package com.example.premierleague.web;

import com.example.premierleague.models.binding.NewsUpdateBindingModel;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.NewsServiceModel;
import com.example.premierleague.models.view.NewsDetailsView;
import com.example.premierleague.models.view.TeamTableViewModel;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/news")
public class NewsController {
    private final NewsService newsService;
    private final TeamService teamService;
    private final UserService userService;
    private final ModelMapper modelMapper;

    public NewsController(NewsService newsService, TeamService teamService, UserService userService, ModelMapper modelMapper) {
        this.newsService = newsService;
        this.teamService = teamService;
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/details/{id}")
    public String newsDetails(@PathVariable Long id, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);
        News news = this.newsService.findNewsById(id);
        List<TeamTableViewModel> teams = this.teamService.findAllTeams()
                .stream().map(t -> this.modelMapper.map(t, TeamTableViewModel.class))
                .collect(Collectors.toList());
        for (TeamTableViewModel team: teams){
            if(team.getName().equals(user.getFavouriteTeam().getName())){
                team.setFavouriteTeam(true);
            }
        }
        model.addAttribute("news", news);
        model.addAttribute("teams", teams);
        return "news-details";
    }

    @GetMapping("/error/{id}")
    public String error(@PathVariable Long id){
        throw new NullPointerException();
    }

    @GetMapping("/edit/{id}")
    public String editNews(@PathVariable Long id, Model model){
        NewsDetailsView newsDetailsView = this.modelMapper.map(this.newsService.findNewsById(id), NewsDetailsView.class);
        NewsUpdateBindingModel newsUpdateBindingModel = this.modelMapper.map(newsDetailsView, NewsUpdateBindingModel.class);
        newsUpdateBindingModel.setId(id);
        model.addAttribute("newsModel", newsUpdateBindingModel);
        return "edit-news";
    }

    @GetMapping("/edit/errors/{id}")
    public String editNewsErrors(@PathVariable Long id){
        return "edit-news";
    }

    @PatchMapping("/edit/{id}")
    public String editNewsConfirm(@PathVariable Long id, @Valid NewsUpdateBindingModel newsUpdateBindingModel,
                                  BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("newsModel", newsUpdateBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.newsModel", bindingResult);

            return "redirect:/news/edit/errors/" + id;
        }
        Team team = this.teamService.findTeamByName(newsUpdateBindingModel.getTeam());
        NewsServiceModel serviceModel = modelMapper.map(newsUpdateBindingModel, NewsServiceModel.class);
        serviceModel.setTeam(team);
        serviceModel.setId(id);

        this.newsService.updateNews(serviceModel);
        return "redirect:/news/details/" + id;
    }

    @DeleteMapping("/details/{id}")
    public String deleteNews(@PathVariable Long id){
        this.newsService.deleteNewsConfirm(id);
        return "redirect:/";
    }
}
