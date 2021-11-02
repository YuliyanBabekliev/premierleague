package com.example.premierleague.services;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.view.PlayerViewModel;

import java.util.Set;

public interface PlayerService {
    Set<Player> findPlayers(Team team, String position);

    PlayerViewModel findPlayerById(Long id);
}
