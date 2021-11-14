package com.example.premierleague.services;

import com.example.premierleague.models.view.StatsView;

public interface StatsService {
    void onRequest();

    StatsView getStats();
}
