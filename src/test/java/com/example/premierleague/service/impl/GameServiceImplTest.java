package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Game;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.service.GameServiceModel;
import com.example.premierleague.models.service.StatisticsServiceModel;
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
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GameServiceImplTest {
    private GameServiceImpl serviceToTest;
    private Game game1;
    private Game game2;
    private Game game3;
    private Game game4;
    private Game game5;
    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;
    private Team team5;
    private Team team6;

    @Mock
    private GameRepository gameRepository;

    @Mock
    private ModelMapper modelMapper;

    @BeforeEach
    void init(){
        serviceToTest = new GameServiceImpl(gameRepository, modelMapper);
        team1 = new Team();
        team1.setName("Sheffield");
        team2 = new Team();
        team2.setName("West Bromich");
        team3 = new Team();
        team3.setName("Derby County");
        team4 = new Team();
        team4.setName("Bolton");
        team5 = new Team();
        team5.setName("Fulham");
        team6 = new Team();
        team6.setName("Ipswich");
        game1 = new Game();
        game1.setHomeTeam(this.team1);
        game1.setAwayTeam(this.team2);
        game1.setDate(LocalDate.now());
        game1.setResult("3:0");

        game2 = new Game();
        game2.setHomeTeam(this.team1);
        game2.setAwayTeam(this.team3);
        game2.setDate(LocalDate.of(2021, 10, 25));
        game2.setResult("5:0");

        game3 = new Game();
        game3.setHomeTeam(this.team1);
        game3.setAwayTeam(this.team4);
        game3.setDate(LocalDate.now());
        game3.setResult("4:0");

        game4 = new Game();
        game4.setHomeTeam(this.team1);
        game4.setAwayTeam(this.team5);
        game4.setDate(LocalDate.now());
        game4.setResult("3:0");

        game5 = new Game();
        game5.setHomeTeam(this.team1);
        game5.setAwayTeam(this.team6);
        game5.setDate(LocalDate.now());
        game5.setResult("5:0");
    }

    @Test
    public void testDeleteGame(){
        int id = 1;
        this.serviceToTest.deleteGameById((long) id);
        Mockito.verify(this.gameRepository, times(1)).deleteById((long) id);
    }

    @Test
    public void addGameTest(){
        GameServiceModel gameServiceModel = new GameServiceModel();
        gameServiceModel.setHomeTeam(this.game1.getHomeTeam());
        gameServiceModel.setAwayTeam(this.game1.getAwayTeam());
        gameServiceModel.setDate(this.game1.getDate());
        gameServiceModel.setResult(this.game1.getResult());

        when(this.modelMapper.map(gameServiceModel, Game.class)).thenReturn(game1);

        this.serviceToTest.addGame(gameServiceModel);

        verify(this.gameRepository, times(1)).save(this.game1);
    }

    @Test
    public void findGamesByFavouriteTeamTest(){
        List<Game> games =  List.of(this.game1, this.game2);
        when(this.gameRepository.findByAwayTeamOrHomeTeam(this.team1, this.team1)).thenReturn(
               games
        );

        List<GameViewModel> gameViewModels = new ArrayList<>();
        GameViewModel gameViewModel1 = new GameViewModel();
        gameViewModel1.setHomeTeam(this.game1.getHomeTeam());
        gameViewModel1.setAwayTeam(this.game1.getAwayTeam());
        gameViewModel1.setDate(this.game1.getDate());
        gameViewModel1.setResult(this.game1.getResult());

        GameViewModel gameViewModel2 = new GameViewModel();
        gameViewModel2.setHomeTeam(this.game2.getHomeTeam());
        gameViewModel2.setAwayTeam(this.game2.getAwayTeam());
        gameViewModel2.setDate(this.game2.getDate());
        gameViewModel2.setResult(this.game2.getResult());

        gameViewModels.add(gameViewModel1);
        gameViewModels.add(gameViewModel2);

        when(this.modelMapper.map(game1, GameViewModel.class)).thenReturn(gameViewModel1);
        when(this.modelMapper.map(game2, GameViewModel.class)).thenReturn(gameViewModel2);

        List<GameViewModel> actual = this.serviceToTest.findGamesByFavouriteTeam(this.team1);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(actual.get(0).getResult(), gameViewModels.get(0).getResult());
    }
}
