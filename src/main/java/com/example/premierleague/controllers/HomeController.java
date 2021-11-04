package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.view.TeamTableViewModel;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    private final ModelMapper modelMapper;
    private final NewsService newsService;
    private final UserService userService;
    private final TeamService teamService;

    public HomeController(ModelMapper modelMapper, NewsService newsService, UserService userService, TeamService teamService) {
        this.modelMapper = modelMapper;
        this.newsService = newsService;
        this.userService = userService;
        this.teamService = teamService;
    }

    @GetMapping("/")
    public String index(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);
        if(user == null) {
            return "index";
        }
        Set<News> news = user.getFavouriteTeam().getNews();
        Set<News> orderedNews = this.newsService.orderNews(news);
        News mainNews = this.newsService.findMainNews(orderedNews);
        List<TeamTableViewModel> teams = this.teamService.findAllTeams()
                .stream().map(t -> this.modelMapper.map(t, TeamTableViewModel.class))
                .collect(Collectors.toList());
        this.teamService.equalTeams(teams, user);
        //TODO teamService equalTeams(define user in the method from the controller)

        model.addAttribute("news", orderedNews);
        model.addAttribute("mainNews", mainNews);
        model.addAttribute("teams", teams);
        return "home";
    }
}
