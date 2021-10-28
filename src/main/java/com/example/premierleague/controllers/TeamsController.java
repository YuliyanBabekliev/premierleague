package com.example.premierleague.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teams")
public class TeamsController {

    @GetMapping("/information")
    public String teamInformation(){
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
