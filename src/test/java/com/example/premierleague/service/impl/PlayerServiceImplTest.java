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

    @Autowired
    private PlayerServiceImpl serviceToTest;
    @Mock
    private TeamRepository teamRepository;

    private Player player;

    @BeforeEach
    void init(){
        serviceToTest = new PlayerServiceImpl(playerRepository, modelMapper);

        player = new Player();
        player.setId(Long.parseLong("1"));
        player.setFirstName("yuliyan");
        player.setLastName("yuliyanov");
        player.setClub(teamRepository.findByName("Chelsea"));
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

//    @Test
//    void testFindPlayerById(){
//        when(this.playerRepository.getById(player.getId()))
//                .thenReturn(player);
//
//        PlayerViewModel playerViewModel = this.serviceToTest.findPlayerById(player.getId());
//
//        assertNotNull(playerViewModel);
////        assertEquals(this.modelMapper.map(playerViewModel, Player.class), player);
//    }
//
//    @Test
//    void testAddPlayer(){
//        PlayerServiceModel playerServiceModel = this.modelMapper.map(player,PlayerServiceModel.class);
//        serviceToTest.addPlayer(playerServiceModel);
//        Assertions.assertEquals(1, serviceToTest.findPlayers(
//                teamRepository.findByName("Chelsea"), "Forward"
//        ).size());
//    }

}