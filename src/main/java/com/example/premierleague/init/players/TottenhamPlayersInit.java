package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TottenhamPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public TottenhamPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initTottenhamPlayers(){
        if (this.playerRepository.count() == 491) {
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

            trainer.setFirstName("Nunu");
            trainer.setLastName("Espirito Santo");
            trainer.setAge(47);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("17")));
            trainer.setNationality("Portugal");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg):focal(1198x442:1200x440)/origin-imgresizer.eurosport.com/2021/09/26/3227260-66062468-2560-1440.jpg");

            player1.setFirstName("Hugo");
            player1.setLastName("Lloris");
            player1.setAge(34);
            player1.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player1.setNationality("France");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/hugo-lloris-1471618515-5912.jpg?lm=1483606121");

            player2.setFirstName("Pierluigi");
            player2.setLastName("Gollini");
            player2.setAge(26);
            player2.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player2.setNationality("Italy");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/pierluigi-gollini-atalanta-bc-1594707920-43421.jpg?lm=1594707887");

            player3.setFirstName("Brandon");
            player3.setLastName("Austin");
            player3.setAge(22);
            player3.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/brandon-austin-1611335224-55162.jpg?lm=1611335296");

            player4.setFirstName("Matt");
            player4.setLastName("Doherty");
            player4.setAge(29);
            player4.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player4.setNationality("Ireland");
            player4.setPosition("Defender");
            player4.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/matt-doherty-tottenham-hotspur-1600607619-47565.jpg?lm=1600607630");

            player5.setFirstName("Sergio");
            player5.setLastName("Reguilon");
            player5.setAge(24);
            player5.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player5.setNationality("Spain");
            player5.setPosition("Defender");
            player5.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/282429-1559807731.png?lm=1");

            player6.setFirstName("Davinson");
            player6.setLastName("Sanchez");
            player6.setAge(25);
            player6.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player6.setNationality("Colombia");
            player6.setPosition("Defender");
            player6.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/davinson-sanchez-im-trikot-von-tottenham-1575976855-28149.jpg?lm=1575976862");

            player7.setFirstName("Joe");
            player7.setLastName("Rodon");
            player7.setAge(23);
            player7.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player7.setNationality("Wales");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/joe-rodon-tottenham-2020-1608133966-53291.jpg?lm=1608133987");

            player8.setFirstName("Japhet");
            player8.setLastName("Tanganga");
            player8.setAge(22);
            player8.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/japhet-tanganga-spurs-1580809416-31098.jpg?lm=1580809436");

            player9.setFirstName("Ben");
            player9.setLastName("Davies");
            player9.setAge(28);
            player9.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player9.setNationality("Wales");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ben-davies-tottenham-hotspur-1565092514-24352.jpg?lm=1565092525");

            player10.setFirstName("Eric");
            player10.setLastName("Dier");
            player10.setAge(27);
            player10.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/eric-dier-tottenham-1591341186-40568.jpg?lm=1591341168");

            player11.setFirstName("Cristian");
            player11.setLastName("Romero");
            player11.setAge(23);
            player11.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player11.setNationality("Argentina");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/cristian-romero-atalanta-1617715205-60170.jpg?lm=1617715229");

            player12.setFirstName("Maksim");
            player12.setLastName("Paskotsi");
            player12.setAge(18);
            player12.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player12.setNationality("Estonia");
            player12.setPosition("Defender");
            player12.setImgUrl("https://i2-prod.football.london/incoming/article20882170.ece/ALTERNATES/s1200c/0_GettyImages-1310123282.jpg");

            player13.setFirstName("Kallum");
            player13.setLastName("Cesay");
            player13.setAge(19);
            player13.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://media.gettyimages.com/photos/kallum-cesay-of-tottenham-hotspur-during-the-preseason-friendly-match-picture-id1329261472?s=594x594");

            player14.setFirstName("Brooklyn");
            player14.setLastName("Lyons-Foster");
            player14.setAge(20);
            player14.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player14.setNationality("England");
            player14.setPosition("Defender");
            player14.setImgUrl("https://media.gettyimages.com/photos/brooklyn-lyonsfoster-of-tottenham-hotspur-during-the-premier-league-2-picture-id1336679747");

            player15.setFirstName("Emerson");
            player15.setLastName("Royal");
            player15.setAge(22);
            player15.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player15.setNationality("Brazil");
            player15.setPosition("Defender");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/emerson-royal-fc-barcelona-2021-1630325965-69992.jpg?lm=1630325977");

            player16.setFirstName("Tobi");
            player16.setLastName("Omole");
            player16.setAge(21);
            player16.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player16.setNationality("England");
            player16.setPosition("Defender");
            player16.setImgUrl("https://dailycannon.com/static/uploads/2020/09/74795964_755459994932580_4407814499708854664_n.jpg");

            player17.setFirstName("Malachi");
            player17.setLastName("Fagan-Walcott");
            player17.setAge(19);
            player17.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player17.setNationality("England");
            player17.setPosition("Defender");
            player17.setImgUrl("https://i2-prod.football.london/incoming/article17901103.ece/ALTERNATES/s615/0_GettyImages-1176648236.jpg");

            player18.setFirstName("Pierre-Emile");
            player18.setLastName("Hojberg");
            player18.setAge(26);
            player18.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player18.setNationality("Denmark");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/pierre-emile-hojbjerg-tottenham-hotspur-1602502399-48972.jpg?lm=1602502424");

            player19.setFirstName("Harry");
            player19.setLastName("Winks");
            player19.setAge(25);
            player19.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/winks-pochettino-tottenham-1487070658-8357.jpg?lm=1487070680");

            player20.setFirstName("Giovani");
            player20.setLastName("Lo Celso");
            player20.setAge(25);
            player20.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player20.setNationality("Argentina");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/giovani-lo-celso-tottenham-2021-1629102770-68984.jpg?lm=1629102780");

            player21.setFirstName("Dele");
            player21.setLastName("Alli");
            player21.setAge(25);
            player21.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/207929-1612367000.jpg?lm=1");

            player22.setFirstName("Tanguy");
            player22.setLastName("Ndombele");
            player22.setAge(24);
            player22.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player22.setNationality("France");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://icdn.psgtalk.com/wp-content/uploads/2020/03/Tanguy-Ndombele-Tottenham-Hotspur-vs-Aston-Villa-Premier-League-2019.jpg");

            player23.setFirstName("Ryan");
            player23.setLastName("Sessegnon");
            player23.setAge(21);
            player23.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ryan-sessegnon-tsg-1899-hoffenheim-1604479483-50461.jpg?lm=1604479494");

            player24.setFirstName("Oliver");
            player24.setLastName("Skipp");
            player24.setAge(21);
            player24.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player24.setNationality("England");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/oliver-skipp-tottenham-1589385123-38490.jpg?lm=1589385119");

            player25.setFirstName("Jack");
            player25.setLastName("Clarke");
            player25.setAge(20);
            player25.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player25.setNationality("England");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jack-clarke-tottenham-hotspur-1610626530-54575.jpg?lm=1610626540");

            player30.setFirstName("Lucas");
            player30.setLastName("Moura");
            player30.setAge(29);
            player30.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player30.setNationality("Brazil");
            player30.setPosition("Forward");
            player30.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/lucas-moura-von-tottenham-1557349598-22166.jpg?lm=1557349611");

            player27.setFirstName("Harvey");
            player27.setLastName("White");
            player27.setAge(20);
            player27.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player27.setNationality("England");
            player27.setPosition("Midfielder");
            player27.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/harvey-white-tottenham-1598346749-45936.jpg?lm=1598346746");

            player28.setFirstName("Nile");
            player28.setLastName("John");
            player28.setAge(18);
            player28.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player28.setNationality("England");
            player28.setPosition("Midfielder");
            player28.setImgUrl("https://cloudfront.ligalive.net/wp-content/uploads/2021/02/25191654/imago1000959153h-795x1024.jpg");

            player29.setFirstName("Matthew");
            player29.setLastName("Craig");
            player29.setAge(18);
            player29.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player29.setNationality("Scotland");
            player29.setPosition("Midfielder");
            player29.setImgUrl("https://media.gettyimages.com/photos/matthew-craig-of-tottenham-hotspur-u23-during-the-preseason-friendly-picture-id1329260442");

            player26.setFirstName("Romaine");
            player26.setLastName("Mundle");
            player26.setAge(18);
            player26.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player26.setNationality("England");
            player26.setPosition("Midfielder");
            player26.setImgUrl("https://media.gettyimages.com/photos/romaine-mundle-of-tottenham-hotspur-u23-on-the-ball-during-the-picture-id1331657268");

            player31.setFirstName("Son");
            player31.setLastName("Heung-Min");
            player31.setAge(29);
            player31.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player31.setNationality("South Korea");
            player31.setPosition("Forward");
            player31.setImgUrl("https://tmssl.akamaized.net/images/foto/big/heung-min-son-tottenham-hotspur-1554843836-21622.jpg?lm=1554843857");

            player32.setFirstName("Harry");
            player32.setLastName("Kane");
            player32.setAge(28);
            player32.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player32.setNationality("England");
            player32.setPosition("Forward");
            player32.setImgUrl("https://tmssl.akamaized.net/images/foto/big/harry-kane-tottenham-hotspur-1622619898-63905.jpg?lm=1622619909");

            player33.setFirstName("Steven");
            player33.setLastName("Bergwijn");
            player33.setAge(23);
            player33.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player33.setNationality("Netherlands");
            player33.setPosition("Forward");
            player33.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/steven-bergwijn-tottenham-hotspur-1583783309-33431.jpg?lm=1583783327");

            player34.setFirstName("Bryan");
            player34.setLastName("Gil");
            player34.setAge(20);
            player34.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player34.setNationality("Spain");
            player34.setPosition("Forward");
            player34.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/bryan-gil-spain-1627307758-67864.jpg?lm=1627307778");

            player35.setFirstName("Dane");
            player35.setLastName("Scarlett");
            player35.setAge(17);
            player35.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player35.setNationality("England");
            player35.setPosition("Forward");
            player35.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/670883-1606475964.jpg?lm=1");

            player36.setFirstName("Dilan");
            player36.setLastName("Markanday");
            player36.setAge(20);
            player36.setClub(this.teamRepository.getById(Long.parseLong("17")));
            player36.setNationality("England");
            player36.setPosition("Forward");
            player36.setImgUrl("https://images2.minutemediacdn.com/image/upload/c_fill,w_720,ar_3:4,f_auto,q_auto,g_auto/shape/cover/sport/Tottenham-Hotspur-v-West-Ham-United-Premier-League-fb8f451cbd0d6484e4e22af08f87f64e.jpg");


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
