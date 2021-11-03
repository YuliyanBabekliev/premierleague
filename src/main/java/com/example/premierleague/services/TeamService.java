package com.example.premierleague.services;

import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.view.TeamTableViewModel;

import java.util.List;
import java.util.Set;

public interface TeamService {
    Team findTeamByName(String teamName);

    List<TeamTableViewModel> findAllTeams();
}
