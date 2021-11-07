package com.example.premierleague.services.impl;

import com.example.premierleague.models.binding.AdminAddPlayerBindingModel;
import com.example.premierleague.models.entities.Player;
import com.example.premierleague.models.entities.Team;
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
    private final TeamService teamService;
    private final ModelMapper modelMapper;

    public PlayerServiceImpl(PlayerRepository playerRepository, TeamService teamService, ModelMapper modelMapper) {
        this.playerRepository = playerRepository;
        this.teamService = teamService;
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
    public void addPlayer(AdminAddPlayerBindingModel adminAddPlayerBindingModel) {
        Team team = this.teamService.findTeamByName(adminAddPlayerBindingModel.getClub());
        Player player = this.modelMapper.map(adminAddPlayerBindingModel, Player.class);
        player.setClub(team);
        this.playerRepository.save(player);
    }
}
