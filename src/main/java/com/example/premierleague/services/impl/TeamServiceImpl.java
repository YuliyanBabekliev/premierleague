package com.example.premierleague.services.impl;

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
    public List<TeamTableViewModel> findAllTeams() {
        List<TeamTableViewModel> teams = this.teamRepository.
                findAllByOrderByPointsDesc().
                stream().
                map(team -> this.modelMapper.map(team, TeamTableViewModel.class)).
                collect(Collectors.toList());
        int counter = 0;
        for(TeamTableViewModel team: teams){
            team.setPosition(team.getPosition() + counter);
            counter++;
        }

        return teams;
    }
}
