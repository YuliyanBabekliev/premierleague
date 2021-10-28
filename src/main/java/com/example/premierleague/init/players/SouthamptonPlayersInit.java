package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SouthamptonPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public SouthamptonPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initSouthamptonPlayers() {
        if (this.playerRepository.count() == 464) {
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

            trainer.setFirstName("Ralph");
            trainer.setLastName("Hasenhuttl");
            trainer.setAge(54);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("16")));
            trainer.setNationality("Austria");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/648.jpg");

            player1.setFirstName("Alex");
            player1.setLastName("McCarthy");
            player1.setAge(31);
            player1.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/torwart-alex-mccarthy-southampton-1538664079-18089.jpg?lm=1538664092");

            player2.setFirstName("Harry");
            player2.setLastName("Lewis");
            player2.setAge(23);
            player2.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player2.setNationality("England");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://www.thesportsdb.com/images/media/player/cutout/yk98wk1584908604.png");

            player3.setFirstName("Fraser");
            player3.setLastName("Forster");
            player3.setAge(33);
            player3.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/fraser-forster-1459244446-5189.jpg?lm=1483606036");

            player4.setFirstName("Kyle");
            player4.setLastName("Walker-Peters");
            player4.setAge(24);
            player4.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/kyle-walker-peters-vom-fc-southampton-1589799896-38955.jpg?lm=1589799887");

            player5.setFirstName("Jack");
            player5.setLastName("Stephens");
            player5.setAge(27);
            player5.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/6/67/Stephens_vs_Sevilla_2017.jpg");

            player6.setFirstName("Mohammed");
            player6.setLastName("Salisu");
            player6.setAge(22);
            player6.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player6.setNationality("Ghana");
            player6.setPosition("Defender");
            player6.setImgUrl("https://e0.365dm.com/20/08/2048x1152/skysports-mohammed-salisu-real-valladolid_5058729.jpg");

            player7.setFirstName("Jan");
            player7.setLastName("Bednarek");
            player7.setAge(25);
            player7.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player7.setNationality("Poland");
            player7.setPosition("Defender");
            player7.setImgUrl("https://e0.365dm.com/20/12/2048x1152/skysports-southampton-bednarek_5193823.jpg");

            player8.setFirstName("Yan");
            player8.setLastName("Valery");
            player8.setAge(22);
            player8.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player8.setNationality("France");
            player8.setPosition("Defender");
            player8.setImgUrl("https://i2-prod.hampshirelive.news/sport/football/football-news/article4862708.ece/ALTERNATES/s615/0_GettyImages-1294513346.jpg");

            player9.setFirstName("Romain");
            player9.setLastName("Perraud");
            player9.setAge(24);
            player9.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player9.setNationality("France");
            player9.setPosition("Defender");
            player9.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-romain-perraud-southampton_5481545.jpg?20210817103650");

            player10.setFirstName("Valentino");
            player10.setLastName("Livramento");
            player10.setAge(18);
            player10.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://pictures.tribuna.com/image/588101d3-5a37-4456-b533-54d66e460226?width=640&height=346");

            player11.setFirstName("Thierry");
            player11.setLastName("Small");
            player11.setAge(17);
            player11.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/thierry-small-1617355851-59968.jpg?lm=1617355928");

            player12.setLastName("Lyanco");
            player12.setAge(24);
            player12.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player12.setNationality("Brazil");
            player12.setPosition("Defender");
            player12.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/379807-1595859618.jpg?lm=1");

            player13.setFirstName("Oriol");
            player13.setLastName("Romeu");
            player13.setAge(30);
            player13.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player13.setNationality("Spain");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/romeu-southampton-1488903522-8813.jpg?lm=1488903541");

            player14.setFirstName("James");
            player14.setLastName("Ward-Prowse");
            player14.setAge(26);
            player14.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player14.setNationality("England");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/james-ward-prowse-fc-southampton-2021-1632382725-71562.jpg?lm=1632382735");

            player15.setFirstName("Nathan");
            player15.setLastName("Redmond");
            player15.setAge(27);
            player15.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player15.setNationality("England");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/nathan-redmond-suthampton-1589392905-38512.jpg?lm=1589392901");

            player16.setFirstName("Moussa");
            player16.setLastName("Djenepo");
            player16.setAge(23);
            player16.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player16.setNationality("Mali");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/moussa-djenepo-fc-southampton-1582626393-32329.jpg?lm=1582626410");

            player17.setFirstName("Stuart");
            player17.setLastName("Armstrong");
            player17.setAge(29);
            player17.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player17.setNationality("Scotland");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKQlMaEmIrQLFNFo7BQlTtXAK9R8LFWPwnUA&usqp=CAU");

            player18.setFirstName("William");
            player18.setLastName("Smallbone");
            player18.setAge(21);
            player18.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player18.setNationality("Ireland");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://cdn.thisisfutbol.com/wp-content/uploads/2020/06/smallbone.jpg");

            player19.setFirstName("Nathan");
            player19.setLastName("Tella");
            player19.setAge(22);
            player19.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXoOZPFdsJX_LC4RJHxm8bm__KygSj9bDVVpXdkg4Q2_fRgIYDJlWh5rn6iN94jh4wLxg&usqp=CAU");

            player20.setFirstName("Ibrahima");
            player20.setLastName("Diallo");
            player20.setAge(22);
            player20.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player20.setNationality("France");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ibrahima-diallo-fc-southampton-duell-mit-ross-barkley-aston-villa-1606903178-52387.jpg?lm=1606903191");

            player21.setFirstName("Mohamed");
            player21.setLastName("Elyounoussi");
            player21.setAge(27);
            player21.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player21.setNationality("Norway");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/186644-1473161627.jpg?lm=1");

            player22.setFirstName("Che");
            player22.setLastName("Adams");
            player22.setAge(25);
            player22.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player22.setNationality("Scotland");
            player22.setPosition("Forward");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/che-adams-southampton-1589383717-38476.jpg?lm=1589383712");

            player23.setFirstName("Shane");
            player23.setLastName("Long");
            player23.setAge(34);
            player23.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player23.setNationality("Ireland");
            player23.setPosition("Forward");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/shane-long-fc-southampton-1556079035-21901.jpg?lm=1556079044");

            player24.setFirstName("Theo");
            player24.setLastName("Walcott");
            player24.setAge(32);
            player24.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player24.setNationality("England");
            player24.setPosition("Forward");
            player24.setImgUrl("https://site-cdn.givemesport.com/images/20/11/07/b96ace9f8bdfa0ab476187625aadf552/960.jpg");

            player25.setFirstName("Armando");
            player25.setLastName("Broja");
            player25.setAge(20);
            player25.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player25.setNationality("Albania");
            player25.setPosition("Forward");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/armando-broja-vitesse-arnheim-1598017105-45817.jpg?lm=1598017087");

            player26.setFirstName("Adam");
            player26.setLastName("Armstrong");
            player26.setAge(24);
            player26.setClub(this.teamRepository.getById(Long.parseLong("16")));
            player26.setNationality("England");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/adam-armstrong-blackburn-rovers-1608655140-53544.jpg?lm=1608655192");

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
        }
    }
}
