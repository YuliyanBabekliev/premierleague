package com.example.premierleague.init.games;

import com.example.premierleague.models.entities.Game;
import com.example.premierleague.repositories.GameRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class GamesInit {
    private final GameRepository gameRepository;
    private final TeamRepository teamRepository;

    public GamesInit(GameRepository gameRepository, TeamRepository teamRepository) {
        this.gameRepository = gameRepository;
        this.teamRepository = teamRepository;
    }

    public void initGames(){
        if(this.gameRepository.count() == 0) {
            Game game1 = new Game();
            Game game2 = new Game();
            Game game3 = new Game();
            Game game4 = new Game();
            Game game5 = new Game();
            Game game6 = new Game();
            Game game7 = new Game();
            Game game8 = new Game();
            Game game9 = new Game();
            Game game10 = new Game();
            Game game11 = new Game();
            Game game12 = new Game();
            Game game13 = new Game();
            Game game14 = new Game();
            Game game15 = new Game();
            Game game16 = new Game();
            Game game17 = new Game();
            Game game18 = new Game();
            Game game19 = new Game();
            Game game20 = new Game();
            Game game21 = new Game();
            Game game22 = new Game();
            Game game23 = new Game();
            Game game24 = new Game();
            Game game25 = new Game();
            Game game26 = new Game();
            Game game27 = new Game();
            Game game28 = new Game();
            Game game29 = new Game();
            Game game30 = new Game();
            Game game31 = new Game();
            Game game32 = new Game();
            Game game33 = new Game();
            Game game34 = new Game();
            Game game35 = new Game();
            Game game36 = new Game();
            Game game37 = new Game();
            Game game38 = new Game();
            Game game39 = new Game();
            Game game40 = new Game();
            Game game41 = new Game();
            Game game42 = new Game();
            Game game43 = new Game();
            Game game44 = new Game();
            Game game45 = new Game();
            Game game46 = new Game();
            Game game47 = new Game();
            Game game48 = new Game();
            Game game49 = new Game();
            Game game50 = new Game();
            Game game51 = new Game();
            Game game52 = new Game();
            Game game53 = new Game();
            Game game54 = new Game();
            Game game55 = new Game();
            Game game56 = new Game();
            Game game57 = new Game();
            Game game58 = new Game();
            Game game59 = new Game();
            Game game60 = new Game();
            Game game61 = new Game();
            Game game62 = new Game();
            Game game63 = new Game();
            Game game64 = new Game();
            Game game65 = new Game();
            Game game66 = new Game();
            Game game67 = new Game();
            Game game68 = new Game();
            Game game69 = new Game();
            Game game70 = new Game();
            Game game71 = new Game();
            Game game72 = new Game();
            Game game73 = new Game();
            Game game74 = new Game();
            Game game75 = new Game();
            Game game76 = new Game();
            Game game77 = new Game();
            Game game78 = new Game();
            Game game79 = new Game();
            Game game80 = new Game();
            Game game81 = new Game();
            Game game82 = new Game();
            Game game83 = new Game();
            Game game84 = new Game();
            Game game85 = new Game();
            Game game86 = new Game();
            Game game87 = new Game();
            Game game88 = new Game();
            Game game89 = new Game();
            Game game90 = new Game();
            Game game91 = new Game();
            Game game92 = new Game();
            Game game93 = new Game();
            Game game94 = new Game();
            Game game95 = new Game();
            Game game96 = new Game();
            Game game97 = new Game();
            Game game98 = new Game();
            Game game99 = new Game();
            Game game100 = new Game();

            game1.setDate(LocalDate.of(2021, 8, 28));
            game1.setHomeTeam(teamRepository.getById(Long.parseLong("12")));
            game1.setAwayTeam(teamRepository.getById(Long.parseLong("1")));
            game1.setResult("5:0");

            game2.setDate(LocalDate.of(2021, 9, 11));
            game2.setHomeTeam(teamRepository.getById(Long.parseLong("1")));
            game2.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game2.setResult("1:0");

            game3.setDate(LocalDate.of(2021, 9, 18));
            game3.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game3.setAwayTeam(teamRepository.getById(Long.parseLong("1")));
            game3.setResult("0:1");

            game4.setDate(LocalDate.of(2021, 9, 26));
            game4.setHomeTeam(teamRepository.getById(Long.parseLong("1")));
            game4.setAwayTeam(teamRepository.getById(Long.parseLong("17")));
            game4.setResult("3:1");

            game5.setDate(LocalDate.of(2021, 10, 2));
            game5.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game5.setAwayTeam(teamRepository.getById(Long.parseLong("1")));
            game5.setResult("0:0");

            game6.setDate(LocalDate.of(2021, 8, 28));
            game6.setHomeTeam(teamRepository.getById(Long.parseLong("2")));
            game6.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game6.setResult("1:1");

            game7.setDate(LocalDate.of(2021, 9, 11));
            game7.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game7.setAwayTeam(teamRepository.getById(Long.parseLong("2")));
            game7.setResult("3:0");

            game8.setDate(LocalDate.of(2021, 9, 18));
            game8.setHomeTeam(teamRepository.getById(Long.parseLong("2")));
            game8.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game8.setResult("3:0");

            game9.setDate(LocalDate.of(2021, 9, 25));
            game9.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game9.setAwayTeam(teamRepository.getById(Long.parseLong("2")));
            game9.setResult("0:1");

            game10.setDate(LocalDate.of(2021, 10, 3));
            game10.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game10.setAwayTeam(teamRepository.getById(Long.parseLong("2")));
            game10.setResult("2:1");

            game11.setDate(LocalDate.of(2021, 8, 28));
            game11.setHomeTeam(teamRepository.getById(Long.parseLong("2")));
            game11.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game11.setResult("1:1");

            game12.setDate(LocalDate.of(2021, 9, 11));
            game12.setHomeTeam(teamRepository.getById(Long.parseLong("3")));
            game12.setAwayTeam(teamRepository.getById(Long.parseLong("4")));
            game12.setResult("0:1");

            game13.setDate(LocalDate.of(2021, 9, 18));
            game13.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game13.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game13.setResult("0:2");

            game14.setDate(LocalDate.of(2021, 9, 25));
            game14.setHomeTeam(teamRepository.getById(Long.parseLong("3")));
            game14.setAwayTeam(teamRepository.getById(Long.parseLong("11")));
            game14.setResult("3:3");

            game15.setDate(LocalDate.of(2021, 10, 3));
            game15.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game15.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game15.setResult("1:2");

            game16.setDate(LocalDate.of(2021, 8, 28));
            game16.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game16.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game16.setResult("0:2");

            game17.setDate(LocalDate.of(2021, 9, 11));
            game17.setHomeTeam(teamRepository.getById(Long.parseLong("3")));
            game17.setAwayTeam(teamRepository.getById(Long.parseLong("4")));
            game17.setResult("0:1");

            game18.setDate(LocalDate.of(2021, 9, 19));
            game18.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game18.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game18.setResult("2:1");

            game19.setDate(LocalDate.of(2021, 9, 27));
            game19.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game19.setAwayTeam(teamRepository.getById(Long.parseLong("4")));
            game19.setResult("1:1");

            game20.setDate(LocalDate.of(2021, 10, 2));
            game20.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game20.setAwayTeam(teamRepository.getById(Long.parseLong("1")));
            game20.setResult("0:0");

            game21.setDate(LocalDate.of(2021, 8, 29));
            game21.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game21.setAwayTeam(teamRepository.getById(Long.parseLong("9")));
            game21.setResult("1:1");

            game22.setDate(LocalDate.of(2021, 9, 13));
            game22.setHomeTeam(teamRepository.getById(Long.parseLong("8")));
            game22.setAwayTeam(teamRepository.getById(Long.parseLong("5")));
            game22.setResult("3:1");

            game23.setDate(LocalDate.of(2021, 9, 18));
            game23.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game23.setAwayTeam(teamRepository.getById(Long.parseLong("1")));
            game23.setResult("0:1");

            game24.setDate(LocalDate.of(2021, 9, 25));
            game24.setHomeTeam(teamRepository.getById(Long.parseLong("10")));
            game24.setAwayTeam(teamRepository.getById(Long.parseLong("5")));
            game24.setResult("2:2");

            game25.setDate(LocalDate.of(2021, 10, 2));
            game25.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game25.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game25.setResult("0:0");

            game26.setDate(LocalDate.of(2021, 8, 28));
            game26.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game26.setAwayTeam(teamRepository.getById(Long.parseLong("6")));
            game26.setResult("1:1");

            game27.setDate(LocalDate.of(2021, 9, 11));
            game27.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game27.setAwayTeam(teamRepository.getById(Long.parseLong("2")));
            game27.setResult("3:0");

            game28.setDate(LocalDate.of(2021, 9, 19));
            game28.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game28.setAwayTeam(teamRepository.getById(Long.parseLong("6")));
            game28.setResult("0:3");

            game29.setDate(LocalDate.of(2021, 9, 25));
            game29.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game29.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game29.setResult("0:1");

            game30.setDate(LocalDate.of(2021, 10, 2));
            game30.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game30.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game30.setResult("3:1");

            game31.setDate(LocalDate.of(2021, 8, 28));
            game31.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game31.setAwayTeam(teamRepository.getById(Long.parseLong("7")));
            game31.setResult("2:2");

            game32.setDate(LocalDate.of(2021, 9, 11));
            game32.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game32.setAwayTeam(teamRepository.getById(Long.parseLong("17")));
            game32.setResult("3:0");

            game33.setDate(LocalDate.of(2021, 9, 18));
            game33.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game33.setAwayTeam(teamRepository.getById(Long.parseLong("7")));
            game33.setResult("3:0");

            game34.setDate(LocalDate.of(2021, 9, 27));
            game34.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game34.setAwayTeam(teamRepository.getById(Long.parseLong("4")));
            game34.setResult("1:1");

            game35.setDate(LocalDate.of(2021, 10, 3));
            game35.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game35.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game35.setResult("2:2");

            game36.setDate(LocalDate.of(2021, 8, 28));
            game36.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game36.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game36.setResult("0:2");

            game37.setDate(LocalDate.of(2021, 9, 13));
            game37.setHomeTeam(teamRepository.getById(Long.parseLong("8")));
            game37.setAwayTeam(teamRepository.getById(Long.parseLong("5")));
            game37.setResult("3:1");

            game38.setDate(LocalDate.of(2021, 9, 18));
            game38.setHomeTeam(teamRepository.getById(Long.parseLong("2")));
            game38.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game38.setResult("3:0");

            game39.setDate(LocalDate.of(2021, 9, 25));
            game39.setHomeTeam(teamRepository.getById(Long.parseLong("8")));
            game39.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game39.setResult("2:0");

            game40.setDate(LocalDate.of(2021, 10, 2));
            game40.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game40.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game40.setResult("1:1");

            game41.setDate(LocalDate.of(2021, 8, 29));
            game41.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game41.setAwayTeam(teamRepository.getById(Long.parseLong("9")));
            game41.setResult("1:1");

            game42.setDate(LocalDate.of(2021, 9, 12));
            game42.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game42.setAwayTeam(teamRepository.getById(Long.parseLong("11")));
            game42.setResult("0:3");

            game43.setDate(LocalDate.of(2021, 9, 17));
            game43.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game43.setAwayTeam(teamRepository.getById(Long.parseLong("9")));
            game43.setResult("1:1");

            game44.setDate(LocalDate.of(2021, 9, 25));
            game44.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game44.setAwayTeam(teamRepository.getById(Long.parseLong("19")));
            game44.setResult("1:2");

            game45.setDate(LocalDate.of(2021, 10, 2));
            game45.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game45.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game45.setResult("1:0");

            game46.setDate(LocalDate.of(2021, 8, 28));
            game46.setHomeTeam(teamRepository.getById(Long.parseLong("15")));
            game46.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game46.setResult("1:2");

            game47.setDate(LocalDate.of(2021, 9, 11));
            game47.setHomeTeam(teamRepository.getById(Long.parseLong("10")));
            game47.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game47.setResult("0:1");

            game48.setDate(LocalDate.of(2021, 9, 19));
            game48.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game48.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game48.setResult("2:1");

            game49.setDate(LocalDate.of(2021, 9, 25));
            game49.setHomeTeam(teamRepository.getById(Long.parseLong("10")));
            game49.setAwayTeam(teamRepository.getById(Long.parseLong("5")));
            game49.setResult("2:2");

            game50.setDate(LocalDate.of(2021, 10, 3));
            game50.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game50.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game50.setResult("2:2");

            game51.setDate(LocalDate.of(2021, 8, 28));
            game51.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game51.setAwayTeam(teamRepository.getById(Long.parseLong("6")));
            game51.setResult("1:1");

            game52.setDate(LocalDate.of(2021, 9, 12));
            game52.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game52.setAwayTeam(teamRepository.getById(Long.parseLong("11")));
            game52.setResult("0:3");

            game53.setDate(LocalDate.of(2021, 9, 18));
            game53.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game53.setAwayTeam(teamRepository.getById(Long.parseLong("7")));
            game53.setResult("3:0");

            game54.setDate(LocalDate.of(2021, 9, 25));
            game54.setHomeTeam(teamRepository.getById(Long.parseLong("3")));
            game54.setAwayTeam(teamRepository.getById(Long.parseLong("11")));
            game54.setResult("3:3");

            game55.setDate(LocalDate.of(2021, 10, 3));
            game55.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game55.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game55.setResult("2:2");

            game56.setDate(LocalDate.of(2021, 8, 28));
            game56.setHomeTeam(teamRepository.getById(Long.parseLong("12")));
            game56.setAwayTeam(teamRepository.getById(Long.parseLong("1")));
            game56.setResult("5:0");

            game57.setDate(LocalDate.of(2021, 9, 11));
            game57.setHomeTeam(teamRepository.getById(Long.parseLong("10")));
            game57.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game57.setResult("0:1");

            game58.setDate(LocalDate.of(2021, 9, 18));
            game58.setHomeTeam(teamRepository.getById(Long.parseLong("12")));
            game58.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game58.setResult("0:0");

            game59.setDate(LocalDate.of(2021, 9, 25));
            game59.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game59.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game59.setResult("0:1");

            game60.setDate(LocalDate.of(2021, 10, 3));
            game60.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game60.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game60.setResult("2:2");

            game61.setDate(LocalDate.of(2021, 8, 29));
            game61.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game61.setAwayTeam(teamRepository.getById(Long.parseLong("13")));
            game61.setResult("0:1");

            game62.setDate(LocalDate.of(2021, 9, 11));
            game62.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game62.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game62.setResult("4:1");

            game63.setDate(LocalDate.of(2021, 9, 19));
            game63.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game63.setAwayTeam(teamRepository.getById(Long.parseLong("13")));
            game63.setResult("1:2");

            game64.setDate(LocalDate.of(2021, 9, 25));
            game64.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game64.setAwayTeam(teamRepository.getById(Long.parseLong("2")));
            game64.setResult("0:1");

            game65.setDate(LocalDate.of(2021, 10, 2));
            game65.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game65.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game65.setResult("1:1");

            game66.setDate(LocalDate.of(2021, 8, 28));
            game66.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game66.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game66.setResult("2:2");

            game67.setDate(LocalDate.of(2021, 9, 11));
            game67.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game67.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game67.setResult("4:1");

            game68.setDate(LocalDate.of(2021, 9, 17));
            game68.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game68.setAwayTeam(teamRepository.getById(Long.parseLong("9")));
            game68.setResult("1:1");

            game69.setDate(LocalDate.of(2021, 9, 25));
            game69.setHomeTeam(teamRepository.getById(Long.parseLong("18")));
            game69.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game69.setResult("1:1");

            game70.setDate(LocalDate.of(2021, 10, 2));
            game70.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game70.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game70.setResult("2:1");

            game71.setDate(LocalDate.of(2021, 8, 28));
            game71.setHomeTeam(teamRepository.getById(Long.parseLong("15")));
            game71.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game71.setResult("1:2");

            game72.setDate(LocalDate.of(2021, 9, 11));
            game72.setHomeTeam(teamRepository.getById(Long.parseLong("1")));
            game72.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game72.setResult("1:0");

            game73.setDate(LocalDate.of(2021, 9, 18));
            game73.setHomeTeam(teamRepository.getById(Long.parseLong("15")));
            game73.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game73.setResult("1:3");

            game74.setDate(LocalDate.of(2021, 9, 25));
            game74.setHomeTeam(teamRepository.getById(Long.parseLong("8")));
            game74.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game74.setResult("2:0");

            game75.setDate(LocalDate.of(2021, 10, 2));
            game75.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game75.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game75.setResult("0:0");

            game76.setDate(LocalDate.of(2021, 8, 28));
            game76.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game76.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game76.setResult("2:2");

            game77.setDate(LocalDate.of(2021, 9, 11));
            game77.setHomeTeam(teamRepository.getById(Long.parseLong("16")));
            game77.setAwayTeam(teamRepository.getById(Long.parseLong("19")));
            game77.setResult("0:0");

            game78.setDate(LocalDate.of(2021, 9, 18));
            game78.setHomeTeam(teamRepository.getById(Long.parseLong("12")));
            game78.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game78.setResult("0:0");

            game79.setDate(LocalDate.of(2021, 9, 26));
            game79.setHomeTeam(teamRepository.getById(Long.parseLong("16")));
            game79.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game79.setResult("0:1");

            game80.setDate(LocalDate.of(2021, 10, 2));
            game80.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game80.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game80.setResult("3:1");

            game81.setDate(LocalDate.of(2021, 8, 29));
            game81.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game81.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game81.setResult("1:0");

            game82.setDate(LocalDate.of(2021, 9, 11));
            game82.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game82.setAwayTeam(teamRepository.getById(Long.parseLong("17")));
            game82.setResult("3:0");

            game83.setDate(LocalDate.of(2021, 9, 19));
            game83.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game83.setAwayTeam(teamRepository.getById(Long.parseLong("6")));
            game83.setResult("0:3");

            game84.setDate(LocalDate.of(2021, 9, 26));
            game84.setHomeTeam(teamRepository.getById(Long.parseLong("1")));
            game84.setAwayTeam(teamRepository.getById(Long.parseLong("17")));
            game84.setResult("3:1");

            game85.setDate(LocalDate.of(2021, 10, 3));
            game85.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game85.setAwayTeam(teamRepository.getById(Long.parseLong("2")));
            game85.setResult("2:1");

            game86.setDate(LocalDate.of(2021, 8, 29));
            game86.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game86.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game86.setResult("1:0");

            game87.setDate(LocalDate.of(2021, 9, 11));
            game87.setHomeTeam(teamRepository.getById(Long.parseLong("18")));
            game87.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game87.setResult("0:2");

            game88.setDate(LocalDate.of(2021, 9, 18));
            game88.setHomeTeam(teamRepository.getById(Long.parseLong("15")));
            game88.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game88.setResult("1:3");

            game89.setDate(LocalDate.of(2021, 9, 25));
            game89.setHomeTeam(teamRepository.getById(Long.parseLong("18")));
            game89.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game89.setResult("1:1");

            game90.setDate(LocalDate.of(2021, 10, 2));
            game90.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game90.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game90.setResult("1:0");

            game91.setDate(LocalDate.of(2021, 8, 28));
            game91.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game91.setAwayTeam(teamRepository.getById(Long.parseLong("7")));
            game91.setResult("2:2");

            game92.setDate(LocalDate.of(2021, 9, 11));
            game92.setHomeTeam(teamRepository.getById(Long.parseLong("16")));
            game92.setAwayTeam(teamRepository.getById(Long.parseLong("19")));
            game92.setResult("0:0");

            game93.setDate(LocalDate.of(2021, 9, 19));
            game93.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game93.setAwayTeam(teamRepository.getById(Long.parseLong("13")));
            game93.setResult("1:2");

            game94.setDate(LocalDate.of(2021, 9, 25));
            game94.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game94.setAwayTeam(teamRepository.getById(Long.parseLong("19")));
            game94.setResult("1:2");

            game95.setDate(LocalDate.of(2021, 10, 3));
            game95.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game95.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game95.setResult("1:2");

            game96.setDate(LocalDate.of(2021, 8, 29));
            game96.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game96.setAwayTeam(teamRepository.getById(Long.parseLong("13")));
            game96.setResult("0:1");

            game97.setDate(LocalDate.of(2021, 9, 11));
            game97.setHomeTeam(teamRepository.getById(Long.parseLong("18")));
            game97.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game97.setResult("0:2");

            game98.setDate(LocalDate.of(2021, 9, 18));
            game98.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game98.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game98.setResult("0:2");

            game99.setDate(LocalDate.of(2021, 9, 26));
            game99.setHomeTeam(teamRepository.getById(Long.parseLong("16")));
            game99.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game99.setResult("0:1");

            game100.setDate(LocalDate.of(2021, 10, 2));
            game100.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game100.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game100.setResult("2:1");



            this.gameRepository.save(game1);
            this.gameRepository.save(game2);
            this.gameRepository.save(game3);
            this.gameRepository.save(game4);
            this.gameRepository.save(game5);
            this.gameRepository.save(game6);
            this.gameRepository.save(game7);
            this.gameRepository.save(game8);
            this.gameRepository.save(game9);
            this.gameRepository.save(game10);
            this.gameRepository.save(game11);
            this.gameRepository.save(game12);
            this.gameRepository.save(game13);
            this.gameRepository.save(game14);
            this.gameRepository.save(game15);
            this.gameRepository.save(game16);
            this.gameRepository.save(game17);
            this.gameRepository.save(game18);
            this.gameRepository.save(game19);
            this.gameRepository.save(game20);
            this.gameRepository.save(game21);
            this.gameRepository.save(game22);
            this.gameRepository.save(game23);
            this.gameRepository.save(game24);
            this.gameRepository.save(game25);
            this.gameRepository.save(game26);
            this.gameRepository.save(game27);
            this.gameRepository.save(game28);
            this.gameRepository.save(game29);
            this.gameRepository.save(game30);
            this.gameRepository.save(game31);
            this.gameRepository.save(game32);
            this.gameRepository.save(game33);
            this.gameRepository.save(game34);
            this.gameRepository.save(game35);
            this.gameRepository.save(game36);
            this.gameRepository.save(game37);
            this.gameRepository.save(game38);
            this.gameRepository.save(game39);
            this.gameRepository.save(game40);
            this.gameRepository.save(game41);
            this.gameRepository.save(game42);
            this.gameRepository.save(game43);
            this.gameRepository.save(game44);
            this.gameRepository.save(game45);
            this.gameRepository.save(game46);
            this.gameRepository.save(game47);
            this.gameRepository.save(game48);
            this.gameRepository.save(game49);
            this.gameRepository.save(game50);
            this.gameRepository.save(game51);
            this.gameRepository.save(game52);
            this.gameRepository.save(game53);
            this.gameRepository.save(game54);
            this.gameRepository.save(game55);
            this.gameRepository.save(game56);
            this.gameRepository.save(game57);
            this.gameRepository.save(game58);
            this.gameRepository.save(game59);
            this.gameRepository.save(game60);
            this.gameRepository.save(game61);
            this.gameRepository.save(game62);
            this.gameRepository.save(game63);
            this.gameRepository.save(game64);
            this.gameRepository.save(game65);
            this.gameRepository.save(game66);
            this.gameRepository.save(game67);
            this.gameRepository.save(game68);
            this.gameRepository.save(game69);
            this.gameRepository.save(game70);
            this.gameRepository.save(game71);
            this.gameRepository.save(game72);
            this.gameRepository.save(game73);
            this.gameRepository.save(game74);
            this.gameRepository.save(game75);
            this.gameRepository.save(game76);
            this.gameRepository.save(game77);
            this.gameRepository.save(game78);
            this.gameRepository.save(game79);
            this.gameRepository.save(game80);
            this.gameRepository.save(game81);
            this.gameRepository.save(game82);
            this.gameRepository.save(game83);
            this.gameRepository.save(game84);
            this.gameRepository.save(game85);
            this.gameRepository.save(game86);
            this.gameRepository.save(game87);
            this.gameRepository.save(game88);
            this.gameRepository.save(game89);
            this.gameRepository.save(game90);
            this.gameRepository.save(game91);
            this.gameRepository.save(game92);
            this.gameRepository.save(game93);
            this.gameRepository.save(game94);
            this.gameRepository.save(game95);
            this.gameRepository.save(game96);
            this.gameRepository.save(game97);
            this.gameRepository.save(game98);
            this.gameRepository.save(game99);
            this.gameRepository.save(game100);
        }
    }
}
