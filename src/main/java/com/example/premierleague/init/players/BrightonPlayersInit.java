package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BrightonPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public BrightonPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initBrightonPlayers(){
        if (this.playerRepository.count() == 94) {
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
            Player player31 = new Player();
            Player player32 = new Player();
            Player player33 = new Player();
            Player player34 = new Player();
            Player player35 = new Player();
            Player player36 = new Player();

            trainer.setFirstName("Graham");
            trainer.setLastName("Potter");
            trainer.setAge(46);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("4")));
            trainer.setNationality("England");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://i2-prod.football.london/incoming/article20549255.ece/ALTERNATES/s615/0_GettyImages-1229142668.jpg");

            player1.setFirstName("Jason");
            player1.setLastName("Steele");
            player1.setAge(31);
            player1.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/122721.jpg");

            player2.setFirstName("Robert");
            player2.setLastName("Sanchez");
            player2.setAge(23);
            player2.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player2.setNationality("Spain");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://e0.365dm.com/21/03/2048x1152/skysports-robert-sanchez-brighton_5317574.jpg");

            player3.setFirstName("Kjell");
            player3.setLastName("Scherpen");
            player3.setAge(21);
            player3.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player3.setNationality("Netherlands");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://i1.wp.com/i.dailymail.co.uk/1s/2021/07/17/06/45550143-0-image-m-2_1626501235108.jpg?resize=634%2C518&ssl=1");

            player4.setFirstName("Thomas");
            player4.setLastName("McGill");
            player4.setAge(21);
            player4.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player4.setNationality("England");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://pbs.twimg.com/media/EtoHnVjXcAEOpn7.jpg");

            player5.setFirstName("Tariq");
            player5.setLastName("Lamptey");
            player5.setAge(20);
            player5.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://images.daznservices.com/di/library/GOAL/2/52/tariq-lamptey-brighton-2020-21_5osu5so0od8n1kng66kt8jgzg.jpg?t=-586787644&quality=60&w=1200&h=800");

            player6.setFirstName("Adam");
            player6.setLastName("Webster");
            player6.setAge(26);
            player6.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player6.setNationality("England");
            player6.setPosition("Defender");
            player6.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/adam-webster-brighton-1589798690-38939.jpg?lm=1589798683");

            player7.setFirstName("Lewis");
            player7.setLastName("Dunk");
            player7.setAge(29);
            player7.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://i2-prod.leeds-live.co.uk/incoming/article18711703.ece/ALTERNATES/s1200c/0_Lewis-Dunk.jpg");

            player8.setFirstName("Dan");
            player8.setLastName("Burn");
            player8.setAge(29);
            player8.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://cdn.theathletic.com/app/uploads/2020/06/12104746/dan-burn-brighton-scaled-e1591973397111-1024x683.jpg");

            player9.setFirstName("Joel");
            player9.setLastName("Veltman");
            player9.setAge(29);
            player9.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player9.setNationality("Netherlands");
            player9.setPosition("Defender");
            player9.setImgUrl("https://talksport.com/wp-content/uploads/sites/5/2020/07/Sun_Instagram_image_download_officiallallana_70504jpg-JS598969202.jpg?strip=all&w=960&quality=100");

            player10.setFirstName("Shane");
            player10.setLastName("Duffy");
            player10.setAge(29);
            player10.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player10.setNationality("Ireland");
            player10.setPosition("Defender");
            player10.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/e/e1/Shane_Duffy_2018.jpg");

            player11.setFirstName("Haydon");
            player11.setLastName("Roberts");
            player11.setAge(19);
            player11.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://media.gettyimages.com/photos/hayden-roberts-of-brighton-hove-albion-during-the-premier-league-2-picture-id1022958910?s=594x594");

            player12.setFirstName("James");
            player12.setLastName("Furlong");
            player12.setAge(19);
            player12.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player12.setNationality("Ireland");
            player12.setPosition("Defender");
            player12.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2020/09/02/a1f34487-63da-431f-baf9-8593a75f081e/23-James-Furlong.jpg?width=1500");

            player13.setFirstName("Odeluga");
            player13.setLastName("Offiah");
            player13.setAge(18);
            player13.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://resources.brightonandhovealbion.com/bhafc/players/620x670/p445548.png");

            player14.setFirstName("Antef");
            player14.setLastName("Tsoungui");
            player14.setAge(18);
            player14.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player14.setNationality("England");
            player14.setPosition("Defender");
            player14.setImgUrl("https://m.footballdatabase.eu/images/photos/players/a_393/393400.jpg");

            player15.setFirstName("Marc");
            player15.setLastName("Cucurella");
            player15.setAge(23);
            player15.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player15.setNationality("Spain");
            player15.setPosition("Defender");
            player15.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2021/08/31/d6cdbdf7-e38d-4fe6-b75f-9b87e89fd9c2/Marc-Cucurella-6.jpg?width=1500");

            player16.setFirstName("Tudor");
            player16.setLastName("Baluta");
            player16.setAge(22);
            player16.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player16.setNationality("Romania");
            player16.setPosition("Defender");
            player16.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2019/07/29/f979b67f-c189-4889-b66a-277e4b5d2114/Tudor-Baluta.JPG?width=414");

            player17.setFirstName("Ed");
            player17.setLastName("Turns");
            player17.setAge(18);
            player17.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player17.setNationality("England");
            player17.setPosition("Defender");
            player17.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2020/11/23/1b8acfb8-e603-4d05-a824-27d97f871483/15-Ed-Turns.jpg?width=1500");

            player18.setFirstName("Yves");
            player18.setLastName("Bissouma");
            player18.setAge(25);
            player18.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player18.setNationality("Mali");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://www.101greatgoals.com/wp-content/uploads/2021/08/GettyImages-1234678044-scaled.jpg");

            player19.setFirstName("Alex");
            player19.setLastName("Mac Allister");
            player19.setAge(22);
            player19.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player19.setNationality("Argentina");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://i.ytimg.com/vi/1gizwONq10Q/maxresdefault.jpg");

            player20.setFirstName("Pascal");
            player20.setLastName("Gross");
            player20.setAge(30);
            player20.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player20.setNationality("Germany");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://resources.premierleague.com/photos/2019/04/25/1cead752-e81c-402f-922e-7cb608b38505/2018-08-21T173230Z_1959134058_RC1DC9C29B60_RTRMADP_3_STOCK-BHA1819.jpg?width=930&height=620");

            player21.setFirstName("Adam");
            player21.setLastName("Lallana");
            player21.setAge(33);
            player21.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://webnews.bg/uploads/images/13/9813/489813/768x432.jpg?_=1595881549");

            player22.setFirstName("Vitaly");
            player22.setLastName("Janelt");
            player22.setAge(23);
            player22.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player22.setNationality("Germany");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/vitaly-janelt-fc-brentford-1613122451-56439.jpg?lm=1613122464");

            player23.setFirstName("Jakub");
            player23.setLastName("Moder");
            player23.setAge(22);
            player23.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player23.setNationality("Poland");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://cdn.theathletic.com/app/uploads/2020/12/27130826/Jakub-Moder-scaled-e1609092570468-1024x683.jpg");

            player24.setFirstName("Steven");
            player24.setLastName("Alzate");
            player24.setAge(23);
            player24.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player24.setNationality("Colombia");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://pbs.twimg.com/profile_images/1193856930441256960/awH86kwN_400x400.jpg");

            player25.setFirstName("Solly");
            player25.setLastName("March");
            player25.setAge(27);
            player25.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player25.setNationality("England");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/solly-march-brighton-1589802081-38972.jpg?lm=1589802075");

            player26.setFirstName("Enock");
            player26.setLastName("Mwepu");
            player26.setAge(23);
            player26.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player26.setNationality("Zambia");
            player26.setPosition("Midfielder");
            player26.setImgUrl("https://resources.premierleague.com/photos/2021/08/07/e9683755-2c67-4f01-9c7d-e6680aadc663/Mwepu.jpg?width=930&height=620");

            player27.setFirstName("Taylor");
            player27.setLastName("Richards");
            player27.setAge(20);
            player27.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player27.setNationality("England");
            player27.setPosition("Midfielder");
            player27.setImgUrl("https://resources.brightonandhovealbion.com/bhafc/photo/2020/08/24/1594f439-38d0-4ee7-993c-0c047ec840ff/Taylor-Richards.jpg");

            player28.setFirstName("Marc");
            player28.setLastName("Leonard");
            player28.setAge(19);
            player28.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player28.setNationality("Scotland");
            player28.setPosition("Midfielder");
            player28.setImgUrl("https://i2-prod.sussexlive.co.uk/incoming/article5297147.ece/ALTERNATES/s615/0_GettyImages-1231330025.jpg");

            player29.setFirstName("Andrew");
            player29.setLastName("Moran");
            player29.setAge(17);
            player29.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player29.setNationality("Ireland");
            player29.setPosition("Midfielder");
            player29.setImgUrl("https://pbs.twimg.com/media/E7Pcz6RWYAIRbB-.jpg");

            player30.setFirstName("Aaron");
            player30.setLastName("Connolly");
            player30.setAge(21);
            player30.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player30.setNationality("Ireland");
            player30.setPosition("Forward");
            player30.setImgUrl("https://i2-prod.irishmirror.ie/incoming/article23716010.ece/ALTERNATES/s1200c/1_GettyImages-1289963675.jpg");

            player31.setFirstName("Neal");
            player31.setLastName("Maupay");
            player31.setAge(25);
            player31.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player31.setNationality("France");
            player31.setPosition("Forward");
            player31.setImgUrl("https://ichef.bbci.co.uk/news/976/cpsprodpb/1858F/production/_118772799_hi066225831.jpg");

            player32.setFirstName("Leandro");
            player32.setLastName("Trossard");
            player32.setAge(26);
            player32.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player32.setNationality("Belgium");
            player32.setPosition("Forward");
            player32.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/leandro-trossard-brighton-1589799181-38944.jpg?lm=1589799175");

            player33.setFirstName("Danny");
            player33.setLastName("Wellbeck");
            player33.setAge(30);
            player33.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player33.setNationality("England");
            player33.setPosition("Forward");
            player33.setImgUrl("https://d3vlf99qeg6bpx.cloudfront.net/content/uploads/2018/11/13091203/Danny.Welbeck1.jpg");

            player34.setFirstName("Evan");
            player34.setLastName("Ferguson");
            player34.setAge(16);
            player34.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player34.setNationality("Ireland");
            player34.setPosition("Forward");
            player34.setImgUrl("https://img2.thejournal.ie/article/5321081/river?version=5321083&width=1340");

            player35.setFirstName("Jurgen");
            player35.setLastName("Locadia");
            player35.setAge(27);
            player35.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player35.setNationality("Netherlands");
            player35.setPosition("Forward");
            player35.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/166505.jpg?fallback=png");

            player36.setFirstName("Jeremy");
            player36.setLastName("Sarmiento");
            player36.setAge(19);
            player36.setClub(this.teamRepository.getById(Long.parseLong("4")));
            player36.setNationality("England");
            player36.setPosition("Forward");
            player36.setImgUrl("https://i2-prod.sussexlive.co.uk/sport/football/football-news/article5641095.ece/ALTERNATES/s615/0_GettyImages-1140767573.jpg");

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
            this.playerRepository.save(player31);
            this.playerRepository.save(player32);
            this.playerRepository.save(player33);
            this.playerRepository.save(player34);
            this.playerRepository.save(player35);
            this.playerRepository.save(player36);
        }
    }
}
