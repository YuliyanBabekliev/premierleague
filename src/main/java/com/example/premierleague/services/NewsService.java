package com.example.premierleague.services;

import com.example.premierleague.models.entities.News;

import java.util.Set;

public interface NewsService {

    News findMainNews(Set<News> news);

    Set<News> orderNews(Set<News> news);

    News findNewsById(Long id);
}
