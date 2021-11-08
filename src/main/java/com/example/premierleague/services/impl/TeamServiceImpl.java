package com.example.premierleague.services.impl;

import com.example.premierleague.models.binding.AdminEditStatisticsBindingModel;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.view.TeamTableViewModel;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        return this.teamRepository.findById(id).orElse(null);
    }

    @Override
    public void editTeamStatistics(AdminEditStatisticsBindingModel adminEditStatisticsBindingModel) {
        Team team = this.teamRepository.findByName(adminEditStatisticsBindingModel.getTeam());
        team.setPlayed(adminEditStatisticsBindingModel.getPlayed());
        team.setGoalDifference(adminEditStatisticsBindingModel.getGoalDifference());
        team.setPoints(adminEditStatisticsBindingModel.getPoints());
        this.teamRepository.saveAndFlush(team);
    }
}
