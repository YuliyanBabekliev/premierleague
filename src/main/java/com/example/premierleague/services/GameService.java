package com.example.premierleague.services;

import com.example.premierleague.models.entities.Game;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.service.GameServiceModel;
import com.example.premierleague.models.view.GameViewModel;

import java.util.List;

public interface GameService {
    List<GameViewModel> findGamesByFavouriteTeam(Team team);

    void addGame(GameServiceModel gameServiceModel);
}
