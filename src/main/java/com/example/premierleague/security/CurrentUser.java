package com.example.premierleague.security;

import com.example.premierleague.models.entities.Team;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {
    private Long id;
    private String username;
    private Team favouriteTeam;

    public CurrentUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(Team favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
}