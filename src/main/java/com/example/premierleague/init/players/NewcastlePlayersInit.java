package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewcastlePlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public NewcastlePlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initNewcastlePlayers() {
        if (this.playerRepository.count() == 407) {
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

            trainer.setFirstName("Steve");
            trainer.setLastName("Bruce");
            trainer.setAge(60);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("14")));
            trainer.setNationality("England");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://i2-prod.chroniclelive.co.uk/sport/article19524713.ece/ALTERNATES/s1200c/0_steve-bruce.jpg");

            player1.setFirstName("Martin");
            player1.setLastName("Dubravka");
            player1.setAge(32);
            player1.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player1.setNationality("Slovakia");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/martin-dubravka-1553505565-21324.jpg?lm=1553505581");

            player2.setFirstName("Karl");
            player2.setLastName("Darlow");
            player2.setAge(30);
            player2.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player2.setNationality("England");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/karl-darlow-2016-1520605995-14380.jpg?lm=1520606011");

            player3.setFirstName("Mark");
            player3.setLastName("Gillespie");
            player3.setAge(29);
            player3.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/142389-1600681751.jpg?lm=1");

            player4.setFirstName("Daniel");
            player4.setLastName("Langley");
            player4.setAge(20);
            player4.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player4.setNationality("England");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://www.nufc.co.uk/media/50071/dan-langley-nufc-u23.jpg?anchor=center&mode=crop&width=600&height=338&quality=60");

            player5.setFirstName("Freddie");
            player5.setLastName("Woodman");
            player5.setAge(24);
            player5.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player5.setNationality("England");
            player5.setPosition("Goalkeeper");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/freddie-woodman-swansea-city-1615378418-58423.jpg?lm=1615378443");

            player6.setFirstName("Ciaran");
            player6.setLastName("Clark");
            player6.setAge(32);
            player6.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player6.setNationality("Ireland");
            player6.setPosition("Defender");
            player6.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/98240-1410950237.jpg?lm=1");

            player7.setFirstName("Paul");
            player7.setLastName("Dummett");
            player7.setAge(30);
            player7.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player7.setNationality("Wales");
            player7.setPosition("Defender");
            player7.setImgUrl("https://i2-prod.chroniclelive.co.uk/incoming/article19686591.ece/ALTERNATES/s1200c/0_Newcastle-United-v-Fulham-Premier-League.jpg");

            player8.setFirstName("Fabian");
            player8.setLastName("Schar");
            player8.setAge(29);
            player8.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player8.setNationality("Switzerland");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/fabian-schar-newcastle-1589879416-39067.jpg?lm=1589879443");

            player9.setFirstName("Jamaal");
            player9.setLastName("Lascelles");
            player9.setAge(27);
            player9.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jamaal-lascelles-newcastle-united-1568285309-25673.jpg?lm=1568285319");

            player10.setFirstName("Jamal");
            player10.setLastName("Lewis");
            player10.setAge(23);
            player10.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player10.setNationality("Northern Ireland");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jamal-lewis-norwich-1589382182-38465.jpg?lm=1589382176");

            player11.setFirstName("Emil");
            player11.setLastName("Krafth");
            player11.setAge(27);
            player11.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player11.setNationality("Sweden");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/emil-krafth-schweden-matteo-darmian-italien-1528710174-15944.jpg?lm=1528710196");

            player12.setFirstName("Federico");
            player12.setLastName("Fernandez");
            player12.setAge(32);
            player12.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player12.setNationality("Argentina");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/federico-fernandez-swansea-city-1533841788-17087.jpg?lm=1533841812");

            player13.setFirstName("Javier");
            player13.setLastName("Manquillo");
            player13.setAge(27);
            player13.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player13.setNationality("Spain");
            player13.setPosition("Defender");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/javier-manquillo-1406892386-1963.jpg?lm=1483605666");

            player14.setFirstName("Jonjo");
            player14.setLastName("Shelvey");
            player14.setAge(29);
            player14.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player14.setNationality("England");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jonjo-shelvey-newcastle-united-1583486362-33232.jpg?lm=1583486380");

            player15.setFirstName("Matt");
            player15.setLastName("Richie");
            player15.setAge(32);
            player15.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player15.setNationality("Scotland");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/matt-ritchie-newcastle-1589382649-38468.jpg?lm=1589382646");

            player16.setFirstName("Isaac");
            player16.setLastName("Hayden");
            player16.setAge(26);
            player16.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player16.setNationality("England");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/isaac-hayden-newcastle-united-1568367765-25705.jpg?lm=1568367776");

            player17.setFirstName("Jeff");
            player17.setLastName("Hendrick");
            player17.setAge(29);
            player17.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player17.setNationality("Ireland");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jeff-hendrick-burnley-1589384206-38478.jpg?lm=1589384206");

            player18.setFirstName("Ryan");
            player18.setLastName("Fraser");
            player18.setAge(27);
            player18.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player18.setNationality("Scotland");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ryan-fraser-newcastle-2020-1608044700-53220.jpg?lm=1608044707");

            player19.setFirstName("Jacob");
            player19.setLastName("Murphy");
            player19.setAge(26);
            player19.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/josh-murphy-cardiff-city-1571304849-26634.jpg?lm=1571304876");

            player20.setFirstName("Miguel");
            player20.setLastName("Almiron");
            player20.setAge(27);
            player20.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player20.setNationality("Paraguay");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/miguel-almiron-newcastle-1589879266-39065.jpg?lm=1589879271");

            player21.setFirstName("Sean");
            player21.setLastName("Longstaff");
            player21.setAge(23);
            player21.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/sean-longstaff-im-trikot-von-newcastle-1588596196-37648.jpg?lm=1588596196");

            player22.setFirstName("Elliot");
            player22.setLastName("Anderson");
            player22.setAge(18);
            player22.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player22.setNationality("England");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://www.nottheoldfirm.com/static/uploads/15/2021/01/GettyImages-1230506400-1440x960.jpg");

            player23.setFirstName("Joseph");
            player23.setLastName("Willock");
            player23.setAge(22);
            player23.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/originals/joe-willock-newcastle-united-1619271965-61432.jpg?lm=1619271974");

            player24.setFirstName("Joe");
            player24.setLastName("White");
            player24.setAge(19);
            player24.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player24.setNationality("England");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://www.nufc.co.uk/media/56911/joe-white-fa-youth-cup.jpg?anchor=center&mode=crop&width=900&height=506&quality=75");

            player25.setLastName("Joelington");
            player25.setAge(25);
            player25.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player25.setNationality("Brazil");
            player25.setPosition("Forward");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/joelinton-newcastle-united-1583158928-32982.jpg?lm=1583158937");

            player26.setFirstName("Allan");
            player26.setLastName("Saint-Maximin");
            player26.setAge(24);
            player26.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player26.setNationality("France");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/allan-saint-maximin-newcastle-1589879184-39064.jpg?lm=1589879201");

            player27.setFirstName("Dwight");
            player27.setLastName("Gayle");
            player27.setAge(31);
            player27.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player27.setNationality("England");
            player27.setPosition("Forward");
            player27.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/dwight-gayle-newcastle-1589879492-39068.jpg?lm=1589879491");

            player28.setFirstName("Callum");
            player28.setLastName("Wilson");
            player28.setAge(29);
            player28.setClub(this.teamRepository.getById(Long.parseLong("14")));
            player28.setNationality("England");
            player28.setPosition("Forward");
            player28.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/callum-wilson-im-trikot-von-bournemouth-1575041579-27861.jpg?lm=1575041587");

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
