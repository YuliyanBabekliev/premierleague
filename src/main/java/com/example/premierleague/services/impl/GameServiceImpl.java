package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Game;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.service.GameServiceModel;
import com.example.premierleague.models.view.GameViewModel;
import com.example.premierleague.repositories.GameRepository;
import com.example.premierleague.services.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService {
    private final GameRepository gameRepository;
    private final ModelMapper modelMapper;

    public GameServiceImpl(GameRepository gameRepository, ModelMapper modelMapper) {
        this.gameRepository = gameRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<GameViewModel> findGamesByFavouriteTeam(Team team) {
        List<Game> games = this.gameRepository.findByAwayTeamOrHomeTeam(team, team);
        List<GameViewModel> viewModelGames = games.
                stream().
                map(game -> this.modelMapper.map(game, GameViewModel.class))
                .collect(Collectors.toList());
        List<GameViewModel> viewModelFinalGames = new ArrayList<>();
        for (GameViewModel viewModelGame : viewModelGames) {
            if (viewModelFinalGames.size() == 5) {
                break;
            }
            viewModelFinalGames.add(viewModelGame);
        }
        return viewModelFinalGames;
    }

    @Override
    public void addGame(GameServiceModel gameServiceModel) {
        Game game = this.modelMapper.map(gameServiceModel, Game.class);
        this.gameRepository.save(game);
    }

    @Override
    public void deleteGameById(Long id) {
        this.gameRepository.deleteById(id);
    }
}
