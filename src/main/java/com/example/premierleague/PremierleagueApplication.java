package com.example.premierleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PremierleagueApplication {
    public static void main(String[] args) {
        SpringApplication.run(PremierleagueApplication.class, args);
    }
}
