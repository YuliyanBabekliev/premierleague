package com.example.premierleague.services.impl;

import com.example.premierleague.models.binding.AdminAddNewsBindingModel;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;
    private final ModelMapper modelMapper;
    private final TeamService teamService;

    public NewsServiceImpl(NewsRepository newsRepository, ModelMapper modelMapper, TeamService teamService) {
        this.newsRepository = newsRepository;
        this.modelMapper = modelMapper;
        this.teamService = teamService;
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

    @Override
    public void addNews(AdminAddNewsBindingModel adminAddNewsBindingModel, User user) {
        News news = this.modelMapper.map(adminAddNewsBindingModel, News.class);
        news.setUser(user);
        news.setTeam(this.teamService.findTeamByName(adminAddNewsBindingModel.getTeam()));
        news.setAddedOn(LocalDateTime.now());
        this.newsRepository.save(news);
    }
}
