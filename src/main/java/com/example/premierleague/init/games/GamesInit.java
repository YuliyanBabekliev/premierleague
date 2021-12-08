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

            game11.setDate(LocalDate.of(2021, 9, 11));
            game11.setHomeTeam(teamRepository.getById(Long.parseLong("3")));
            game11.setAwayTeam(teamRepository.getById(Long.parseLong("4")));
            game11.setResult("0:1");

            game12.setDate(LocalDate.of(2021, 9, 18));
            game12.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game12.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game12.setResult("0:2");

            game13.setDate(LocalDate.of(2021, 9, 25));
            game13.setHomeTeam(teamRepository.getById(Long.parseLong("3")));
            game13.setAwayTeam(teamRepository.getById(Long.parseLong("11")));
            game13.setResult("3:3");

            game14.setDate(LocalDate.of(2021, 10, 3));
            game14.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game14.setAwayTeam(teamRepository.getById(Long.parseLong("3")));
            game14.setResult("1:2");

            game15.setDate(LocalDate.of(2021, 8, 28));
            game15.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game15.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game15.setResult("0:2");

            game16.setDate(LocalDate.of(2021, 9, 19));
            game16.setHomeTeam(teamRepository.getById(Long.parseLong("4")));
            game16.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game16.setResult("2:1");

            game17.setDate(LocalDate.of(2021, 9, 27));
            game17.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game17.setAwayTeam(teamRepository.getById(Long.parseLong("4")));
            game17.setResult("1:1");

            game18.setDate(LocalDate.of(2021, 8, 29));
            game18.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game18.setAwayTeam(teamRepository.getById(Long.parseLong("9")));
            game18.setResult("1:1");

            game19.setDate(LocalDate.of(2021, 9, 13));
            game19.setHomeTeam(teamRepository.getById(Long.parseLong("8")));
            game19.setAwayTeam(teamRepository.getById(Long.parseLong("5")));
            game19.setResult("3:1");

            game20.setDate(LocalDate.of(2021, 9, 25));
            game20.setHomeTeam(teamRepository.getById(Long.parseLong("10")));
            game20.setAwayTeam(teamRepository.getById(Long.parseLong("5")));
            game20.setResult("2:2");

            game21.setDate(LocalDate.of(2021, 10, 2));
            game21.setHomeTeam(teamRepository.getById(Long.parseLong("5")));
            game21.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game21.setResult("0:0");

            game22.setDate(LocalDate.of(2021, 8, 28));
            game22.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game22.setAwayTeam(teamRepository.getById(Long.parseLong("6")));
            game22.setResult("1:1");

            game23.setDate(LocalDate.of(2021, 9, 19));
            game23.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game23.setAwayTeam(teamRepository.getById(Long.parseLong("6")));
            game23.setResult("0:3");

            game24.setDate(LocalDate.of(2021, 9, 25));
            game24.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game24.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game24.setResult("0:1");

            game25.setDate(LocalDate.of(2021, 10, 2));
            game25.setHomeTeam(teamRepository.getById(Long.parseLong("6")));
            game25.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game25.setResult("3:1");

            game26.setDate(LocalDate.of(2021, 8, 28));
            game26.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game26.setAwayTeam(teamRepository.getById(Long.parseLong("7")));
            game26.setResult("2:2");

            game27.setDate(LocalDate.of(2021, 9, 11));
            game27.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game27.setAwayTeam(teamRepository.getById(Long.parseLong("17")));
            game27.setResult("3:0");

            game28.setDate(LocalDate.of(2021, 9, 18));
            game28.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game28.setAwayTeam(teamRepository.getById(Long.parseLong("7")));
            game28.setResult("3:0");

            game29.setDate(LocalDate.of(2021, 10, 3));
            game29.setHomeTeam(teamRepository.getById(Long.parseLong("7")));
            game29.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game29.setResult("2:2");

            game30.setDate(LocalDate.of(2021, 9, 25));
            game30.setHomeTeam(teamRepository.getById(Long.parseLong("8")));
            game30.setAwayTeam(teamRepository.getById(Long.parseLong("15")));
            game30.setResult("2:0");

            game31.setDate(LocalDate.of(2021, 10, 2));
            game31.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game31.setAwayTeam(teamRepository.getById(Long.parseLong("8")));
            game31.setResult("1:1");

            game32.setDate(LocalDate.of(2021, 9, 12));
            game32.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game32.setAwayTeam(teamRepository.getById(Long.parseLong("11")));
            game32.setResult("0:3");

            game33.setDate(LocalDate.of(2021, 9, 17));
            game33.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game33.setAwayTeam(teamRepository.getById(Long.parseLong("9")));
            game33.setResult("1:1");

            game34.setDate(LocalDate.of(2021, 9, 25));
            game34.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game34.setAwayTeam(teamRepository.getById(Long.parseLong("19")));
            game34.setResult("1:2");

            game35.setDate(LocalDate.of(2021, 10, 2));
            game35.setHomeTeam(teamRepository.getById(Long.parseLong("9")));
            game35.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game35.setResult("1:0");

            game36.setDate(LocalDate.of(2021, 8, 28));
            game36.setHomeTeam(teamRepository.getById(Long.parseLong("15")));
            game36.setAwayTeam(teamRepository.getById(Long.parseLong("10")));
            game36.setResult("1:2");

            game37.setDate(LocalDate.of(2021, 9, 11));
            game37.setHomeTeam(teamRepository.getById(Long.parseLong("10")));
            game37.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game37.setResult("0:1");

            game38.setDate(LocalDate.of(2021, 10, 3));
            game38.setHomeTeam(teamRepository.getById(Long.parseLong("11")));
            game38.setAwayTeam(teamRepository.getById(Long.parseLong("12")));
            game38.setResult("2:2");

            game39.setDate(LocalDate.of(2021, 9, 18));
            game39.setHomeTeam(teamRepository.getById(Long.parseLong("12")));
            game39.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game39.setResult("0:0");

            game40.setDate(LocalDate.of(2021, 8, 29));
            game40.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game40.setAwayTeam(teamRepository.getById(Long.parseLong("13")));
            game40.setResult("0:1");

            game41.setDate(LocalDate.of(2021, 9, 11));
            game41.setHomeTeam(teamRepository.getById(Long.parseLong("13")));
            game41.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game41.setResult("4:1");

            game42.setDate(LocalDate.of(2021, 9, 19));
            game42.setHomeTeam(teamRepository.getById(Long.parseLong("19")));
            game42.setAwayTeam(teamRepository.getById(Long.parseLong("13")));
            game42.setResult("1:2");

            game43.setDate(LocalDate.of(2021, 8, 28));
            game43.setHomeTeam(teamRepository.getById(Long.parseLong("14")));
            game43.setAwayTeam(teamRepository.getById(Long.parseLong("16")));
            game43.setResult("2:2");

            game44.setDate(LocalDate.of(2021, 9, 25));
            game44.setHomeTeam(teamRepository.getById(Long.parseLong("18")));
            game44.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game44.setResult("1:1");

            game45.setDate(LocalDate.of(2021, 10, 2));
            game45.setHomeTeam(teamRepository.getById(Long.parseLong("20")));
            game45.setAwayTeam(teamRepository.getById(Long.parseLong("14")));
            game45.setResult("2:1");

            game46.setDate(LocalDate.of(2021, 9, 18));
            game46.setHomeTeam(teamRepository.getById(Long.parseLong("15")));
            game46.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game46.setResult("1:3");

            game47.setDate(LocalDate.of(2021, 9, 11));
            game47.setHomeTeam(teamRepository.getById(Long.parseLong("16")));
            game47.setAwayTeam(teamRepository.getById(Long.parseLong("19")));
            game47.setResult("0:0");

            game48.setDate(LocalDate.of(2021, 9, 26));
            game48.setHomeTeam(teamRepository.getById(Long.parseLong("16")));
            game48.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game48.setResult("0:1");

            game49.setDate(LocalDate.of(2021, 8, 29));
            game49.setHomeTeam(teamRepository.getById(Long.parseLong("17")));
            game49.setAwayTeam(teamRepository.getById(Long.parseLong("18")));
            game49.setResult("1:0");

            game50.setDate(LocalDate.of(2021, 9, 11));
            game50.setHomeTeam(teamRepository.getById(Long.parseLong("18")));
            game50.setAwayTeam(teamRepository.getById(Long.parseLong("20")));
            game50.setResult("0:2");



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
        }
    }
}
