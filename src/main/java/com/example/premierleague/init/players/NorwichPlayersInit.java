package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NorwichPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public NorwichPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initNorwichPlayers() {
        if (this.playerRepository.count() == 436) {
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

            trainer.setFirstName("Daniel");
            trainer.setLastName("Farke");
            trainer.setAge(44);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("15")));
            trainer.setNationality("Germany");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://i2-prod.football.london/incoming/article17856836.ece/ALTERNATES/s1200c/1_GettyImages-1204036019.jpg");

            player1.setFirstName("Tim");
            player1.setLastName("Krul");
            player1.setAge(33);
            player1.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player1.setNationality("Netherlands");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/tim-krul-norwich-city-1583656707-33324.jpg?lm=1583656728");

            player2.setFirstName("Michael");
            player2.setLastName("McGovern");
            player2.setAge(37);
            player2.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player2.setNationality("Nothern Ireland");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/a/a7/Michael_McGovern%2C_CZE-NIR_2019-10-14_%282%29.jpg");

            player3.setFirstName("Angus");
            player3.setLastName("Gunn");
            player3.setAge(25);
            player3.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/angus-gunn-fc-southampton-1539596463-18239.jpg?lm=1539596474");

            player4.setFirstName("Max");
            player4.setLastName("Aarons");
            player4.setAge(21);
            player4.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/471690-1543494081.jpg?lm=1");

            player5.setFirstName("Sam");
            player5.setLastName("Byram");
            player5.setAge(28);
            player5.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/big/sam-byram-nottingham-forest-1563265848-23624.jpg?lm=1563265861");

            player6.setFirstName("Grant");
            player6.setLastName("Hanley");
            player6.setAge(29);
            player6.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player6.setNationality("Scotland");
            player6.setPosition("Defender");
            player6.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/grant-hanley-1585655116-35419.jpg?lm=1585655134");

            player7.setFirstName("Christoph");
            player7.setLastName("Zimmermann");
            player7.setAge(28);
            player7.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player7.setNationality("Germany");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/christoph-zimmermann-norwich-city-1524818148-15114.jpg?lm=1524818161");

            player8.setFirstName("Bali");
            player8.setLastName("Mumba");
            player8.setAge(20);
            player8.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/433186-1544621857.jpg?lm=1");

            player9.setFirstName("Andrew");
            player9.setLastName("Omobamidele");
            player9.setAge(19);
            player9.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player9.setNationality("Ireland");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/max-aarons-von-norwich-city-1578587433-29470.jpg?lm=1578587442");

            player10.setFirstName("Ben");
            player10.setLastName("Gibson");
            player10.setAge(28);
            player10.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ben-gibson-norwich-city-1621422103-62775.jpg?lm=1621422129");

            player11.setFirstName("Dimitris");
            player11.setLastName("Giannoulis");
            player11.setAge(25);
            player11.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player11.setNationality("Greece");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/dimitrios-giannoulis-norwich-city-1620038091-61896.jpg?lm=1620038105");

            player12.setFirstName("Brandon");
            player12.setLastName("Williams");
            player12.setAge(21);
            player12.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player12.setNationality("England");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/brandon-williams-manchester-united-1589382322-38466.jpg?lm=1589382321");

            player13.setFirstName("Ozan");
            player13.setLastName("Kabak");
            player13.setAge(21);
            player13.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player13.setNationality("Turkey");
            player13.setPosition("Defender");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/big/ozan-kabak-vfb-stuttgart-1559558535-22591.jpg?lm=1559558552");

            player14.setFirstName("Lukas");
            player14.setLastName("Rupp");
            player14.setAge(30);
            player14.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player14.setNationality("Germany");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/lukas-rupp-norwich-city-1618584482-60985.jpg?lm=1618584495");

            player15.setFirstName("Kieran");
            player15.setLastName("Dowell");
            player15.setAge(23);
            player15.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player15.setNationality("England");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/kieran-dowell-wigan-athletic-1596109015-44532.jpg?lm=1596109041");

            player16.setFirstName("Przemyslaw");
            player16.setLastName("Placheta");
            player16.setAge(23);
            player16.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player16.setNationality("Poland");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/przemyslaw-placheta-norwich-city-1618586287-60994.jpg?lm=1618586304");

            player17.setFirstName("Todd");
            player17.setLastName("Cantwell");
            player17.setAge(23);
            player17.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player17.setNationality("England");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/todd-cantwell-norwich-city-1581929865-31826.jpg?lm=1581929892");

            player18.setFirstName("Jacob");
            player18.setLastName("Sorensen");
            player18.setAge(23);
            player18.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player18.setNationality("Denmark");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jakob-lungi-sorensen-esbjerg-fb-1595320458-43845.jpg?lm=1595320452");

            player19.setFirstName("Kenny");
            player19.setLastName("McLean");
            player19.setAge(29);
            player19.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player19.setNationality("Scotland");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/126600-1551178922.jpg?lm=1");

            player20.setFirstName("Milot");
            player20.setLastName("Rashica");
            player20.setAge(25);
            player20.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player20.setNationality("Kosovo");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/milot-rashica-sv-werder-bremen-1600076794-47228.jpg?lm=1600076801");

            player21.setFirstName("Billy");
            player21.setLastName("Gilmour");
            player21.setAge(20);
            player21.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player21.setNationality("Scotland");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/billy-gilmour-im-schottland-trikot-1621935832-63407.jpg?lm=1621935842");

            player22.setFirstName("Pierre");
            player22.setLastName("Lees-Melou");
            player22.setAge(28);
            player22.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player22.setNationality("France");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/pierre-lees-melou-ogc-nizza-1584516887-34126.jpg?lm=1584516898");

            player23.setFirstName("Mathias");
            player23.setLastName("Normann");
            player23.setAge(25);
            player23.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player23.setNationality("Norway");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/mathias-normann-rostov-1618305157-60713.jpg?lm=1618305174");

            player24.setFirstName("Teemu");
            player24.setLastName("Pukki");
            player24.setAge(31);
            player24.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player24.setNationality("Finland");
            player24.setPosition("Forward");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/teemu-pukki-norwich-2020-2021-1617794743-60275.jpg?lm=1617794754");

            player25.setFirstName("Adam");
            player25.setLastName("Idah");
            player25.setAge(20);
            player25.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player25.setNationality("Ireland");
            player25.setPosition("Forward");
            player25.setImgUrl("https://www.playmakerstats.com/img/jogadores/50/682950_med__20200705151638_adam_idah.jpg");

            player26.setFirstName("Joshua");
            player26.setLastName("Sargent");
            player26.setAge(21);
            player26.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player26.setNationality("United States");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tmssl.akamaized.net/images/foto/originals/josh-sargent-werder-bremen-1544264662-19158.jpg?lm=1544264729");

            player27.setFirstName("Christos");
            player27.setLastName("Tzolis");
            player27.setAge(19);
            player27.setClub(this.teamRepository.getById(Long.parseLong("15")));
            player27.setNationality("Greece");
            player27.setPosition("Forward");
            player27.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/christos-tzolis-paok-thessaloniki-1600175208-47331.jpg?lm=1600175222");

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
