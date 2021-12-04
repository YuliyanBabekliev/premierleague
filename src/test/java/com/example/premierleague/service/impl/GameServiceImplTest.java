package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Game;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.service.GameServiceModel;
import com.example.premierleague.models.view.GameViewModel;
import com.example.premierleague.repositories.GameRepository;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.services.impl.GameServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class GameServiceImplTest {
    private GameServiceImpl serviceToTest;
    private ModelMapper modelMapper;
    private Game game1;
    private Game game2;
    private Game game3;
    private Game game4;
    private Game game5;

    @Mock
    private GameRepository gameRepository;

    @Mock
    private TeamRepository teamRepository;

    @BeforeEach
    void init(){
        modelMapper = new ModelMapper();
        serviceToTest = new GameServiceImpl(gameRepository, modelMapper);
        game1 = new Game();
        game1.setHomeTeam(teamRepository.findByName("Chelsea"));
        game1.setAwayTeam(teamRepository.findByName("Arsenal"));
        game1.setDate(LocalDate.now());
        game1.setResult("3:0");

        game2 = new Game();
        game2.setHomeTeam(teamRepository.findByName("Chelsea"));
        game2.setAwayTeam(teamRepository.findByName("Burnley"));
        game2.setDate(LocalDate.now());
        game2.setResult("5:0");

        game3 = new Game();
        game3.setHomeTeam(teamRepository.findByName("Chelsea"));
        game3.setAwayTeam(teamRepository.findByName("Brighton"));
        game3.setDate(LocalDate.now());
        game3.setResult("4:0");

        game4 = new Game();
        game4.setHomeTeam(teamRepository.findByName("Chelsea"));
        game4.setAwayTeam(teamRepository.findByName("Tottenham"));
        game4.setDate(LocalDate.now());
        game4.setResult("3:0");

        game5 = new Game();
        game5.setHomeTeam(teamRepository.findByName("Chelsea"));
        game5.setAwayTeam(teamRepository.findByName("Watford"));
        game5.setDate(LocalDate.now());
        game5.setResult("5:0");
    }

    @Test
    public void test(){

    }

//    void testAddGame(){
//        serviceToTest.addGame(modelMapper.map(game1, GameServiceModel.class));
//        Game game = new Game();
//        game =  gameRepository.findByAwayTeamOrHomeTeam("Chelsea", "Arsenal").get();
//
//        Assert.assertEquals(game1,);
//    }
//
//      @Test
//      void testFindGamesByFavouriteTeam(){
//        serviceToTest.addGame(modelMapper.map(game1, GameServiceModel.class));
//        gameRepository.save(game1);
//          Team team = this.teamRepository.findByName("Chelsea");
//          List<GameViewModel> games = serviceToTest.findGamesByFavouriteTeam(team);
//          Assertions.assertEquals(1, games.size());
//      }
}
