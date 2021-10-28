package com.example.premierleague.init.players;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.repositories.PlayerRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.stereotype.Component;

@Component
public class BrentfordPlayersInit {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    public BrentfordPlayersInit(PlayerRepository playerRepository, TeamRepository teamRepository) {
        this.playerRepository = playerRepository;
        this.teamRepository = teamRepository;
    }

    public void initBrentfordPlayers(){
        if (this.playerRepository.count() == 61) {
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

            trainer.setFirstName("Thomas");
            trainer.setLastName("Frank");
            trainer.setAge(48);
            trainer.setClub(this.teamRepository.getById(Long.parseLong("3")));
            trainer.setNationality("Denmark");
            trainer.setPosition("Trainer");
            trainer.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2019-20/first-team-games/20190831---derby/20190831-165547-85-0100.jpg/Large");

            player1.setFirstName("David");
            player1.setLastName("Raya");
            player1.setAge(26);
            player1.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player1.setNationality("Spain");
            player1.setPosition("Goalkeeper");
            player1.setImgUrl("https://upload.wikimedia.org/wikipedia/en/e/ea/David_Raya%2C_Blackburn_Rovers_goalkeeper.jpg");

            player2.setFirstName("Alvaro");
            player2.setLastName("Fernandez");
            player2.setAge(23);
            player2.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player2.setNationality("Spain");
            player2.setPosition("Goalkeeper");
            player2.setImgUrl("https://img.a.transfermarkt.technology/portrait/big/453704-1567679229.jpg?lm=1");

            player3.setFirstName("Rico");
            player3.setLastName("Henry");
            player3.setAge(24);
            player3.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player3.setNationality("England");
            player3.setPosition("Defender");
            player3.setImgUrl("https://static.standard.co.uk/2021/04/06/11/newFile.jpg?width=968&auto=webp&quality=75&crop=968%3A645%2Csmart");

            player4.setFirstName("Charlie");
            player4.setLastName("Goode");
            player4.setAge(26);
            player4.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player4.setNationality("England");
            player4.setPosition("Defender");
            player4.setImgUrl("https://c8.alamy.com/comp/2D8K3D1/charlie-goode-4-of-brentford-before-the-game-2D8K3D1.jpg");

            player5.setFirstName("Ethan");
            player5.setLastName("Pinnock");
            player5.setAge(28);
            player5.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player5.setNationality("Jamaica");
            player5.setPosition("Defender");
            player5.setImgUrl("https://www.theleaguepaper.com/wp-content/uploads/2020/01/PA-48963009.jpg");

            player6.setFirstName("Pontus");
            player6.setLastName("Jansson");
            player6.setAge(30);
            player6.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player6.setNationality("Sweden");
            player6.setPosition("Defender");
            player6.setImgUrl("https://www.theleaguepaper.com/wp-content/uploads/2020/01/PA-48963009.jpg");

            player7.setFirstName("Mads Bech");
            player7.setLastName("Sorensen");
            player7.setAge(22);
            player7.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player7.setNationality("Denmark");
            player7.setPosition("Defender");
            player7.setImgUrl("https://www.brentfordfc.com/api/image/cropandgreyscale/f08c34cb-9251-4ab1-b36f-43d74321923e/?preset=square&greyscale=false");

            player8.setFirstName("Mads");
            player8.setLastName("Roerslev");
            player8.setAge(22);
            player8.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player8.setNationality("Denmark");
            player8.setPosition("Defender");
            player8.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/2/28/Mads_Roerslev.jpg");

            player9.setFirstName("Dominic");
            player9.setLastName("Thompson");
            player9.setAge(21);
            player9.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player9.setNationality("England");
            player9.setPosition("Defender");
            player9.setImgUrl("https://media.gettyimages.com/photos/dominic-thompson-of-brentford-warms-up-prior-to-the-preseason-match-picture-id1329863864?s=612x612");

            player10.setFirstName("Julian");
            player10.setLastName("Jeanvier");
            player10.setAge(29);
            player10.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player10.setNationality("Guinea");
            player10.setPosition("Defender");
            player10.setImgUrl("https://www.brentfordfc.com/api/image/cropandgreyscale/0331b4fb-d2bb-4420-95ef-1b2ff4ce42b1/?preset=square&greyscale=false");

            player11.setFirstName("Luka");
            player11.setLastName("Racic");
            player11.setAge(22);
            player11.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player11.setNationality("Denmark");
            player11.setPosition("Defender");
            player11.setImgUrl("https://www.ntfc.co.uk/siteassets/image/202021/luka-racic/luka-racic..jpg/Large");

            player12.setFirstName("Finley");
            player12.setLastName("Stevens");
            player12.setAge(18);
            player12.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player12.setNationality("Wales");
            player12.setPosition("Defender");
            player12.setImgUrl("https://dailycannon.com/static/uploads/2020/07/EeAH2sBWoAIaVyD-e1595930420463.jpg");

            player13.setFirstName("Lewis");
            player13.setLastName("Gordon");
            player13.setAge(20);
            player13.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player13.setNationality("England");
            player13.setPosition("Defender");
            player13.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2020-21/b-team-games/20210317---chelsea/20210317-120415-37.jpg/Large");

            player14.setFirstName("Kristoffer");
            player14.setLastName("Ajer");
            player14.setAge(23);
            player14.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player14.setNationality("Norway");
            player14.setPosition("Defender");
            player14.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/ft-signings-and-contracts/kris-ajer-signs.jpg/Large");

            player15.setLastName("Zanka");
            player15.setAge(31);
            player15.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player15.setNationality("Denmark");
            player15.setPosition("Defender");
            player15.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/international-duty/zanka-denmark.jpg/Large");

            player16.setFirstName("Christian");
            player16.setLastName("Norgaard");
            player16.setAge(27);
            player16.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player16.setNationality("Denmark");
            player16.setPosition("Midfielder");
            player16.setImgUrl("https://c8.alamy.com/comp/W67W7P/christian-norgaard-brentford-W67W7P.jpg");

            player17.setFirstName("Mathias");
            player17.setLastName("Jensen");
            player17.setAge(25);
            player17.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player17.setNationality("Denmark");
            player17.setPosition("Midfielder");
            player17.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2020-21/first-team-games/20201004---preston/20201004-151341-25-0100.jpg/Large");

            player18.setFirstName("Josh");
            player18.setLastName("Dasilva");
            player18.setAge(22);
            player18.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player18.setNationality("England");
            player18.setPosition("Midfielder");
            player18.setImgUrl("https://ichef.bbci.co.uk/onesport/cps/624/cpsprodpb/EC79/production/_110873506_gettyimages-1200225699.jpg");

            player19.setFirstName("Bryan");
            player19.setLastName("Mbeumo");
            player19.setAge(22);
            player19.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player19.setNationality("France");
            player19.setPosition("Midfielder");
            player19.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/first-team-games/20210717---wimbledon/20210717-151146-77-0100.jpg/Large");

            player20.setFirstName("Tariqe");
            player20.setLastName("Fosu-Henry");
            player20.setAge(25);
            player20.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player20.setNationality("Ghana");
            player20.setPosition("Midfielder");
            player20.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2020-21/first-team-games/20200916---southampton/20200916-200916-05-0100.jpg/Large");

            player21.setFirstName("Shandon");
            player21.setLastName("Baptiste");
            player21.setAge(23);
            player21.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player21.setNationality("Grenada");
            player21.setPosition("Midfielder");
            player21.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2020-21/first-team-games/20200922---west-brom/20200922-194049-04-0100.jpg/Large");

            player22.setFirstName("Vitaly");
            player22.setLastName("Janelt");
            player22.setAge(23);
            player22.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player22.setNationality("Germany");
            player22.setPosition("Midfielder");
            player22.setImgUrl("https://tmssl.akamaized.net/images/foto/normal/vitaly-janelt-fc-brentford-1613122451-56439.jpg?lm=1613122464");

            player23.setFirstName("Jan");
            player23.setLastName("Zamburek");
            player23.setAge(20);
            player23.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player23.setNationality("Czech Republic");
            player23.setPosition("Midfielder");
            player23.setImgUrl("https://www.brentfordfc.com/api/image/cropandgreyscale/4e55c19b-b734-4c5d-b130-722892a0a613/?preset=square&greyscale=false");

            player24.setFirstName("Mads");
            player24.setLastName("Bidstrup");
            player24.setAge(20);
            player24.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player24.setNationality("Denmark");
            player24.setPosition("Midfielder");
            player24.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2020-21/first-team-games/20210501---watford/20210501-151814-12-0100.jpg");

            player25.setFirstName("Maxwell");
            player25.setLastName("Haygarth");
            player25.setAge(19);
            player25.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player25.setNationality("England");
            player25.setPosition("Midfielder");
            player25.setImgUrl("https://www.unitedinfocus.com/static/uploads/14/2020/12/GettyImages-1228435322.jpg");

            player26.setFirstName("Frank");
            player26.setLastName("Onyeka");
            player26.setAge(23);
            player26.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player26.setNationality("Nigeria");
            player26.setPosition("Midfielder");
            player26.setImgUrl("https://images.daznservices.com/di/library/GOAL/bc/e1/frank-onyeka-brentford_o27m1bj9w9fk1dvr2411vnxvj.jpg?t=1152817099&quality=60&w=1200&h=800");

            player27.setFirstName("Myles");
            player27.setLastName("Peart-Harris");
            player27.setAge(19);
            player27.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player27.setNationality("England");
            player27.setPosition("Midfielder");
            player27.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/ft-signings-and-contracts/8m7a3039-16x9.jpg/Large");

            player28.setFirstName("Yoane");
            player28.setLastName("Wissa");
            player28.setAge(25);
            player28.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player28.setNationality("DR Congo");
            player28.setPosition("Midfielder");
            player28.setImgUrl("https://res.feednews.com/assets/v2/3f81ff371724111af4a2de2a2d136989?width=1280&height=720&quality=hq&category=us_News_Sports.Soccer");

            player29.setFirstName("Sergi");
            player29.setLastName("Canos");
            player29.setAge(24);
            player29.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player29.setNationality("Spain");
            player29.setPosition("Forward");
            player29.setImgUrl("https://cdn.mos.cms.futurecdn.net/AKzZPSGemrL6Bs8YFa8hAH.jpg");

            player30.setFirstName("Marcus");
            player30.setLastName("Forss");
            player30.setAge(22);
            player30.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player30.setNationality("Finland");
            player30.setPosition("Forward");
            player30.setImgUrl("https://www.brentfordfc.com/api/image/cropandgreyscale/22841d26-b0a1-4cc6-b75b-c4e366affb39/?preset=square&greyscale=false");

            player31.setFirstName("Ivan");
            player31.setLastName("Toney");
            player31.setAge(25);
            player31.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player31.setNationality("England");
            player31.setPosition("Forward");
            player31.setImgUrl("https://e0.365dm.com/20/10/2048x1152/skysports-ivan-toney-brentford_5141469.jpg");

            player32.setFirstName("Saman");
            player32.setLastName("Ghoddos");
            player32.setAge(28);
            player32.setClub(this.teamRepository.getById(Long.parseLong("3")));
            player32.setNationality("Iran");
            player32.setPosition("Forward");
            player32.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2020-21/first-team-games/20201017---coventry/20201017-165141-35-0100.jpg/Large");

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
        }
    }
}
