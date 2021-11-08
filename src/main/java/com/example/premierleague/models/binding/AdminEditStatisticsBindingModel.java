package com.example.premierleague.models.binding;

import javax.validation.constraints.NotNull;

public class AdminEditStatisticsBindingModel {
    private String team;
    private Integer played;
    private Integer goalDifference;
    private Integer points;

    @NotNull
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @NotNull
    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    @NotNull
    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    @NotNull
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
