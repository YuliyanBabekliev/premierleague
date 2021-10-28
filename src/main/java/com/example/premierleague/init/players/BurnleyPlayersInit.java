package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BurnleyPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public BurnleyPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initBurnleyPlayers() {
        if (this.playerRepository.count() == 131) {
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

            trainer.setFirstName("Sean");
            trainer.setLastName("Dyche");
            trainer.setAge(50);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("5")));
            trainer.setNationality("England");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://i2-prod.lancs.live/sport/football/article18954371.ece/ALTERNATES/s615/0_Dyche-Sheff-U.jpg");

            player1.setFirstName("Nick");
            player1.setLastName("Pope");
            player1.setAge(29);
            player1.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://e0.365dm.com/21/03/2048x1152/skysports-nick-pope-england_5319720.jpg");

            player2.setFirstName("Will");
            player2.setLastName("Norris");
            player2.setAge(28);
            player2.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player2.setNationality("England");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://pbs.twimg.com/profile_images/1349503002483286016/yB8aBgY7.jpg");

            player3.setFirstName("Wayne");
            player3.setLastName("Hennessey");
            player3.setAge(34);
            player3.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player3.setNationality("Wales");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/7AA7/production/_119499313_gettyimages-1178481524.jpg");

            player4.setFirstName("Matthew");
            player4.setLastName("Lowton");
            player4.setAge(32);
            player4.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://i2-prod.lancs.live/incoming/article17011911.ece/ALTERNATES/s615/0_JS192671050.jpg");

            player5.setFirstName("Charlie");
            player5.setLastName("Taylor");
            player5.setAge(28);
            player5.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/charlie-taylor-fc-burnley-1583228507-33015.jpg?lm=1583228516");

            player6.setFirstName("James");
            player6.setLastName("Tarkowski");
            player6.setAge(28);
            player6.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player6.setNationality("England");
            player6.setPosition("Defender");
            player6.setImgUrl("https://img.bleacherreport.net/img/images/photos/003/785/201/hi-res-b504e987e5faa2d05d3b9bd73f637295_crop_north.jpg?1547144274&w=3072&h=2048");

            player7.setFirstName("Ben");
            player7.setLastName("Mee");
            player7.setAge(32);
            player7.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://e0.365dm.com/21/08/2048x1152/skysports-ben-mee-burnley-football_5483571.jpg");

            player8.setFirstName("Erik");
            player8.setLastName("Pieters");
            player8.setAge(33);
            player8.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player8.setNationality("Netherlands");
            player8.setPosition("Defender");
            player8.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/53762.jpg");

            player9.setFirstName("Phil");
            player9.setLastName("Bardsley");
            player9.setAge(36);
            player9.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player9.setNationality("Scotland");
            player9.setPosition("Defender");
            player9.setImgUrl("https://www.thesun.co.uk/wp-content/uploads/2018/04/nintchdbpict000344199894-e1523892013255.jpg");

            player10.setFirstName("Kevin");
            player10.setLastName("Long");
            player10.setAge(31);
            player10.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player10.setNationality("Ireland");
            player10.setPosition("Defender");
            player10.setImgUrl("https://cdn.theathletic.com/app/uploads/2020/05/22103259/KEVIN-LONG-BURNLEY-scaled-e1590158013775-1024x670.jpg");

            player11.setFirstName("Nathan");
            player11.setLastName("Collins");
            player11.setAge(20);
            player11.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player11.setNationality("Ireland");
            player11.setPosition("Defender");
            player11.setImgUrl("https://i2-prod.lancs.live/incoming/article20919382.ece/ALTERNATES/s615b/0_Collins-scarfjpggned.jpg");

            player12.setFirstName("Bobby");
            player12.setLastName("Thomas");
            player12.setAge(20);
            player12.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player12.setNationality("England");
            player12.setPosition("Defender");
            player12.setImgUrl("https://i2-prod.lancs.live/incoming/article21493458.ece/ALTERNATES/s615/0_GettyImages-1234212224.jpg");

            player13.setFirstName("Owen");
            player13.setLastName("Dodgson");
            player13.setAge(18);
            player13.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://media-cdn.incrowdsports.com/b42c9260-f48c-4f88-b06d-4bdbc484de49.jfif");

            player14.setFirstName("Maxwel");
            player14.setLastName("Cornet");
            player14.setAge(25);
            player14.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player14.setNationality("Cote D'Ivoire");
            player14.setPosition("Defender");
            player14.setImgUrl("https://icdn.caughtoffside.com/wp-content/uploads/2021/08/Screenshot-2021-08-29-at-11.00.44.jpg");

            player15.setFirstName("Connor");
            player15.setLastName("Roberts");
            player15.setAge(26);
            player15.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player15.setNationality("Wales");
            player15.setPosition("Defender");
            player15.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/94F6/production/_120343183_capture.png");

            player16.setFirstName("Jack");
            player16.setLastName("Cork");
            player16.setAge(32);
            player16.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player16.setNationality("England");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://e0.365dm.com/20/04/2048x1152/skysports-jack-cork-burnley_4978582.jpg");

            player17.setFirstName("Johann");
            player17.setLastName("Gudmundsson");
            player17.setAge(30);
            player17.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player17.setNationality("Iceland");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/gudmundsson-burnley-1589798438-38935.jpg?lm=1589798430");

            player18.setFirstName("Josh");
            player18.setLastName("Brownhill");
            player18.setAge(25);
            player18.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://e0.365dm.com/21/03/2048x1152/skysports-josh-brownhill-burnley_5299599.jpg");

            player19.setFirstName("Dwight");
            player19.setLastName("McNeil");
            player19.setAge(21);
            player19.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/Dwight_McNeil_controls_the_ball.jpg/1200px-Dwight_McNeil_controls_the_ball.jpg");

            player20.setFirstName("Dale");
            player20.setLastName("Stephens");
            player20.setAge(32);
            player20.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/75BB/production/_114593103_stephens.png");

            player21.setFirstName("Ashley");
            player21.setLastName("Westwood");
            player21.setAge(31);
            player21.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://i2-prod.birminghammail.co.uk/incoming/article16991781.ece/ALTERNATES/s615/0_Ashley-Westwood.jpg");

            player22.setFirstName("Matej");
            player22.setLastName("Vydra");
            player22.setAge(29);
            player22.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player22.setNationality("Czech Republic");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tbrfootball.com/static/uploads/27/2019/11/GettyImages-1164614436.jpg");

            player23.setFirstName("Lewis");
            player23.setLastName("Richardson");
            player23.setAge(18);
            player23.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://i2-prod.lancs.live/sport/football/article19942482.ece/ALTERNATES/s1200c/0_GettyImages-1231437821.jpg");

            player24.setFirstName("Aaron");
            player24.setLastName("Lennon");
            player24.setAge(34);
            player24.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player24.setNationality("England");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://e0.365dm.com/21/08/2048x1152/skysports-aaron-lennon-burnley_5490057.jpg");

            player25.setFirstName("Chris");
            player25.setLastName("Wood");
            player25.setAge(29);
            player25.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player25.setNationality("New Zealand");
            player25.setPosition("Forward");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/chris-wood-1587640098-36952.jpg?lm=1587640110");

            player26.setFirstName("Ashley");
            player26.setLastName("Barnes");
            player26.setAge(31);
            player26.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player26.setNationality("England");
            player26.setPosition("Forward");
            player26.setImgUrl("https://i2-prod.lancs.live/sport/football/article21194536.ece/ALTERNATES/s615/0_GettyImages-1234206195.jpg");

            player27.setFirstName("Jay");
            player27.setLastName("Rodriguez");
            player27.setAge(32);
            player27.setClub(this.teamRepository.getById(Long.parseLong("5")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://i2-prod.lancs.live/incoming/article16713357.ece/ALTERNATES/s615/1_JS189195894.jpg");

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
        }
    }
}
