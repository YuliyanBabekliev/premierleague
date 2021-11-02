package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;
import java.util.Set;

@Controller
public class HomeController {
    private final ModelMapper modelMapper;
    private final NewsService newsService;
    private final UserService userService;

    public HomeController(ModelMapper modelMapper, NewsService newsService, UserService userService) {
        this.modelMapper = modelMapper;
        this.newsService = newsService;
        this.userService = userService;
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

        model.addAttribute("news", orderedNews);
        model.addAttribute("mainNews", mainNews);
        return "home";
    }

//    @GetMapping("/home")
//    public String home(Model model){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String username = auth.getName();
//        User user = this.userService.findUserByUsername(username);
//        Set<News> news = user.getFavouriteTeam().getNews();
//        Set<News> orderedNews = this.newsService.orderNews(news);
//        News mainNews = this.newsService.findMainNews(orderedNews);
//
//        model.addAttribute("news", orderedNews);
//        model.addAttribute("mainNews", mainNews);
//        return "home";
//    }
}
