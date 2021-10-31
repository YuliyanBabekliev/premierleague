package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.services.NewsService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

}
