package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WolverhamptonPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public WolverhamptonPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initWolverhamptonPlayers() {
        if (this.playerRepository.count() == 586) {
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

            trainer.setFirstName("Bruno");
            trainer.setLastName("Lage");
            trainer.setAge(45);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("20")));
            trainer.setNationality("Portugal");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://resources.premierleague.com/photos/2021/07/08/f9f1b303-060a-429a-993a-186069c1a230/Bruno-Lage-Wolves.jpg?width=886&height=620");

            player1.setFirstName("John");
            player1.setLastName("Ruddy");
            player1.setAge(34);
            player1.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/john-ruddy-wolverhampton-wolves-2019-1598360264-45991.jpg?lm=1598360318");

            player2.setFirstName("Jose");
            player2.setLastName("Sa");
            player2.setAge(28);
            player2.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player2.setNationality("Portugal");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jose-sa-olympiakos-1557932932-22287.jpg?lm=1557932941");

            player3.setFirstName("Louie");
            player3.setLastName("Moulden");
            player3.setAge(19);
            player3.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl(" https://pbs.twimg.com/media/Ek9ZNrpX0AAREQ1.jpg");

            player4.setFirstName("Ki-Jana");
            player4.setLastName("Hoever");
            player4.setAge(19);
            player4.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player4.setNationality("Netherlands");
            player4.setPosition("Defender");
            player4.setImgUrl("https://resources.premierleague.com/photos/2020/09/19/d9b6a74f-4b5f-4a3f-8192-566d1bf9544d/Ki-Jana-Hoever-WOL.jpg?width=860&height=573");

            player5.setLastName("Marçal");
            player5.setAge(32);
            player5.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player5.setNationality("Brazil");
            player5.setPosition("Defender");
            player5.setImgUrl("https://e0.365dm.com/20/09/2048x1152/skysports-marcal-wolves_5089298.jpg");

            player6.setFirstName("Willy");
            player6.setLastName("Boly");
            player6.setAge(30);
            player6.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player6.setNationality("Cote D'Ivoire");
            player6.setPosition("Defender");
            player6.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/willy-boly-1585654504-35416.jpg?lm=1585654514");

            player7.setFirstName("Conor");
            player7.setLastName("Coady");
            player7.setAge(28);
            player7.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player7.setNationality("England");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/conor-coady-wolverhampton-1589377216-38449.jpg?lm=1589377210");

            player8.setLastName("Jonny");
            player8.setAge(27);
            player8.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player8.setNationality("Spain");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jonny-otto-1589455174-38577.jpg?lm=1589455177");

            player9.setFirstName("Nelson");
            player9.setLastName("Semedo");
            player9.setAge(27);
            player9.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player9.setNationality("Portugal");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/nelson-semedo-wolves-1601306794-47996.jpg?lm=1601306808");

            player10.setFirstName("Maximilian");
            player10.setLastName("Kilman");
            player10.setAge(24);
            player10.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/525247-1595852729.jpg?lm=1");

            player11.setFirstName("Yerson");
            player11.setLastName("Mosquera");
            player11.setAge(20);
            player11.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player11.setNationality("Colombia");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/yerson-mosquera-1630526373-70174.jpg?lm=1630526392");

            player12.setFirstName("Rayan");
            player12.setLastName("Ait-Nouri");
            player12.setAge(20);
            player12.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player12.setNationality("France");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/rayan-ait-nouri-wolverhampton-wanderers-1613401177-56569.jpg?lm=1613401211");

            player13.setFirstName("Ruben");
            player13.setLastName("Neves");
            player13.setAge(24);
            player13.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player13.setNationality("Portugal");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ruben-neves-portugal-1622736305-64116.jpg?lm=1622736312");

            player14.setFirstName("Daniel");
            player14.setLastName("Podence");
            player14.setAge(25);
            player14.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player14.setNationality("Portugal");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/daniel-podence-1589455947-38581.jpg?lm=1589455997");

            player15.setFirstName("Romain");
            player15.setLastName("Saiss");
            player15.setAge(31);
            player15.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player15.setNationality("Morocco");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/romain-saiss-wolverhampton-wanderers-1609141036-53661.jpg?lm=1609141049");

            player16.setFirstName("Joao");
            player16.setLastName("Moutinho");
            player16.setAge(35);
            player16.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player16.setNationality("Portugal");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/joao-moutinho-wolverhampton-wanderers-wolves-1574589980-27681.jpg?lm=1574589990");

            player17.setFirstName("Leander");
            player17.setLastName("Dendoncker");
            player17.setAge(26);
            player17.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player17.setNationality("Belgium");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/leander-dendoncker-wolverhampton-1568285309-25674.jpg?lm=1568285320");

            player18.setFirstName("Luke");
            player18.setLastName("Cundle");
            player18.setAge(19);
            player18.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://wolves-cdn.azureedge.net/media/19792/cundle.png");

            player19.setFirstName("Pedro");
            player19.setLastName("Neto");
            player19.setAge(21);
            player19.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player19.setNationality("Portugal");
            player19.setPosition("Forward");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/originals/pedro-neto-lazio-2018-1599641142-46980.jpg?lm=1599641153");

            player20.setFirstName("Raul");
            player20.setLastName("Jimenez");
            player20.setAge(30);
            player20.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player20.setNationality("Mexico");
            player20.setPosition("Forward");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/raul-jimenez-wolverhampton-wanderers-1583762963-33412.jpg?lm=1583762976");

            player21.setFirstName("Fabio");
            player21.setLastName("Silva");
            player21.setAge(19);
            player21.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player21.setNationality("Portugal");
            player21.setPosition("Forward");
            player21.setImgUrl("https://img.a.transfermarkt.technology/portrait/header/505653-1552402139.jpg?lm=1");

            player22.setFirstName("Adama");
            player22.setLastName("Traore");
            player22.setAge(25);
            player22.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player22.setNationality("Spain");
            player22.setPosition("Forward");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/adama-traore-wolverhampton-wanderers-1598959842-46505.jpg?lm=1598959821");

            player23.setLastName("Trincao");
            player23.setAge(21);
            player23.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player23.setNationality("Portugal");
            player23.setPosition("Forward");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/trincao-fc-barcelona-1625391029-66624.jpg?lm=1625391037");

            player24.setFirstName("Chem");
            player24.setLastName("Campbell");
            player24.setAge(18);
            player24.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player24.setNationality("Wales");
            player24.setPosition("Forward");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/chem-campbell-action-2019-1573573318-27369.jpg?lm=1573573342");

            player25.setFirstName("Hwang");
            player25.setLastName("Hee-Chan");
            player25.setAge(25);
            player25.setClub(this.teamRepository.getById(Long.parseLong("20")));
            player25.setNationality("South Korea");
            player25.setPosition("Forward");
            player25.setImgUrl("https://cdn-media.theathletic.com/cdn-cgi/image/fit=cover,width=700,height=466/Tt0wB2isTz2P_Tt0wB2isTz2P_463TrFg5eENH_original_1440x960.jpg");

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
        }
    }
}
