package com.example.premierleague.init.news;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class NewsInit {
    private final NewsRepository newsRepository;
    private final UserRepository userRepository;
    private final TeamRepository teamRepository;

    public NewsInit(NewsRepository newsRepository, UserRepository userRepository, TeamRepository teamRepository) {
        this.newsRepository = newsRepository;
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
    }

    public void initNews(){
        if(this.newsRepository.count() == 0) {
            News arsenalNewsOne = new News();
            News arsenalNewsTwo = new News();
            News arsenalNewsThree = new News();
            News arsenalNewsFour = new News();
            News astonVillaNewsOne = new News();
            News astonVillaNewsTwo = new News();
            News astonVillaNewsThree = new News();
            News astonVillaNewsFour = new News();
            News brentfordNewsOne = new News();
            News brentfordNewsTwo = new News();
            News brentfordNewsThree = new News();
            News brentfordNewsFour = new News();
            News brightonNewsOne = new News();
            News brightonNewsTwo = new News();
            News brightonNewsThree = new News();
            News brightonNewsFour = new News();
            News burnleyNewsOne = new News();
            News burnleyNewsTwo = new News();
            News burnleyNewsThree = new News();
            News burnleyNewsFour = new News();
            News chelseaNewsOne = new News();
            News chelseaNewsTwo = new News();
            News chelseaNewsThree = new News();
            News chelseaNewsFour = new News();
            News crystalPalaceNewsOne = new News();
            News crystalPalaceNewsTwo = new News();
            News crystalPalaceNewsThree = new News();
            News crystalPalaceNewsFour = new News();
            News evertonNewsOne = new News();
            News evertonNewsTwo = new News();
            News evertonNewsThree = new News();
            News evertonNewsFour = new News();
            News leedsNewsOne = new News();
            News leedsNewsTwo = new News();
            News leedsNewsThree = new News();
            News leedsNewsFour = new News();
            News leicesterNewsOne = new News();
            News leicesterNewsTwo = new News();
            News leicesterNewsThree = new News();
            News leicesterNewsFour = new News();
            News liverpoolNewsOne = new News();
            News liverpoolNewsTwo = new News();
            News liverpoolNewsThree = new News();
            News liverpoolNewsFour = new News();
            News manCityNewsOne = new News();
            News manCityNewsTwo = new News();
            News manCityNewsThree = new News();
            News manCityNewsFour = new News();
            News manUnitedNewsOne = new News();
            News manUnitedNewsTwo = new News();
            News manUnitedNewsThree = new News();
            News manUnitedNewsFour = new News();
            News newcastleNewsOne = new News();
            News newcastleNewsTwo = new News();
            News newcastleNewsThree = new News();
            News newcastleNewsFour = new News();
            News norwichNewsOne = new News();
            News norwichNewsTwo = new News();
            News norwichNewsThree = new News();
            News norwichNewsFour = new News();
            News southamptonNewsOne = new News();
            News southamptonNewsTwo = new News();
            News southamptonNewsThree = new News();
            News southamptonNewsFour = new News();
            News tottenhamNewsOne = new News();
            News tottenhamNewsTwo = new News();
            News tottenhamNewsThree = new News();
            News tottenhamNewsFour = new News();
            News watfordNewsOne = new News();
            News watfordNewsTwo = new News();
            News watfordNewsThree = new News();
            News watfordNewsFour = new News();
            News westHamNewsOne = new News();
            News westHamNewsTwo = new News();
            News westHamNewsThree = new News();
            News westHamNewsFour = new News();
            News wolverhamptonNewsOne = new News();
            News wolverhamptonNewsTwo = new News();
            News wolverhamptonNewsThree = new News();
            News wolverhamptonNewsFour = new News();

            arsenalNewsOne.setTitle("Arsene Wenger: Invincible");
            arsenalNewsOne.setImgUrl("https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/AWI-Facebook-Trailer-Thumbnail-ARS.jpg?itok=X9A6uFgY");
            arsenalNewsOne.setDescription("Arsene Wenger: Invincible, the definitive portrait of one of the greatest managers of all time, comes to cinemas from November 11.\n" +
                    "\n" +
                    "It will be available on Blu-ray, DVD and digital download on November 22. Click here to pre-order now.\n" +
                    "\n" +
                    "Courtesy of Noah Media Group, the creators of some of the most acclaimed feature-length sports documentaries of recent years (Finding Jack Charlton, Bobby Robson: More than a Manager, The Edge, Steve McQueen: The Man & Le Mans), comes the very first documentary about Wenger, as told in his own words.\n" +
                    "\n" +
                    "A genius, visionary and obsessive, what Wenger achieved with Arsenal changed the landscape of the English game and shaped football worldwide.\n" +
                    "\n" +
                    "Featuring remarkable access and previously unseen archive footage, directors Gabriel Clarke (Bobby Robson: More Than A Manager, Finding Jack Charlton) and Christian Jeanpierre draw back the veil on a truly enigmatic figure who discusses, for the first time, the football ‘addiction’ that was both his driving force and his 'fatal flaw’. \n" +
                    "\n" +
                    "Shot on location in England, France and Arsène’s home village of Duttlenheim, Arsene Wenger: Invicible is a compelling, intimate insight into a football figure like no other.\n" +
                    "\n" +
                    "\u2028Framed against the backdrop of Arsenal’s historic Invincible season of 2003/04, the film sees Wenger reflect candidly on his revolutionary era at the club and the emotional and personal turmoil that surrounded his exit after 22 years. Gravitas and heavyweight authority is added by an A-list supporting cast, led by Wenger’s greatest rival from the time, Sir Alex Ferguson, and star players whose careers were impacted by the French coach, including Thierry Henry, Patrick Vieira, Dennis Bergkamp, Ian Wright, Emmanuel Petit and Robert Pires.\n" +
                    "\n" +
                    "Arsène Wenger’s achievements are stunning. His legacy is unique. Never before has he told his story in his own words... until now.");
            arsenalNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("1")).get());
            arsenalNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            arsenalNewsOne.setAddedOn(LocalDateTime.now());

            arsenalNewsTwo.setTitle("Internationals: Partey scores winner for Ghana");
            arsenalNewsTwo.setImgUrl("https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/Partey_3.jpg?itok=e1ZRQmUR");
            arsenalNewsTwo.setDescription("The international break came to an end on Tuesday, with a host of our players in action. Here's how they got on:\n" +
                    "\n" +
                    "Thomas Partey scored the decisive goal as Ghana secured a crucial win in Zimbabwe.\n" +
                    "\n" +
                    "Our midfielder - who was also on target when the sides met on Saturday - powered home a 31st-minute free-kick to give the Black Stars all three points.\n" +
                    "\n" +
                    "Meanwhile in the Faroe Islands, Kieran Tierney started and played the full 90 minutes to help Scotland take another step towards securing a World Cup play-off spot. Steve Clarke’s side were frustrated by their hosts until Lyndon Dykes bundled in from close range four minutes before the end.\n" +
                    "\n" +
                    "Bukayo Saka came off the bench in England’s 1-1 draw against Hungary at Wembley. Roland Sallai gave the visitors a surprise first-half lead before John Stones equalised just before half-time. Bukayo replaced Jack Grealish just after the hour.\n" +
                    "\n" +
                    "Takehiro Tomiyasu played the duration of Japan’s important win over Australia. Ajdin Hrustic’s second-half leveller cancelled out Ao Tanaka’s early strike - but Aziz Behich’s late own goal handed Hajime Moriyasu’s side a vital victory.\n" +
                    "\n" +
                    "Sead Kolasinac was substituted in second-half stoppage time as Bosnia and Herzegovina drew in Ukraine. Anel Ahmedhodzic equalised for the visitors late on, after Andriy Yarmolenko had given the home team a 15th-minute lead.\n" +
                    "\n" +
                    "Nuno Tavares was part of the Portugal Under-21s defence that kept a clean sheet in Iceland. Fabio Vieira scored the only goal 10 minutes after the restart.");
            arsenalNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("1")).get());
            arsenalNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            arsenalNewsTwo.setAddedOn(LocalDateTime.now());

            arsenalNewsThree.setTitle("Internationals: Auba, ESR, Pepe all score");
            arsenalNewsThree.setImgUrl("https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/ESR%20E-u21%20goal.jpg?itok=PCAgF6H9");
            arsenalNewsThree.setDescription("A host of our players were in action for their respective nations on Monday - with three of them scoring.\n" +
                    "\n" +
                    "Pierre-Emerick Aubameyang was on target as Gabon kept their hopes of qualifying for the World Cup alive with a 2-0 win over Angola. Our captain gave his nation the lead with a quarter of an hour to play, firing home with his left foot. Having scored the first, Auba then set up a late second for Alex Moussounda.\n" +
                    "\n" +
                    "Over in Cotonou, Nicolas Pepe opened the scoring in Ivory Coast’s 2-1 win against Malawi. Nico struck within two minutes and, though Khuda Muyaba equalised soon after, Franck Kessie secured a crucial three points from the spot after the break.\n" +
                    "\n" +
                    "Emile Smith Rowe was on target too, scoring the winner as England Under-21s secured a hard-fought win in Andorra. Our No 10 - who was named man of the match - netted the only goal of the game midway through the second half, latching on to Curtis Jones’ defence-splitting pass before going through on goal and finishing with aplomb. Folarin Balogun also featured as a late substitute, replacing Emile in second-half stoppage time.\n" +
                    "\n" +
                    "Martin Odegaard captained Norway to a 2-0 home success against Montenegro. Mohamed Elyounoussi scored either side of half-time, while Martin was substituted with eight minutes to play.\n" +
                    "\n" +
                    "Egypt are four points clear at the top of Group F thanks to a 3-0 win in Libya. Ahmed El Fotouh, Mostafa Mohamed and Ramadan Sobhi scored the goals, while Mo Elneny completed 90 minutes of action.\n" +
                    "\n" +
                    "Karl Hein started as Estonia were beaten by Wales in Tallinn. Kieffer Moore scored the only goal of the game from close range early in the first half.");
            arsenalNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("1")).get());
            arsenalNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            arsenalNewsThree.setAddedOn(LocalDateTime.now());

            arsenalNewsFour.setTitle("Liverpool v Arsenal Ticket Information");
            arsenalNewsFour.setImgUrl("https://www.arsenal.com/sites/default/files/styles/large_16x9/public/images/WhatsApp%20Image%202019-08-24%20at%2015.16.10.jpeg?itok=20TLz_Vr");
            arsenalNewsFour.setDescription("Liverpool v Arsenal\n" +
                    "\n" +
                    "Premier League\n" +
                    "\n" +
                    "Saturday, November 20, 2021\n" +
                    "\n" +
                    "Kick Off: 17:30\n" +
                    "\n" +
                    "Live on Sky Sports\n" +
                    "\n" +
                    "We have received an allocation of 2,887 tickets for this fixture.\n" +
                    "\n" +
                    "The allocation will be in Blocks 121, 122, 123 and 124.\n" +
                    "\n" +
                    "Discounted Premier League away tickets\n" +
                    "\n" +
                    "We are delighted to remind our loyal travelling supporters that we are continuing to provide a further £4 discount on all away Premier League match tickets this season in addition to the £30 cap on away tickets.\n" +
                    "\n" +
                    "Tickets are priced at:\n" +
                    "\n" +
                    "Adult - £26\n" +
                    "\n" +
                    "65 and over - £18.50\n" +
                    "\n" +
                    "Under 17-21 - £11\n" +
                    "\n" +
                    "Under (16 & Under) - £5\n" +
                    "\n" +
                    "Restricted view and severely restricted view tickets carry a discount of £1 and £3 respectively for Adults, Over 65’s and Young Adults. The Junior tickets remain at £5.\n" +
                    "\n" +
                    "Disabled:\n" +
                    "\n" +
                    "Adults - £18.50\n" +
                    "\n" +
                    "Over 65 - £13\n" +
                    "\n" +
                    "17 -21 (young adult) - £7\n" +
                    "\n" +
                    "Juniors (16 & under) - £3\n" +
                    "\n" +
                    "Disabled tickets will include a free personal assistant, if eligible.\n" +
                    "\n" +
                    " Members purchasing concession tickets must have ID showing proof of age relating to the concession ticket purchased, as you may be required to produce this on entry at the turnstiles.");
            arsenalNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("1")).get());
            arsenalNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            arsenalNewsFour.setAddedOn(LocalDateTime.now());

            astonVillaNewsOne.setTitle("Hause looking to kick on against former team Wolves");
            astonVillaNewsOne.setImgUrl("https://images.webapi.gc.avfcservices.co.uk/800x450/82b8b3c0-2b55-11ec-833f-9d72e593aaa9.jpg");
            astonVillaNewsOne.setDescription("Kortney Hause traded gold and black for claret and blue when he moved across the midlands to join Aston Villa permanently in July 2019.\n" +
                    "\n" +
                    "The defender had arrived from Wolves six months earlier, initially on loan, helping restore the club to the Premier League.\n" +
                    "\n" +
                    "And as he prepares to come face-to-face with his old team at Villa Park on Saturday, Hause has reflected on his decision to join Villa and the journey since.\n" +
                    "\nHe said: “When I came from Wolves I’d spoken to the manager and Christian Purslow and they had a plan. Villa’s a big club and they shouldn’t have been in the Championship.\n" +
                    "\n" +
                    "“I came here with a goal to get the club into the Premier League and get them fighting to get into Europe.\n" +
                    "\n" +
                    "“I knew what I was coming into and I knew what I was getting into. I was all for it because I want to do big things in my career as well.”\n" +
                    "\n" +
                    "Hause added: “It’s been a weird one since I joined Villa – there have been ups but there’s also been downs. We struggled the first year in the Premier League.\n" +
                    "\n" +
                    "“It’s part of the process and we’re still striving for greatness. It’s been up and down, but I’m grateful for where we are at the moment and we’re still looking to kick on.”");
            astonVillaNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("2")).get());
            astonVillaNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            astonVillaNewsOne.setAddedOn(LocalDateTime.now());

            astonVillaNewsTwo.setTitle("Frith joins Villa Academy");
            astonVillaNewsTwo.setImgUrl("https://images.webapi.gc.avfcservices.co.uk/800x450/4110be30-25d9-11ec-8b31-bbf8d7a89bef.jpg");
            astonVillaNewsTwo.setDescription("Aston Villa is delighted to confirm the signing of Declan Frith.\n" +
                    "\n" +
                    "The 19-year-old wide attacking midfielder joins Villa’s Academy having impressed on trial over recent weeks for the Under-23s in Premier League 2.\n" +
                    "\n" +
                    "Frith also scored a hat-trick for the Young Lions in the Birmingham Senior Cup first round last month.\n" +
                    "\n" +
                    "Academy manager Mark Harrison said: “Declan left Chelsea at the end of August and has been on trial with us for a couple of weeks, playing in games against West Bromwich Albion, Coventry Sphinx, Stoke City and Wolves.\n" +
                    "\n" +
                    "“Having performed well he has signed a professional contract. He is a wide attacking player who can play both sides.\n" +
                    "\n" +
                    "“We look forward to seeing how he develops.”");
            astonVillaNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("2")).get());
            astonVillaNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            astonVillaNewsTwo.setAddedOn(LocalDateTime.now());

            astonVillaNewsThree.setTitle("Caleb Chukwuemeka wins PL2 POTM award");
            astonVillaNewsThree.setImgUrl("https://images.webapi.gc.avfcservices.co.uk/800x450/c8faa110-17e9-11ec-9935-557073044e6b.jpg");
            astonVillaNewsThree.setDescription("Caleb Chukwuemeka has won Premier League 2’s September Player of the Month award.\n" +
                    "\n" +
                    "Five goals during three games last month saw the striker fire Aston Villa to the top of the table. \n" +
                    "\n" +
                    "Chukwuemeka's standout display came when he tore West Bromwich Albion apart at Bodymoor Heath, netting a hat-trick in a 4-2 win.The 19-year-old followed it up with a brace in the 8-0 demolition of Stoke City.\n" +
                    "\n" +
                    "Chukwuemeka beat Folarin Balogun (Arsenal), Sam Burns (Blackburn Rovers), Alfie Devine (Tottenham Hotspur), Baba Fernandes (Nottingham Forest), Joe Gelhardt (Leeds United) and Jesurun Rak-Sakyi (Crystal Palace) to the award.");
            astonVillaNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("2")).get());
            astonVillaNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            astonVillaNewsThree.setAddedOn(LocalDateTime.now());

            astonVillaNewsFour.setTitle("Internationals: Mixed emotions for Villans");
            astonVillaNewsFour.setImgUrl("https://images.webapi.gc.avfcservices.co.uk/800x450/5e6a2a30-2c04-11ec-9c89-477d579b78df.jpg");
            astonVillaNewsFour.setDescription("here were mixed emotions for four of Aston Villa’s internationals during World Cup qualifying on Tuesday.\n" +
                    "\n" +
                    "John McGinn was the only player to emerge victorious with his country, helping Scotland to a 1-0 away success against Faroe Islands.\n" +
                    "\n" +
                    "A draw looked to be on the cards before Lydon Dykes scored after 86 minutes, with McGinn playing the full match.\n" +
                    "\n" +
                    "The win helps solidify Scotland’s position in Group F, leaving them one win away from securing a play-off spot.");
            astonVillaNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("2")).get());
            astonVillaNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            astonVillaNewsFour.setAddedOn(LocalDateTime.now());

            brentfordNewsOne.setTitle("MORE FANTASY PREMIER LEAGUE EXPERTS SELECTING MBEUMO");
            brentfordNewsOne.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/first-team-games/20210918---wolves/20210918-130434-92.jpg/Large");
            brentfordNewsOne.setDescription("Two days from now the Premier League season will be about to resume. There has been a gap for international matches but the campaign will kick off again on Saturday with Brentford in action at 5.30pm  that day against Chelsea. The past few days has been time to rest and recover for those not playing international football and Fantasy Premier League managers have been looking at their squads. And the experts have suggested FPL managers should be looking at Brentford.\n" +
                    "\n" +
                    "The FPL season, like the Premier League season, is seven weeks old. Players that are out-performing expectations have been identified by regular players and the way teams are setting up is having an effect. The Premier League's FPL experts are using this break to suggest changes that FPL managers can make and have identified Bryan Mbeumo as one to pick as he is listed as a midfield player but is playing further forward, scoring against Wolverhampton Wanderers and West Ham United.\n" +
                    "\n" +
                    "The Scout has already suggested Bryan is a player to look at and others have joined in. The Premier League has assembled a squad of experts to deliver Fantasy Premier League insight to FPL managers. Fantasy bosses with proven pedigree and respected social influencers are on hand ahead of each match and they have suggested Bryan is a player to look at.");
            brentfordNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("3")).get());
            brentfordNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brentfordNewsOne.setAddedOn(LocalDateTime.now());

            brentfordNewsTwo.setTitle("DRAW FOR WOMEN AGAINST SUTTON");
            brentfordNewsTwo.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/brentford-wfc/womens-matches/210926-watford.jpg/Large");
            brentfordNewsTwo.setDescription("Brentford FC Women’s First Team and Sutton United Women came away with a point each following a 0-0 draw on Sunday. This result leaves Brentford fifth in the league table and means they remain undefeated in the league campaign thus far.\n" +
                    "\n" +
                    "Head Coach Karleigh Osborne has been pleased with the overall performances so far but believes his team still have more to give and said: “I’m pleased with the performances, but I still think there is more from us to come. I think we’ve settled into the league now and the girls have realised they deserve to be where they are. As I say, I still think there is another level or two to go, so I’m looking forward to pushing that and continuing to watch us grow as a team.”\n" +
                    "\n" +
                    "In the first half both sides struggled to create any real chances of note. The Bees were looking dangerous from wide positions but lacked that cutting edge with the final ball. Whereas Sutton were largely limited to shots from distance which never really troubled Emily Boycott in the Brentford goal.\n" +
                    "\n" +
                    "After the break, it was the home side who had more impetus in their play and were pressing Brentford high up the pitch, not allowing them anytime on the ball. This led to a lot of territory gained by Sutton United, however they lacked the quality to breach a resolute Brentford defence.\n" +
                    "\n" +
                    "The big positive for Brentford is that they gained their first clean sheet of the season. They were also missing some key players, most notably captain Mollie Holmes in the centre of midfield, this allowed Jasmine King to make the step up from the B Team and new signing Ashleigh Harvie to make her debut at left back.");
            brentfordNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("3")).get());
            brentfordNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brentfordNewsTwo.setAddedOn(LocalDateTime.now());

            brentfordNewsThree.setTitle("IVAN TONEY THIRD IN PFA PLAYER OF THE MONTH AWARD");
            brentfordNewsThree.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/first-team-games/20210925---liverpool/20210925-180700-50-0100.jpg/Large");
            brentfordNewsThree.setDescription("Ivan Toney finished third in the PFA Vertu Motors Fans' Player of the Month vote for September. The award was won by Liverpool's Mo Salah with Manchester United's Cristiano Ronaldo in second.\n" +
                    "\n" +
                    "Ivan provided a goal and an assist as we beat Wolverhampton Wanderers 2-0 at Molineux before setting up our opener in the 3-3 draw against Liverpool. On top of that, no player in the top flight won more aerial duels than Ivan and his 7 key passes in September was the ninth highest figure in the division over the month.\n" +
                    "\n" +
                    "Ivan was named the WhoScored.com Premier League Player of the Month and earned a place in the WhoScored Team of the Month from Europe's top five leagues.\n" +
                    "\n" +
                    "Despite that it was Liverpool's Salah who took the fans' award following his three-goal haul. His first, in a 3-0 win over Leeds United, made him the fifth-fastest player to 100 Premier League goals. He also found the net against Crystal Palace before scoring in the six-goal thriller at the Brentford Community Stadium to end the month. ");
            brentfordNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("3")).get());
            brentfordNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brentfordNewsThree.setAddedOn(LocalDateTime.now());

            brentfordNewsFour.setTitle("MATCH REPORT: BRENTFORD B 3 BARNET 0");
            brentfordNewsFour.setImgUrl("https://www.brentfordfc.com/siteassets/images/football/2021-22/b-team-games/20211013---barnet/20211013-133200-18909.jpg/Large");
            brentfordNewsFour.setDescription("Nathan Young-Coombes scored twice, either side of a Dom Jefferies goal, to complete a 3-0 win over Barnet for Brentford B on Wednesday afternoon.\n" +
                    "\n" +
                    "After a even first half, Neil MacFarlane's side had Young-Coombes to thank for opening the scoring on the hour. It was a quick-thinking rebound from Jefferies soon after that saw the B Team double the advantage, just before Young-Coombes sealed the win a few minutes later.\n" +
                    "\n" +
                    "Joel Valencia got 45 minutes under his belt, starting the game in an eleven that showed wholesale changes from the last outing at Charlton. Six players missed out through international commitments, while Jude Russell returned to action after a spell out injured.\n" +
                    "\n" +
                    "Barnet fashioned the first real chance after 12 minutes, cutting in from the right wing to strike a ball towards Ben Winterbottom. The keeper caught it with ease but had to be sharp a few minutes later when called into action again. This time, he got down smartly to his right and palmed the ball behind.\n" +
                    "\n" +
                    "The first half was largely a midfield battle and it was rare to see the ball drift into the final third. It almost worked out nicely for the home side after 25 minutes, Valencia squaring the ball back along the edge of the area but narrowly behind Jefferies racing in for a chance to strike it.\n" +
                    "\n" +
                    "Young-Coombes had his head in his hands with 34 on the clock. Lewis Gordon started the move on the left wing, passing the ball inside to Ryan Trevitt. He then found Young-Coombes just inside the box with no one around him, the forward pivoting before firing low towards goal. The shot lacked the power it needed to trouble the goalkeeper and another chance went untaken.");
            brentfordNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("3")).get());
            brentfordNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brentfordNewsFour.setAddedOn(LocalDateTime.now());

            brightonNewsOne.setTitle("Spirited Albion beaten by Rovers on penalties");
            brightonNewsOne.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2021/10/12/62fbb55c-03e9-439c-a877-fa0b0ec9cb7a/Lorent-Tolaj.JPG?width=1280&height=720");
            brightonNewsOne.setDescription("penalty shootout defeat to Forest Green Rovers means Albion will need victory in their final game at Northampton Town, and rely on other results to go their way, if they're to advance in the Papa John's Trophy.\n" +
                    "\n" +
                    "Coach Andrew Crofts will take a lot of positives from the evening as Antef Tsoungui’s harsh red card two minutes into the second half put Albion under real pressure.\n" +
                    "\n" +
                    "But they showed their mettle when, after conceding a second goal shortly after the sending off, Lorent Tolaj’s low strike ensured Albion would take at least a point from the affair.\n" +
                    "\n" +
                    "After some half chances for the hosts, Rob Edwards’ team had the opportunity to take the lead from the penalty spot after Sam Packham tripped Josh March just inside the box.");
            brightonNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("4")).get());
            brightonNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brightonNewsOne.setAddedOn(LocalDateTime.now());

            brightonNewsTwo.setTitle("England call-up for Albion quartet");
            brightonNewsTwo.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2021/10/12/5dd8767c-d927-4481-8ad4-3ace50c42103/Brighton_and_Hove_Albion_Women_v_Tottenham_Hotspur_Women_10OCT21_KH_151.JPG?width=1280&height=720");
            brightonNewsTwo.setDescription("Four Albion players have been selected for an England women’s under-23 training camp later this month.\n" +
                    "\n" +
                    "Defender Maya Le Tissier, midfielders Ellie Brazil and Katie Robinson and goalkeeper Fran Stenson, who is on loan from Arsenal, have been selected for a week-long training camp which starts on 19 October and includes a fixture against Belgium in Brussels on 25 October.\n" +
                    "\n" +
                    "In addition, midfielder Rinsola Babajide has been placed on standby.\n" +
                    "\n" +
                    "Head coach Hope Powell, a former England manager, said, “We’re delighted for all four players who have been selected. This is the next step in their journey towards being a full international and I’m sure they will relish the experience. We wish them all the best.”\n" +
                    "\n" +
                    "Maisie Symonds is in the England under-19 squad for a tournament in Limerick when Republic of Ireland, Switzerland and Northern Ireland are the opposition. Fellow midfielder Libby Bance is on standby.");
            brightonNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("4")).get());
            brightonNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brightonNewsTwo.setAddedOn(LocalDateTime.now());

            brightonNewsThree.setTitle("Ticket news: Upcoming men's U23s and U21s matches");
            brightonNewsThree.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2021/10/11/54493f65-bcdd-4c61-b8b9-d9593fe633ee/Brighton_-_Hove_Albion_U23_v_Leicester_City_U23_24SEP21_PH.040.JPG?width=1280&height=720");
            brightonNewsThree.setDescription("A limited number of season-ticket holders and members will be able to attend under-23s home matches, from this Saturday against Crystal Palace at the American Express Elite Football Performance Centre.\n" +
                    "\n" +
                    "The match has been moved back to Saturday, and will kick-off at 5pm, with one ticket available per season ticket holder – tickets are only available to season ticket holders.\n" +
                    "\n" +
                    "Tickets for the fixture must be purchased by 4pm on Friday, while there will be no catering available on the evening of the game.\n" +
                    "\n" +
                    "Supporters can gain entry to the American Express Elite Football Performance Centre from 4.20pm on the day of the game, and limited parking will be available.\n" +
                    "\n" +
                    "Albion’s under-23s fixture against Manchester City on Friday 29th October will be open to fans too on a similar basis.\n" +
                    "\n" +
                    "Tickets are also on sale for Albion’s Papa John’s Trophy matches away at Forest Green Rovers on Tuesday 12th October and Northampton Town on Tuesday 2nd November.");
            brightonNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("4")).get());
            brightonNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brightonNewsThree.setAddedOn(LocalDateTime.now());

            brightonNewsFour.setTitle("Baxter: Under-18s ready to kick on");
            brightonNewsFour.setImgUrl("https://resources.brightonandhovealbion.com/photo-resources/2021/10/07/b931d2b1-6c85-478c-95de-7bd0e85f15d9/U18-Brighton-v-U18-West-Bromwich-Albion-25SEP21_PH_0141.JPG?width=1280&height=720");
            brightonNewsFour.setDescription("Professional development phase coach James Baxter is looking forward to having a full squad to pick from for the first time this season.\n" +
                    "\n" +
                    "Albion’s interim under-18s boss has seen his squad disrupted by injury, but he should have a full complement to pick from by the end of the international break.\n" +
                    "\n" +
                    "He said “It’s been stop-start, not just with Covid-19 but with injuries, we’ve had a few boys who haven’t kicked a ball yet.\n" +
                    "\n" +
                    "“But by the end of this international break we will have everyone available. As is the case with academy football, we’ve also had five or six train with the 23s and first team. The start of the season has been really pleasing in that aspect.”\n" +
                    "\n" +
                    "Albion have won their opening group games in the group stages of both Premier League Under-17s and Under-18s cup competitions, while they sit sixth after six games in Premier League South.\n" +
                    "\n" +
                    "“We’ve got a very good group – we’ve got second years who won the Premier League Under-17s Cup last season and there’s a good intake of first years,” added Baxter.\n" +
                    "\n" +
                    "“We’re in and around the top teams in the league table at this early stage. We’ve had wins in the Under-17s and Under-18s cup competitions, so it’s been a good start. We want to play a good brand of football with the foundation of a having winning mentality. We want to retain the under-17s cup and to do well in the under-18s cup.”");
            brightonNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("4")).get());
            brightonNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            brightonNewsFour.setAddedOn(LocalDateTime.now());

            burnleyNewsOne.setTitle("Leicester 2 Burnley 2: Chris Wood’s last-minute goal ruled out as Jamie Vardy scores twice following earlier own goal");
            burnleyNewsOne.setImgUrl("https://www.thesun.co.uk/wp-content/uploads/2021/09/crop-16241443-1.jpg?w=660");
            burnleyNewsOne.setDescription("JAMIE VARDY bagged a hat-trick - but for once in his career the Leicester City legend had absolutely no interest in claiming the matchball!\n" +
                    "\n" +
                    "Unfortunately for the 34-year-old Fox, his bullet-header after 12 minutes gifted Burnley the lead in this utterly bonkers game!Although Vardy more than made amends with a double at the 'right' end of the park, it still wasn't enough to put Shaun Dyche's Clarets to the sword.\n" +
                    "\n" +
                    "In fact the visitors will feel they could and should have left with their first win of the season when Chris Wood thought he had snatched a stoppage time winner.\n" +
                    "\n" +
                    "Leicester's ropey defence failed to deal with a spot of head-tennis in their box and Wood pounced to glance his header home off the far post.\n" +
                    "\n" +
                    "But as Burnley fans celebrated, VAR spotted what far-side linesman Neil Davies missed, and judged that the Burnley hitman's foot had strayed marginally offside.\n" +
                    "\n" +
                    "It was a huge let off for a Foxes side who, without their defensive rock Jonny Evans, are a pale imitation of last season's fearless outfit who finished the season in fifth.");
            burnleyNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("5")).get());
            burnleyNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            burnleyNewsOne.setAddedOn(LocalDateTime.now());

            burnleyNewsTwo.setTitle("Ashley Westwood buried his grandad just hours before Burnley’s historic win over Liverpool in January");
            burnleyNewsTwo.setImgUrl("https://www.thesun.co.uk/wp-content/uploads/2021/09/crop-16201925.jpg?w=660");
            burnleyNewsTwo.setDescription("ASHLEY WESTWOOD buried his grandad just hours before Burnley's historic win over Liverpool last season.\n" +
                    "\n" +
                    "The Clarets beat Liverpool 1-0 at Anfield, ending the then defending Premier League champions' 68-game unbeaten home run.Westwood buried his grandad Sid - who saw his grandson's journey to the Premier League - hours before kick-off.\n" +
                    "\n" +
                    "The 31-year-old Englishman managed to make it to Anfield, turn in a fine performance and help his side pick up three valuable points.\n" +
                    "\n" +
                    "Westwood's reasoning for playing the game - which many wouldn't - was simple: grandad Sid wouldn't have been happy if he missed the game.\n" +
                    "\n" +
                    "Westwood told the Daily Mail: \"He wouldn't have been happy with me missing a game because of that.");
            burnleyNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("5")).get());
            burnleyNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            burnleyNewsTwo.setAddedOn(LocalDateTime.now());

            burnleyNewsThree.setTitle("Arsenal and Burnley fans clash in ugly scenes as bottles and seats are thrown at Turf Moor");
            burnleyNewsThree.setImgUrl("https://www.thesun.co.uk/wp-content/uploads/2021/09/SPORT-PREVIEW-Arsenal-Burnley-Aggro.jpg?w=660");
            burnleyNewsThree.setDescription("ARSENAL and Burnley fans were involved in ugly clashes at Turf Moor following the Gunners' 1-0 win.\n" +
                    "\n" +
                    "Images showed bottles and coins being thrown, seats ripped up and blood spattered on the steps of the Barnfield Construction Stand.The two sets of supporters behind the goal came together after the final whistle and had to be separated by stewards.\n" +
                    "\n" +
                    "There were reports of objects being thrown as some fans tried to fight their way across safety barriers, which are in place to segregate the two sets of supporters.\n" +
                    "\n" +
                    "An announcement over Burnley's PA system asked fans to disperse and leave the ground immediately.\n" +
                    "\n" +
                    "Moments before there were positive scenes from the away end as the Arsenal players celebrated three points with the travelling contingent.");
            burnleyNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("5")).get());
            burnleyNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            burnleyNewsThree.setAddedOn(LocalDateTime.now());

            burnleyNewsFour.setTitle("Premier League’s cheapest and most expensive shirts revealed with best budget kit £25 less than top price replica");
            burnleyNewsFour.setImgUrl("https://www.thesun.co.uk/wp-content/uploads/2021/09/AP-PREM-KIT-PRICES-v2.jpg?w=620");
            burnleyNewsFour.setDescription("BURNLEY shirts are the cheapest in the Premier League while Tottenham fans are forced to cough £25 more for a replica shirt.\n" +
                    "\n" +
                    "Clarets supporters get the best value for money in England’s top flight, while Spurs, Chelsea and Liverpool followers pay more than 50 PER CENT extra.Spurs shirts are the most pricey in England with fans having to cough up £70 for a replica jersey, according to 888 Sport research.\n" +
                    "\n" +
                    "Chelsea and Liverpool come in second with theirs just 5p less at £69.95.\n" +
                    "\n" +
                    "Manchester City rank fourth with their Puma top setting Cityzens back £65.\n" +
                    "\n" +
                    "And Newcastle complete the top-five with their famous black and white stripes costing loyal geordies £64.99.\n" +
                    "\n" +
                    "Manchester United, Leicester, Arsenal, Leeds and Aston Villa complete the top 10 from £64.96 to £57.\n" +
                    "\n" +
                    "Burnley's £45 shirt is the best value in England's top flight with Brentford (£48), Crystal Palace (£50) and Norwich (£50) completing the cheapest five list.");
            burnleyNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("5")).get());
            burnleyNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            burnleyNewsFour.setAddedOn(LocalDateTime.now());

            chelseaNewsOne.setTitle("Havertz feared becoming open goal meme in Champions League final as he helped Chelsea down Man City");
            chelseaNewsOne.setImgUrl("https://eu-images.contentstack.com/v3/assets/bltcc7a7ffd2fbf71f5/bltc06f3c97647be70b/60da71c7454f930f33f1098b/437555b27aea67314d5c6cd47267bf3410f45aea.jpg?quality=60&w=1000");
            chelseaNewsOne.setDescription("The Germany international netted a match-winning effort in an all-Premier League encounter, but his nerve held when presented with a golden chance\n" +
                    "\n" +
                    "Kai Havertz has admitted that he feared becoming a meme when presented with an open goal in Chelsea’s Champions League final clash with Premier League rivals Manchester City.\n" +
                    "\n" +
                    "The Germany international was able to hold his nerve in a European showpiece, with a match-winning effort recorded in the 42nd minute of a heavyweight continental clash.\n" +
                    "\n" +
                    "Havertz did, however, have a few scary thoughts going through his head after bundling the ball beyond City goalkeeper Ederson, with the 22-year-old treading a fine line between hero and villain.");
            chelseaNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("6")).get());
            chelseaNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            chelseaNewsOne.setAddedOn(LocalDateTime.now());

            chelseaNewsTwo.setTitle("Pulisic supporting New York Jets in 2021 NFL London Games at Tottenham Hotspur Stadium");
            chelseaNewsTwo.setImgUrl("https://eu-images.contentstack.com/v3/assets/bltcc7a7ffd2fbf71f5/bltfc283ea4eb01acad/6106f1159fdf123163c29410/2b3f57f2554c7859b274f4dac2adb5f97e81c073.jpg?quality=60&w=1000");
            chelseaNewsTwo.setDescription("The Chelsea star, a Pennsylvania native, has made the most of an opportunity to catch some live American Football action in north London\n" +
                    "\n" +
                    "United States international Christian Pulisic has never made any secret of his support for the New York Jets, with the Chelsea forward taking an opportunity to catch them in live action during the 2021 NFL London Games.\n" +
                    "\n" +
                    "The 23-year-old is a Pennsylvania native and revealed in the past that his colours are firmly nailed to New York masts when it comes to sporting institutions in his homeland, with the Rangers of NHL another of his favourite teams.\n" +
                    "\n" +
                    "American Football was back in England on Sunday for the first time since 2019, with Pulisic welcoming the opportunity to make a short trip from west to north London and watch the Jets at the Tottenham Hotspur Stadium.");
            chelseaNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("6")).get());
            chelseaNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            chelseaNewsTwo.setAddedOn(LocalDateTime.now());

            chelseaNewsThree.setTitle("Jorginho not winning Ballon d’Or would be ‘strange’, says Mancini as Chelsea star ‘dreams big’");
            chelseaNewsThree.setImgUrl("https://eu-images.contentstack.com/v3/assets/bltcc7a7ffd2fbf71f5/blt564ec2d3d7136cab/612cadf92baae13d220bc686/8ff47e5d2c80b802bccffa0d3bbe2f781f3e7260.jpg?quality=60&w=1000");
            chelseaNewsThree.setDescription("The Italy boss is convinced that a Champions League and European Championship winner should be the obvious choice to land a Golden Ball in 2021\n" +
                    "\n" +
                    "Jorginho not walking away with the 2021 Ballon d’Or would be “strange”, says Italy boss Roberto Mancini, with the Chelsea midfielder considered to be the obvious choice for a Golden Ball triumph given the year he has enjoyed.\n" +
                    "\n" +
                    "A 29-year-old playmaker on the books at Stamford Bridge has been included on France Football’s 30-man list of contenders battling it out for the right to be called the best player on the planet.\n" +
                    "\n" +
                    "Lionel Messi and Cristiano Ronaldo, with 11 gongs between them, are also in the running, along with Robert Lewandowski and Erling Haaland, but Mancini believes Jorginho deserves the nod after claiming Champions League and European Championship crowns in 2021.");
            chelseaNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("6")).get());
            chelseaNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            chelseaNewsThree.setAddedOn(LocalDateTime.now());

            chelseaNewsFour.setTitle("Listed: Every Champions League winner & the teams that have won the trophy the most times in history");
            chelseaNewsFour.setImgUrl("https://eu-images.contentstack.com/v3/assets/bltcc7a7ffd2fbf71f5/blt2c4e3626de2a2c5e/60da728fa8fb870f882d74de/ab4df6522171a054966d3d73ef608673c7332a7a.jpg?quality=60&w=1000");
            chelseaNewsFour.setDescription("Chelsea secured their second title after beating Manchester City in May 2021, but who has won the competition the most times?\n" +
                    "\n" +
                    "Chelsea beat Manchester City 1-0 in an all-English Champions League final in the 2020-21 season, and both sides are contenders for the trophy once again now that the 2021-22 competition is underway.\n" +
                    "\n" +
                    "A first-half goal from Kai Havertz was enough for the Blues to see off the reigning Premier League champions, whose wait for their first-ever continental crown was extended for another year.\n" +
                    "\n" +
                    "Chelsea now boast two Champions Leagues in their trophy cabinet, but which clubs have won it the most in the history of football? Goal takes a look.");
            chelseaNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("6")).get());
            chelseaNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            chelseaNewsFour.setAddedOn(LocalDateTime.now());

            crystalPalaceNewsOne.setTitle("Routledge describes how Andy Johnson whiplash cut short first goal celebration");
            crystalPalaceNewsOne.setImgUrl("https://media-cdn.incrowdsports.com/442d5f77-ff1c-4db6-8152-73fd79e7d628.jpg?crop=1527:859:nowe:157:183&width=1440&height=1440&format=webp");
            crystalPalaceNewsOne.setDescription("Crystal Palace Academy graduate Wayne Routledge recently announced his retirement from football after 20 years in the game. Having made his senior debut for Palace in October 2001, the 36-year-old went two decades more to compete with clubs like Tottenham Hotspur, Queens Park Rangers and, more than any other, Swansea City.\n" +
                    "\n" +
                    "He spoke at length with Palace TV earlier this year to recall his time in south London.\n" +
                    "\n" +
                    "Routledge began life in Sidcup before moving to Thornton Heath as a child, attending Beulah school and then Archbishop Lanfranc as a teenager. He lived around the corner from Selhurst Park, and remembers “walking past it, shopping in Sainsbury’s, walking it home.”\n" +
                    "\n" +
                    "“It becomes a part of your life because it’s in and around you every day,” he says.\n" +
                    "\n" +
                    "It didn’t take long for Routledge to get spotted by his local side’s scouts, and he joined the Academy around the age of 10. He says life then was “constantly football, football, football,” but it becomes clear he wouldn’t have it any other way.");
            crystalPalaceNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("7")).get());
            crystalPalaceNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            crystalPalaceNewsOne.setAddedOn(LocalDateTime.now());

            crystalPalaceNewsTwo.setTitle("Academy graduate Alex Wynter shares revealing account of his life at Palace");
            crystalPalaceNewsTwo.setImgUrl("https://media-cdn.incrowdsports.com/318a94df-72e4-43df-9b8d-62a0b7cc2b08.jpg?crop=3948:2221:nowe:0:201&width=1440&height=1440&format=webp");
            crystalPalaceNewsTwo.setDescription("Alex Wynter graduated from the Crystal Palace Academy to make his first-team debut aged just 16 in 2010. A south Londoner, he was part of the club for 12 years and made two competitive appearances before leaving permanently to join Colchester United in 2015.\n" +
                    "\n" +
                    "He played over 50 times in League One and Two for the U’s and currently competes with Eastleigh in the National League. Now aged 28, it’s been over 11 years since Wynter made his Palace bow.\n" +
                    "\n" +
                    "Recently, he launched a blog, Fly On The Ball, through which he intends to \"give fans an insight into the journey of professional football and help the next generation understand what they will face on their own journey”.\n" +
                    "\n" +
                    "In it, he shares memories from the various unseen aspects of professional football. There’s no hero-to-zero drama to share, but Wynter’s is a classic and honest example of a career in football. He has written the below column exclusively for cpfc.co.uk to shed light on it.");
            crystalPalaceNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("7")).get());
            crystalPalaceNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            crystalPalaceNewsTwo.setAddedOn(LocalDateTime.now());

            crystalPalaceNewsThree.setTitle("All the results from Palace's international Eagles");
            crystalPalaceNewsThree.setImgUrl("https://media-cdn.incrowdsports.com/b4c4703a-64c5-42a9-9c2e-39c177d8b2e3.jpg?crop=1440:810:nowe:0:0&width=1440&height=1440&format=webp");
            crystalPalaceNewsThree.setDescription("It was another successful break for the international Eagles - get a full update on all the results below!\n" +
                    "\n" +
                    "Joachim Andersen's Denmark secured qualification for the 2022 World Cup with victories over Moldova and Austria. The defender came on as a second-half substitute in the former, marshalling the defence to a fourth consecutive clean sheet.\n" +
                    "\n" +
                    "Wilfried Zaha led the line for the Ivory Coast as they completed a double over Malawi, with Nicolas Pépé and Franck Kessié scoring for the Elephants.\n" +
                    "\n" +
                    "Cheikhou Kouyaté started in central midfield as Senegal conclusively beat Namibia in back-to-back World Cup qualifiers, while Jordan Ayew led the line for Ghana in victories over Zimbabwe.\n" +
                    "\n" +
                    "Meanwhile, Marc Guehi captained England Under-21s in meetings with Andorra and Slovenia, with Conor Gallagher opening the scoring in the latter.");
            crystalPalaceNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("7")).get());
            crystalPalaceNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            crystalPalaceNewsThree.setAddedOn(LocalDateTime.now());

            crystalPalaceNewsFour.setTitle("Kouyate: Rituals, big tackles, and balancing an Africa Cup of Nations season");
            crystalPalaceNewsFour.setImgUrl("https://media-cdn.incrowdsports.com/1d7259d1-f7ee-4f24-8db0-bc6797cdcadd.jpg?crop=960:540:nowe:0:657&width=1440&height=1440&format=webp");
            crystalPalaceNewsFour.setDescription("Be it on the pitch or off it, Cheikhou Kouyate is always on the move. A tenacious footballer and an equally enthusiastic dancer, the Palace midfielder has long been a big character in the home dressing room.\n" +
                    "\n" +
                    "During the club’s official media day, he shows off his moves to the assembled broadcasters. We ask him if he’s enjoying himself. “Meh,” he says, smiling. “I don’t love it – there’s no good music, nothing. It’s too quiet, you know!”\n" +
                    "\n" +
                    "Pre-match, the issue is more in his control. He doesn’t control the playlist, but he isn’t afraid to make his opinions known.\n" +
                    "\n" +
                    "“The pre-match music every time is the same player: it’s Wilfried Zaha,” he reveals. “He takes the music. Sometimes he picks the good music, and sometimes it’s not such good music.\n" +
                    "\n" +
                    "“Too many times he picks the good music. It’s anything, Afrobeat, African music, United States music. He’s like an international DJ! He’s not bad.\n" +
                    "\n" +
                    "“We also have Jamie [Goldsmith], the gym coach. Sometimes he does the music. It’s not bad at all…he tries his best.”");
            crystalPalaceNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("7")).get());
            crystalPalaceNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            crystalPalaceNewsFour.setAddedOn(LocalDateTime.now());

            evertonNewsOne.setTitle("QUIZ: TEST YOUR EVERTON V WEST HAM KNOWLEDGE!");
            evertonNewsOne.setImgUrl("https://resources.evertonfc.com/photo-resources/2021/10/14/c7ee7901-10a8-4bb1-9f16-f3f2ed2cec1f/GettyImages-181434409.jpg?width=315&height=175");
            evertonNewsOne.setDescription("Test your Toffees knowledge by taking part in this week's official Everton quiz!\n" +
                    "\n" +
                    "As the international break comes to an end and with the return of the Premier League just around the corner, we focus on the Blues' history with Sunday's opponents West Ham United.\n" +
                    "\n" +
                    "It will be a clash of two in-form sides at Goodison Park, as David Moyes' Hammers head to Merseyside for a 2pm (BST) kick-off.");
            evertonNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("8")).get());
            evertonNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            evertonNewsOne.setAddedOn(LocalDateTime.now());

            evertonNewsTwo.setTitle("BENITEZ'S EVERTON INJURY UPDATE");
            evertonNewsTwo.setImgUrl("https://resources.evertonfc.com/photo-resources/2021/10/14/63df73b7-e942-4ab4-856e-1d16705c9b5c/fdDutioY.jpg?width=315&height=175");
            evertonNewsTwo.setDescription("Rafa Benitez has confirmed Lucas Digne, Seamus Coleman and Alex Iwobi have returned to full training - but it is too soon to make a decision over anyone’s availability for Sunday’s meeting with West Ham United.\n" +
                    "\n" +
                    "The strike duo of Dominic Calvert-Lewin and Richarlison, along with Everton captain Coleman, missed the four matches immediately prior to October’s Premier League shutdown.\n" +
                    "\n" +
                    "Manager Benitez was additionally without Andre Gomes and Iwobi for the 1-1 draw at Manchester United two weeks ago.\n" +
                    "\n" +
                    "Left-back Digne, meanwhile, returned early from France duty nursing a minor hamstring complaint – and fellow defender Yerry Mina is set to play for Colombia against Ecuador on Thursday night.\n" +
                    "\n" +
                    "For Ben Godfrey and Salomon Rondon, two players whose seasons started late, the past fortnight represented an extended chance for physical conditioning.\n" +
                    "\n" +
                    "“The international break is an opportunity to bring back players,” said Benitez.\n" +
                    "\n" +
                    "“Alex Iwobi was training and [so were] Digne and Coleman – that is good news for us – they have started training with the team.");
            evertonNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("8")).get());
            evertonNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            evertonNewsTwo.setAddedOn(LocalDateTime.now());

            evertonNewsThree.setTitle("EVERTON V TOTTENHAM HOTSPUR TICKETS ON GENERAL SALE");
            evertonNewsThree.setImgUrl("https://resources.evertonfc.com/photo-resources/2021/10/14/cc5e8b28-878f-4ca3-8b4d-905b17057dff/MGAT-0360-Tottenham-1920x1080px2.jpg?width=315&height=175");
            evertonNewsThree.setDescription("Tickets are now on general sale.\n" +
                    "\n" +
                    "Tickets can be purchased online, over the phone on 0151 556 1878 or in person at the Goodison Road ticket office. Opening times for all our ticketing outlets can be found here.\n" +
                    "\n" +
                    "** Everton Season Ticket Members will be able to resell tickets for games they cannot attend during the 2021/22 season, with the Club’s own ticket resale platform being launched.\n" +
                    "\n" +
                    "The facility has been created to assist Season Ticket Members if they are unable to attend matches.\n" +
                    "\n" +
                    "Season Ticket Members can list their seats for any fixture they are unable to attend, with fans able to manage the process themselves from their online ticketing account. Full details of how Season Ticket Members list is available on the Club’s ticketing platform. **");
            evertonNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("8")).get());
            evertonNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            evertonNewsThree.setAddedOn(LocalDateTime.now());

            evertonNewsFour.setTitle("EVERTON'S GOAL OF THE MONTH WINNER REVEALED");
            evertonNewsFour.setImgUrl("https://resources.evertonfc.com/photo-resources/2021/10/13/681b690a-9c89-4977-88c9-b8762f2ddc50/GettyImages-1340209665.jpg?width=315&height=175");
            evertonNewsFour.setDescription("Andros Townsend has scooped his first Davanti Tyres Everton Goal of the Month award after fans voted his stunning strike against Burnley as the Club's best of September.\n" +
                    "\n" +
                    "The summer signing collected possession 35 yards from goal and drove at the Clarets defence before cutting on to his left foot and unleashing an unstoppable curling shot into the top corner of the Sir Philip Carter Park Stand goal.The goal - which was also crowned the Premier League Goal of the Month last week - sparked scenes of jubilation on a memorable night at Goodison, as the Toffees hit the front on their way to a rousing 3-1 victory.\n" +
                    "\n" +
                    "Unsurprisingly, Townsend's strike was a clear winner with a whopping 86.3% of the overall vote, while Demarai Gray's strike from the same game (5.3%) and Hanna Bennison's first goal for Everton Women in the victory over Birmingham (3.3%) finished second and third respectively.");
            evertonNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("8")).get());
            evertonNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            evertonNewsFour.setAddedOn(LocalDateTime.now());

            leedsNewsOne.setTitle("DIEGO LLORENTE: WE WILL TRY TO GET THE THREE POINTS");
            leedsNewsOne.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/150/19043515361618/diego_llorente_web_9.jpg");
            leedsNewsOne.setDescription("Leeds United defender Diego Llorente has spoken to the media ahead of Saturday’s Premier League trip to Southampton.\n" +
                    "\n" +
                    "The Whites are looking for back-to-back wins in the top-flight, against the Saints, who the Whites did the double over last season.\n" +
                    "\n" +
                    "Llorete began by reflecting on the previous game against Watford, in which his goal secured the Whites a one-nil victory.\n" +
                    "\n" +
                    "“I think we deserved the first win,” said Llorente.\n" +
                    "\n" +
                    "“In other games we were unlucky, for example against Newcastle United and West Ham, where the team did a great job, but the result was not as expected.\n" +
                    "\n" +
                    "“Against Watford we deserved the win and I think we could have won by more than one goal, as we had a lot of opportunities.");
            leedsNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("9")).get());
            leedsNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leedsNewsOne.setAddedOn(LocalDateTime.now());

            leedsNewsTwo.setTitle("JON HOWE: FEEDING THE GREED FOR LEEDS");
            leedsNewsTwo.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/150/63431330237870/diego_llorente_web_11.jpg");
            leedsNewsTwo.setDescription("In his latest column for leedsunited.com, lifelong supporter Jon Howe reflects on the win against Watford.\n" +
                    "\n" +
                    "Howe is the author of two books on the club, ‘The Only Place For Us: An A-Z History of Elland Road’ - which has been updated as a new version for 2021 - and ‘All White: Leeds United’s 100 Greatest Players’ in 2012.\uFEFFWe walked away from Elland Road after the 1-0 defeat of Watford with a sense of overwhelming relief. We were delighted, of course, with a first three-point haul of the season; the anxiety was gone, the mental chains were wrestled to the ground and discarded and Leeds United were finally off and running, even if the season was now to be rudely interrupted by another international break. But there was also a lot of frustration.");
            leedsNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("9")).get());
            leedsNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leedsNewsTwo.setAddedOn(LocalDateTime.now());

            leedsNewsThree.setTitle("U23 REPORT: SUNDERLAND 2-1 LEEDS UNITED");
            leedsNewsThree.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/150/62098731813025/crysencio_summerville_web_1.jpg");
            leedsNewsThree.setDescription("A young Leeds United Under-23s side were defeated 2-1 at the Stadium of Light by Sunderland in the Premier League Cup, in a closely fought encounter.\n" +
                    "\n" +
                    "The home side made the brightest start to the match and nearly took the lead from a free-kick inside six minutes.  Caden Kelly’s cross was met by the head of Arbenit Xhemajli, which went just over, landing on the roof of the net.\n" +
                    "\n" +
                    "Sunderland prevented Leeds from creating opportunities in the opening period and were limited to a Harvey Sutcliffe strike which went wide.\n" +
                    "\n" +
                    "The Black Cats threatened the Leeds goal again in the 19th minute, breaking forward at speed down the left, with Nathan Newall forcing Harry Christie into a good stop.\n" +
                    "\n" +
                    "Four minutes later, Sunderland took the lead.  Kelly whipped in a corner and defender Cameron Jessup was on hand to fire a volley into the back of the net from close range.\n" +
                    "\n" +
                    "Sunderland were forced into a change with striker Harry Gardiner going off injured an his replacement Joe Ryder almost had an immediate impact, teeing up Newall to strike from just inside the Leeds box, with his attempt going just over.");
            leedsNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("9")).get());
            leedsNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leedsNewsThree.setAddedOn(LocalDateTime.now());

            leedsNewsFour.setTitle("HOLLY HOUSLEY SIGNS FOR LEEDS UNITED WOMEN");
            leedsNewsFour.setImgUrl("https://dc6vmiz8c91pk.cloudfront.net/media/150/15808644352382/signing_banner.jpg");
            leedsNewsFour.setDescription("Leeds United Women have completed the signing of highly-rated 24-year-old, Holly Housley.\n" +
                    "\n" +
                    "The versatile left-sided player joins the club from Sheffield FC, who play in the league above the Whites. Housley was impressed by the vision and desire of the club to reach a higher level, so had no doubts about signing for Dan O’Hearne’s side.\n" +
                    "\n" +
                    "Housley has previously played in the WSL earlier in her career and will therefore add experience and quality to a Leeds United Women’s side that have started the season in good form.\n" +
                    "\n" +
                    "The Whites sit top of their league and are back in action on Sunday afternoon, where they take on Durham Cestria LFC at the Global Stadium in Tadcaster, and Housley will go straight into the starting line-up.");
            leedsNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("9")).get());
            leedsNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leedsNewsFour.setAddedOn(LocalDateTime.now());

            leicesterNewsOne.setTitle("Six Classic Home Clashes With Manchester United");
            leicesterNewsOne.setImgUrl("https://resources.lcfc.com/photo-resources/2020/07/23/caaba554-cca9-4e2e-853e-ce9c77b719b6/LC7168-231.jpg?width=640&height=360");
            leicesterNewsOne.setDescription("From two hat-tricks in a single game to a biggest-ever triumph, check out six enthralling home encounters with our next Premier League opponents, 20-time English champions Manchester United.All three of the goalscorers in this game had been key members of the Leicester City side which came within one point of winning the league title in 1929, eventually finishing as runners-up.\n" +
                    "\n" +
                    "When the game was played, Leicester were sixth in the table, facing a Man Utd outfit who were relegated at the end of the campaign. Jimmy Bullock’s hat-trick for United were the only goals he scored for the club. Ernie Hine is third in Leicester’s all-time goalscoring list with 156 goals.\n" +
                    "\n" +
                    "Scot Arthur Lochhead, who had signed for Leicester City from Manchester United in 1925, scored twice. He netted over 100 goals for the Club between 1925 and 1934, when he then became manager. Finally, Club record goalscorer Arthur Chandler – who has 273 goals in total – scored once.");
            leicesterNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("10")).get());
            leicesterNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leicesterNewsOne.setAddedOn(LocalDateTime.now());

            leicesterNewsTwo.setTitle("World Cup Qualification Secured For Schmeichel & Vestergaard");
            leicesterNewsTwo.setImgUrl("https://resources.lcfc.com/photo-resources/2021/10/12/930fa9df-fa1f-4523-b2a2-ddccea0345dc/GettyImages-1232046017.jpg?height=360&width=640");
            leicesterNewsTwo.setDescription("The Danes have won all eight of their matches and have not conceded a single goal en route to their qualification for the Qatar finals, scoring 27 times in the process.\n" +
                    "\n" +
                    "On Tuesday, it was Joakim Maehle’s strike on 53 minutes that secured the three points, with Schmeichel and Vestergaard completing 90 minutes to help Denmark to their eighth clean sheet in as many games. \n" +
                    "\n" +
                    "Earlier in the day, Daniel Amartey played from start to finish in Ghana’s 1-0 win away to Zimbabwe in Harare as part of their 2022 FIFA World Cup qualification campaign.\n" +
                    "\n" +
                    "Thomas Partey’s strike on 31 minutes proved to be enough for the Black Stars, who are now second in Group G of the African qualification pool.\n" +
                    "\n" +
                    "They have nine points from four games, and next face Ethiopia in the November international break as they look to close in on leaders South Africa.\n" +
                    "\n" +
                    "In the same competition, Papy Mendy came off the bench late on in Senegal’s 3-1 success over Namibia at Orlando Stadium in Soweto, South Africa, as his nation became one of the first teams to progress through to the play-offs.");
            leicesterNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("10")).get());
            leicesterNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leicesterNewsTwo.setAddedOn(LocalDateTime.now());

            leicesterNewsThree.setTitle("Assessing How City’s Under-18s Have Fared In 2021/22");
            leicesterNewsThree.setImgUrl("https://resources.lcfc.com/photo-resources/2021/10/12/ae582b2d-2013-4d3e-8014-f292e977e4d1/775689422-064.jpg?height=360&width=640");
            leicesterNewsThree.setDescription("City sit fifth in the Premier League U18 South standings after six games of the season, with 12 points collected from a possible 18. Only goal difference separates Leicester from fourth-placed Chelsea, while there’s a three-point gap to top-of-the-table Fulham as things stand.  \n" +
                    "\n" +
                    "Responding well to a 3-1 defeat to Crystal Palace on the opening day of the season, the Under-18s claimed all three points away at Brighton & Hove Albion a week later, also recording a first clean sheet of the campaign in the 1-0 success.\n" +
                    "\n" +
                    "A second successive win – and first on home soil – was secured against Reading as second goals of the season for both Kian Pennant and Jack Butterfill helped the hosts come from behind to triumph 2-1 in Seagrave.\n" +
                    "\n" +
                    "The team’s only other defeat this term arrived away at West Ham United in September, during which Chris Popov got off the mark for the season but could prevent the visitors falling to a 3-1 reverse.\n" +
                    "\n" +
                    "Back-to-back league victories followed, with Chelsea impressively beaten 1-0 at LCFC Training Ground, ahead of another three points and shutout against Southampton a week later, in 3-0 triumph.");
            leicesterNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("10")).get());
            leicesterNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leicesterNewsThree.setAddedOn(LocalDateTime.now());

            leicesterNewsFour.setTitle("Scotland Call For Howard");
            leicesterNewsFour.setImgUrl("https://resources.lcfc.com/photo-resources/2021/10/12/6538dd86-ebfa-4ebd-b771-75c3e2a37eed/775702196-152-1-.jpg?height=360&width=640");
            leicesterNewsFour.setDescription("The 28-year-old centre-back, who has made 21 senior appearances for Scotland to date, will join up with her international team-mates on Monday 18 October, before facing Hungary in a FIFA Women’s World Cup qualifier at Hampden Park on Friday 22 October (7:35pm kick-off).\n" +
                    "\n" +
                    "Scotland are currently second in Group B after two matches, sitting level on six points with Spain, and will be aiming to continue their 100 per cent qualifying record when they welcome fourth-placed Hungary to Glasgow.\n" +
                    "\n" +
                    "The hosts recorded a 2-0 victory over their next opponents at Hidegkuti Nándor Stadium in September, thanks to goals from Erin Cuthbert and Martha Thomas.\n" +
                    "\n" +
                    "A 25-player squad has been assembled for the camp by manager Pedro Martínez Losa and his side are then scheduled to meet Sweden in a friendly match at SMiSA Stadium four days later (7:05pm kick-off).\n" +
                    "\n" +
                    "Good luck, Sophie!");
            leicesterNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("10")).get());
            leicesterNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            leicesterNewsFour.setAddedOn(LocalDateTime.now());

            liverpoolNewsOne.setTitle("Mo Salah named PFA Fans' Player of the Month for September");
            liverpoolNewsOne.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/28/thumb_127977_default_news_size_5.jpeg");
            liverpoolNewsOne.setDescription("Mohamed Salah has been named the PFA Fans' Player of the Month for September in the Premier League.\n" +
                    "\n" +
                    "The Liverpool forward was on the scoresheet three times in the division in the month, striking against Leeds United, Crystal Palace and Brentford.\n" +
                    "\n" +
                    "That streak included both his 100th career Premier League goal and his top-flight century for the Reds, who remained unbeaten in 2021-22.\n" +
                    "\n" +
                    "Salah claimed 69 per cent of the vote for the PFA accolade to see off competition from Michail Antonio, Cristiano Ronaldo, Antonio Rudiger, Ismaila Sarr and Ivan Toney.\n" +
                    "\n");
            liverpoolNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("11")).get());
            liverpoolNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            liverpoolNewsOne.setAddedOn(LocalDateTime.now());

            liverpoolNewsTwo.setTitle("Curtis Jones on 50 Liverpool appearances and target for the fans");
            liverpoolNewsTwo.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/28/thumb_127749_default_news_size_5.jpeg");
            liverpoolNewsTwo.setDescription("Curtis Jones has detailed his pride at reaching 50 Liverpool appearances as he sets out his ambitions for the next half-century.\n" +
                    "\n" +
                    "The Academy graduate reached the milestone at senior level when he started last month’s Carabao Cup victory at Norwich City.\n" +
                    "\n" +
                    "That game marked the beginning of a run of four successive starts for the Reds before the current international break, in which Jones netted at Brentford and was involved in every goal as FC Porto were beaten 5-1 in the Champions League.");
            liverpoolNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("11")).get());
            liverpoolNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            liverpoolNewsTwo.setAddedOn(LocalDateTime.now());

            liverpoolNewsThree.setTitle("LFC fitness update: Trent Alexander-Arnold, Diogo Jota and Thiago Alcantara");
            liverpoolNewsThree.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/28/thumb_127969_default_news_size_5.jpeg");
            liverpoolNewsThree.setDescription("Trent Alexander-Arnold and Diogo Jota are expected to be available for Liverpool's Premier League clash with Watford on Saturday.\n" +
                    "\n" +
                    "Alexander-Arnold missed the Reds’ meetings with FC Porto and Manchester City before the international break due to a muscle issue, while Jota sat out his country’s fixtures in the past week.\n" +
                    "\n" +
                    "Both are set to train fully with their teammates ahead of the trip to Vicarage Road, however, with Jürgen Klopp therefore optimistic they can figure at the weekend.\n" +
                    "\n" +
                    "The lunchtime contest is likely to come too soon for Thiago Alcantara, though – the Spain international continues to recover from a calf injury.\n" +
                    "\n" +
                    "Asked for a squad fitness update, Klopp told Liverpoolfc.com on Wednesday: “They are all good, they are all in a good way, let me say it like this.\n" +
                    "\n" +
                    "“So it looks really like Trent and Diogo will be fine, they will train with us tomorrow completely normal, that’s the plan.\n" +
                    "\n" +
                    "“Thiago needs probably a little bit longer, [he] was not in team training yet – that’s always not a good sign for starting the next game.\n" +
                    "\n" +
                    "“And the rest [of the] international [players], some are back, obviously some are not back yet. And we will see.”");
            liverpoolNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("11")).get());
            liverpoolNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            liverpoolNewsThree.setAddedOn(LocalDateTime.now());

            liverpoolNewsFour.setTitle("Q&A: James Milner on recharging during the break, mentoring and Watford");
            liverpoolNewsFour.setImgUrl("https://d3j2s6hdd6a7rg.cloudfront.net/v2/uploads/media/default/0002/28/thumb_127887_default_news_size_5.jpeg");
            liverpoolNewsFour.setDescription("James Milner feels refreshed and ready to help Liverpool build on their 'solid’ start to the season following this latest international break.\n" +
                    "\n" +
                    "The Reds resume their 2021-22 campaign by travelling to Vicarage Road on Saturday lunchtime to take on Watford, who last week installed Claudio Ranieri as their new head coach.\n" +
                    "\n" +
                    "Milner retired from representing England back in 2016 and now uses the pause in club football to ensure he’s in the best possible shape physically and mentally to serve Jürgen Klopp. \n" +
                    "\n" +
                    "Liverpoolfc.com caught up with the vice-captain at the AXA Training Centre ahead of the Watford encounter – read on for the interview…");
            liverpoolNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("11")).get());
            liverpoolNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            liverpoolNewsFour.setAddedOn(LocalDateTime.now());

            manCityNewsOne.setTitle("CITYZENS GIVING FOR RECOVERY AUCTION WINNERS MEET MANCHESTER CITY STARS");
            manCityNewsOne.setImgUrl("https://www.mancity.com/meta/media/4aqdjcus/kdb-nate-drew-002.jpg?width=810");
            manCityNewsOne.setDescription("The auction, which raised vital funds to help communities get back on their feet in the wake of the pandemic, provided fans with an opportunity to speak to their on-pitch heroes.\n" +
                    "\n" +
                    "With bids coming in from all over the world, four lucky winners were given the chance to meet first-team players through a virtual call.\n" +
                    "\n" +
                    "In the United States, big City fans and father and son duo, Nate and Drew, had the chance to speak to Kevin De Bruyne and hear behind-the-scenes insight on life as a professional footballer.\n" +
                    "\n" +
                    "Their highlights included Kevin’s encouragement to focus on having fun when playing football, and the sound travel advice to ‘don’t forget your umbrella’ when you come to Manchester!\n" +
                    "\n" +
                    "“It was amazing to talk to my favourite player and it is still hard for me to believe that it actually happened. I am so glad that he took the time to talk to me. Kevin was so nice to talk to and funny.\" - Drew (age 9).");
            manCityNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("12")).get());
            manCityNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manCityNewsOne.setAddedOn(LocalDateTime.now());

            manCityNewsTwo.setTitle("STEFFEN SHINES AS USA EDGE HOME");
            manCityNewsTwo.setImgUrl("https://www.mancity.com/meta/media/jikjsyst/zack-steffen-usa.jpg?width=810");
            manCityNewsTwo.setDescription("Zack Steffen impressed as USA beat Costa Rica 2-1 in this morning’s World Cup qualifier.\n" +
                    "\n" +
                    "MEN'S TEAM\n" +
                    "\n" +
                    "International break: Test you knowledge on City players' performances\n" +
                    "In what was Steffen’s first World Cup qualifying debut, the City keeper was confident and assured, making several important saves at crucial moments.\n" +
                    "\n" +
                    "He received a warm reception from the sell-out Columbus crowd having played for Columbus Crew from 2016 to 2019.The States, playing their third game in seven days, had to recover from a dreadful start before eventually overcoming Los Ticos in Columbus.\n" +
                    "\n" +
                    "With a minute not yet on the clock, Steffen was forced to race to race out of his box to head the ball clear – but Costa Rica quickly won possession back and Ronald Matarrita’s cross was converted by Keysher Fuller to give the visitors a dream start.");
            manCityNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("12")).get());
            manCityNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manCityNewsTwo.setAddedOn(LocalDateTime.now());

            manCityNewsThree.setTitle("RUBEN DIAS: ULTIMATE FOOTBALLER");
            manCityNewsThree.setImgUrl("https://images.daznservices.com/di/library/GOAL/39/ba/ruben-dias-manchester-city_hjxddg0fjqfg1rj9r2flf7cuv.jpg?t=-563567196&quality=100");
            manCityNewsThree.setDescription("To kick-off our new video series, we asked the defender to identify which of his colleagues was the strongest in a range of on and off the pitch skills, combining them all together to make one super player.We find out who Dias thinks has the best right and left foot, whilst the defender reveals a category in which he feels Kevin De Bruyne and Ilkay Gundogan can’t be separated.\n" +
                    "\n" +
                    "The 24-year-old also explains who he finds the funniest, who he feels is the most intelligent and who has the best fashion sense.");
            manCityNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("12")).get());
            manCityNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manCityNewsThree.setAddedOn(LocalDateTime.now());

            manCityNewsFour.setTitle("MACE: CITY DEBUT AN ‘INCREDIBLE’ FEELING");
            manCityNewsFour.setImgUrl("https://www.mancity.com/meta/media/grcpnlwm/mace-bunny-cele.jpg?width=810");
            manCityNewsFour.setDescription("Ruby Mace says she ‘words cannot describe’ her elation at making her debut for City.\n" +
                    "\n" +
                    "MATCH REPORT\n" +
                    "\n" +
                    "City topple Toffees in dream Continental Cup opener\n" +
                    "The teenager – a summer recruit – gained her first minutes in Wednesday night’s Continental Cup group opener against Everton, as Gareth Taylor’s side stormed to a 5-1 victory.\n" +
                    "\n" +
                    "Mace produced a solid display at centre-back, completing the full 90 minutes and handling the dangerous duo of Everton stars Toni Duggan and Valerie Gauvin well.");
            manCityNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("12")).get());
            manCityNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manCityNewsFour.setAddedOn(LocalDateTime.now());

            manUnitedNewsOne.setTitle("Harry Maguire 'back soon' but Manchester United expected to be without captain and Raphael Varane against Leicester");
            manUnitedNewsOne.setImgUrl("https://e0.365dm.com/21/09/1600x900/skysports-raphael-varane-harry-maguire_5515798.jpg?20210917151309");
            manUnitedNewsOne.setDescription("Manchester United's Harry Maguire is yet to return to full training as he recovers from injury and is expected to miss Saturday's match against Leicester.\n" +
                    "\n" +
                    "The centre-back has missed United's last two games with a calf injury, and was unavailable for England's World Cup qualifiers against Andorra and Hungary.And although Maguire expects to be back in training soon, his ongoing absence is a headache for Ole Gunnar Solskjaer, who is also without his other first-choice centre-back, Raphael Varane, for the next few weeks.\n" +
                    "\n" +
                    "Varane suffered a groin problem on international duty with France and will miss the upcoming games against Leicester, Atalanta and Liverpool.");
            manUnitedNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("13")).get());
            manUnitedNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manUnitedNewsOne.setAddedOn(LocalDateTime.now());

            manUnitedNewsTwo.setTitle("Manchester United's Anthony Elanga says he was racially abused while playing for Sweden U21s in Italy");
            manUnitedNewsTwo.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-anthony-elanga-sweden-u21_5545158.jpg?20211013124915");
            manUnitedNewsTwo.setDescription("Manchester United forward Anthony Elanga was subjected to alleged racist abuse by an opponent while playing for Sweden U21s on Tuesday, the Swedish Football Association has said.\n" +
                    "\n" +
                    "Elanga was part of the Sweden side that drew 1-1 with Italy in a European U21 Championship Qualifier.A statement on the Swedish FA's official website said: \"In connection with the U21 national team's European Championship Qualifier against Italy in Monza on Tuesday, Anthony Elanga has stated after the match that he has been subjected to a racist comment from an opponent in the Italian U21 national team.\"");
            manUnitedNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("13")).get());
            manUnitedNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manUnitedNewsTwo.setAddedOn(LocalDateTime.now());

            manUnitedNewsThree.setTitle("Which Premier League players could be missing this weekend due to South American internationals issue?");
            manUnitedNewsThree.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-alisson-liverpool_5545141.jpg?20211013123314");
            manUnitedNewsThree.setDescription("Liverpool, Man City, Man Utd and Aston Villa worst affected; some players will be kicking off for their countries just 35 hours before their club games are due to kick off, as the Premier League returns from the international fortnightUp to 16 Premier League players from South America could be missing this weekend due to the scheduling of CONMEBOL's World Cup Qualifying.\n" +
                    "\n" +
                    "Some players will even be kicking off for their countries just 35 hours before their club games are due to kick off as the Premier League returns from the international fortnight.");
            manUnitedNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("13")).get());
            manUnitedNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manUnitedNewsThree.setAddedOn(LocalDateTime.now());

            manUnitedNewsFour.setTitle("Raphael Varane: Manchester United defender out for few weeks with groin injury");
            manUnitedNewsFour.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-raphael-varane-manchester-united_5544345.jpg?20211012164058");
            manUnitedNewsFour.setDescription("Raphael Varane came off injured in the first half of France's Nations League final victory over Spain on Sunday; defender is expected to miss games vs Leicester, Atalanta and Liverpool; United may also be without captain Harry Magure against Foxes on Saturday due to injuryManchester United have announced Raphael Varane will be out for a \"few weeks\" with a groin injury sustained playing for France.\n" +
                    "\n" +
                    "The defender picked up the problem in Sunday's Nations League final, which saw France overcome Spain with a 2-1 victory to win the second edition of the UEFA competition thanks to goals from Karim Benzema and Kylian Mbappe.");
            manUnitedNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("13")).get());
            manUnitedNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            manUnitedNewsFour.setAddedOn(LocalDateTime.now());

            newcastleNewsOne.setTitle("Back in Tyne: Five memorable victories against Spurs");
            newcastleNewsOne.setImgUrl("https://www.nufc.co.uk/media/56907/back-in-tyne-spurs.jpg?anchor=center&mode=crop&width=2000&height=1125&quality=80");
            newcastleNewsOne.setDescription("Magnificent seven for United (1996/97)\n" +
                    "\n" +
                    "Newcastle United ended the year in sensational fashion after recording their joint-best Premier League victory with a 7-1 thrashing of Tottenham at St. James’ Park.\n" +
                    "\n" +
                    "The Magpies were without a league win in seven matches but took the lead inside 20 minutes through Alan Shearer’s impressive half-volley before Les Ferdinand doubled the hosts’ advantage two minutes later with a stretched finish.\n" +
                    "\n" +
                    "Ferdinand, who would join Tottenham the following season, grabbed United’s third after getting on the end of John Beresford’s whipped cross before Rob Lee’s low drive added further gloss to the scoreline.\n" +
                    "\n" +
                    "Philippe Albert, who netted United’s fifth in a memorable 5-0 victory against Manchester United two months prior, got in on the act before Shearer and Lee both grabbed their braces in the closing stages.\n" +
                    "\n" +
                    "Pavel Srníček’s hopes of a clean sheet were cruelly dashed in the 89th minute as Allan Nielsen netted a consolation on an otherwise perfect afternoon for Kevin Keegan’s side.");
            newcastleNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("14")).get());
            newcastleNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            newcastleNewsOne.setAddedOn(LocalDateTime.now());

            newcastleNewsTwo.setTitle("Newcastle United Foundation Trustee Shola Ameobi launches NU Futures outreach programme for young people");
            newcastleNewsTwo.setImgUrl("https://www.nufc.co.uk/media/61318/shola-ameobi-nu-futures.jpg?anchor=center&mode=crop&width=2000&height=1125&quality=80");
            newcastleNewsTwo.setDescription("Centrally-based in NUCASTLE, powered by Newcastle Building Society, NU Futures will support 12,000 young people annually over the next decade and transform the way the next generation enter the world of work.\n" +
                    "\n" +
                    "By better connecting young people with life-changing opportunities in the North of Tyne economy through inspirational STEM (science, technology, engineering and maths) learning, apprenticeships and career paths, NU Futures will tackle wealth inequalities issues, low productivity and exclusion for the next generation.\n" +
                    "\n" +
                    "Ameobi saw first-hand where NU Futures will be delivered by Newcastle United Foundation with support from the North of Tyne Combined Authority through their £2.6m investment into the careers and education programme.\n" +
                    "\n" +
                    "\"NU FUTURES IS GOING TO BE SO IMPORTANT TO THE REGION AND MAKING SURE EVERYONE HAS OPPORTUNITIES TO SUCCEED AND TO BE THE BEST THEY CAN BE. ANYONE LOOKING FOR THAT SUPPORT OR FOR GUIDANCE ON THEIR OPTIONS FOR THE FUTURE WILL BE ABLE TO GET IT THROUGH THE FOUNDATION AND THE NU FUTURES PROGRAMME.\"\n" +
                    "\n" +
                    "SHOLA AMEOBI\n" +
                    "At an exclusive launch event at NUCASTLE - a stone's throw from where Ameobi grew up - the Foundation trustee met with teenagers and young adults already receiving employment support from the charity to improve their confidence, interviewing skills and job prospects.");
            newcastleNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("14")).get());
            newcastleNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            newcastleNewsTwo.setAddedOn(LocalDateTime.now());

            newcastleNewsThree.setTitle("\"A very different type of game\" - Young on Northumberland Senior Cup tie");
            newcastleNewsThree.setImgUrl("https://www.nufc.co.uk/media/61312/jack-young-ns-cup.jpg?anchor=center&mode=crop&width=2000&height=1125&quality=80");
            newcastleNewsThree.setDescription("The young Magpies, who have won the competition a record 38 times, take on the Northern League Division One side at Whitley Park (kick-off 7.30pm BST), bidding to reach the quarter-final stages.\n" +
                    "\n" +
                    "Young, who made his Newcastle first-team debut during a 3-2 pre-season victory at Doncaster Rovers in July, is anticipating a tough test against the Lions, with the two teams having faced each other in the tournament back in January 2020 as Newcastle's second-string prevailed in a penalty shoot-out, following a 1-1 draw at Benfield's Sam Smith's Park.\n" +
                    "\n" +
                    "\"It will be a very different type of game, a one where we will have to show a different skill set and deal with direct play,\" the Morpeth-born midfielder told nufc.co.uk. \"We've had experience with that this season in the Papa John's Trophy so hopefully we can get the ball down and play, making it our kind of game instead of theirs. ");
            newcastleNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("14")).get());
            newcastleNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            newcastleNewsThree.setAddedOn(LocalDateTime.now());

            newcastleNewsFour.setTitle("Chelsea tickets now on online general sale");
            newcastleNewsFour.setImgUrl("https://www.nufc.co.uk/media/61120/fan-passionate.jpg?anchor=center&mode=crop&width=2000&height=1125&quality=80");
            newcastleNewsFour.setDescription("Thomas Tuchel's team head to St. James' Park for a 3pm (BST) kick-off on Saturday, 30th October, and tickets for the category A game went on Member sale on Tuesday, 5th October. \n" +
                    "\n" +
                    "They then went on online general sale at 10am on Tuesday, 12th October and, subject to availability, will be released for full general sale - including telephone bookings - seven days later. Adult and junior memberships can also be bought online.\n" +
                    "\n" +
                    "Hospitality is also available from £216. \n" +
                    "\n" +
                    "Tickets for United's home game against Tottenham Hotspur - the beginning of a new era for the Magpies - sold out last week. ");
            newcastleNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("14")).get());
            newcastleNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            newcastleNewsFour.setAddedOn(LocalDateTime.now());

            norwichNewsOne.setTitle("Brandon Williams: Manchester United left-back joins Norwich City on season-long loan");
            norwichNewsOne.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-brandon-williams_5487881.jpg?20210823142850");
            norwichNewsOne.setDescription("Norwich have beaten off competition for Brandon Williams from Newcastle and Southampton; Williams has seen his gametime at Old Trafford restricted by the form of Luke Shaw at left-back; the defender could be available to feature in Norwich's Carabao Cup game with Bournemouth on TuesdayEngland Under-21 international full-back Brandon Williams has completed a move to Norwich City on a season-long loan from Manchester United.\n" +
                    "\n" +
                    "The 20-year-old's move to Carrow Road was finalised on Monday after he completed a medical over the weekend, and the defender will wear the No 21 shirt for the Canaries for the rest of the 2021/22 campaign.");
            norwichNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("15")).get());
            norwichNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            norwichNewsOne.setAddedOn(LocalDateTime.now());

            norwichNewsTwo.setTitle("Homophobia in football: FA determined to drive 'rent boy' slur out of the sport, says director Edleen John");
            norwichNewsTwo.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-billy-gilmour-football_5481871.jpg?20210817164644");
            norwichNewsTwo.setDescription("Some Liverpool fans used the phrase towards Norwich's Billy Gilmour on Saturday, while there were allegations of homophobic language used by some supporters during Derby and Peterborough's game; FA's Edleen John: \"We have to understand that 'rent boy' is on the same level [as racism]\"Edleen John, the Equality, Diversity and Inclusion Director at the Football Association, says the governing body abhors the \"disgusting\" use of the 'rent boy' insult and is determined to drive it out of the game.\n" +
                    "\n" +
                    "Norwich, Liverpool, a number of LGBT+ groups and Kick It Out have condemned the use of the term by some Liverpool supporters towards on-loan Chelsea midfielder Billy Gilmour during the sides' Premier League opener at Carrow Road on Saturday.");
            norwichNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("15")).get());
            norwichNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            norwichNewsTwo.setAddedOn(LocalDateTime.now());

            norwichNewsThree.setTitle("Billy Gilmour: Kick It Out condemns homophobic chanting by Liverpool fans aimed at on-loan Norwich midfielder");
            norwichNewsThree.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-billy-gilmour-norwich_5480924.jpg?20210816161201");
            norwichNewsThree.setDescription("Kop Outs, Liverpool's LGBT+ fans group, founder Paul Amann says it was \"deeply disappointing\" to hear fellow Liverpool supporters engage in the chanting after efforts in recent years to educate fans about the use of the term 'rent boy'Kick It Out has condemned homophobic chanting by Liverpool supporters aimed at Norwich’s on-loan midfielder Billy Gilmour at Carrow Road on Saturday.\n" +
                    "\n" +
                    "The Scotland international, 20, was targeted by some fans during Liverpool's 3-0 win in the Premier League as he made his competitive debut for Norwich after joining the club on a season-long loan from Chelsea in July.\n" +
                    "\n" +
                    "Liverpool said the chant was \"offensive and inappropriate\" after it was highlighted by Kop Outs, the club's LGBT+ fans group.");
            norwichNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("15")).get());
            norwichNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            norwichNewsThree.setAddedOn(LocalDateTime.now());

            norwichNewsFour.setTitle("Liverpool condemn homophobic chants directed at Norwich's Billy Gilmour");
            norwichNewsFour.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-billy-gilmour-norwich_5479318.jpg?20210814211215");
            norwichNewsFour.setDescription("Norwich's on-loan Chelsea midfielder Billy Gilmour was the subject of homophobic chanting from a section of Liverpool fans during the Premier League game at Carrow Road; Derby also investigating allegations of racist and homophobic abuse in their game at PeterboroughLiverpool have condemned homophobic chanting directed towards Norwich midfielder Billy Gilmour during the team's 3-0 victory at Carrow Road.\n" +
                    "\n" +
                    "Goals from Diogo Jota, Roberto Firmino and Mohamed Salah made it a winning start to the new campaign, but Gilmour - the on-loan Chelsea player - was verbally targeted by a section of Liverpool supporters during the win.\n" +
                    "\n" +
                    "An official Liverpool tweet posted after the game read: \"The chant is offensive and inappropriate - a message we have repeatedly communicated alongside Kop Outs.\n" +
                    "\n" +
                    "\"We urge supporters to remember the inclusive values of the club and to refrain from using it in the future.\"");
            norwichNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("15")).get());
            norwichNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            norwichNewsFour.setAddedOn(LocalDateTime.now());

            southamptonNewsOne.setTitle("Che Adams: Southampton striker to miss Premier League game against Leeds, Ralph Hasenhuttl confirms");
            southamptonNewsOne.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-che-adams-southampton_5546232.jpg?20211014133927");
            southamptonNewsOne.setDescription("The 25-year-old was ruled out of Scotland's match against the Faroe Islands last week after suffering a muscle injury in their 3-2 win over Israel; Ralph Hasenhuttl: \"It's not too serious but he will definitely be out for the game this weekend\"Southampton striker Che Adams will miss Saturday's Premier League home match against Leeds after picking up a muscle injury on international duty with Scotland, manager Ralph Hasenhuttl said on Thursday.\n" +
                    "\n" +
                    "Adams was ruled out of Scotland's match against the Faroe Islands last week after suffering the injury in their 3-2 win over Israel at Hampden Park.");
            southamptonNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("16")).get());
            southamptonNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            southamptonNewsOne.setAddedOn(LocalDateTime.now());

            southamptonNewsTwo.setTitle("Faroe Islands vs Scotland: Che Adams pulls out of World Cup Qualifying game through injury");
            southamptonNewsTwo.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-che-adams-scotland_5542869.jpg?20211011111532");
            southamptonNewsTwo.setDescription("Che Adams won his 11th Scotland cap in their dramatic 3-2 win over Israel on Saturday; however, striker will miss World Cup Qualifier away to the Faroe Islands on Tuesday; watch the Faroe Islands vs Scotland live on Sky Sports from 7pm - kick-off at 7:45pmChe Adams has withdrawn from Scotland's squad for their World Cup Qualifier away to the Faroe Islands on Tuesday - live on Sky Sports - through injury.\n" +
                    "\n" +
                    "Adams started Scotland's dramatic 3-2 win over Israel on Saturday at Hampden Park but was substituted in the second-half due a leg injury.");
            southamptonNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("16")).get());
            southamptonNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            southamptonNewsTwo.setAddedOn(LocalDateTime.now());

            southamptonNewsThree.setTitle("Tino Livramento: Southampton defender says Chelsea exit was needed to achieve Premier League dream");
            southamptonNewsThree.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-tino-livramento-southampton_5536491.jpg?20211005225608");
            southamptonNewsThree.setDescription("Tino Livramento is now with England U21s ahead of Thursday's Euro 2023 qualifier in Slovenia and knows leaving Chelsea was the right move; he signed for Southampton from the Blues in the summer for a £5m fee and played against his boyhood club in Saturday's 3-1 defeatTino Livramento admits he needed to leave Chelsea for the good of his career.\n" +
                    "\n" +
                    "The 18-year-old right-back has starred for Southampton since his £5m summer switch from the Blues.");
            southamptonNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("16")).get());
            southamptonNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            southamptonNewsThree.setAddedOn(LocalDateTime.now());

            southamptonNewsFour.setTitle("Southampton transfer news: Lyanco joins club from Torino on four-year deal");
            southamptonNewsFour.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-lyanco-southampton_5489772.jpg?20210825150839");
            southamptonNewsFour.setDescription("Lyanco is Ralph Hasenhuttl's eighth summer signing and has arrived at St Mary's on a contract until 2025; \"It's a dream that I have had since I started playing football as a child to play in the Premier League and for a team like Southampton\"Southampton have completed the signing of Brazilian defender Lyanco from Torino on a four-year contract.\n" +
                    "\n" +
                    "The 24-year-old completed a medical on Monday and is understood to have also been subject to interest from Udinese and their sister club Watford over the summer.");
            southamptonNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("16")).get());
            southamptonNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            southamptonNewsFour.setAddedOn(LocalDateTime.now());

            tottenhamNewsOne.setTitle("Man City would walk the Premier League if they had Harry Kane, says Gary Neville");
            tottenhamNewsOne.setImgUrl("https://s.hs-data.com/bilder/spieler/gross/179293.jpg?fallback=png");
            tottenhamNewsOne.setDescription("Manchester City secured four points from trips to Chelsea and Liverpool underlining their pedigree as Premier League champions even without a recognised striker; Neville also reflects on Cristiano Ronaldo's actions and the pressure being put on Ole Gunnar SolskjaerGary Neville says there would be no Premier League title contest this season had Manchester City managed to snare Harry Kane away from Tottenham over the summer.\n" +
                    "\n" +
                    "City came from behind twice to earn a 2-2 draw with Liverpool in a breathless and pulsating Premier League encounter at Anfield on Sunday, but the game further highlighted a lack of cutting edge in the champions during a dominant first half.");
            tottenhamNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("17")).get());
            tottenhamNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            tottenhamNewsOne.setAddedOn(LocalDateTime.now());

            tottenhamNewsTwo.setTitle("Serge Aurier: Former Tottenham right-back set to sign for Villarreal on initial one-year contract");
            tottenhamNewsTwo.setImgUrl("https://e0.365dm.com/21/05/1600x900/skysports-serge-aurier-tottenham_5400953.jpg?20211004114201");
            tottenhamNewsTwo.setDescription("Serge Aurier set to sign for Villarreal on initial one-year contract; former Spurs right-back agreed to mutually terminate his contract with the north London club in August; Aurier will link up again with Villarreal boss Unai Emery, who coached him at Paris Saint-GermainFormer Tottenham defender Serge Aurier is set to sign for Villarreal. \n" +
                    "\n" +
                    "The Ivory Coast international has agreed an initial one-year deal, with an option of two further years, after completing a medical on Monday.");
            tottenhamNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("17")).get());
            tottenhamNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            tottenhamNewsTwo.setAddedOn(LocalDateTime.now());

            tottenhamNewsThree.setTitle("Harry Kane marvels at bonus Europa Conference League hat-trick");
            tottenhamNewsThree.setImgUrl("https://e0.365dm.com/21/09/1600x900/skysports-kane-son-tottenham_5530940.jpg?20210930221247");
            tottenhamNewsThree.setDescription("Harry Kane comes off bench to score 20-minute hat-trick as Tottenham run riot in 5-1 victory over NS Mura; Dele Alli and Giovani Lo Celso also on target as Spurs end five-game winless run to move top of Europa Conference League Group GHarry Kane said his hat-trick from the bench in Tottenham's 5-1 Europa Conference League win over NS Mura came as a bonus.\n" +
                    "\n" +
                    "The England captain struck the 13th treble of his Spurs career after coming on just before the hour-mark against the Slovenian outfit.");
            tottenhamNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("17")).get());
            tottenhamNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            tottenhamNewsThree.setAddedOn(LocalDateTime.now());

            tottenhamNewsFour.setTitle("Emi Martinez, Cristian Romero and Giovani Lo Celso: Argentina call up three Premier League players for October internationals");
            tottenhamNewsFour.setImgUrl("https://e0.365dm.com/21/09/1600x900/skysports-cristian-romero-martinez_5500966.jpg?20210904210417");
            tottenhamNewsFour.setDescription("As of Friday, all three players would be allowed to enter Argentina if they are fully vaccinated and return a negative Covid test; however, should they return to the UK, they would have to quarantine for 10 days upon their return; Argentina are due to play Paraguay, Uruguay and PeruAston Villa goalkeeper Emi Martinez and Tottenham duo Cristian Romero and Giovani Lo Celso have been called up by Argentina for October's World Cup Qualifiers despite the country remaining on the UK's red travel list.\n" +
                    "\n" +
                    "Premier League club's agreed not to allow South American players to travel to represent their countries for last month's international break due to quarantine rules.");
            tottenhamNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("17")).get());
            tottenhamNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            tottenhamNewsFour.setAddedOn(LocalDateTime.now());

            watfordNewsOne.setTitle("Claudio Ranieri thrilled to be at Watford - and determined to keep them in the Premier League");
            watfordNewsOne.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-claudio-ranieri-watford_5535034.png?20211004162338");
            watfordNewsOne.setDescription("Title-winning boss has replaced Xisco Munoz, who was fired after taking seven points from seven games this season; Ranieri: \"I am an ambitious man and I hope to bring Watford to be safe at the end of the season and to improve\"Claudio Ranieri says he is delighted to be a head coach in the Premier League again with Watford - and says his first job is to keep them in the top flight.\n" +
                    "\n" +
                    "The Italian, who famously led Leicester to Premier League glory in 2015/16, turns 70 next week.");
            watfordNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("18")).get());
            watfordNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            watfordNewsOne.setAddedOn(LocalDateTime.now());

            watfordNewsTwo.setTitle("Claudio Ranieri: Watford in talks to appoint Italian after sacking Xisco Munoz as head coach");
            watfordNewsTwo.setImgUrl("https://e0.365dm.com/21/10/1600x900/skysports-ranieri-claudio-ranieri_5533380.jpg?20211003120639");
            watfordNewsTwo.setDescription("Watford have seven points from their opening seven league games, with Xisco Munoz's last match in charge a 1-0 defeat against Leeds at Elland Road on Saturday; former Chelsea and Leicester boss Claudio Ranieri previously considered by Hornets, Sky Sports News has been toldWatford are in talks to appoint Claudio Ranieri as their new head coach after sacking Xisco Munoz.\n" +
                    "\n" +
                    "Ranieri, who guided Leicester City to the Premier League title in 2016, left his role as Sampdoria manager at the end of last season.");
            watfordNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("18")).get());
            watfordNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            watfordNewsTwo.setAddedOn(LocalDateTime.now());

            watfordNewsThree.setTitle("Peter Etebo: On-loan Watford midfielder faces four to five months out with torn quad muscle");
            watfordNewsThree.setImgUrl("https://e0.365dm.com/21/09/1600x900/skysports-peter-etebo-watford_5530381.jpg?20210930130243");
            watfordNewsThree.setDescription("Watford have revealed the extent of the injury that forced Peter Etebo to be withdrawn against Newcastle; the 25-year-old sustained a torn quad injury that is set to keep him out of action for four to five monthsWatford midfielder Peter Etebo will miss up to five months after picking up a torn quad muscle injury against Newcastle.\n" +
                    "\n" +
                    "The 25-year-old, who is on loan from Stoke, sustained the injury towards the end of the club's 1-1 draw against the Magpies last weekend.");
            watfordNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("18")).get());
            watfordNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            watfordNewsThree.setAddedOn(LocalDateTime.now());

            watfordNewsFour.setTitle("Troy Deeney joins Birmingham after announcing Watford departure");
            watfordNewsFour.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-troy-deeney-watford_5495526.jpg?20210830151859");
            watfordNewsFour.setDescription("Troy Deeney leaves Watford after more than 400 games for the club; captain's contract was due to expire at the end of the season, but striker leaves as free agent; Deeney has now joined boyhood club Birmingham on two-year dealBirmingham have confirmed the signing of Troy Deeney on a two-year deal after the striker ended his 11-year stay at Watford.\n" +
                    "\n" +
                    "Deeney says he feels \"tremendous pride\" for everything he has achieved with the Hornets. The 33-year-old's contract was due to expire at the end of the season, but Watford agreed to let him depart as a free agent.");
            watfordNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("18")).get());
            watfordNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            watfordNewsFour.setAddedOn(LocalDateTime.now());

            westHamNewsOne.setTitle("Declan Rice reaffirms commitment to West Ham as David Moyes calls him one of Europe's best young midfielders");
            westHamNewsOne.setImgUrl("https://e0.365dm.com/19/09/736x414/skysports-declan-rice-west-ham_4777445.jpg?20190917145557");
            westHamNewsOne.setDescription("Declan Rice has been regularly linked with a transfer to a 'big six' Premier League side, while he has reportedly stalled over signing a new West Ham contract; however, midfielder says he 'loves playing for this team' and for David MoyesDeclan Rice insists he is happy at West Ham and is confident he can achieve his ambitions at the club.\n" +
                    "\n" +
                    "The England midfielder has been constantly linked with a move to Chelsea and Manchester United and has reportedly stalled over signing a new contract.");
            westHamNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("19")).get());
            westHamNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            westHamNewsOne.setAddedOn(LocalDateTime.now());

            westHamNewsTwo.setTitle("Jesse Lingard: West Ham return for Manchester United winger was never close, says David Moyes");
            westHamNewsTwo.setImgUrl("https://e0.365dm.com/21/07/1600x900/skysports-jesse-lingard_5448216.jpg?20210715160257");
            westHamNewsTwo.setDescription("Jesse Lingard hoping to be part of Man Utd squad for Premier League clash at West Ham on Sunday; David Moyes believes Ole Gunnar Solskjaer can bring title back to Old Trafford after nine years; watch West Ham vs Man Utd on Sunday, live on Sky Sports from 1pm - kick-off at 2pmDavid Moyes has revealed a return to West Ham for Jesse Lingard was never close to materialising over the summer.\n" +
                    "\n" +
                    "Lingard, 28, scored nine goals in 16 matches for the Hammers while on loan last season as he earned a recall to the England squad.");
            westHamNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("19")).get());
            westHamNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            westHamNewsTwo.setAddedOn(LocalDateTime.now());

            westHamNewsThree.setTitle("Cristiano Ronaldo: Michail Antonio can become West Ham's answer to Manchester United forward, says David Moyes");
            westHamNewsThree.setImgUrl("https://e0.365dm.com/21/09/1600x900/skysports-michail-antonio_5507198.jpg?20210910104017");
            westHamNewsThree.setDescription("Michail Antonio, 31, became West Ham's all-time leading Premier League goalscorer last month; Jamaica international joined the Hammers from Nottingham Forest as a winger in 2015 but has become club's No 9David Moyes wants to develop Michail Antonio into a ruthless goalscorer for West Ham and be as influential as Cristiano Ronaldo has been during his career.\n" +
                    "\n" +
                    "Antonio, who became West Ham's all-time leading Premier League goalscorer last month, has scored five goals in as many games this season, including a first in Europe against Dinamo Zagreb on Thursday.");
            westHamNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("19")).get());
            westHamNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            westHamNewsThree.setAddedOn(LocalDateTime.now());

            westHamNewsFour.setTitle("Kurt Zouma: West Ham sign France international defender from Chelsea on four-year deal");
            westHamNewsFour.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-kurt-zouma-chelsea_5481850.jpg?20210817164118");
            westHamNewsFour.setDescription("Kurt Zouma has joined West Ham from Chelsea for £29.8m on a four-year deal after completing a medical on Thursday; West Ham were keen to add defensive reinforcements and had targeted Zouma, who had fallen out of favour under Thomas Tuchel; Zouma: \"I'm very happy and very proud\"West Ham have completed the £29.8m signing of Kurt Zouma from Chelsea on a four-year deal.\n" +
                    "\n" +
                    "The 26-year-old centre-back has signed a contract until the summer of 2025 after undergoing a medical on Thursday." +
                    "\n" +"Sky Sports News previously reported that West Ham were keen to add defensive reinforcements and had targeted Zouma, who had fallen out of favour at Chelsea under Thomas Tuchel.");
            westHamNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("19")).get());
            westHamNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            westHamNewsFour.setAddedOn(LocalDateTime.now());

            wolverhamptonNewsOne.setTitle("Hwang Hee-chan exclusive interview: Wolves' new loan signing from Leipzig on being the new Bull at Molineux");
            wolverhamptonNewsOne.setImgUrl("https://e0.365dm.com/21/09/1600x900/skysports-hwang-hee-chan-wolves_5518173.jpg?20210920084823");
            wolverhamptonNewsOne.setDescription("In an exclusive interview with Sky Sports, Wolves’ new signing Hwang Hee-chan reveals why he is known as The Bull, opens up on the COVID-19 issues that complicated his stay in Germany and why he is ready to make up for lost time in the Premier League...There could hardly be a more appropriate nickname for a player hoping for hero status at Wolves. Steve Bull scored 306 goals for this club. They named a stand after him. Now Hwang Hee-chan is here, known as The Bull, and already off the mark.\n" +
                    "\n" +
                    "Hwang's goal at Watford makes him the only man to score a Premier League goal for Wolves so far under Bruno Lage. Inside the dressing room at Molineux for his first interviews, the new loan signing from Leipzig reflects on that moment, that nickname, and more.");
            wolverhamptonNewsOne.setTeam(this.teamRepository.findById(Long.parseLong("20")).get());
            wolverhamptonNewsOne.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            wolverhamptonNewsOne.setAddedOn(LocalDateTime.now());

            wolverhamptonNewsTwo.setTitle("Premier League hits and misses: When will Wolves' luck turn?");
            wolverhamptonNewsTwo.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-adama-traore-blog_5494707.jpg?20210829170118");
            wolverhamptonNewsTwo.setDescription("As Wolves fire blanks, Nuno Espirito Santo's pragmatic ways have Tottenham top of the Premier League following a third straight win while Burnley's own problems in front of goal could send them down" + "\n" +
                    "Three games into this nascent Premier League season, and Wolves sit in the bottom three without a goal and without a point under their new manager Bruno Lage.The home side threw everything at Manchester United, especially early on with Raul Jimenez and Trincao going close, but their defensively disjointed visitors clung on and snatched a controversial winner late in the day through Mason Greenwood.\n" +
                    "\n" +
                    "It has been a baptism of fire for Lage, who, having witnessed a third consecutive 1-0 defeat, must be wondering when his luck is about to turn.");
            wolverhamptonNewsTwo.setTeam(this.teamRepository.findById(Long.parseLong("20")).get());
            wolverhamptonNewsTwo.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            wolverhamptonNewsTwo.setAddedOn(LocalDateTime.now());

            wolverhamptonNewsThree.setTitle("Wolves 0-1 Man Utd: Did Paul Pogba foul Ruben Neves in build-up to Mason Greenwood's winner?");
            wolverhamptonNewsThree.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-ruben-neves-man-utd_5494942.jpg?20210829191022");
            wolverhamptonNewsThree.setDescription("Mason Greenwood made it three goals in three Premier League games this season as Manchester United beat Wolves on Super Sunday, but his winner was shrouded in controversy following a challenge by Paul Pogba on Ruben NevesGraeme Souness and Roy Keane believe Manchester United's winning goal at Wolves on Sunday should not have stood, claiming Paul Pogba's challenge on Ruben Neves in the build-up was a foul.\n" +
                    "\n" +
                    "Mason Greenwood continued his electric start to the season as his late strike snatched Manchester United a 1-0 victory at Wolves at Molineux.");
            wolverhamptonNewsThree.setTeam(this.teamRepository.findById(Long.parseLong("20")).get());
            wolverhamptonNewsThree.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            wolverhamptonNewsThree.setAddedOn(LocalDateTime.now());

            wolverhamptonNewsFour.setTitle("Hwang Hee-chan: Wolves sign forward from RB Leipzig on season-long loan with option to buy");
            wolverhamptonNewsFour.setImgUrl("https://e0.365dm.com/21/08/1600x900/skysports-hwang-hee-chan-wolves_5494695.jpg?20210829163856");
            wolverhamptonNewsFour.setDescription("Wolves have the option to buy Hwang Hee-chan for around £13m next summer; the 25-year-old South Korea international scored three goals in 29 appearances for Bundesliga side RB Leipzig after moving from sister club Red Bull Salzburg, where he found the net 45 times in 126 matchesWolves have signed Hwang Hee-chan from RB Leipzig on a season-long loan with an option to buy.\n" +
                    "\n" +
                    "The South Korea international forward flew into Birmingham Airport by private jet on Sunday morning to complete his medical.Wolves have the option to buy Hwang for around £13m next summer.\n" +
                    "\n" +
                    "The 25-year-old scored three goals in 29 appearances for Bundesliga side Leipzig after moving from sister club Red Bull Salzburg, where he found the net 45 times in 126 matches");
            wolverhamptonNewsFour.setTeam(this.teamRepository.findById(Long.parseLong("20")).get());
            wolverhamptonNewsFour.setUser(this.userRepository.findById(Long.parseLong("1")).get());
            wolverhamptonNewsFour.setAddedOn(LocalDateTime.now());



            this.newsRepository.save(arsenalNewsOne);
            this.newsRepository.save(arsenalNewsTwo);
            this.newsRepository.save(arsenalNewsThree);
            this.newsRepository.save(arsenalNewsFour);
            this.newsRepository.save(astonVillaNewsOne);
            this.newsRepository.save(astonVillaNewsTwo);
            this.newsRepository.save(astonVillaNewsThree);
            this.newsRepository.save(astonVillaNewsFour);
            this.newsRepository.save(brentfordNewsOne);
            this.newsRepository.save(brentfordNewsTwo);
            this.newsRepository.save(brentfordNewsThree);
            this.newsRepository.save(brentfordNewsFour);
            this.newsRepository.save(brightonNewsOne);
            this.newsRepository.save(brightonNewsTwo);
            this.newsRepository.save(brightonNewsThree);
            this.newsRepository.save(brightonNewsFour);
            this.newsRepository.save(burnleyNewsOne);
            this.newsRepository.save(burnleyNewsTwo);
            this.newsRepository.save(burnleyNewsThree);
            this.newsRepository.save(burnleyNewsFour);
            this.newsRepository.save(chelseaNewsOne);
            this.newsRepository.save(chelseaNewsTwo);
            this.newsRepository.save(chelseaNewsThree);
            this.newsRepository.save(chelseaNewsFour);
            this.newsRepository.save(crystalPalaceNewsOne);
            this.newsRepository.save(crystalPalaceNewsTwo);
            this.newsRepository.save(crystalPalaceNewsThree);
            this.newsRepository.save(crystalPalaceNewsFour);
            this.newsRepository.save(evertonNewsOne);
            this.newsRepository.save(evertonNewsTwo);
            this.newsRepository.save(evertonNewsThree);
            this.newsRepository.save(evertonNewsFour);
            this.newsRepository.save(leedsNewsOne);
            this.newsRepository.save(leedsNewsTwo);
            this.newsRepository.save(leedsNewsThree);
            this.newsRepository.save(leedsNewsFour);
            this.newsRepository.save(leicesterNewsOne);
            this.newsRepository.save(leicesterNewsTwo);
            this.newsRepository.save(leicesterNewsThree);
            this.newsRepository.save(leicesterNewsFour);
            this.newsRepository.save(liverpoolNewsOne);
            this.newsRepository.save(liverpoolNewsTwo);
            this.newsRepository.save(liverpoolNewsThree);
            this.newsRepository.save(liverpoolNewsFour);
            this.newsRepository.save(manCityNewsOne);
            this.newsRepository.save(manCityNewsTwo);
            this.newsRepository.save(manCityNewsThree);
            this.newsRepository.save(manCityNewsFour);
            this.newsRepository.save(manUnitedNewsOne);
            this.newsRepository.save(manUnitedNewsTwo);
            this.newsRepository.save(manUnitedNewsThree);
            this.newsRepository.save(manUnitedNewsFour);
            this.newsRepository.save(newcastleNewsOne);
            this.newsRepository.save(newcastleNewsTwo);
            this.newsRepository.save(newcastleNewsThree);
            this.newsRepository.save(newcastleNewsFour);
            this.newsRepository.save(norwichNewsOne);
            this.newsRepository.save(norwichNewsTwo);
            this.newsRepository.save(norwichNewsThree);
            this.newsRepository.save(norwichNewsFour);
            this.newsRepository.save(southamptonNewsOne);
            this.newsRepository.save(southamptonNewsTwo);
            this.newsRepository.save(southamptonNewsThree);
            this.newsRepository.save(southamptonNewsFour);
            this.newsRepository.save(tottenhamNewsOne);
            this.newsRepository.save(tottenhamNewsTwo);
            this.newsRepository.save(tottenhamNewsThree);
            this.newsRepository.save(tottenhamNewsFour);
            this.newsRepository.save(watfordNewsOne);
            this.newsRepository.save(watfordNewsTwo);
            this.newsRepository.save(watfordNewsThree);
            this.newsRepository.save(watfordNewsFour);
            this.newsRepository.save(westHamNewsOne);
            this.newsRepository.save(westHamNewsTwo);
            this.newsRepository.save(westHamNewsThree);
            this.newsRepository.save(westHamNewsFour);
            this.newsRepository.save(wolverhamptonNewsOne);
            this.newsRepository.save(wolverhamptonNewsTwo);
            this.newsRepository.save(wolverhamptonNewsThree);
            this.newsRepository.save(wolverhamptonNewsFour);
        }
    }
}
