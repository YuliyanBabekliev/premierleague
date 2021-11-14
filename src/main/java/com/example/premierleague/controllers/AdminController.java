package com.example.premierleague.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/add-role")
    public String adminAddRole(){
        return "admin-add-role";
    }

    @GetMapping("/add-news")
    public String adminAddNews(){
        return "admin-add-news";
    }

    @GetMapping("/add-statistics")
    public String adminAddStatistics(){
        return "admin-add-statistics";
    }

    @GetMapping("/add-players")
    public String adminAddPlayers(){
        return "admin-add-players";
    }
}
