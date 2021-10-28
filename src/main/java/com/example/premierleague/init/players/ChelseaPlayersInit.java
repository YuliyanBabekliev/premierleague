package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChelseaPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public ChelseaPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initChelseaPlayers() {
        if (this.playerRepository.count() == 159) {
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

            trainer.setFirstName("Thomas");
            trainer.setLastName("Tuchel");
            trainer.setAge(48);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("6")));
            trainer.setNationality("Germany");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://www.si.com/.image/t_share/MTgzOTU0MjY4Mjg0MjY2MTg1/sipa_33631250.jpg");

            player1.setFirstName("Kepa");
            player1.setLastName("Arrizabalaga");
            player1.setAge(26);
            player1.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player1.setNationality("Spain");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://pbs.twimg.com/media/E_627t0UcAYYTtN.jpg");

            player2.setFirstName("Edouard");
            player2.setLastName("Mendy");
            player2.setAge(29);
            player2.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player2.setNationality("Senegal");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/361214.jpg?fallback=png");

            player3.setFirstName("Marcus");
            player3.setLastName("Bettinelly");
            player3.setAge(29);
            player3.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://www.thesun.co.uk/wp-content/uploads/2021/07/SPORT-PREVIEW-Bettenelli.jpg");

            player4.setFirstName("Lucas");
            player4.setLastName("Bergstrom");
            player4.setAge(19);
            player4.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player4.setNationality("Finland");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://pbs.twimg.com/media/D5K77jQW0AAcMRX.jpg");

            player5.setFirstName("Antonio");
            player5.setLastName("Rudiger");
            player5.setAge(28);
            player5.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player5.setNationality("Germany");
            player5.setPosition("Defender");
            player5.setImgUrl("https://static.dw.com/image/57701401_303.jpg");

            player6.setFirstName("Marcos");
            player6.setLastName("Alonso");
            player6.setAge(30);
            player6.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player6.setNationality("Spain");
            player6.setPosition("Defender");
            player6.setImgUrl("https://e0.365dm.com/21/09/2048x1152/skysports-marcos-alonso-chelsea_5518823.jpg");

            player7.setFirstName("Andreas");
            player7.setLastName("Christensen");
            player7.setAge(25);
            player7.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player7.setNationality("Denmark");
            player7.setPosition("Defender");
            player7.setImgUrl("https://cdn-media.theathletic.com/cdn-cgi/image/fit=cover,width=700,height=466/1xeJDIRyrZjS_1xeJDIRyrZjS_Dh5Kt1ZScFz9_original_1440x960.jpg");

            player8.setFirstName("Thiago");
            player8.setLastName("Silva");
            player8.setAge(37);
            player8.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player8.setNationality("Brazil");
            player8.setPosition("Defender");
            player8.setImgUrl("https://site-cdn.givemesport.com/images/21/09/19/62cb2430da49e5e3514a92340d3368bd/320.jpg");

            player9.setFirstName("Ben");
            player9.setLastName("Chilwell");
            player9.setAge(24);
            player9.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://e0.365dm.com/20/10/768x432/skysports-ben-chilwell-chelsea_5154331.jpg?20201029172013");

            player10.setFirstName("Reece");
            player10.setLastName("James");
            player10.setAge(21);
            player10.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://i2-prod.football.london/incoming/article21375428.ece/ALTERNATES/s1200c/0_GettyImages-1335691214.jpg");

            player11.setFirstName("Cezar");
            player11.setLastName("Azpilicueta");
            player11.setAge(32);
            player11.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player11.setNationality("Spain");
            player11.setPosition("Defender");
            player11.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/f/fd/Cesar_Azpilicueta.jpg");

            player12.setFirstName("Trevoh");
            player12.setLastName("Chalobah");
            player12.setAge(22);
            player12.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player12.setNationality("England");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/trevoh-chalobah-chelsea-2018-1520605557-14377.jpg?lm=1520605577");

            player13.setFirstName("Malang");
            player13.setLastName("Sarr");
            player13.setAge(22);
            player13.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player13.setNationality("France");
            player13.setPosition("Defender");
            player13.setImgUrl("https://i2.wp.com/i.dailymail.co.uk/1s/2021/09/01/13/47372119-9947149-image-m-24_1630499879495.jpg?resize=634%2C404&ssl=1");

            player14.setFirstName("Xavier");
            player14.setLastName("Mbuyamba");
            player14.setAge(19);
            player14.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player14.setNationality("Netherlands");
            player14.setPosition("Defender");
            player14.setImgUrl("https://i.dailymail.co.uk/1s/2021/09/04/16/47505709-0-image-a-184_1630770318219.jpg");

            player15.setLastName("Jorginho");
            player15.setAge(29);
            player15.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player15.setNationality("Italy");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://www.thechelseachronicle.com/static/uploads/17/2021/08/GettyImages-1334298298.jpg");

            player16.setFirstName("Ngolo");
            player16.setLastName("Kante");
            player16.setAge(30);
            player16.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player16.setNationality("England");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://e0.365dm.com/21/09/768x432/skysports-chelsea-ngolo-kante_5528260.jpg?20210928140831");

            player17.setFirstName("Christian");
            player17.setLastName("Pulisic");
            player17.setAge(23);
            player17.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player17.setNationality("USA");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://soccer.nbcsports.com/wp-content/uploads/sites/14/2021/09/GettyImages-1234682291.jpg");

            player18.setFirstName("Mateo");
            player18.setLastName("Kovacic");
            player18.setAge(27);
            player18.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player18.setNationality("Croatia");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://pbs.twimg.com/profile_images/1387321744252411904/t-jwq8-4_400x400.jpg");

            player19.setFirstName("Mason");
            player19.setLastName("Mount");
            player19.setAge(22);
            player19.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://metro.co.uk/wp-content/uploads/2021/09/GettyImages-1235444721-1.jpg?quality=90&strip=all&zoom=1&resize=480%2C320");

            player20.setFirstName("Hakim");
            player20.setLastName("Ziyech");
            player20.setAge(28);
            player20.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player20.setNationality("Morocco");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/216104.jpg");

            player21.setFirstName("Kai");
            player21.setLastName("Havertz");
            player21.setAge(22);
            player21.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player21.setNationality("Germany");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://resources.premierleague.com/premierleague/photo/2021/07/13/9648aa07-5b8b-4b23-aa36-9b5130738da9/Kai-Havertz.jpg");

            player22.setFirstName("Ruben");
            player22.setLastName("Loftus-Cheek");
            player22.setAge(25);
            player22.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player22.setNationality("England");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ruben-loftus-cheek-chelsea-fc-1601381284-48046.jpg?lm=1601381302");

            player23.setFirstName("Saul");
            player23.setLastName("Niguez");
            player23.setAge(26);
            player23.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player23.setNationality("Spain");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://d3vlf99qeg6bpx.cloudfront.net/content/uploads/2021/09/17155734/saul-niguez-chelsea.jpg");

            player24.setFirstName("Timo");
            player24.setLastName("Werner");
            player24.setAge(25);
            player24.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player24.setNationality("Germany");
            player24.setPosition("Forward");
            player24.setImgUrl("https://static.independent.co.uk/2021/09/21/15/GettyImages-1341333905.jpg?width=982&height=726&auto=webp&quality=75");

            player25.setFirstName("Ross");
            player25.setLastName("Barkley");
            player25.setAge(27);
            player25.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player25.setNationality("England");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://www.telegraph.co.uk/content/dam/football/2021/09/10/TELEMMGLPICT000266640778_trans_NvBQzQNjv4Bq_29iairYn7vv3BZZ5dd7ibeHsZFrEmHQDi0eQN40zhg.jpeg?imwidth=680");

            player26.setFirstName("Callum");
            player26.setLastName("Hudson-Odoi");
            player26.setAge(20);
            player26.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player26.setNationality("England");
            player26.setPosition("Forward");
            player26.setImgUrl("https://e0.365dm.com/21/08/768x432/skysports-callum-hudson-odoi_5496238.jpg?20210831121916");

            player27.setFirstName("Romelu");
            player27.setLastName("Lukaku");
            player27.setAge(28);
            player27.setClub(this.teamRepository.getById(Long.parseLong("6")));
            player27.setNationality("Belgium");
            player27.setPosition("Forward");
            player27.setImgUrl("https://football-italia.net/wp-content/uploads/2021/05/Lukaku-2104-noshhirt-inter-epa.jpg");

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
