package com.example.premierleague.models.entities;

import com.example.premierleague.models.entities.enums.RoleNameEnum;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{
    private String username;
    private String email;
    private String password;
    private String gender;
    private Team favouriteTeam;
    private Set<Role> role;
    private Set<News> news;

    @Column(name = "username", unique = true, nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "gender", nullable = false)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    @OneToOne
    public Team getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(Team favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    @OneToMany(fetch = FetchType.EAGER)
    public Set<News> getNews() {
        return news;
    }

    public void setNews(Set<News> news) {
        this.news = news;
    }
}
