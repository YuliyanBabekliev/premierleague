package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.models.service.PlayerServiceModel;
import com.example.premierleague.models.view.PlayerViewModel;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.services.impl.PlayerServiceImpl;
import com.example.premierleague.services.impl.UserDetailsServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceImplTest {
    @Mock
    private PlayerRepository playerRepository;

    @Mock
    private ModelMapper modelMapper;

    private PlayerServiceImpl serviceToTest;
    @Mock
    private TeamRepository teamRepository;

    private Player player;

    private Team team;

    @BeforeEach
    void init(){
        serviceToTest = new PlayerServiceImpl(playerRepository, modelMapper);

        team = new Team();

        team.setName("Sheffield");

        player = new Player();
        player.setId(Long.parseLong("1"));
        player.setFirstName("yuliyan");
        player.setLastName("yuliyanov");
        player.setClub(team);
        player.setNationality("Bulgarian");
        player.setPosition("Forward");
        player.setAge(22);
        player.setImgUrl("aaaaaaaaaaaaaaaaaa");
    }

    @Test
    void testFindPlayers(){
        when(this.playerRepository.findByClubAndPosition(this.teamRepository.findByName("Chelsea"), "Forward"))
                .thenReturn(Set.of(player));

        Set<Player> players = this.serviceToTest.
                findPlayers(this.teamRepository.findByName("Chelsea"), "Forward");

        assertNotNull(players);
        assertEquals(players.size(), 1);
    }

    @Test
    public void addPlayerTest(){
        PlayerServiceModel playerServiceModel = new PlayerServiceModel();
        playerServiceModel.setFirstName(this.player.getFirstName());
        playerServiceModel.setLastName(this.player.getLastName());
        playerServiceModel.setClub(this.player.getClub());
        playerServiceModel.setNationality(this.player.getNationality());
        playerServiceModel.setPosition(this.player.getPosition());
        playerServiceModel.setAge(this.player.getAge());
        playerServiceModel.setImgUrl(this.player.getImgUrl());

        when(this.modelMapper.map(playerServiceModel, Player.class)).
                thenReturn(this.player);
        when(this.playerRepository.save(player)).
                thenReturn(this.player);

        Player actual = this.serviceToTest.addPlayer(playerServiceModel);

        Assertions.assertEquals(actual.getFirstName(), this.player.getFirstName());
    }
    @Test
    void testFindPlayerById(){
        when(this.playerRepository.findById(player.getId()))
                .thenReturn(Optional.of(player));

        PlayerViewModel playerViewModel = new PlayerViewModel();
        playerViewModel.setClub(this.player.getClub().getName());
        playerViewModel.setNationality(this.player.getNationality());
        playerViewModel.setAge(this.player.getAge());
        playerViewModel.setPosition(this.player.getPosition());
        playerViewModel.setFirstName(this.player.getFirstName());
        playerViewModel.setLastName(this.player.getLastName());
        playerViewModel.setImgUrl(this.player.getImgUrl());

        when(this.modelMapper.map(this.player, PlayerViewModel.class)).
                thenReturn(playerViewModel);

        PlayerViewModel actual = this.serviceToTest.findPlayerById(player.getId());

        assertNotNull(actual);
        assertEquals(actual.getFirstName(), playerViewModel.getFirstName());
    }


}