package com.example.premierleague.web.schedulers;

import com.example.premierleague.services.UserService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Component
public class UsersCountScheduler {
    static final Logger LOGGER = Logger.getLogger(UsersCountScheduler.class.getName());
    private final UserService userService;

    public UsersCountScheduler(UserService userService) {
        this.userService = userService;
    }

    @Scheduled(fixedRate = 60000)
    public void usersCount(){
        LOGGER.info("Current users count at " + LocalDateTime.now() + " : " + userService.getUsersCount());
    }
}
