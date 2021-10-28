package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EvertonPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Autowired
    public EvertonPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initEvertonPlayers() {
        if (this.playerRepository.count() == 217) {
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

            trainer.setFirstName("Rafael");
            trainer.setLastName("Benitez");
            trainer.setAge(61);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("8")));
            trainer.setNationality("Spain");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/3/38/RealM-Shahter15_%2811%29.jpg");

            player1.setFirstName("Jordan");
            player1.setLastName("Pickford");
            player1.setAge(27);
            player1.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player1.setNationality("England");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Jordan_Pickford_2018_%28cropped%29.jpg/250px-Jordan_Pickford_2018_%28cropped%29.jpg");

            player2.setFirstName("Asmir");
            player2.setLastName("Begovic");
            player2.setAge(34);
            player2.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player2.setNationality("Bosnia & Herzegovina");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/a/a7/20150331_2026_AUT_BIH_2176.jpg");

            player3.setFirstName("Andy");
            player3.setLastName("Lonergan");
            player3.setAge(37);
            player3.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player3.setNationality("England");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://images.daznservices.com/di/library/GOAL/41/fe/andy-lonergan-liverpool-2019-20_1dj46yjsgop2l1d828hjjpgwfs.jpg?t=-1667486804&quality=100");

            player4.setFirstName("Mason");
            player4.setLastName("Holgate");
            player4.setAge(24);
            player4.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/mason-holgate-everton-fc-1583262268-33073.jpg?lm=1583262278");

            player5.setFirstName("Michael");
            player5.setLastName("Keane");
            player5.setAge(28);
            player5.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player5.setNationality("England");
            player5.setPosition("Defender");
            player5.setImgUrl("https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/09/16/12/michael-keane.jpg?width=1200&auto=webp&quality=75");

            player6.setFirstName("Lucas");
            player6.setLastName("Digne");
            player6.setAge(28);
            player6.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player6.setNationality("France");
            player6.setPosition("Defender");
            player6.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/1/18/Lucas_Digne_Everton.jpg");

            player7.setFirstName("Yerry");
            player7.setLastName("Mina");
            player7.setAge(27);
            player7.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player7.setNationality("Colombia");
            player7.setPosition("Defender");
            player7.setImgUrl("https://phantom-marca.unidadeditorial.es/950f0e70d13fe1331b91d48bb3de917c/resize/1320/f/jpg/assets/multimedia/imagenes/2021/05/23/16218000261590.jpg");

            player8.setFirstName("Ben");
            player8.setLastName("Godfrey");
            player8.setAge(23);
            player8.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player8.setNationality("England");
            player8.setPosition("Defender");
            player8.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ben-godfrey-von-everton-1622022224-63537.jpg?lm=1622022233");

            player9.setFirstName("Seamus");
            player9.setLastName("Coleman");
            player9.setAge(32);
            player9.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player9.setNationality("Ireland");
            player9.setPosition("Defender");
            player9.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/seamus-coleman-everton-2021-1612436744-55879.jpg?lm=1612436761");

            player10.setFirstName("Jonjoe");
            player10.setLastName("Kenny");
            player10.setAge(24);
            player10.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://i2-prod.liverpoolecho.co.uk/incoming/article18318932.ece/ALTERNATES/s1200c/0_JS192059328.jpg");

            player11.setFirstName("Jarrad");
            player11.setLastName("Branthwaite");
            player11.setAge(19);
            player11.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://i2-prod.lancs.live/incoming/article19561824.ece/ALTERNATES/s615/0_GettyImages-1272929852.jpg");

            player12.setLastName("Allan");
            player12.setAge(30);
            player12.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player12.setNationality("Brazil");
            player12.setPosition("Midfielder");
            player12.setImgUrl("https://resources.evertonfc.com/photo-resources/2021/05/05/a373243e-789d-4153-877d-978b13d43650/GettyImages-1316108341.jpg?width=900&height=506");

            player13.setFirstName("Fabian");
            player13.setLastName("Delph");
            player13.setAge(31);
            player13.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player13.setNationality("England");
            player13.setPosition("Midfielder");
            player13.setImgUrl("https://cdn.images.express.co.uk/img/dynamic/67/750x445/1226271.jpg");

            player14.setFirstName("Gylfi");
            player14.setLastName("Sigurdsson");
            player14.setAge(32);
            player14.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player14.setNationality("Iceland");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://www.telegraaf.nl/images/1200x630/filters:format(jpeg):quality(80)/cdn-kiosk-api.telegraaf.nl/1c284a2c-ea27-11eb-9061-0255c322e81b.jpg");

            player15.setFirstName("Abdoulaye");
            player15.setLastName("Doucoure");
            player15.setAge(28);
            player15.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player15.setNationality("France");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://resources.evertonfc.com/photo-resources/2020/09/13/3904f2a0-6407-4f52-b83f-ba8f056e5f49/GettyImages-1272281739.jpg?width=1200&height=675");

            player16.setFirstName("Andre");
            player16.setLastName("Gomes");
            player16.setAge(28);
            player16.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player16.setNationality("Portugal");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://cdn.mos.cms.futurecdn.net/6dhBhGZXvmrtuhMoVaNgkm.jpg");

            player17.setFirstName("Jean-Philippe");
            player17.setLastName("Gbamin");
            player17.setAge(26);
            player17.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player17.setNationality("Cote D'Ivoire");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://e0.365dm.com/21/04/768x432/skysports-jean-phillipe-gbamin_5341949.jpg?20210414134116");

            player18.setFirstName("Tom");
            player18.setLastName("Davies");
            player18.setAge(23);
            player18.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://images2.minutemediacdn.com/image/fetch/w_736,h_485,c_fill,g_auto,f_auto/https%3A%2F%2Fprincerupertstower.com%2Fwp-content%2Fuploads%2Fgetty-images%2F2020%2F07%2F1093129582-850x560.jpeg");

            player19.setFirstName("Andros");
            player19.setLastName("Townsend");
            player19.setAge(30);
            player19.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://imgresizer.eurosport.com/unsafe/1200x0/filters:format(jpeg):focal(1323x536:1325x534)/origin-imgresizer.eurosport.com/2021/09/13/3218210-65919468-2560-1440.jpg");

            player20.setFirstName("Charlie");
            player20.setLastName("Whitaker");
            player20.setAge(18);
            player20.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://resources.evertonfc.com/photo-resources/2020/09/14/143f11a5-6aef-473d-94bd-7af340beafc8/20.21-U18-v-Preston-113v2.jpg?width=1200&height=675");

            player21.setLastName("Richarlison");
            player21.setAge(24);
            player21.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player21.setNationality("Brazil");
            player21.setPosition("Forward");
            player21.setImgUrl("https://www.coachesvoice.com/wp-content/uploads/2021/06/RicharlisonMobile.jpg");

            player22.setFirstName("Dominic");
            player22.setLastName("Calvert-Lewin");
            player22.setAge(24);
            player22.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player22.setNationality("England");
            player22.setPosition("Forward");
            player22.setImgUrl("https://e0.365dm.com/21/08/768x432/skysports-calvert-lewin-everton_5485662.jpg?20210821153430");

            player23.setFirstName("Alex");
            player23.setLastName("Iwobi");
            player23.setAge(25);
            player23.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player23.setNationality("Nigeria");
            player23.setPosition("Forward");
            player23.setImgUrl("https://i2-prod.football.london/incoming/article17112119.ece/ALTERNATES/s615/1_Iwobi.jpg");

            player24.setFirstName("Cenk");
            player24.setLastName("Tosun");
            player24.setAge(30);
            player24.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player24.setNationality("Turkey");
            player24.setPosition("Forward");
            player24.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/cenk-tosun-everton-1565510845-24553.jpg?lm=1565510858");

            player25.setFirstName("Demarai");
            player25.setLastName("Gray");
            player25.setAge(25);
            player25.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player25.setNationality("England");
            player25.setPosition("Forward");
            player25.setImgUrl("https://www.thetimes.co.uk/imageserver/image/%2Fmethode%2Ftimes%2Fprod%2Fweb%2Fbin%2Fb62a018e-0344-11ec-89b3-29a9a04e8645.jpg?crop=2353%2C1569%2C1185%2C35");

            player26.setFirstName("Anthony");
            player26.setLastName("Gordon");
            player26.setAge(20);
            player26.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player26.setNationality("England");
            player26.setPosition("Forward");
            player26.setImgUrl("https://tbrfootball.com/static/uploads/27/2020/10/GettyImages-1200347812.jpg");

            player27.setFirstName("Salomon");
            player27.setLastName("Rondon");
            player27.setAge(32);
            player27.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player27.setNationality("Venezuela");
            player27.setPosition("Forward");
            player27.setImgUrl("http://insidefutbol.com/app/uploads/2021/08/Dalian_Salomon_Rondon.jpg");

            player28.setFirstName("Ellis");
            player28.setLastName("Simms");
            player28.setAge(20);
            player28.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player28.setNationality("England");
            player28.setPosition("Forward");
            player28.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ellis-simms-fc-everton-u18-1553872597-21445.jpg?lm=1553872666");

            player29.setFirstName("Lewis");
            player29.setLastName("Dobbin");
            player29.setAge(18);
            player29.setClub(this.teamRepository.getById(Long.parseLong("8")));
            player29.setNationality("England");
            player29.setPosition("Forward");
            player29.setImgUrl("https://i2-prod.liverpoolecho.co.uk/incoming/article21255923.ece/ALTERNATES/s1200c/0_dobbinjpeg.jpg");

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
