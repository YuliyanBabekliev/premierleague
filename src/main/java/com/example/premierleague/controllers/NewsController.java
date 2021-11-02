package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.services.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {
    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/details/{id}")
    public String newsDetails(@PathVariable Long id, Model model) {
        News news = this.newsService.findNewsById(id);
        model.addAttribute("news", news);
        return "news-details";
    }
}
