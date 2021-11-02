package com.example.premierleague.controllers;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.services.PlayerService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
@RequestMapping("/teams")
public class TeamsController {

    private final TeamService teamService;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final PlayerService playerService;

    public TeamsController(TeamService teamService, ModelMapper modelMapper, UserService userService, PlayerService playerService) {
        this.teamService = teamService;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.playerService = playerService;
    }

    @GetMapping("/information")
    public String teamInformation(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);
        Team team = user.getFavouriteTeam();
        Set<Player> trainer = this.playerService.findPlayers(team, "Trainer");
        Set<Player> goalkeepers = this.playerService.findPlayers(team, "Goalkeeper");
        Set<Player> defenders = this.playerService.findPlayers(team, "Defender");
        Set<Player> midfielders = this.playerService.findPlayers(team, "Midfielder");
        Set<Player> forwards = this.playerService.findPlayers(team, "Forward");
        model.addAttribute("team", team);
        model.addAttribute("goalkeepers", goalkeepers);
        model.addAttribute("defenders", defenders);
        model.addAttribute("midfielders", midfielders);
        model.addAttribute("forwards", forwards);
        model.addAttribute("trainer", trainer);
        return "team-information";
    }

    @GetMapping("/statistics")
    public String teamStatistics(){
        return "team-statistics";
    }

    @GetMapping("/other")
    public String otherTeams(){
        return "teams-other";
    }

    @GetMapping("/other/news")
    public String otherTeamNews(){
        return "other-team-news";
    }
}
