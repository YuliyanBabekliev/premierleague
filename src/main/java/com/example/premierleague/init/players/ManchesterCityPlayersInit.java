package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManchesterCityPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public ManchesterCityPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }


    public void initManchesterCityPlayers() {
        if (this.playerRepository.count() == 341) {
            Player trainer = new Player();
            Player player1 = new Player();
            Player player2 = new Player();
            Player player3 = new Player();
            Player player4 = new Player();
            Player player5 = new Player();
            Player player6 = new Player();
            Player player7 = new Player();
            Player player8 = new Player();
            Player player9 = new Player();
            Player player10 = new Player();
            Player player11 = new Player();
            Player player12 = new Player();
            Player player13 = new Player();
            Player player14 = new Player();
            Player player15 = new Player();
            Player player16 = new Player();
            Player player17 = new Player();
            Player player18 = new Player();
            Player player19 = new Player();
            Player player20 = new Player();
            Player player21 = new Player();
            Player player22 = new Player();
            Player player23 = new Player();
            Player player24 = new Player();
            Player player25 = new Player();
            Player player26 = new Player();
            Player player27 = new Player();
            Player player28 = new Player();
            Player player29 = new Player();
            Player player30 = new Player();

            trainer.setFirstName("Pep");
            trainer.setLastName("Guardiola");
            trainer.setAge(50);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("12")));
            trainer.setNationality("Spain");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/d/d5/Pep_Guardiola_2015.jpg");

            player1.setFirstName("Zack");
            player1.setLastName("Steffen");
            player1.setAge(26);
            player1.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player1.setNationality("USA");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/zack-steffen-1604985204-50882.jpg?lm=1604985220");

            player2.setLastName("Ederson");
            player2.setAge(28);
            player2.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player2.setNationality("Brazil");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://www.gol.bg/media/files/resized/article/625x352/ff2/65b4ed7e8a78118f7d5e5c867633aff2-ederson.jpg");

            player3.setFirstName("Scott");
            player3.setLastName("Carson");
            player3.setAge(36);
            player3.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/scott-carson-manchester-city-1621024483-62495.jpg?lm=1621024503");

            player4.setFirstName("Cieran");
            player4.setLastName("Slicker");
            player4.setAge(19);
            player4.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player4.setNationality("Scotland");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://www.playmakerstats.com/img/jogadores/88/724788_med__20201122031234_cieran_slicker.jpg");

            player5.setFirstName("Kyle");
            player5.setLastName("Walker");
            player5.setAge(31);
            player5.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://www.si.com/.image/ar_1:1%2Cc_fill%2Ccs_srgb%2Cfl_progressive%2Cq_auto:good%2Cw_1200/MTgzNDY1NjIwOTk2NjI5NTQy/sipa_34664751.jpg");

            player6.setFirstName("Ruben");
            player6.setLastName("Dias");
            player6.setAge(24);
            player6.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player6.setNationality("Portugal");
            player6.setPosition("Defender");
            player6.setImgUrl("https://trud.bg/public/images/articles/2021-08/ruben_dias_8050094059084266710_original.jpg");

            player7.setFirstName("John");
            player7.setLastName("Stones");
            player7.setAge(27);
            player7.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://i2-prod.manchestereveningnews.co.uk/sport/article20672929.ece/ALTERNATES/s1200c/0_GettyImages-1319623892.jpg");

            player8.setFirstName("Nathan");
            player8.setLastName("Ake");
            player8.setAge(26);
            player8.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player8.setNationality("Netherlands");
            player8.setPosition("Defender");
            player8.setImgUrl("https://pbs.twimg.com/media/E75EcYJXMAQDM0c.jpg");

            player9.setFirstName("Oleksandr");
            player9.setLastName("Zinchenko");
            player9.setAge(24);
            player9.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player9.setNationality("Ukraine");
            player9.setPosition("Defender");
            player9.setImgUrl("https://resources.premierleague.com/photos/2021/04/27/e304a59f-a6e8-4d95-ab2e-61f4b03fd6de/GettyImages-1306386775.jpg?width=930&height=620");

            player10.setFirstName("Aymeric");
            player10.setLastName("Laporte");
            player10.setAge(27);
            player10.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player10.setNationality("Spain");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/aymeric-laporte-manchester-city-1550860010-20648.jpg?lm=1550860022");

            player11.setFirstName("Benjamin");
            player11.setLastName("Mendy");
            player11.setAge(27);
            player11.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player11.setNationality("France");
            player11.setPosition("Defender");
            player11.setImgUrl("https://ichef.bbci.co.uk/news/976/cpsprodpb/8F39/production/_120256663_45a80f6a-9e76-4fe8-9e58-d83869c1fbd6.jpg");

            player12.setFirstName("Joao");
            player12.setLastName("Cancelo");
            player12.setAge(27);
            player12.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player12.setNationality("Portugal");
            player12.setPosition("Defender");
            player12.setImgUrl("https://e0.365dm.com/21/06/1600x900/skysports-joao-cancelo-portugal_5413739.jpg?20210613105513");

            player13.setFirstName("Luke");
            player13.setLastName("Mbete");
            player13.setAge(18);
            player13.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://cdn.vox-cdn.com/thumbor/OjvhNcGTLizpl6dMOzEvPZndRGo=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/22214840/1289432140.jpg");

            player14.setFirstName("Joshua");
            player14.setLastName("Wilson-Esbrand");
            player14.setAge(18);
            player14.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player14.setNationality("England");
            player14.setPosition("Defender");
            player14.setImgUrl("https://i2-prod.manchestereveningnews.co.uk/incoming/article21623693.ece/ALTERNATES/s615/0_GettyImages-1235293619.jpg");

            player15.setFirstName("Conrad");
            player15.setLastName("Egan-Riley");
            player15.setAge(18);
            player15.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player15.setNationality("England");
            player15.setPosition("Defender");
            player15.setImgUrl("http://www.playmakerstats.com/img/jogadores/78/724778_med__20201122021829_conrad_riley.jpg");

            player16.setFirstName("Finley");
            player16.setLastName("Burns");
            player16.setAge(18);
            player16.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player16.setNationality("England");
            player16.setPosition("Defender");
            player16.setImgUrl("https://celebhook.com/wp-content/uploads/2021/03/d24160977b8eef7c65d8710e5d1862.jpg");

            player17.setFirstName("Ilkay");
            player17.setLastName("Gundogan");
            player17.setAge(30);
            player17.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player17.setNationality("Germany");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ilkay-gundogan-deutschland-1622737348-64121.jpg?lm=1622737355");

            player18.setLastName("Rodri");
            player18.setAge(25);
            player18.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player18.setNationality("Spain");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://i2-prod.manchestereveningnews.co.uk/incoming/article21225675.ece/ALTERNATES/s1200c/0_GettyImages-1284624649.jpg");

            player19.setFirstName("Kevin");
            player19.setLastName("De Bruyne");
            player19.setAge(30);
            player19.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player19.setNationality("Belgium");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://i2-prod.manchestereveningnews.co.uk/sport/football/football-news/article21560645.ece/ALTERNATES/s1200c/0_GettyImages-1334346387.jpg");

            player20.setFirstName("Bernardo");
            player20.setLastName("Silva");
            player20.setAge(27);
            player20.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player20.setNationality("Portugal");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://m5.netinfo.bg/media/images/35326/35326193/960-600-bernardo-silva.jpg");

            player21.setLastName("Fernandinho");
            player21.setAge(36);
            player21.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player21.setNationality("Brazil");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/fernandinho-manchester-city-1621586425-63001.jpg?lm=1621586435");

            player22.setFirstName("Phil");
            player22.setLastName("Foden");
            player22.setAge(21);
            player22.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player22.setNationality("England");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://resources.premierleague.com/photos/2020/08/31/b8a76f7f-21bf-42a2-a747-e9a94655929a/Phil-Foden-Manchester-City.png?width=930&height=620");

            player23.setFirstName("Jack");
            player23.setLastName("Grealish");
            player23.setAge(26);
            player23.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/203460-1581417066.jpg?lm=1");

            player24.setFirstName("Cole");
            player24.setLastName("Palmer");
            player24.setAge(19);
            player24.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player24.setNationality("England");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://i2-prod.manchestereveningnews.co.uk/incoming/article21168635.ece/ALTERNATES/s615/0_palmer.jpg");

            player25.setFirstName("Romeo");
            player25.setLastName("Lavia");
            player25.setAge(17);
            player25.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player25.setNationality("Belgium");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/romeo-lavia-manchester-city-u23-1622624966-63919.jpg?lm=1622624977");

            player26.setFirstName("James");
            player26.setLastName("McAtee");
            player26.setAge(18);
            player26.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player26.setNationality("England");
            player26.setPosition("Midfielder");
            player26.setImgUrl("https://pbs.twimg.com/profile_images/1343652104364314627/1HhT0Xaa_400x400.jpg");

            player27.setFirstName("Raheem");
            player27.setLastName("Sterling");
            player27.setAge(26);
            player27.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg):focal(1171x279:1173x277)/origin-imgresizer.eurosport.com/2021/10/04/3231829-66153848-2560-1440.jpg");

            player28.setFirstName("Gabriel");
            player28.setLastName("Jesus");
            player28.setAge(24);
            player28.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player28.setNationality("Brazil");
            player28.setPosition("Forward");
            player28.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/363205-1533284263.jpg?lm=1");

            player29.setFirstName("Ferran");
            player29.setLastName("Torres");
            player29.setAge(21);
            player29.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player29.setNationality("Spain");
            player29.setPosition("Forward");
            player29.setImgUrl("https://pbs.twimg.com/profile_images/1425562816317173767/lHaYBQFj_400x400.jpg");

            player30.setFirstName("Riyad");
            player30.setLastName("Mahrez");
            player30.setAge(30);
            player30.setClub(this.teamRepository.getById(Long.parseLong("12")));
            player30.setNationality("Algeria");
            player30.setPosition("Forward");
            player30.setImgUrl("https://pbs.twimg.com/profile_images/1362798215536533515/bISpXIoR_400x400.jpg");

            this.playerRepository.save(trainer);
            this.playerRepository.save(player1);
            this.playerRepository.save(player2);
            this.playerRepository.save(player3);
            this.playerRepository.save(player4);
            this.playerRepository.save(player5);
            this.playerRepository.save(player6);
            this.playerRepository.save(player7);
            this.playerRepository.save(player8);
            this.playerRepository.save(player9);
            this.playerRepository.save(player10);
            this.playerRepository.save(player11);
            this.playerRepository.save(player12);
            this.playerRepository.save(player13);
            this.playerRepository.save(player14);
            this.playerRepository.save(player15);
            this.playerRepository.save(player16);
            this.playerRepository.save(player17);
            this.playerRepository.save(player18);
            this.playerRepository.save(player19);
            this.playerRepository.save(player20);
            this.playerRepository.save(player21);
            this.playerRepository.save(player22);
            this.playerRepository.save(player23);
            this.playerRepository.save(player24);
            this.playerRepository.save(player25);
            this.playerRepository.save(player26);
            this.playerRepository.save(player27);
            this.playerRepository.save(player28);
            this.playerRepository.save(player29);
            this.playerRepository.save(player30);
        }
    }
}
