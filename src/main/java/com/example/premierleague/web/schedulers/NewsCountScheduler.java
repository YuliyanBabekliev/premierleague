package com.example.premierleague.web.schedulers;

import com.example.premierleague.services.NewsService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Component
public class NewsCountScheduler {
    static final Logger LOGGER = Logger.getLogger(NewsCountScheduler.class.getName());
    private final NewsService newsService;

    public NewsCountScheduler(NewsService newsService) {
        this.newsService = newsService;
    }

    @Scheduled(fixedRate = 60000)
    private void newsCount(){
        LOGGER.info("Current news count at " + LocalDateTime.now() + " : " + this.newsService.newsCount());
    }
}
