package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManchesterUnitedPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public ManchesterUnitedPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initManchesterUnitedPlayers(){
        if (this.playerRepository.count() == 372) {
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

            trainer.setFirstName("Ole");
            trainer.setLastName("Solskjaer");
            trainer.setAge(48);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("13")));
            trainer.setNationality("Norway");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://d2x51gyc4ptf2q.cloudfront.net/content/uploads/2021/09/28104336/Ole-Gunnar-Solskjaer-Man-Utd-F365-91.jpg");

            player1.setFirstName("David");
            player1.setLastName("De Gea");
            player1.setAge(30);
            player1.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player1.setNationality("Spain");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/59377-1454414410.jpg?lm=1");

            player2.setFirstName("Dean");
            player2.setLastName("Henderson");
            player2.setAge(24);
            player2.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player2.setNationality("England");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/dean-henderson-nationalmannschaft-england-2020-1608717275-53578.jpg?lm=1608717289");

            player3.setFirstName("Tom");
            player3.setLastName("Heaton");
            player3.setAge(35);
            player3.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/tom-heaton-aston-villa-1597995127-45751.jpg?lm=1597995116");

            player4.setFirstName("Lee");
            player4.setLastName("Grant");
            player4.setAge(38);
            player4.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player4.setNationality("England");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/lee-grant-manchester-united-1583422356-33203.jpg?lm=1583422367");

            player5.setFirstName("Victor");
            player5.setLastName("Lindelof");
            player5.setAge(21);
            player5.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player5.setNationality("Sweden");
            player5.setPosition("Defender");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/victor-lindelof-manchester-united-1542105670-18798.jpg?lm=1542105682");

            player6.setFirstName("Matej");
            player6.setLastName("Kovar");
            player6.setAge(21);
            player6.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player6.setNationality("Czech Republic");
            player6.setPosition("Defender");
            player6.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/550829-1600681047.jpg?lm=1");

            player7.setFirstName("Eric");
            player7.setLastName("Bailly");
            player7.setAge(27);
            player7.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player7.setNationality("Cote D'Ivoire");
            player7.setPosition("Defender");
            player7.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/286384-1447254981.jpg?lm=1");

            player8.setFirstName("Phil");
            player8.setLastName("Jones");
            player8.setAge(29);
            player8.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/phil-jones-manchester-united-1526483323-15437.jpg?lm=1526483335");

            player9.setFirstName("Harry");
            player9.setLastName("Maguire");
            player9.setAge(28);
            player9.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/harry-maguire-england-2021-1617252032-59843.jpg?lm=1617252050");

            player10.setFirstName("Luke");
            player10.setLastName("Shaw");
            player10.setAge(26);
            player10.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/183288-1469631475.jpg?lm=1");

            player11.setFirstName("Alex");
            player11.setLastName("Telles");
            player11.setAge(28);
            player11.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player11.setNationality("Brazil");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/alex-telles-von-manchester-united-1626882077-67624.jpg?lm=1626882095");

            player12.setFirstName("Aaron");
            player12.setLastName("Wan-Bissaka");
            player12.setAge(23);
            player12.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player12.setNationality("England");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/galerie/aaron-wan-bissaka-manchester-united-1564572777-24097.jpg?lm=1564572805");

            player13.setFirstName("Diogo");
            player13.setLastName("Dalot");
            player13.setAge(22);
            player13.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player13.setNationality("Portugal");
            player13.setPosition("Defender");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/diogo-dalot-milan-1604059909-50261.jpg?lm=1604059927");

            player14.setFirstName("Teden");
            player14.setLastName("Mengi");
            player14.setAge(19);
            player14.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player14.setNationality("England");
            player14.setPosition("Defender");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/teden-mengi-manchester-united-1612198757-55665.jpg?lm=1612198773");

            player15.setFirstName("Raphael");
            player15.setLastName("Varane");
            player15.setAge(28);
            player15.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player15.setNationality("France");
            player15.setPosition("Defender");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/raphael-varane-von-manchester-united-1631882403-71267.jpg?lm=1631882449");

            player16.setFirstName("Paul");
            player16.setLastName("Pogba");
            player16.setAge(28);
            player16.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player16.setNationality("France");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://tmssl.akamaized.net/images/foto/big/paul-pogba-manchester-united-1582094374-31954.jpg?lm=1582094389");

            player17.setLastName("Fred");
            player17.setAge(28);
            player17.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player17.setNationality("Brazil");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/fred-im-trikot-von-manchester-united-1533633042-17027.jpg?lm=1533633054");

            player18.setFirstName("Bruno");
            player18.setLastName("Fernandes");
            player18.setAge(27);
            player18.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player18.setNationality("Portugal");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/bruno-fernandes-portugal-2021-1623928993-65469.jpg?lm=1623929022");

            player19.setFirstName("Nemanja");
            player19.setLastName("Matic");
            player19.setAge(33);
            player19.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player19.setNationality("Serbia");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/nemanja-matic-1505237847-11893.jpg?lm=1505237868");

            player20.setFirstName("Donny");
            player20.setLastName("van de Beek");
            player20.setAge(24);
            player20.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player20.setNationality("Netherlands");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/donny-van-de-beek-manchester-united-2020-1601983406-48533.jpg?lm=1601983418");

            player21.setFirstName("Scott");
            player21.setLastName("McTominay");
            player21.setAge(24);
            player21.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player21.setNationality("Scotland");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/scott-mctominay-von-manchester-united-1568285359-25675.jpg?lm=1568285366");

            player22.setFirstName("Hannibal");
            player22.setLastName("Mejbri");
            player22.setAge(18);
            player22.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player22.setNationality("Tunisia");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/hannibal-mejbri-manchester-united-1580046062-30510.jpg?lm=1580046077");

            player23.setFirstName("Jesse");
            player23.setLastName("Lingard");
            player23.setAge(28);
            player23.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jesse-lingard-manchester-united-2021-22-1632064829-71325.jpg?lm=1632064850");

            player24.setFirstName("Juan");
            player24.setLastName("Mata");
            player24.setAge(33);
            player24.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player24.setNationality("Spain");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/juan-mata-manchester-united-1559984698-22822.jpg?lm=1559984715");

            player25.setFirstName("Facundo");
            player25.setLastName("Pellistri");
            player25.setAge(19);
            player25.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player25.setNationality("Uruguay");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/facudona-pellistri-deportivo-alaves-1628173957-68352.jpg?lm=1628173964");

            player26.setFirstName("Edinson");
            player26.setLastName("Cavani");
            player26.setAge(34);
            player26.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player26.setNationality("Uruguay");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/edinson-cavani-manchester-united-1609491360-53799.jpg?lm=1609491390");

            player27.setFirstName("Anthony");
            player27.setLastName("Martial");
            player27.setAge(25);
            player27.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player27.setNationality("France");
            player27.setPosition("Forward");
            player27.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/anthony-martial-1520581014-14363.jpg?lm=1520581023");

            player28.setFirstName("Marcus");
            player28.setLastName("Rashford");
            player28.setAge(23);
            player28.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player28.setNationality("England");
            player28.setPosition("Forward");
            player28.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/marcus-rashford-trifft-fur-manchester-united-gegen-leicester-2020-2021-1608993668-53643.jpg?lm=1608993701");

            player29.setFirstName("Mason");
            player29.setLastName("Greenwood");
            player29.setAge(20);
            player29.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player29.setNationality("England");
            player29.setPosition("Forward");
            player29.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/mason-greenwood-manchester-united-1613481541-56732.jpg?lm=1613481720");

            player30.setFirstName("Amad");
            player30.setLastName("Diallo");
            player30.setAge(19);
            player30.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player30.setNationality("Cote D'Ivoire");
            player30.setPosition("Forward");
            player30.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/amad-diallo-manchester-united-1617106698-59739.jpg?lm=1617106745");

            player31.setFirstName("Anthony");
            player31.setLastName("Elanga");
            player31.setAge(19);
            player31.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player31.setNationality("Sweden");
            player31.setPosition("Forward");
            player31.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/583189-1620800347.jpg?lm=1");

            player32.setFirstName("Shola");
            player32.setLastName("Shoretire");
            player32.setAge(17);
            player32.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player32.setNationality("England");
            player32.setPosition("Forward");
            player32.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/640026-1612447506.jpg?lm=1");

            player33.setFirstName("Jadon");
            player33.setLastName("Sancho");
            player33.setAge(21);
            player33.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player33.setNationality("England");
            player33.setPosition("Forward");
            player33.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/401173-1632686361.jpg?lm=1");

            player34.setFirstName("Cristiano");
            player34.setLastName("Ronaldo");
            player34.setAge(36);
            player34.setClub(this.teamRepository.getById(Long.parseLong("13")));
            player34.setNationality("Portugal");
            player34.setPosition("Forward");
            player34.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/8198-1631656078.jpg?lm=1");


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
        }
    }
}
