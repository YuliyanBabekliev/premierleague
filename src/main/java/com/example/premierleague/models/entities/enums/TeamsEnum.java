package com.example.premierleague.models.entities.enums;

public enum TeamsEnum {
    Arsenal, Aston_Villa, Brentford, Brighton, Burnley, Chelsea,
    Crystal_Palace("Crystal Palace"), Everton, Leeds, Leicester, Liverpool,
    Manchester_City, Manchester_United, Newcastle, Norwich,
    Southampton, Tottenham, Watford, West_Ham, Wolverhampton;

    public String name;
    TeamsEnum(String name) {
        this.name = name;
    }

    TeamsEnum() {
    }
}
