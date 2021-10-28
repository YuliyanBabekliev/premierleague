package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CrystalPalacePlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public CrystalPalacePlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initCrystalPalacePlayers() {
        if (this.playerRepository.count() == 187) {
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

            trainer.setFirstName("Patrick");
            trainer.setLastName("Vieira");
            trainer.setAge(45);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("7")));
            trainer.setNationality("France");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://e0.365dm.com/21/07/768x432/skysports-crystal-palace-patrick-vieira_5459120.png?20210726141813");

            player1.setFirstName("Jack");
            player1.setLastName("Butland");
            player1.setAge(28);
            player1.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://pbs.twimg.com/profile_images/1393995872116019202/-921Ninh_400x400.jpg");

            player2.setFirstName("Vicente");
            player2.setLastName("Guaita");
            player2.setAge(34);
            player2.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player2.setNationality("Spain");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/vicente-guaita-crystal-palace-1570781044-26478.jpg?lm=1570781054");

            player3.setFirstName("Remi");
            player3.setLastName("Matthews");
            player3.setAge(27);
            player3.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://i2-prod.chroniclelive.co.uk/incoming/article18812169.ece/ALTERNATES/s1200c/0_Sunderland-Unveil-New-Signing-Remi-Matthews.jpg");

            player4.setFirstName("Joel");
            player4.setLastName("Ward");
            player4.setAge(31);
            player4.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/f/f6/Joel_Ward_2012.jpg");

            player5.setFirstName("James");
            player5.setLastName("Tomkins");
            player5.setAge(32);
            player5.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/110150.jpg");

            player6.setFirstName("Nathaniel");
            player6.setLastName("Clyne");
            player6.setAge(30);
            player6.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player6.setNationality("England");
            player6.setPosition("Defender");
            player6.setImgUrl("https://cdn.mos.cms.futurecdn.net/u8Bh84LyyQuraKfVkKyF49.jpg");

            player7.setFirstName("Tyrick");
            player7.setLastName("Mitchell");
            player7.setAge(22);
            player7.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/tyrick-mitchell-crystal-palace-1602499082-48965.jpg?lm=1602499234");

            player8.setFirstName("Martin");
            player8.setLastName("Kelly");
            player8.setAge(31);
            player8.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://resources.premierleague.com/photos/2019/08/12/10f529d6-170f-407a-837e-1a25c9ab5396/Martin-Kelly.jpg?width=930&height=620");

            player9.setFirstName("Nathan");
            player9.setLastName("Ferguson");
            player9.setAge(20);
            player9.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://cdn.footballtransfertavern.com/wp-content/uploads/2020/11/Nathan-Ferguson-Crystal-Palace.jpg");

            player10.setFirstName("Marc");
            player10.setLastName("Guehi");
            player10.setAge(21);
            player10.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://static.standard.co.uk/2021/07/18/19/newFile.jpg?width=1200&width=1200&auto=webp&quality=75");

            player11.setFirstName("Joachim");
            player11.setLastName("Andersen");
            player11.setAge(25);
            player11.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player11.setNationality("Denmark");
            player11.setPosition("Defender");
            player11.setImgUrl("https://e0.365dm.com/21/05/1600x900/skysports-fulham-andersen-joachim-andersen_5381683.jpg?20210514170858");

            player12.setFirstName("Reece");
            player12.setLastName("Hannam");
            player12.setAge(21);
            player12.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player12.setNationality("England");
            player12.setPosition("Defender");
            player12.setImgUrl("https://media-cdn.incrowdsports.com/43eccbc2-0729-4a69-abbd-47c49101e976.jpg");

            player13.setFirstName("Luka");
            player13.setLastName("Milivojevic");
            player13.setAge(30);
            player13.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player13.setNationality("Serbia");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/luka-milivojevic-1589792862-38817.jpg?lm=1589792891");

            player14.setFirstName("Cheikhou");
            player14.setLastName("Kouyate");
            player14.setAge(31);
            player14.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player14.setNationality("Senegal");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/cheikhou-kouyate-crystal-palace-1589384595-38482.jpg?lm=1589384588");

            player15.setFirstName("Jeffrey");
            player15.setLastName("Schlupp");
            player15.setAge(28);
            player15.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player15.setNationality("Ghana");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://pbs.twimg.com/profile_images/1184186965685624834/Jfy5JpE0_400x400.jpg");

            player16.setFirstName("James");
            player16.setLastName("McArthur");
            player16.setAge(33);
            player16.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player16.setNationality("Scotland");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/109763.jpg");

            player17.setFirstName("Eberechi");
            player17.setLastName("Eze");
            player17.setAge(23);
            player17.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player17.setNationality("England");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://cdn-media.theathletic.com/cdn-cgi/image/fit=cover,width=700,height=466/rbB0LvqozjFd_oBDGpCAF5M2L_1440x960.jpg");

            player18.setFirstName("Jairo");
            player18.setLastName("Riedewald");
            player18.setAge(25);
            player18.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player18.setNationality("Netherlands");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://i2-prod.football.london/incoming/article19254767.ece/ALTERNATES/s1200c/0_GettyImages-1281986672.jpg");

            player19.setFirstName("Michael");
            player19.setLastName("Olise");
            player19.setAge(19);
            player19.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player19.setNationality("France");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://resources.premierleague.com/premierleague/photo/2021/07/08/ba41faa0-a260-4097-8de3-a49c7be98f4d/Screenshot-2021-07-08-at-15.12.36.png");

            player20.setFirstName("Conor");
            player20.setLastName("Gallagher");
            player20.setAge(21);
            player20.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://cdn.vox-cdn.com/thumbor/UT9TWQs5KWMUoElJA2P0LucceX0=/0x0:2693x1796/1200x800/filters:focal(1079x697:1509x1127)/cdn.vox-cdn.com/uploads/chorus_image/image/69759462/1234796499.0.jpg");

            player21.setFirstName("Jesurun");
            player21.setLastName("Rak-Sakyi");
            player21.setAge(18);
            player21.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://i2-prod.football.london/incoming/article20357417.ece/ALTERNATES/s1200c/1_Rak-Sakyi.jpg");

            player22.setFirstName("Will");
            player22.setLastName("Hughes");
            player22.setAge(26);
            player22.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player22.setNationality("England");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://pbs.twimg.com/profile_images/1431733073201319939/RDeO1ETw_400x400.jpg");

            player23.setFirstName("Jordan");
            player23.setLastName("Ayew");
            player23.setAge(30);
            player23.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player23.setNationality("Ghana");
            player23.setPosition("Forward");
            player23.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/158615.jpg?fallback=png");

            player24.setFirstName("Wilfried");
            player24.setLastName("Zaha");
            player24.setAge(28);
            player24.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player24.setNationality("Cote Di'Voire");
            player24.setPosition("Forward");
            player24.setImgUrl("https://e0.365dm.com/20/07/2048x1152/skysports-wilfried-zaha-crystal-palace_5052686.jpg");

            player25.setFirstName("Jean-Philippe");
            player25.setLastName("Mateta");
            player25.setAge(24);
            player25.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player25.setNationality("France");
            player25.setPosition("Forward");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jean-philippe-mateta-crystal-palace-1632303146-71530.jpg?lm=1632303158");

            player26.setFirstName("Christian");
            player26.setLastName("Benteke");
            player26.setAge(30);
            player26.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player26.setNationality("Belgium");
            player26.setPosition("Forward");
            player26.setImgUrl("https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/crystal-palace-v-newcastle-united-premier-league-5ea2aebdec78208ee5000001.jpg");

            player27.setFirstName("Robert");
            player27.setLastName("Street");
            player27.setAge(20);
            player27.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://pbs.twimg.com/profile_images/1331750780492263425/p5zJ9UU2.jpg");

            player28.setFirstName("Scott");
            player28.setLastName("Banks");
            player28.setAge(20);
            player28.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player28.setNationality("Scotland");
            player28.setPosition("Forward");
            player28.setImgUrl("https://pbs.twimg.com/profile_images/1329954131298148353/Kw8583cC.jpg");

            player29.setFirstName("Odsonne");
            player29.setLastName("Edouard");
            player29.setAge(23);
            player29.setClub(this.teamRepository.getById(Long.parseLong("7")));
            player29.setNationality("France");
            player29.setPosition("Forward");
            player29.setImgUrl("https://i2-prod.dailyrecord.co.uk/incoming/article24965487.ece/ALTERNATES/s1200c/0_JS244779199-1.jpg");

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
        }
    }
}
