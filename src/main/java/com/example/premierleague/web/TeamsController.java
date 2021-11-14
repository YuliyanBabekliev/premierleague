package com.example.premierleague.web;

import com.example.premierleague.models.entities.*;
import com.example.premierleague.models.view.GameViewModel;
import com.example.premierleague.models.view.OtherTeamsViewModel;
import com.example.premierleague.services.*;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/teams")
public class TeamsController {

    private final TeamService teamService;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final PlayerService playerService;
    private final GameService gameService;
    private final NewsService newsService;

    public TeamsController(TeamService teamService, ModelMapper modelMapper, UserService userService, PlayerService playerService, GameService gameService, NewsService newsService) {
        this.teamService = teamService;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.playerService = playerService;
        this.gameService = gameService;
        this.newsService = newsService;
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
    public String teamStatistics(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        User user = this.userService.findUserByUsername(username);
        Team team = user.getFavouriteTeam();
        List<GameViewModel> games = this.gameService.findGamesByFavouriteTeam(team);
        model.addAttribute("games", games);
        return "team-statistics";
    }

    @GetMapping("/other")
    public String otherTeams(Model model){
        List<OtherTeamsViewModel> teams = this.teamService.findAllTeams()
                .stream().map(t -> this.modelMapper.map(t, OtherTeamsViewModel.class))
                .collect(Collectors.toList());

        model.addAttribute("otherTeams", teams);
        return "teams-other";
    }

    @GetMapping("/other/news/{id}")
    public String otherTeamNews(@PathVariable Long id, Model model){
        Team team = this.teamService.findTeamById(id);
        Set<News> news = team.getNews();
        Set<News> orderedNews = this.newsService.orderNews(news);
        News mainNews = this.newsService.findMainNews(orderedNews);

        model.addAttribute("mainNews", mainNews);
        model.addAttribute("otherTeamNews", orderedNews);

        return "other-team-news";
    }

    @DeleteMapping("/statistics/{id}")
    public String deleteNews(@PathVariable Long id){
        this.gameService.deleteGameById(id);
        return "redirect:/";
    }
}
