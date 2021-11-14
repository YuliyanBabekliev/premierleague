package com.example.premierleague.web;

import com.example.premierleague.security.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final CurrentUser currentUser;

    public HomeController(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    @GetMapping("/")
    public String index(){
        if(this.currentUser.getUsername() == null) {
            return "index";
        }
        return "home";
    }
}
