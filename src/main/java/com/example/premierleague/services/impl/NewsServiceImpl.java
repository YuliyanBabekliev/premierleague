package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.services.NewsService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public News findMainNews(Set<News> news) {
        News mainNews = new News();
        for (News newsIterator: news){
            mainNews = newsIterator;
            news.remove(newsIterator);
            break;
        }
        return mainNews;
    }

    @Override
    public Set<News> orderNews(Set<News> news) {
        Set<Team> teams = news.stream().map(News::getTeam).collect(Collectors.toSet());
        Team team = new Team();
        for(Team teamCurrent: teams){
            team = teamCurrent;
            break;
        }
        return this.newsRepository.findByTeamOrderByAddedOn(team);
    }

    @Override
    public News findNewsById(Long id) {
        return this.newsRepository.findById(id).orElse(null);
    }
}
