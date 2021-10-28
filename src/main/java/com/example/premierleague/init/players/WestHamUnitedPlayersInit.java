package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WestHamUnitedPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public WestHamUnitedPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initWestHamUnitedPlayers() {
        if (this.playerRepository.count() == 558) {
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

            trainer.setFirstName("David");
            trainer.setLastName("Moyes");
            trainer.setAge(58);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("19")));
            trainer.setNationality("Scotland");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://www.whufc.com/sites/default/files/img/manager/2019-02/Moyes1080.jpg");

            player1.setFirstName("Lukasz");
            player1.setLastName("Fabianski");
            player1.setAge(36);
            player1.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player1.setNationality("Poland");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://cdn.footballtransfertavern.com/wp-content/uploads/2021/05/west-ham-keeper-lukasz-fabianski.jpg");

            player2.setFirstName("David");
            player2.setLastName("Martin");
            player2.setAge(35);
            player2.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player2.setNationality("England");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/david-martin-west-ham-1575200408-27885.jpg?lm=1575200422");

            player3.setFirstName("Darren");
            player3.setLastName("Randolph");
            player3.setAge(34);
            player3.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player3.setNationality("Ireland");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/51321-1464868391.jpg?lm=1");

            player4.setFirstName("Alphonse");
            player4.setLastName("Areola");
            player4.setAge(28);
            player4.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player4.setNationality("France");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/alphonse-areola-real-madrid-1570780411-26469.jpg?lm=1570780453");

            player5.setFirstName("Aaron");
            player5.setLastName("Cresswell");
            player5.setAge(31);
            player5.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/aaron-cresswel-west-ham-1589385236-38492.jpg?lm=1589385231");

            player6.setFirstName("Vladimir");
            player6.setLastName("Coufal");
            player6.setAge(29);
            player6.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player6.setNationality("Czech Republic");
            player6.setPosition("Defender");
            player6.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/vladimir-coufal-im-tschechien-trikot-1621953664-63461.jpg?lm=1621953676");

            player7.setFirstName("Angelo");
            player7.setLastName("Ogbonna");
            player7.setAge(33);
            player7.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player7.setNationality("Italy");
            player7.setPosition("Defender");
            player7.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/angelo-ogbonna-1589794192-38843.jpg?lm=1589794187");

            player8.setFirstName("Issa");
            player8.setLastName("Diop");
            player8.setAge(24);
            player8.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player8.setNationality("France");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/issa-diop-1589794045-38840.jpg?lm=1589794048");

            player9.setFirstName("Ryan");
            player9.setLastName("Fredericks");
            player9.setAge(28);
            player9.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://thisisfutbol.com/wp-content/uploads/2019/02/fredericks.jpg");

            player10.setFirstName("Arthur");
            player10.setLastName("Masuaku");
            player10.setAge(27);
            player10.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player10.setNationality("DR Congo");
            player10.setPosition("Defender");
            player10.setImgUrl("https://tmssl.akamaized.net/images/foto/big/arthur-masuaku-west-ham-1564411351-24020.jpg?lm=1564411368");

            player11.setFirstName("Craig");
            player11.setLastName("Dawson");
            player11.setAge(31);
            player11.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/craig-dawson-fc-watford-2020-1602527750-49021.jpg?lm=1602527768");

            player12.setFirstName("Winston");
            player12.setLastName("Reid");
            player12.setAge(33);
            player12.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player12.setNationality("New Zealand");
            player12.setPosition("Defender");
            player12.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/winston-reid-sporting-kansas-city-1612179944-55618.jpg?lm=1612179989");

            player13.setFirstName("Jamal");
            player13.setLastName("Baptiste");
            player13.setAge(17);
            player13.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://images2.minutemediacdn.com/image/fetch/w_2000,h_2000,c_fit/https%3A%2F%2Fgreenstreethammers.com%2Fwp-content%2Fuploads%2Fgetty-images%2F2017%2F07%2F1206915915.jpeg");

            player14.setFirstName("Kurt");
            player14.setLastName("Zouma");
            player14.setAge(26);
            player14.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player14.setNationality("France");
            player14.setPosition("Defender");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/kurt-zouma-fc-chelsea-2020-21-1621594585-63062.jpg?lm=1621594615");

            player15.setFirstName("Ajibola");
            player15.setLastName("Alese");
            player15.setAge(20);
            player15.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player15.setNationality("England");
            player15.setPosition("Defender");
            player15.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/502065-1544622088.jpg?lm=1");

            player16.setFirstName("Ben");
            player16.setLastName("Johnson");
            player16.setAge(21);
            player16.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player16.setNationality("England");
            player16.setPosition("Defender");
            player16.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/468002-1551363739.jpg?lm=1");

            player17.setFirstName("Manuel");
            player17.setLastName("Lanzini");
            player17.setAge(28);
            player17.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player17.setNationality("Argentina");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/135853-1520606166.jpg?lm=1");

            player18.setFirstName("Mark");
            player18.setLastName("Noble");
            player18.setAge(34);
            player18.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://www.vbetnews.com/wp-content/uploads/2021/01/GettyImages-1187432517.jpg");

            player19.setFirstName("Pablo");
            player19.setLastName("Fornals");
            player19.setAge(25);
            player19.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player19.setNationality("Spain");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/pablo-fornals-1589795652-38873.jpg?lm=1589795649");

            player20.setFirstName("Tomas");
            player20.setLastName("Soucek");
            player20.setAge(26);
            player20.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player20.setNationality("Czech Republic");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/tomas-soucek-tschechien-1621954128-63464.jpg?lm=1621954136");

            player21.setFirstName("Declan");
            player21.setLastName("Rice");
            player21.setAge(22);
            player21.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/declan-rice-england-1622733698-64102.jpg?lm=1622733704");

            player22.setFirstName("Nikola");
            player22.setLastName("Vlasic");
            player22.setAge(24);
            player22.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player22.setNationality("Croatia");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/nikola-vlasic-zska-moskau-1604500047-50516.jpg?lm=1604500058");

            player23.setFirstName("Alex");
            player23.setLastName("Kral");
            player23.setAge(23);
            player23.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player23.setNationality("Czech Republic");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/alex-kral-spartak-moskau-1630415443-70074.jpg?lm=1630415462");

            player24.setFirstName("Andriy");
            player24.setLastName("Yarmolenko");
            player24.setAge(31);
            player24.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player24.setNationality("Ukraine");
            player24.setPosition("Forward");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/andriy-yarmolenko-ukraine-1623940998-65496.jpg?lm=1623941008");

            player25.setFirstName("Said");
            player25.setLastName("Benrahma");
            player25.setAge(26);
            player25.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player25.setNationality("Algeria");
            player25.setPosition("Forward");
            player25.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/benrahma-von-west-ham-united-1611913389-55505.jpg?lm=1611913404");

            player26.setFirstName("Jarrod");
            player26.setLastName("Bowen");
            player26.setAge(24);
            player26.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player26.setNationality("England");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/jarrod-bowen-1589796217-38885.jpg?lm=1589796218");

            player27.setFirstName("Michail");
            player27.setLastName("Antonio");
            player27.setAge(31);
            player27.setClub(this.teamRepository.getById(Long.parseLong("19")));
            player27.setNationality("Jamaica");
            player27.setPosition("Forward");
            player27.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/michail-antonio-west-ham-united-1594475056-43157.jpg?lm=1594475021");

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
