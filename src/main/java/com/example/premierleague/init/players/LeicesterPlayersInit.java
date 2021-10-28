package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeicesterPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public LeicesterPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initLeicesterPlayers(){
        if (this.playerRepository.count() == 277) {
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

            trainer.setFirstName("Brendan");
            trainer.setLastName("Rodgers");
            trainer.setAge(48);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("10")));
            trainer.setNationality("Northern Ireland");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/article3281749.ece/ALTERNATES/s615/0_Brendan-Rodgers-68.jpg");

            player1.setFirstName("Kasper");
            player1.setLastName("Schmeichel");
            player1.setAge(34);
            player1.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player1.setNationality("Denmark");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/kasper-schmeichel-2020-1588840602-37930.jpg?lm=1588840604");

            player2.setFirstName("Danny");
            player2.setLastName("Ward");
            player2.setAge(28);
            player2.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player2.setNationality("Wales");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/danny-ward-leicester-1589878824-39056.jpg?lm=1589878836");

            player3.setFirstName("Eldin");
            player3.setLastName("Jakupovic");
            player3.setAge(37);
            player3.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player3.setNationality("Switzerland");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/article2412123.ece/ALTERNATES/s1200c/0_Eldin-Jakupovic-5.jpg");

            player4.setFirstName("James");
            player4.setLastName("Justin");
            player4.setAge(23);
            player4.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/football-news/article4829983.ece/ALTERNATES/s1200c/0_James-Justin-32.jpg");

            player5.setFirstName("Wesley");
            player5.setLastName("Fofana");
            player5.setAge(20);
            player5.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player5.setNationality("France");
            player5.setPosition("Defender");
            player5.setImgUrl("https://icdn.football-espana.net/wp-content/uploads/2021/09/Wesley-Fofana3-640x427.jpg");

            player6.setFirstName("Caglar");
            player6.setLastName("Söyüncü");
            player6.setAge(25);
            player6.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player6.setNationality("Turkey");
            player6.setPosition("Defender");
            player6.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/320141-1622118720.jpg?lm=1");

            player7.setFirstName("Jonny");
            player7.setLastName("Evans");
            player7.setAge(33);
            player7.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player7.setNationality("Northern Ireland");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jonny-evans-leicester-city-1552575828-21104.jpg?lm=1552575838");

            player8.setFirstName("Daniel");
            player8.setLastName("Amartey");
            player8.setAge(26);
            player8.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player8.setNationality("Ghana");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/daniel-amartey-1580743252-31063.jpg?lm=1580743265");

            player9.setFirstName("Ricardo");
            player9.setLastName("Pereira");
            player9.setAge(27);
            player9.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player9.setNationality("Portugal");
            player9.setPosition("Defender");
            player9.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/football-news/article4912505.ece/ALTERNATES/s1200b/0_Ricardo-Pereira-83.jpg");

            player10.setFirstName("Timothy");
            player10.setLastName("Castagne");
            player10.setAge(25);
            player10.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player10.setNationality("Belgium");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/timothy-castagne-leicester-1601305553-47987.jpg?lm=1601305568");

            player11.setFirstName("Luke");
            player11.setLastName("Thomas");
            player11.setAge(20);
            player11.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/football-news/article4335710.ece/ALTERNATES/s1200c/0_Luke-Thomas-11.jpg");

            player12.setFirstName("Filip");
            player12.setLastName("Benkovic");
            player12.setAge(24);
            player12.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player12.setNationality("Croatia");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/filip-benkovic-leicester-city-1602928485-49374.jpg?lm=1602928500");

            player13.setFirstName("Ryan");
            player13.setLastName("Bertrand");
            player13.setAge(32);
            player13.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://talksport.com/wp-content/uploads/sites/5/2021/05/NINTCHDBPICT000652900787.jpg?strip=all&w=960&quality=100");

            player14.setFirstName("Jannik");
            player14.setLastName("Vestergaard");
            player14.setAge(29);
            player14.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player14.setNationality("Denmark");
            player14.setPosition("Defender");
            player14.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/football-news/article5790567.ece/ALTERNATES/s615/0_Jannik-Vestergaard-8.jpg");

            player15.setFirstName("Vontae ");
            player15.setLastName("Daley-Campbell");
            player15.setAge(20);
            player15.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player15.setNationality("England");
            player15.setPosition("Defender");
            player15.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/football-news/article4146335.ece/ALTERNATES/s1200b/0_Vontae-Daley-Campbell.jpg");

            player16.setFirstName("Ben");
            player16.setLastName("Nelson");
            player16.setAge(17);
            player16.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player16.setNationality("England");
            player16.setPosition("Defender");
            player16.setImgUrl("https://www.playmakerstats.com/img/jogadores/96/742596_med__20210118150847_ben_nelson.jpg");

            player17.setFirstName("Youri");
            player17.setLastName("Tielemans");
            player17.setAge(24);
            player17.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player17.setNationality("Belgium");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://i2-prod.leicestermercury.co.uk/sport/football/transfer-news/article5916208.ece/ALTERNATES/s615/0_Youri-Tielemans-1.jpg");

            player18.setFirstName("James");
            player18.setLastName("Maddison");
            player18.setAge(24);
            player18.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://i2-prod.football.london/incoming/article21252051.ece/ALTERNATES/s1200b/0_Maddison.jpg");

            player19.setFirstName("Marc");
            player19.setLastName("Albrighton");
            player19.setAge(31);
            player19.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/marc-albrighton-leicester-1589384346-38480.jpg?lm=1589384340");

            player20.setFirstName("Harver");
            player20.setLastName("Barnes");
            player20.setAge(23);
            player20.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/harvey-barnes-im-trikot-von-leicester-city-1588596041-37643.jpg?lm=1588596041");

            player21.setFirstName("Hamza");
            player21.setLastName("Choudhury");
            player21.setAge(24);
            player21.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/328088.jpg");

            player22.setFirstName("Nampalys");
            player22.setLastName("Mendy");
            player22.setAge(29);
            player22.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player22.setNationality("Senegal");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://e0.365dm.com/20/08/2048x1152/skysports-nampalys-mendy-leicester_5075984.jpg");

            player23.setFirstName("Wilfred");
            player23.setLastName("Ndidi");
            player23.setAge(24);
            player23.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player23.setNationality("Nigeria");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://www.kick442.com/wp-content/uploads/2020/04/IMG-20200427-WA0011.jpg");

            player24.setFirstName("Boubakary");
            player24.setLastName("Soumare");
            player24.setAge(22);
            player24.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player24.setNationality("France");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/soumare-im-trikot-von-lille-1576759122-28733.jpg?lm=1576759133");

            player25.setFirstName("Kiernan");
            player25.setLastName("Dewsbury-Hall");
            player25.setAge(23);
            player25.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player25.setNationality("England");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/138B8/production/_110665008_kiernandewsburyhall-2.jpg");

            player26.setFirstName("Thanawat");
            player26.setLastName("Suengchitthawon");
            player26.setAge(21);
            player26.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player26.setNationality("Thailand");
            player26.setPosition("Midfielder");
            player26.setImgUrl("https://images2.minutemediacdn.com/image/fetch/w_2000,h_2000,c_fit/https%3A%2F%2Ffoxesofleicester.com%2Fwp-content%2Fuploads%2Fgetty-images%2F2017%2F07%2F1310615965.jpeg");

            player27.setFirstName("Jamie");
            player27.setLastName("Vardy");
            player27.setAge(34);
            player27.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jamie-vardy-leicester-city-2020-21-1603690678-49874.jpg?lm=1603690694");

            player28.setFirstName("Kelechi");
            player28.setLastName("Iheanacho");
            player28.setAge(25);
            player28.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player28.setNationality("Nigeria");
            player28.setPosition("Forward");
            player28.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/295330-1617442598.jpg?lm=1");

            player29.setFirstName("Ayoze");
            player29.setLastName("Perez");
            player29.setAge(28);
            player29.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player29.setNationality("Spain");
            player29.setPosition("Forward");
            player29.setImgUrl("https://resources.premierleague.com/photos/2019/08/05/02245d72-a8f9-4da4-9cac-c6ff1f508309/GettyImages-1165796001-1-.jpg?width=933&height=620");

            player30.setFirstName("Patson");
            player30.setLastName("Daka");
            player30.setAge(22);
            player30.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player30.setNationality("Zambia");
            player30.setPosition("Forward");
            player30.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/365172-1601103855.png?lm=1");

            player31.setFirstName("Ademola");
            player31.setLastName("Lookman");
            player31.setAge(23);
            player31.setClub(this.teamRepository.getById(Long.parseLong("10")));
            player31.setNationality("England");
            player31.setPosition("Forward");
            player31.setImgUrl("https://i.guim.co.uk/img/media/9e909d94e99012a9543a49cc67e747daa8fd28bc/1587_243_2803_1682/master/2803.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=5625c3bdad9dc0fb48b6f7c43f8b5e3e");

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
