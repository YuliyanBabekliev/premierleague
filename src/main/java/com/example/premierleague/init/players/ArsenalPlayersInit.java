package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ArsenalPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public ArsenalPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initArsenalPlayers() {
        if (this.playerRepository.count() == 0) {
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

            trainer.setFirstName("Michael");
            trainer.setLastName("Arteta");
            trainer.setAge(39);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("1")));
            trainer.setNationality("Spain");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://icdn.justarsenal.com/wp-content/uploads/2020/02/arteta-boss.jpg");

            player1.setFirstName("Bernd");
            player1.setLastName("Leno");
            player1.setAge(29);
            player1.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player1.setNationality("Germany");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://e0.365dm.com/21/05/2048x1152/skysports-bernd-leno-arsenal_5378053.jpg");

            player2.setFirstName("Arthur");
            player2.setLastName("Okonkwo");
            player2.setAge(20);
            player2.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player2.setNationality("England");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://www.arsenal.com/sites/default/files/styles/desktop_16x9/public/images/Arthur%20Okonkwo.jpg?itok=Mx570_lg");

            player3.setFirstName("Karl");
            player3.setLastName("Hein");
            player3.setAge(19);
            player3.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player3.setNationality("Estonia");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/karl-hein-fc-arsenal-1574328281-27612.jpg?lm=1574328297");

            player4.setFirstName("Aaron");
            player4.setLastName("Ramsdale");
            player4.setAge(23);
            player4.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player4.setNationality("England");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://e0.365dm.com/21/08/768x432/skysports-ramsdale-arsenal_5484905.jpg?20210820185626");

            player5.setFirstName("Kieran");
            player5.setLastName("Tierney");
            player5.setAge(24);
            player5.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player5.setNationality("Scotland");
            player5.setPosition("Defender");
            player5.setImgUrl("https://resources.premierleague.com/photos/2021/09/06/1b8fcac1-17d7-41aa-8ec9-1ff9a39b4b55/GettyImages-1335717653.jpg?width=931&height=620");

            player6.setFirstName("Gabriel");
            player6.setLastName("Magalhaes");
            player6.setAge(23);
            player6.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player6.setNationality("Brazil");
            player6.setPosition("Defender");
            player6.setImgUrl("https://i2-prod.football.london/incoming/article19506984.ece/ALTERNATES/s1200c/0_Gabriel-Magalhaes.jpg");

            player7.setFirstName("Rob");
            player7.setLastName("Holding");
            player7.setAge(25);
            player7.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://i.guim.co.uk/img/media/1be83f18fba96bc8636c2890ec5041acf02d69b5/93_70_1850_1109/master/1850.jpg?width=445&quality=45&auto=format&fit=max&dpr=2&s=b1ab37067ee5e109179ee25f70a7ae08");

            player8.setFirstName("Cedric");
            player8.setLastName("Soares");
            player8.setAge(30);
            player8.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player8.setNationality("Portugal");
            player8.setPosition("Defender");
            player8.setImgUrl("https://icdn.justarsenal.com/wp-content/uploads/2020/03/arsenal-training-cedric-soares.jpg");

            player9.setFirstName("Calum");
            player9.setLastName("Chambers");
            player9.setAge(26);
            player9.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://icdn.justarsenal.com/wp-content/uploads/2020/12/Calum-Chambers.jpg");

            player10.setFirstName("Pablo");
            player10.setLastName("Mari");
            player10.setAge(28);
            player10.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player10.setNationality("Spain");
            player10.setPosition("Defender");
            player10.setImgUrl("https://i2-prod.football.london/incoming/article17881686.ece/ALTERNATES/s1200b/0_GettyImages-1210796622.jpg");

            player11.setFirstName("Sead");
            player11.setLastName("Kolasinac");
            player11.setAge(28);
            player11.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player11.setNationality("Bosnia & Herzegovina");
            player11.setPosition("Defender");
            player11.setImgUrl("https://static.dw.com/image/49751316_303.jpg");

            player12.setFirstName("Nuno");
            player12.setLastName("Tavares");
            player12.setAge(21);
            player12.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player12.setNationality("Portugal");
            player12.setPosition("Defender");
            player12.setImgUrl("https://www.flashnews.bg/wp-content/uploads/2021/07/E57TbwdXEAIyASD.jpg");

            player13.setFirstName("Ben");
            player13.setLastName("White");
            player13.setAge(23);
            player13.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ben-white-fc-arsenal-2021-1628865186-68923.jpg?lm=1628865197");

            player14.setFirstName("Takehiro");
            player14.setLastName("Tomiyasu");
            player14.setAge(22);
            player14.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player14.setNationality("Japan");
            player14.setPosition("Defender");
            player14.setImgUrl("https://dailycannon.com/static/uploads/2021/09/Tomiyasu-1.jpg");

            player15.setFirstName("Bukayo");
            player15.setLastName("Saka");
            player15.setAge(20);
            player15.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player15.setNationality("England");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://firstsportz.com/wp-content/uploads/2021/08/Adobe_Post_20210806_1507230.8390469338393933.jpg");

            player16.setFirstName("Thomas");
            player16.setLastName("Partey");
            player16.setAge(28);
            player16.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player16.setNationality("Ghana");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://www.coachesvoice.com/wp-content/uploads/2020/10/ParteyMobile-1.png");

            player17.setFirstName("Mohamed");
            player17.setLastName("Elneny");
            player17.setAge(29);
            player17.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player17.setNationality("Egypt");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/6/6f/Mohamed_Elneny_2018.jpg");

            player18.setFirstName("Emile Smith");
            player18.setLastName("Rowe");
            player18.setAge(21);
            player18.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://pbs.twimg.com/profile_images/1304122881878765568/IZNHjmPK_400x400.jpg");

            player19.setFirstName("Granit");
            player19.setLastName("Xhaka");
            player19.setAge(28);
            player19.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player19.setNationality("Switzerland");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/9BE2/production/_120360993_gettyimages-1233565434.jpg");

            player20.setFirstName("Ainsley");
            player20.setLastName("Maitland-Niles");
            player20.setAge(24);
            player20.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg):focal(1301x188:1303x186)/origin-imgresizer.eurosport.com/2021/08/31/3210125-65757768-2560-1440.jpg");

            player21.setFirstName("Albert");
            player21.setLastName("Lokonga");
            player21.setAge(21);
            player21.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player21.setNationality("Belgium");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://i2-prod.football.london/incoming/article21149643.ece/ALTERNATES/s1200c/0_Albert-S-L.jpg");

            player22.setFirstName("Marting");
            player22.setLastName("Odegaard");
            player22.setAge(22);
            player22.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player22.setNationality("Norway");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://i2-prod.football.london/arsenal-fc/players/article20349856.ece/ALTERNATES/s615/1_GettyImages-1307071240.jpg");

            player23.setFirstName("Alexandre");
            player23.setLastName("Lacazette");
            player23.setAge(30);
            player23.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player23.setNationality("France");
            player23.setPosition("Forward");
            player23.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/d/da/Alexandre_Lacazette_at_Baku_before_2019_UEFA_Europe_League_Final.jpg");

            player24.setFirstName("Pierre-Emerick");
            player24.setLastName("Aubameyang");
            player24.setAge(32);
            player24.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player24.setNationality("Gabon");
            player24.setPosition("Forward");
            player24.setImgUrl("https://s.france24.com/media/display/a6630dac-0675-11ec-8f19-005056bf30b7/7432a12fe9aa479cc7aeed3dab89fef329339a8c.jpg");

            player25.setFirstName("Nicolas");
            player25.setLastName("Pepe");
            player25.setAge(26);
            player25.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player25.setNationality("Cote D’Ivoire");
            player25.setPosition("Forward");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/nicolas-pepe-im-trikot-des-fc-arsenal-1568284596-25661.jpg?lm=1568284603");

            player26.setFirstName("Eddie");
            player26.setLastName("Nketiah");
            player26.setAge(22);
            player26.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player26.setNationality("England");
            player26.setPosition("Forward");
            player26.setImgUrl("https://metro.co.uk/wp-content/uploads/2021/09/GettyImages-1331851509.jpg?quality=90&strip=all&zoom=1&resize=480%2C340");

            player27.setFirstName("Gabriel");
            player27.setLastName("Martinelli");
            player27.setAge(20);
            player27.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player27.setNationality("Brazil");
            player27.setPosition("Forward");
            player27.setImgUrl("https://www.arsenal.com/sites/default/files/styles/desktop_16x9/public/images/main_0.jpg?itok=kwdZ_dqd");

            player28.setFirstName("Folarin");
            player28.setLastName("Balogun");
            player28.setAge(20);
            player28.setClub(this.teamRepository.getById(Long.parseLong("1")));
            player28.setNationality("England");
            player28.setPosition("Forward");
            player28.setImgUrl("https://ichef.bbci.co.uk/news/807/cpsprodpb/3457/live/b002acc0-eec7-11eb-bb1c-f526a77b5ab9.jpg");

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
        }
    }
}
