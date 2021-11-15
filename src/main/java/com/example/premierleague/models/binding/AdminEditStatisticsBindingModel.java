package com.example.premierleague.models.binding;

import org.springframework.lang.Nullable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdminEditStatisticsBindingModel {
    private String team;
    private Integer played;
    private Integer goalDifference;
    private Integer points;

    @Size(min = 1, message = "Please choose team.")
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Min(value = 0, message = "Played cannot be negative number.")
    @NotNull(message = "Please enter played games.")
    public Integer getPlayed() {
        return played;
    }

    public void setPlayed(Integer played) {
        this.played = played;
    }

    @NotNull(message = "Please enter goal difference.")
    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    @Min(value = 0, message = "Points cannot be negative number.")
    @NotNull(message = "Please enter points")
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
