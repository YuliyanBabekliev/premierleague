package com.example.premierleague.models.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MyUserDetails implements UserDetails {
    private User user;

    public MyUserDetails(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Role> roles = user.getRoles();
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRole().name()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }

    public Team getFavouriteTeam(){
        return this.user.getFavouriteTeam();
    }

    public String getEmail(){
        return this.user.getEmail();
    }

    public boolean arsenalTeam(){
        return this.user.getFavouriteTeam().getName().equals("Arsenal");
    }

    public boolean astonVillaTeam(){
        return this.user.getFavouriteTeam().getName().equals("Aston_Villa");
    }

    public boolean brentfordTeam(){
        return this.user.getFavouriteTeam().getName().equals("Brentford");
    }

    public boolean brightonTeam(){
        return this.user.getFavouriteTeam().getName().equals("Brighton");
    }

    public boolean burnleyTeam(){
        return this.user.getFavouriteTeam().getName().equals("Burnley");
    }

    public boolean chelseaTeam(){
        return this.user.getFavouriteTeam().getName().equals("Chelsea");
    }

    public boolean crystalPalaceTeam(){
        return this.user.getFavouriteTeam().getName().equals("Crystal_Palace");
    }

    public boolean evertonTeam(){
        return this.user.getFavouriteTeam().getName().equals("Everton");
    }

    public boolean leedsTeam(){
        return this.user.getFavouriteTeam().getName().equals("Leeds");
    }

    public boolean leicesterTeam(){
        return this.user.getFavouriteTeam().getName().equals("Leicester");
    }

    public boolean liverpoolTeam(){
        return this.user.getFavouriteTeam().getName().equals("Liverpool");
    }

    public boolean manchesterCityTeam(){
        return this.user.getFavouriteTeam().getName().equals("Manchester_City");
    }

    public boolean manchesterUnitedTeam(){
        return this.user.getFavouriteTeam().getName().equals("Manchester_United");
    }

    public boolean newcastleTeam(){
        return this.user.getFavouriteTeam().getName().equals("Newcastle");
    }

    public boolean norwichTeam(){
        return this.user.getFavouriteTeam().getName().equals("Norwich");
    }

    public boolean southamptonTeam(){
        return this.user.getFavouriteTeam().getName().equals("Southampton");
    }

    public boolean tottenhamTeam(){
        return this.user.getFavouriteTeam().getName().equals("Tottenham");
    }

    public boolean watfordTeam(){
        return this.user.getFavouriteTeam().getName().equals("Watford");
    }

    public boolean westHamTeam(){
        return this.user.getFavouriteTeam().getName().equals("West_Ham");
    }

    public boolean wolverhamptonTeam(){
        return this.user.getFavouriteTeam().getName().equals("Wolverhampton");
    }

    public Set<News> favouriteTeamNews(){
        return this.user.getFavouriteTeam().getNews();
    }
}
