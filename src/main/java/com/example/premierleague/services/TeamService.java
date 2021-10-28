package com.example.premierleague.services;

import com.example.premierleague.models.entities.Team;

public interface TeamService {
    Team findTeamByName(String teamName);
}
