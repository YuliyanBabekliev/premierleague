package com.example.premierleague.services.impl;

import com.example.premierleague.models.binding.AdminAddPlayerBindingModel;
import com.example.premierleague.models.entities.Player;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.service.PlayerServiceModel;
import com.example.premierleague.models.view.PlayerViewModel;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.services.PlayerService;
import com.example.premierleague.services.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;
    private final ModelMapper modelMapper;

    public PlayerServiceImpl(PlayerRepository playerRepository, ModelMapper modelMapper) {
        this.playerRepository = playerRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Set<Player> findPlayers(Team team, String position) {
        return this.playerRepository.findByClubAndPosition(team, position);
    }

    @Override
    public PlayerViewModel findPlayerById(Long id) {
        Player player = this.playerRepository.findById(id).orElse(null);
        PlayerViewModel playerViewModel = this.modelMapper.map(player, PlayerViewModel.class);
        playerViewModel.setClub(player.getClub().getName());

        return playerViewModel;
    }

    @Override
    public void addPlayer(PlayerServiceModel playerServiceModel) {
        Player player = this.modelMapper.map(playerServiceModel, Player.class);
        this.playerRepository.save(player);
    }
}
