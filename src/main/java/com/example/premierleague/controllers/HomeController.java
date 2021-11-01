package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.view.HomeNewsViewModel;
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
    private final ModelMapper modelMapper;
    private final NewsService newsService;

    public HomeController(ModelMapper modelMapper, NewsService newsService) {
        this.modelMapper = modelMapper;
        this.newsService = newsService;
    }

    @GetMapping("/")
    public String index(Model model){
            return "index";
    }

    @GetMapping("/home")
    public String home(Model model){
        return "home";
    }
}
