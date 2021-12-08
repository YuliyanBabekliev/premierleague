package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.models.service.NewsServiceModel;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.services.NewsService;
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
    private final UserService userService;

    public NewsServiceImpl(NewsRepository newsRepository, ModelMapper modelMapper, UserService userService) {
        this.newsRepository = newsRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
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
        return this.newsRepository.findByTeamOrderByAddedOnDesc(team);
    }

    @Override
    public News findNewsById(Long id) {
        return this.newsRepository.findById(id).orElse(null);
    }

    @Override
    public void addNews(NewsServiceModel newsServiceModel, User user) {
        News news = this.modelMapper.map(newsServiceModel, News.class);
        news.setUser(user);
        news.setTeam(newsServiceModel.getTeam());
        news.setAddedOn(LocalDateTime.now());
        this.newsRepository.save(news);
    }

    @Override
    public void deleteNewsConfirm(Long id) {
        this.newsRepository.deleteById(id);
    }

    @Override
    public void updateNews(NewsServiceModel serviceModel) {
        News news = this.newsRepository.findById(serviceModel.getId()).
                orElse(null);

        news.setTitle(serviceModel.getTitle());
        news.setDescription(serviceModel.getDescription());
        news.setImgUrl(serviceModel.getImgUrl());
        news.setTeam(serviceModel.getTeam());
        news.setAddedOn(LocalDateTime.now());

        this.newsRepository.save(news);
    }

    @Override
    public Long newsCount() {
        return this.newsRepository.count();
    }

    @Override
    public boolean isAdmin(String username) {
        User user = this.userService.findUserByUsername(username);
        return user.
                getRoles().
                stream().
                map(Role::getRole).
                anyMatch(r -> r == RoleNameEnum.ADMIN);
    }
}
