package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.StatisticsServiceModel;
import com.example.premierleague.models.view.TeamTableViewModel;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.services.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    private final TeamRepository teamRepository;
    private final ModelMapper modelMapper;

    public TeamServiceImpl(TeamRepository teamRepository, ModelMapper modelMapper) {
        this.teamRepository = teamRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Team findTeamByName(String teamName) {
        return this.teamRepository.findByName(teamName);
    }

    @Override
    public List<Team> findAllTeams() {
        List<Team> teams = this.teamRepository.
                findAllByOrderByPointsDescGoalDifferenceDesc();
        int counter = 0;
        for(Team team: teams){
            team.setPosition(team.getPosition() + counter);
            counter++;
        }

        return teams;
    }

    @Override
    public void equalTeams(List<TeamTableViewModel> teams, User user) {
        for (TeamTableViewModel team: teams){
            if(team.getName().equals(user.getFavouriteTeam().getName())){
                team.setFavouriteTeam(true);
            }
        }
    }

    @Override
    public Team findTeamById(Long id) {
        return this.teamRepository.getById(id);
    }

    @Override
    public void editTeamStatistics(StatisticsServiceModel editStatisticsServiceModel) {
        Team team = this.teamRepository.findByName(editStatisticsServiceModel.getName());
        team.setPlayed(editStatisticsServiceModel.getPlayed());
        team.setGoalDifference(editStatisticsServiceModel.getGoalDifference());
        team.setPoints(editStatisticsServiceModel.getPoints());
        this.teamRepository.saveAndFlush(team);
    }
}
