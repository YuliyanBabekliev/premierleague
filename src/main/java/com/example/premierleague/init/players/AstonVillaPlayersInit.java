package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AstonVillaPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public AstonVillaPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initAstonVillaPlayers() {
        if (this.playerRepository.count() == 29) {
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

            trainer.setFirstName("Dean");
            trainer.setLastName("Smith");
            trainer.setAge(50);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("2")));
            trainer.setNationality("England");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/135E6/production/_109943397_smith2.jpg");

            player1.setFirstName("Jed");
            player1.setLastName("Steer");
            player1.setAge(28);
            player1.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://underagaslitlamp.com/wp-content/uploads/2020/09/EhzfyVOWoAEthQo.jpg");

            player2.setFirstName("Emiliano");
            player2.setLastName("Martinez");
            player2.setAge(29);
            player2.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player2.setNationality("Argentina");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/emiliano-martinez-aston-villa-1602498475-48963.jpg?lm=1602498495");

            player3.setFirstName("Viljami");
            player3.setLastName("Sinisalo");
            player3.setAge(19);
            player3.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player3.setNationality("Finland");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://www.nottheoldfirm.com/static/uploads/15/2020/11/GettyImages-1229252581.jpg");

            player4.setFirstName("Matthew");
            player4.setLastName("Cash");
            player4.setAge(24);
            player4.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://resources.premierleague.com/premierleague/photos/players/250x250/p199796.png");

            player5.setFirstName("Ezri");
            player5.setLastName("Konsa");
            player5.setAge(23);
            player5.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://i.guim.co.uk/img/media/54ea9725ea38e8798361ac6e089acc32a1ed02f4/123_66_2301_1381/master/2301.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=1676e1be27d68e79c2fa7870cf6d6733");

            player6.setFirstName("Tyrone");
            player6.setLastName("Mings");
            player6.setAge(28);
            player6.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player6.setNationality("England");
            player6.setPosition("Defender");
            player6.setImgUrl("https://i2-prod.mirror.co.uk/incoming/article24396658.ece/ALTERNATES/s1200c/1_800x800-8.jpg");

            player7.setFirstName("Matt");
            player7.setLastName("Targett");
            player7.setAge(26);
            player7.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://bet-bet.net/wp-content/uploads/2021/03/Matt-Targett.png");

            player8.setFirstName("Kortney");
            player8.setLastName("Hause");
            player8.setAge(26);
            player8.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://resources.premierleague.com/premierleague/photos/players/250x250/p123354.png");

            player9.setFirstName("Ashley");
            player9.setLastName("Young");
            player9.setAge(36);
            player9.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://www.thefa.com/-/media/www-thefa-com/images/england/men-senior/mens-snr-updated-headshots/723-x-755/ashley-young723x755.ashx");

            player10.setFirstName("Axel");
            player10.setLastName("Tuanzebe");
            player10.setAge(23);
            player10.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://resources.premierleague.com/premierleague/photos/players/250x250/p180804.png");

            player11.setFirstName("Sil");
            player11.setLastName("Swinkels");
            player11.setAge(17);
            player11.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player11.setNationality("Netherlands");
            player11.setPosition("Defender");
            player11.setImgUrl("https://t.resfu.com/img_data/players/big/895797.jpg");

            player12.setFirstName("Douglas");
            player12.setLastName("Luiz");
            player12.setAge(23);
            player12.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player12.setNationality("Brazil");
            player12.setPosition("Midfielder");
            player12.setImgUrl("https://i.ytimg.com/vi/hxDm-Mr0h28/maxresdefault.jpg");

            player13.setFirstName("John");
            player13.setLastName("McGinn");
            player13.setAge(26);
            player13.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player13.setNationality("Scotland");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://e0.365dm.com/19/11/2048x1152/skysports-john-mcginn-aston-villa_4846630.jpg");

            player14.setLastName("Trezeguet");
            player14.setAge(26);
            player14.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player14.setNationality("Egypt");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/trezeguet-von-aston-villa-1589801229-38968.jpg?lm=1589801235");

            player15.setFirstName("Marvelous");
            player15.setLastName("Nakamba");
            player15.setAge(27);
            player15.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player15.setNationality("Zimbabwe");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://www.kick442.com/wp-content/uploads/2020/08/IMG-20200804-WA0086.jpg");

            player16.setFirstName("Anwar");
            player16.setLastName("El Ghazi");
            player16.setAge(26);
            player16.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player16.setNationality("Netherlands");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://resources.premierleague.com/premierleague/photos/players/250x250/p193488.png");

            player17.setFirstName("Morgan");
            player17.setLastName("Sanson");
            player17.setAge(27);
            player17.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player17.setNationality("France");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://i2-prod.leeds-live.co.uk/incoming/article19946726.ece/ALTERNATES/s615/0_GettyImages-1303352096.jpg");

            player18.setFirstName("Jacob");
            player18.setLastName("Ramsey");
            player18.setAge(20);
            player18.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://lastwordonsports.com/football/wp-content/uploads/sites/4/2021/02/gettyimages-1298177689-594x594-1.jpg");

            player19.setFirstName("Emiliano");
            player19.setLastName("Buendia");
            player19.setAge(24);
            player19.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player19.setNationality("Argentina");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://pbs.twimg.com/profile_images/1415631872164573185/p29pbDlr_400x400.jpg");

            player20.setFirstName("Jaden");
            player20.setLastName("Philogene-Bidace");
            player20.setAge(19);
            player20.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://i2-prod.birminghammail.co.uk/incoming/article21113860.ece/ALTERNATES/s615/1_GettyImages-1329940163.jpg");

            player21.setFirstName("Carney");
            player21.setLastName("Chukwuemeka");
            player21.setAge(17);
            player21.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://i2-prod.birminghammail.co.uk/incoming/article20489995.ece/ALTERNATES/s615/1_Newcastle-United-U18-v-Aston-Villa-U18-FA-Youth-Cup.jpg");

            player22.setFirstName("Aaron");
            player22.setLastName("Ramsey");
            player22.setAge(18);
            player22.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player22.setNationality("England");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://pbs.twimg.com/profile_images/1379522152316174343/qq2QSIJM.jpg");

            player23.setFirstName("Lamare");
            player23.setLastName("Bogarde");
            player23.setAge(17);
            player23.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player23.setNationality("Netherlands");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://static.wixstatic.com/media/9be7fa_6e859bbbac2a42569a8b0b47e23a4d1c~mv2.jpeg/v1/fill/w_275,h_183,al_c,q_80/Lamare%20Bogarde.jpeg");

            player24.setFirstName("Hayden");
            player24.setLastName("Lindley");
            player24.setAge(19);
            player24.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player24.setNationality("England");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://images.webapi.gc.avfcservices.co.uk/fit-in/1200x1200/50cc6580-eec6-11eb-bf1f-e52cb2fb1340.jpg");

            player25.setFirstName("Ollie");
            player25.setLastName("Watkins");
            player25.setAge(25);
            player25.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player25.setNationality("England");
            player25.setPosition("Forward");
            player25.setImgUrl("https://i2.wp.com/eurofootballrumours.com/wp-content/uploads/2021/04/Ollie-Watkins-4-800-445.jpg?fit=800%2C445&ssl=1");

            player26.setFirstName("Bertrand");
            player26.setLastName("Traore");
            player26.setAge(26);
            player26.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player26.setNationality("Burkina Faso");
            player26.setPosition("Forward");
            player26.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/205077.jpg?fallback=png");

            player27.setFirstName("Keinan");
            player27.setLastName("Davis");
            player27.setAge(23);
            player27.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://e0.365dm.com/20/09/1600x900/skysports-keinan-davis-aston-villa_5104961.jpg?20200922164032");

            player28.setFirstName("Leon");
            player28.setLastName("Bailey");
            player28.setAge(24);
            player28.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player28.setNationality("Jamaica");
            player28.setPosition("Forward");
            player28.setImgUrl("https://buzz-caribbean.com/app/uploads/2021/08/Leon-Bailey.jpg");

            player29.setFirstName("Danny");
            player29.setLastName("Ings");
            player29.setAge(29);
            player29.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player29.setNationality("England");
            player29.setPosition("Forward");
            player29.setImgUrl("https://images.webapi.gc.avfcservices.co.uk/fit-in/1400x1400/efc50bc0-f5eb-11eb-89cb-873d9c1104d1.jpg");

            player30.setFirstName("Caleb");
            player30.setLastName("Chukwuemeka");
            player30.setAge(19);
            player30.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player30.setNationality("England");
            player30.setPosition("Forward");
            player30.setImgUrl("https://sportslens.com/wp-content/uploads/2021/08/1004300866-1024x683.jpg");

            player31.setFirstName("Cameron");
            player31.setLastName("Archer");
            player31.setAge(19);
            player31.setClub(this.teamRepository.getById(Long.parseLong("2")));
            player31.setNationality("England");
            player31.setPosition("Forward");
            player31.setImgUrl("https://resources.premierleague.com/premierleague/photos/players/250x250/p433979.png");

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
        }
    }
}
