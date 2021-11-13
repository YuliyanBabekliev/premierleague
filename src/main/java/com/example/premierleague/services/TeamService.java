package com.example.premierleague.services;

import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.StatisticsServiceModel;
import com.example.premierleague.models.view.TeamTableViewModel;

import java.util.List;

public interface TeamService {
    Team findTeamByName(String teamName);

    List<Team> findAllTeams();

    void equalTeams(List<TeamTableViewModel> teams, User user);

    Team findTeamById(Long id);

    void editTeamStatistics(StatisticsServiceModel editStatisticsServiceModel);
}
