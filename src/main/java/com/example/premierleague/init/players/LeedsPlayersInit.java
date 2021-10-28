package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeedsPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public LeedsPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initLeedsPlayers() {
        if (this.playerRepository.count() == 247) {
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

            trainer.setFirstName("Marcelo");
            trainer.setLastName("Bielsa");
            trainer.setAge(66);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("9")));
            trainer.setNationality("Argentina");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/13427.jpg");

            player1.setFirstName("Illan");
            player1.setLastName("Meslier");
            player1.setAge(21);
            player1.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player1.setNationality("France");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://e0.365dm.com/21/08/768x432/skysports-illan-meslier-leeds-united_5477315.jpg?20210813110227");

            player2.setFirstName("Kristoffer");
            player2.setLastName("Klaesson");
            player2.setAge(20);
            player2.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player2.setNationality("Norway");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://e0.365dm.com/21/08/768x432/skysports-illan-meslier-leeds-united_5477315.jpg?20210813110227");

            player3.setFirstName("Luke");
            player3.setLastName("Ayling");
            player3.setAge(30);
            player3.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player3.setNationality("England");
            player3.setPosition("Defender");
            player3.setImgUrl("https://www.yorkshireeveningpost.co.uk/webimg/QVNIMTE5NTQ1NTM3.jpg?width=640");

            player4.setFirstName("Robin");
            player4.setLastName("Koch");
            player4.setAge(25);
            player4.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player4.setNationality("Germany");
            player4.setPosition("Defender");
            player4.setImgUrl("https://e0.365dm.com/20/12/2048x1152/skysports-robin-koch-leeds_5199410.jpg");

            player5.setFirstName("Liam");
            player5.setLastName("Cooper");
            player5.setAge(30);
            player5.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player5.setNationality("Scotland");
            player5.setPosition("Defender");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/liam-cooper-von-leeds-united-1621931318-63392.jpg?lm=1621931336");

            player6.setFirstName("Diego");
            player6.setLastName("Llorente");
            player6.setAge(28);
            player6.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player6.setNationality("Spain");
            player6.setPosition("Defender");
            player6.setImgUrl("https://www.coachesvoice.com/wp-content/uploads/2021/07/LlorenteMobile.jpg");

            player7.setFirstName("Pascal");
            player7.setLastName("Struijk");
            player7.setAge(22);
            player7.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player7.setNationality("Netherlands");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/pascal-struijk-leeds-united-1605866782-51748.jpg?lm=1605866795");

            player8.setFirstName("Laurens");
            player8.setLastName("De Bock");
            player8.setAge(28);
            player8.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player8.setNationality("Belgium");
            player8.setPosition("Defender");
            player8.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/104/54004183712601/laurens_de_bock_banner.png");

            player9.setLastName("Junior");
            player9.setFirstName("Firpo");
            player9.setAge(25);
            player9.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player9.setNationality("Spain");
            player9.setPosition("Defender");
            player9.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article21193803.ece/ALTERNATES/s615/1_JS241194598.jpg");

            player10.setFirstName("Charlie");
            player10.setLastName("Cresswell");
            player10.setAge(19);
            player10.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article21191061.ece/ALTERNATES/s615/0_JS241122923.jpg");

            player11.setFirstName("Cody");
            player11.setLastName("Drameh");
            player11.setAge(19);
            player11.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article21263575.ece/ALTERNATES/s1200d/0_1331536992.jpg");

            player12.setFirstName("Leo Fuhr");
            player12.setLastName("Hjelde");
            player12.setAge(18);
            player12.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player12.setNationality("Norway");
            player12.setPosition("Defender");
            player12.setImgUrl("https://i2.wp.com/wikibiography.in/wp-content/uploads/2021/08/GettyImages-1170684011-scaled-1.jpg?resize=735%2C570&ssl=1");

            player13.setFirstName("Adam");
            player13.setLastName("Forshaw");
            player13.setAge(29);
            player13.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player13.setNationality("England");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://i2-prod.mirror.co.uk/incoming/article13796301.ece/ALTERNATES/s615/0_JS171591816.jpg");

            player14.setFirstName("Stuart");
            player14.setLastName("Dallas");
            player14.setAge(30);
            player14.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player14.setNationality("Northern Ireland");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://resources.premierleague.com/photos/2020/10/13/b48bed76-8dea-49ff-aadc-eb4c168a8bf6/Stuart-Dallas-2.jpg?width=930&height=620");

            player15.setFirstName("Kalvin");
            player15.setLastName("Phillips");
            player15.setAge(25);
            player15.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player15.setNationality("England");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://e0.365dm.com/21/06/768x432/skysports-kalvin-phillips-england_5429110.jpg?20210627145713");

            player16.setFirstName("Mateusz");
            player16.setLastName("Klich");
            player16.setAge(31);
            player16.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player16.setNationality("Poland");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://e0.365dm.com/21/03/2048x1152/skysports-mateusz-klich-leeds_5315869.jpg");

            player17.setFirstName("Jamie");
            player17.setLastName("Shackleton");
            player17.setAge(21);
            player17.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player17.setNationality("England");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/117/14987370182444/jamie_shackleton_web_5.jpg");

            player18.setFirstName("Jack");
            player18.setLastName("Harrison");
            player18.setAge(24);
            player18.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/70/88148731676045/jack_harrison_banner_002.png");

            player19.setFirstName("Crysencio");
            player19.setLastName("Summerville");
            player19.setAge(19);
            player19.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player19.setNationality("Netherlands");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article21219237.ece/ALTERNATES/s615/0_GettyImages-1331537647.jpg");

            player20.setFirstName("Liam");
            player20.setLastName("McCarron");
            player20.setAge(20);
            player20.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player20.setNationality("Scotland");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article16437365.ece/ALTERNATES/s615/0_GettyImages-1093311144.jpg");

            player21.setFirstName("Daniel");
            player21.setLastName("James");
            player21.setAge(23);
            player21.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player21.setNationality("Wales");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/147/89567224992359/daniel_james_banner_2.jpg");

            player22.setFirstName("Stuart");
            player22.setLastName("McKinstry");
            player22.setAge(19);
            player22.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player22.setNationality("Scotland");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://www.nottheoldfirm.com/static/uploads/15/2021/09/GettyImages-1234485128-scaled.jpg");

            player23.setFirstName("Nohan");
            player23.setLastName("Kenneh");
            player23.setAge(18);
            player23.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("http://www.secretscout.co.uk/wp-content/uploads/2021/08/GetPaidStock.com-611d5b648fcd9.jpg");

            player24.setFirstName("Patrick");
            player24.setLastName("Bamford");
            player24.setAge(28);
            player24.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player24.setNationality("England");
            player24.setPosition("Forward");
            player24.setImgUrl("https://www.yorkshireeveningpost.co.uk/webimg/QVNIMTIyNTIyNzY2.jpg?width=2048&enable=upscale");

            player25.setFirstName("Tyler");
            player25.setLastName("Roberts");
            player25.setAge(22);
            player25.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player25.setNationality("Wales");
            player25.setPosition("Forward");
            player25.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article17840560.ece/ALTERNATES/s1200b/3_JS207864518.jpg");

            player26.setLastName("Raphinha");
            player26.setAge(24);
            player26.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player26.setNationality("Brazil");
            player26.setPosition("Forward");
            player26.setImgUrl("https://resources.premierleague.com/photos/2020/12/01/fb23f258-d383-4830-9d53-130fd4e58f15/GettyImages-1229837856.jpg?width=930&height=620");

            player27.setLastName("Rodrigo");
            player27.setAge(30);
            player27.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player27.setNationality("Spain");
            player27.setPosition("Forward");
            player27.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article20299400.ece/ALTERNATES/s615/0_GettyImages-1230893168.jpg");

            player28.setFirstName("Sam");
            player28.setLastName("Greenwood");
            player28.setAge(19);
            player28.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player28.setNationality("England");
            player28.setPosition("Forward");
            player28.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/125/26505541655499/sam_greenwood_web_1.jpg");

            player29.setFirstName("Joe");
            player29.setLastName("Gelhardt");
            player29.setAge(19);
            player29.setClub(this.teamRepository.getById(Long.parseLong("9")));
            player29.setNationality("England");
            player29.setPosition("Forward");
            player29.setImgUrl("https://i2-prod.leeds-live.co.uk/sport/leeds-united/article21354088.ece/ALTERNATES/s615/1_1234721355.jpg");

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
