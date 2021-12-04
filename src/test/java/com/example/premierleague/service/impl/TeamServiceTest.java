package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Team;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.services.impl.TeamServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TeamServiceTest {
    private TeamServiceImpl serviceToTest;

    private Team team;
    private Team team2;

    @Mock
    private TeamRepository teamRepository;

    @Mock
    private ModelMapper modelMapper;

    @BeforeEach
    public void setUp(){
        serviceToTest = new TeamServiceImpl(this.teamRepository, this.modelMapper);

        team = new Team();
        team.setName("Sheffield");
        team.setDescription("testtesttest");
        team.setLogoUrl("aaaaaaaaaaaaa");
        team.setPoints(10);
        team.setPosition(10);

        team2 = new Team();
        team2.setName("West Bromich");
        team2.setDescription("testtesttest");
        team2.setLogoUrl("bbbbbbbbbbbbbbb");
        team2.setPoints(5);
        team2.setPosition(15);
    }

    @Test
    public void findTeamByNameTest(){
        Mockito.when(this.teamRepository.findByName(team.getName())).
                thenReturn(team);

        Team actual = this.serviceToTest.findTeamByName(team.getName());

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(team.getName(), actual.getName());
        Assertions.assertEquals(team.getDescription(), actual.getDescription());
    }

    @Test
    public void findAllTeamsTest(){
        Mockito.when(this.teamRepository.findAllByOrderByPointsDescGoalDifferenceDesc()).
                thenReturn(List.of(team, team2));
        List<Team> expected = List.of(team, team2);
        List<Team> actual = this.serviceToTest.findAllTeams();

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findTeamByIdTest(){
        Mockito.when(this.teamRepository.getById(team.getId())).
                thenReturn(team);

        Team actual = this.serviceToTest.findTeamById(team.getId());

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(actual.getDescription(), team.getDescription());
    }
}
