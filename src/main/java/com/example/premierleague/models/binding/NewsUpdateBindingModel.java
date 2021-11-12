package com.example.premierleague.models.binding;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewsUpdateBindingModel {
    private Long id;
    @Size(min = 3, message = "Title must be at least 3 characters long.")
    private String title;
    @Size(min = 10, message = "Description must be at least 10 characters long.")
    private String description;
    @Size(min = 1, message = "Please enter image URL.")
    private String imgUrl;
    @Size(min = 1, message = "Please select team.")
    private String team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
