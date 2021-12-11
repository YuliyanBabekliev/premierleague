package com.example.premierleague.models.binding;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class NewsUpdateBindingModel {
    private Long id;
    private String title;
    private String description;
    private String imgUrl;
    private String team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Size(min = 3, message = "Title must be at least 3 characters long.")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Size(min = 10, message = "Description must be at least 10 characters long.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Size(min = 3, message = "Please enter image URL.")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Size(min = 1, message = "Please select team.")
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
