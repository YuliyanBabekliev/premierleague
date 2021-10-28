package com.example.premierleague.init;

import com.example.premierleague.init.games.GamesInit;
import com.example.premierleague.init.news.NewsInit;
import com.example.premierleague.init.players.*;
import com.example.premierleague.init.roles.RolesInit;
import com.example.premierleague.init.stadiums.StadiumsInit;
import com.example.premierleague.init.teams.TeamsInit;
import com.example.premierleague.init.users.AdminUserDbInit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBInit implements CommandLineRunner {

    private final StadiumsInit stadiumsInit;
    private final TeamsInit teamsInit;
    private final ArsenalPlayersInit arsenalPlayersInit;
    private final AstonVillaPlayersInit astonVillaPlayersInit;
    private final BrentfordPlayersInit brentfordPlayersInit;
    private final BrightonPlayersInit brightonPlayersInit;
    private final BurnleyPlayersInit burnleyPlayersInit;
    private final ChelseaPlayersInit chelseaPlayersInit;
    private final CrystalPalacePlayersInit crystalPalacePlayersInit;
    private final EvertonPlayersInit evertonPlayersInit;
    private final LeedsPlayersInit leedsPlayersInit;
    private final LeicesterPlayersInit leicesterPlayersInit;
    private final LiverpoolPlayersInit liverpoolPlayersInit;
    private final ManchesterCityPlayersInit manchesterCityPlayersInit;
    private final ManchesterUnitedPlayersInit manchesterUnitedPlayersInit;
    private final NewcastlePlayersInit newcastlePlayersInit;
    private final NorwichPlayersInit norwichPlayersInit;
    private final SouthamptonPlayersInit southamptonPlayersInit;
    private final TottenhamPlayersInit tottenhamPlayersInit;
    private final WatfordPlayersInit watfordPlayersInit;
    private final WestHamUnitedPlayersInit westHamUnitedPlayersInit;
    private final WolverhamptonPlayersInit wolverhamptonPlayersInit;
    private final RolesInit rolesInit;
    private final AdminUserDbInit userInit;
    private final NewsInit newsInit;
    private final GamesInit gamesInit;

    public DBInit(StadiumsInit stadiumsInit, TeamsInit teamsInit, ArsenalPlayersInit arsenalPlayersInit, AstonVillaPlayersInit astonVillaPlayersInit, BrentfordPlayersInit brentfordPlayersInit, BrightonPlayersInit brightonPlayersInit, BurnleyPlayersInit burnleyPlayersInit, ChelseaPlayersInit chelseaPlayersInit, CrystalPalacePlayersInit crystalPalacePlayersInit, EvertonPlayersInit evertonPlayersInit, LeedsPlayersInit leedsPlayersInit, LeicesterPlayersInit leicesterPlayersInit, LiverpoolPlayersInit liverpoolPlayersInit, ManchesterCityPlayersInit manchesterCityPlayersInit, ManchesterUnitedPlayersInit manchesterUnitedPlayersInit, NewcastlePlayersInit newcastlePlayersInit, NorwichPlayersInit norwichPlayersInit, SouthamptonPlayersInit southamptonPlayersInit, TottenhamPlayersInit tottenhamPlayersInit, WatfordPlayersInit watfordPlayersInit, WestHamUnitedPlayersInit westHamUnitedPlayersInit, WolverhamptonPlayersInit wolverhamptonPlayersInit, RolesInit rolesInit, AdminUserDbInit userInit, NewsInit newsInit, GamesInit gamesInit) {
        this.stadiumsInit = stadiumsInit;
        this.teamsInit = teamsInit;
        this.arsenalPlayersInit = arsenalPlayersInit;
        this.astonVillaPlayersInit = astonVillaPlayersInit;
        this.brentfordPlayersInit = brentfordPlayersInit;
        this.brightonPlayersInit = brightonPlayersInit;
        this.burnleyPlayersInit = burnleyPlayersInit;
        this.chelseaPlayersInit = chelseaPlayersInit;
        this.crystalPalacePlayersInit = crystalPalacePlayersInit;
        this.evertonPlayersInit = evertonPlayersInit;
        this.leedsPlayersInit = leedsPlayersInit;
        this.leicesterPlayersInit = leicesterPlayersInit;
        this.liverpoolPlayersInit = liverpoolPlayersInit;
        this.manchesterCityPlayersInit = manchesterCityPlayersInit;
        this.manchesterUnitedPlayersInit = manchesterUnitedPlayersInit;
        this.newcastlePlayersInit = newcastlePlayersInit;
        this.norwichPlayersInit = norwichPlayersInit;
        this.southamptonPlayersInit = southamptonPlayersInit;
        this.tottenhamPlayersInit = tottenhamPlayersInit;
        this.watfordPlayersInit = watfordPlayersInit;
        this.westHamUnitedPlayersInit = westHamUnitedPlayersInit;
        this.wolverhamptonPlayersInit = wolverhamptonPlayersInit;
        this.rolesInit = rolesInit;
        this.userInit = userInit;
        this.newsInit = newsInit;
        this.gamesInit = gamesInit;
    }

    @Override
    public void run(String... args) throws Exception {
        this.stadiumsInit.initStadiums();
        this.teamsInit.initTeams();
        this.arsenalPlayersInit.initArsenalPlayers();
        this.astonVillaPlayersInit.initAstonVillaPlayers();
        this.brentfordPlayersInit.initBrentfordPlayers();
        this.brightonPlayersInit.initBrightonPlayers();
        this.burnleyPlayersInit.initBurnleyPlayers();
        this.chelseaPlayersInit.initChelseaPlayers();
        this.crystalPalacePlayersInit.initCrystalPalacePlayers();
        this.evertonPlayersInit.initEvertonPlayers();
        this.leedsPlayersInit.initLeedsPlayers();
        this.leicesterPlayersInit.initLeicesterPlayers();
        this.liverpoolPlayersInit.initLiverpoolPlayers();
        this.manchesterCityPlayersInit.initManchesterCityPlayers();
        this.manchesterUnitedPlayersInit.initManchesterUnitedPlayers();
        this.newcastlePlayersInit.initNewcastlePlayers();
        this.norwichPlayersInit.initNorwichPlayers();
        this.southamptonPlayersInit.initSouthamptonPlayers();
        this.tottenhamPlayersInit.initTottenhamPlayers();
        this.watfordPlayersInit.initWatfordPlayers();
        this.westHamUnitedPlayersInit.initWestHamUnitedPlayers();
        this.wolverhamptonPlayersInit.initWolverhamptonPlayers();
        this.rolesInit.initRoles();
        this.userInit.initAdmin();
        this.newsInit.initNews();
        this.gamesInit.initGames();
    }
}
