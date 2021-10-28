package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.stereotype.Component;

@Component
public class LiverpoolPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    public LiverpoolPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initLiverpoolPlayers(){
        if (this.playerRepository.count() == 309) {
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

            trainer.setFirstName("Jurgen");
            trainer.setLastName("Klopp");
            trainer.setAge(54);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("11")));
            trainer.setNationality("Germany");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/5D8D/production/_120794932_gettyimages-1343795943.jpg");

            player1.setLastName("Alisson");
            player1.setAge(29);
            player1.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player1.setNationality("Brazil");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://www.coachesvoice.com/wp-content/uploads/2021/08/AlissonMobile.jpg");

            player2.setLastName("Adrian");
            player2.setAge(34);
            player2.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player2.setNationality("Spain");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/198614.jpg");

            player3.setFirstName("Caoimhin");
            player3.setLastName("Kelleher");
            player3.setAge(22);
            player3.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player3.setNationality("Ireland");
            player3.setPosition("Goalkeeper");
            player3.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/15/thumb_114715_default_news_size_5.jpeg");

            player4.setFirstName("Loris");
            player4.setLastName("Karius");
            player4.setAge(28);
            player4.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player4.setNationality("Germany");
            player4.setPosition("Goalkeeper");
            player4.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/loris-karius-fc-liverpool-2021-22-1632302534-71528.jpg?lm=1632302550");

            player5.setFirstName("Virgil ");
            player5.setLastName("van Dijk");
            player5.setAge(30);
            player5.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player5.setNationality("Netherlands");
            player5.setPosition("Defender");
            player5.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/02/thumb_101326_default_news_size_5.jpeg");

            player6.setFirstName("Joseph");
            player6.setLastName("Gomez");
            player6.setAge(24);
            player6.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player6.setNationality("England");
            player6.setPosition("Defender");
            player6.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/14/thumb_113473_default_news_size_5.jpeg");

            player7.setFirstName("Konstantinos");
            player7.setLastName("Tsimikas");
            player7.setAge(25);
            player7.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player7.setNationality("Greece");
            player7.setPosition("Defender");
            player7.setImgUrl("https://site-cdn.givemesport.com/images/21/08/21/be2a0f5ae6d86f90d8fd7c10d42593f0/1201.jpg");

            player8.setFirstName("Andrew");
            player8.setLastName("Robertson");
            player8.setAge(27);
            player8.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player8.setNationality("Scotland");
            player8.setPosition("Defender");
            player8.setImgUrl("https://resources.premierleague.com/photos/2020/01/27/f6509935-96d1-4624-b753-f2acf2c4aabf/robertson-liverpool.png?width=860&height=573");

            player9.setFirstName("Joel");
            player9.setLastName("Matip");
            player9.setAge(30);
            player9.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player9.setNationality("Cameroon");
            player9.setPosition("Defender");
            player9.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/27/thumb_126763_default_news_size_5.jpeg");

            player10.setFirstName("Nathaniel");
            player10.setLastName("Phillips");
            player10.setAge(24);
            player10.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player10.setNationality("England");
            player10.setPosition("Defender");
            player10.setImgUrl("https://i2-prod.liverpoolecho.co.uk/incoming/article21253173.ece/ALTERNATES/s615/0_GettyImages-1234210313.jpg");

            player11.setFirstName("Trent");
            player11.setLastName("Alexander-Arnold");
            player11.setAge(22);
            player11.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player11.setNationality("England");
            player11.setPosition("Defender");
            player11.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/24/thumb_123796_default_news_size_5.jpeg");

            player12.setFirstName("Neco");
            player12.setLastName("Williams");
            player12.setAge(20);
            player12.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player12.setNationality("Wales");
            player12.setPosition("Defender");
            player12.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/10/thumb_109349_default_news_size_5.jpeg");

            player13.setFirstName("Ibrahima");
            player13.setLastName("Konate");
            player13.setAge(22);
            player13.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player13.setNationality("France");
            player13.setPosition("Defender");
            player13.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/ibrahima-konate-fc-liverpool-2021-1628875490-68928.jpg?lm=1628875497");

            player14.setLastName("Fabinho");
            player14.setAge(27);
            player14.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player14.setNationality("Brazil");
            player14.setPosition("Midfielder");
            player14.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/fabinho-1589452334-38561.jpg?lm=1589452355");

            player15.setLastName("Thiago");
            player15.setAge(30);
            player15.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player15.setNationality("Spain");
            player15.setPosition("Midfielder");
            player15.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/thiago-fc-liverpool-1600921967-47716.jpg?lm=1600921981");

            player16.setFirstName("James");
            player16.setLastName("Milner");
            player16.setAge(35);
            player16.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player16.setNationality("England");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/19/9186298d473b45076ebee76530dd136f926c6d72.jpeg");

            player17.setFirstName("Naby");
            player17.setLastName("Keita");
            player17.setAge(26);
            player17.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player17.setNationality("Guinea");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/naby-keita-1589453104-38564.jpg?lm=1589453114");

            player18.setFirstName("Jordan");
            player18.setLastName("Henderson");
            player18.setAge(31);
            player18.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://i2-prod.liverpoolecho.co.uk/sport/football/transfer-news/article20775522.ece/ALTERNATES/s615/0_GettyImages-1272149044.jpg");

            player19.setFirstName("Alex");
            player19.setLastName("Oxlade-Chamberlain");
            player19.setAge(28);
            player19.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player19.setNationality("England");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://sky.shorthandstories.com/alex-oxlade-chamberlain/assets/4x52hpL4dY/ox-2560x1440.jpeg");

            player20.setFirstName("Curtis");
            player20.setLastName("Jones");
            player20.setAge(20);
            player20.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player20.setNationality("England");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/26/thumb_125121_default_news_size_5.jpeg");

            player21.setFirstName("Harvey");
            player21.setLastName("Elliott");
            player21.setAge(18);
            player21.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player21.setNationality("England");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/27/thumb_126495_default_news_size_5.jpeg");

            player22.setFirstName("James");
            player22.setLastName("Balagizi");
            player22.setAge(18);
            player22.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player22.setNationality("England");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/misc/0002/24/thumb_123126_misc_general_500.jpeg");

            player23.setFirstName("Tyler");
            player23.setLastName("Morton");
            player23.setAge(18);
            player23.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player23.setNationality("England");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/17/thumb_116824_default_news_size_5.jpeg");

            player24.setFirstName("Conor");
            player24.setLastName("Bradley");
            player24.setAge(18);
            player24.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player24.setNationality("Northern Ireland");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/misc/0002/24/thumb_123116_misc_general_500.jpeg");

            player25.setFirstName("Roberto");
            player25.setLastName("Firmino");
            player25.setAge(30);
            player25.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player25.setNationality("Brazil");
            player25.setPosition("Forward");
            player25.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/27/thumb_126760_default_news_size_5.jpeg");

            player26.setFirstName("Sadio");
            player26.setLastName("Mane");
            player26.setAge(29);
            player26.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player26.setNationality("Senegal");
            player26.setPosition("Forward");
            player26.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/200512-1559901727.jpg?lm=1");

            player27.setFirstName("Mohamed");
            player27.setLastName("Salah");
            player27.setAge(29);
            player27.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player27.setNationality("Egypt");
            player27.setPosition("Forward");
            player27.setImgUrl("https://pbs.twimg.com/media/E_miq9XXsAUqYWA.jpg");

            player28.setFirstName("Diogo");
            player28.setLastName("Jota");
            player28.setAge(24);
            player28.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player28.setNationality("Portugal");
            player28.setPosition("Forward");
            player28.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/20/thumb_119518_default_news_size_5.jpeg");

            player29.setFirstName("Divock");
            player29.setLastName("Origi");
            player29.setAge(26);
            player29.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player29.setNationality("Belgium");
            player29.setPosition("Forward");
            player29.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/148368-1557298968.jpg?lm=1");

            player30.setFirstName("Takumi");
            player30.setLastName("Minamino");
            player30.setAge(26);
            player30.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player30.setNationality("Japan");
            player30.setPosition("Forward");
            player30.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/4/4b/FC_Admira_Wacker_M%C3%B6dling_vs._FC_Red_Bull_Salzburg_2018-04-15_%28061%29.jpg");

            player31.setFirstName("Kaide");
            player31.setLastName("Gordon");
            player31.setAge(16);
            player31.setClub(this.teamRepository.getById(Long.parseLong("11")));
            player31.setNationality("England");
            player31.setPosition("Forward");
            player31.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/c/c1/Kaide_Gordon_Liverpool_FC_gegen_1._FSV_Mainz_05_%28Testspiel_23._Juli_2021%29_36_%28cropped%29.jpg");

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
        }
    }
}
