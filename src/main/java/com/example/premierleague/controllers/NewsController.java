package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.view.TeamTableViewModel;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {
    private final NewsService newsService;
    private final TeamService teamService;
    private final UserService userService;

    public NewsController(NewsService newsService, TeamService teamService, UserService userService) {
        this.newsService = newsService;
        this.teamService = teamService;
        this.userService = userService;
    }

    @GetMapping("/details/{id}")
    public String newsDetails(@PathVariable Long id, Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);
        News news = this.newsService.findNewsById(id);
        List<TeamTableViewModel> teams = this.teamService.findAllTeams();
        for (TeamTableViewModel team: teams){
            if(team.getName().equals(user.getFavouriteTeam().getName())){
                team.setFavouriteTeam(true);
            }
        }
        model.addAttribute("news", news);
        model.addAttribute("teams", teams);
        return "news-details";
    }
}
