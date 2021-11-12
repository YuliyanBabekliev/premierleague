package com.example.premierleague.services;

import com.example.premierleague.models.binding.AdminAddNewsBindingModel;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.NewsUpdateServiceModel;

import java.util.Set;

public interface NewsService {

    News findMainNews(Set<News> news);

    Set<News> orderNews(Set<News> news);

    News findNewsById(Long id);

    void addNews(AdminAddNewsBindingModel adminAddNewsBindingModel, User user);

    void deleteNewsConfirm(Long id);

    void updateNews(NewsUpdateServiceModel serviceModel);
}
