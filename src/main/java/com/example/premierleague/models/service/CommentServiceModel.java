package com.example.premierleague.models.service;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.User;

import java.time.LocalDateTime;

public class CommentServiceModel {
    private Long id;
    private String commentText;
    private LocalDateTime date;
    private User user;
    private News news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
