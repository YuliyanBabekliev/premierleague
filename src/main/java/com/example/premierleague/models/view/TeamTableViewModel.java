package com.example.premierleague.models.view;

import com.example.premierleague.models.entities.User;
import com.example.premierleague.services.UserService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.security.Principal;

public class TeamTableViewModel {
    private String logoUrl;
    private String name;
    private Integer played;
    private Integer goalDifference;
    private Integer points;
    private Integer position;
    private boolean isFavouriteTeam;

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer incrementAndGet(){
        return ++this.position;
    }

    public boolean isFavouriteTeam() {
        return isFavouriteTeam;
    }

    public void setFavouriteTeam(boolean favouriteTeam) {
        isFavouriteTeam = favouriteTeam;
    }
}
