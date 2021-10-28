package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WatfordPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public WatfordPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initWatfordPlayers() {
        if (this.playerRepository.count() == 528) {
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

            trainer.setFirstName("Claudio");
            trainer.setLastName("Ranieri");
            trainer.setAge(69);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("18")));
            trainer.setNationality("Italy");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://pbs.twimg.com/media/D09VR_0W0AAeVxK.jpg");

            player1.setFirstName("Ben");
            player1.setLastName("Foster");
            player1.setAge(38);
            player1.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ben-foster-1402056737-456.jpg?lm=1483605505");

            player2.setFirstName("Daniel");
            player2.setLastName("Bachmann");
            player2.setAge(27);
            player2.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player2.setNationality("Austria");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/daniel-bachmann-fc-watford-1621597082-63089.jpg?lm=1621597105");

            player3.setFirstName("Robert");
            player3.setLastName("Elliot");
            player3.setAge(35);
            player3.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player3.setNationality("Ireland");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://www.watfordfc.com/storage/27689/conversions/210129-Rob-Elliot-Club-TV-9234-featured_image.jpg");

            player4.setFirstName("Jeremy");
            player4.setLastName("Ngakia");
            player4.setAge(21);
            player4.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/503795-1591972619.jpg?lm=1");

            player5.setFirstName("William");
            player5.setLastName("Troost-Ekong");
            player5.setAge(28);
            player5.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player5.setNationality("Nigeria");
            player5.setPosition("Defender");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/william-troost-ekong-udinese-1595915852-44254.jpg?lm=1595915817");

            player6.setFirstName("Adam");
            player6.setLastName("Masina");
            player6.setAge(27);
            player6.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player6.setNationality("Morocco");
            player6.setPosition("Defender");
            player6.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/adam-masina-1478767402-6525.jpg?lm=1483606208");

            player7.setFirstName("Craig");
            player7.setLastName("Cathcart");
            player7.setAge(32);
            player7.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player7.setNationality("Northern Ireland");
            player7.setPosition("Defender");
            player7.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/59606-1452002771.jpg?lm=1");

            player8.setFirstName("Kiko");
            player8.setLastName("Femenia");
            player8.setAge(30);
            player8.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player8.setNationality("Spain");
            player8.setPosition("Defender");
            player8.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/76467-1490621112.jpg?lm=1");

            player9.setFirstName("Christian");
            player9.setLastName("Kabasele");
            player9.setAge(30);
            player9.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player9.setNationality("Belgium");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/christian-kabasele-fc-watford-1563693841-23782.jpg?lm=1563693856");

            player10.setFirstName("Francisco");
            player10.setLastName("Sierralta");
            player10.setAge(24);
            player10.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player10.setNationality("Chile");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/francisco-sierralta-1623407065-64801.jpg?lm=1623407075");

            player11.setFirstName("Danny");
            player11.setLastName("Rose");
            player11.setAge(31);
            player11.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/danny-rose-newcastle-united-1589270791-38300.jpg?lm=1589270840");

            player12.setFirstName("James");
            player12.setLastName("Morris");
            player12.setAge(19);
            player12.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player12.setNationality("England");
            player12.setPosition("Defender");
            player12.setImgUrl("https://pbs.twimg.com/media/E8CHADrVcAM2JjC.jpg");

            player13.setFirstName("Tom");
            player13.setLastName("Cleverley");
            player13.setAge(32);
            player13.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player13.setNationality("England");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://e0.365dm.com/20/10/768x432/skysports-tom-cleverley-watford_5144206.jpg?20201020130216");

            player14.setFirstName("Ken");
            player14.setLastName("Sema");
            player14.setAge(28);
            player14.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player14.setNationality("Sweden");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ken-sema-udinese-1598354476-45972.jpg?lm=1598354459");

            player15.setFirstName("Dan");
            player15.setLastName("Gosling");
            player15.setAge(31);
            player15.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player15.setNationality("England");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/44983-1518794379.jpg?lm=1");

            player16.setFirstName("Daniel");
            player16.setLastName("Phillips");
            player16.setAge(18);
            player16.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player16.setNationality("England");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://cdn.theathletic.com/app/uploads/2020/09/16032850/Daniel-Phillips-Watford-Carabao-Oxford-scaled-e1600241403209-1024x758.jpg");

            player17.setFirstName("Imran");
            player17.setLastName("Louza");
            player17.setAge(22);
            player17.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player17.setNationality("France");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/635336-1588595732.jpg?lm=1");

            player18.setFirstName("Ignacio");
            player18.setLastName("Pussetto");
            player18.setAge(25);
            player18.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player18.setNationality("Argentina");
            player18.setPosition("Forward");
            player18.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ignacio-pussetto-udinese-1579077208-29833.jpg?lm=1579077217");

            player19.setFirstName("Peter");
            player19.setLastName("Etebo");
            player19.setAge(25);
            player19.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player19.setNationality("Nigeria");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/etebo-getafe-1590759322-40011.jpg?lm=1590759308");

            player20.setFirstName("Kwadwo");
            player20.setLastName("Baah");
            player20.setAge(18);
            player20.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/kwadwo-baah-fa-cup-2020-1611914941-55513.jpg?lm=1611914978");

            player21.setFirstName("Juraj");
            player21.setLastName("Kucka");
            player21.setAge(34);
            player21.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player21.setNationality("Slovakia");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/juraj-kucka-parma-1589797844-38928.jpg?lm=1589797845");

            player22.setFirstName("Ozan");
            player22.setLastName("Tufan");
            player22.setAge(26);
            player22.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player22.setNationality("Turkey");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ozan-tufan-fenerbahce-1621608893-63196.jpg?lm=1621608906");

            player23.setFirstName("Moussa");
            player23.setLastName("Sissoko");
            player23.setAge(32);
            player23.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player23.setNationality("France");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/moussa-sissoko-tottenham-hotspur-2021-1616061967-58986.jpg?lm=1616061977");

            player24.setFirstName("Joao");
            player24.setLastName("Pedro");
            player24.setAge(20);
            player24.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player24.setNationality("Brazil");
            player24.setPosition("Forward");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/joao-pedro-watford-1589797823-38927.jpg?lm=1589797849");

            player25.setFirstName("Ismaila");
            player25.setLastName("Sarr");
            player25.setAge(23);
            player25.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player25.setNationality("Senegal");
            player25.setPosition("Forward");
            player25.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/410225-1491921148.jpg?lm=1");

            player26.setFirstName("Emmanuel");
            player26.setLastName("Dennis");
            player26.setAge(23);
            player26.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player26.setNationality("Nigeria");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tmssl.akamaized.net/images/foto/originals/emmanuel-dennis-1-fc-koln-1618313224-60734.jpg?lm=1618313234");

            player27.setFirstName("Ashley");
            player27.setLastName("Fletcher");
            player27.setAge(26);
            player27.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/289846-1464595910.jpg?lm=1");

            player28.setFirstName("Joshua");
            player28.setLastName("King");
            player28.setAge(29);
            player28.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player28.setNationality("Norway");
            player28.setPosition("Forward");
            player28.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/joshua-king-everton-1615457224-58531.jpg?lm=1615457253");

            player29.setFirstName("Cucho");
            player29.setLastName("Hernandez");
            player29.setAge(22);
            player29.setClub(this.teamRepository.getById(Long.parseLong("18")));
            player29.setNationality("Colombia");
            player29.setPosition("Forward");
            player29.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/cucho-hernandez-getafe-cf-2020-1609769014-53909.jpg?lm=1609769035");

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
