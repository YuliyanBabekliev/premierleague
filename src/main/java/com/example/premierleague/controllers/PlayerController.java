package com.example.premierleague.controllers;

import com.example.premierleague.models.view.PlayerViewModel;
import com.example.premierleague.services.PlayerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/players")
public class PlayerController {
    private final PlayerService playerService;
    private final ModelMapper modelMapper;

    public PlayerController(PlayerService playerService, ModelMapper modelMapper) {
        this.playerService = playerService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{id}")
    public String player(@PathVariable Long id, Model model){
        PlayerViewModel playerViewModel = this.playerService.findPlayerById(id);
        model.addAttribute("player", playerViewModel);
        return "player";
    }
}
