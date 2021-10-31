package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.view.HomeNewsViewModel;
import com.example.premierleague.security.CurrentUser;
import com.example.premierleague.services.NewsService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class HomeController {
    private final CurrentUser currentUser;
    private final ModelMapper modelMapper;
    private final NewsService newsService;

    public HomeController(CurrentUser currentUser, ModelMapper modelMapper, NewsService newsService) {
        this.currentUser = currentUser;
        this.modelMapper = modelMapper;
        this.newsService = newsService;
    }

    @GetMapping("/")
    public String index(Model model){
        if(this.currentUser.getUsername() == null) {
            return "index";
        }

        Set<News> newsSet = currentUser.getFavouriteTeam().getNews();
        Set<HomeNewsViewModel> homeNewsViewModels =
                this.currentUser.
                        getFavouriteTeam().
                        getNews().
                        stream().
                        map(news -> this.modelMapper.map(news, HomeNewsViewModel.class)).
                        collect(Collectors.toSet());
        model.addAttribute("homeNewsViewModels", homeNewsViewModels);
        return "home";
    }
}
