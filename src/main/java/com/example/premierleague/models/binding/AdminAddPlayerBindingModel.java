package com.example.premierleague.models.binding;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdminAddPlayerBindingModel {
    private String firstName;
    private String lastName;
    private String position;
    private Integer age;
    private String club;
    private String nationality;
    private String imgUrl;

    @Size(min = 2, max = 20, message = "First name must be minimum 2 and maximum 20 characters long.")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Size(min = 2, max = 20, message = "First name must be minimum 2 and maximum 20 characters long.")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Size(min = 1, message = "Please enter position.")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Min(value = 15)
    @NotNull(message = "Please enter age.")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Size(min = 1, message = "Please choose club.")
    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Size(min = 2, message = "Nationality must be at least 2 characters long.")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Size(min = 1, message = "Please enter image URL.")
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
