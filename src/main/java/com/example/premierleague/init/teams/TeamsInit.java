package com.example.premierleague.init.teams;

import com.example.premierleague.models.entities.Stadium;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.repositories.StadiumRepository;
import com.example.premierleague.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamsInit {
    private final TeamRepository teamRepository;
    private final StadiumRepository stadiumRepository;

    @Autowired
    public TeamsInit(TeamRepository teamRepository, StadiumRepository stadiumRepository) {
        this.teamRepository = teamRepository;
        this.stadiumRepository = stadiumRepository;
    }

    public void initTeams() {
        if(this.teamRepository.count() == 0){
            Team team1 = new Team();
            Team team2 = new Team();
            Team team3 = new Team();
            Team team4 = new Team();
            Team team5 = new Team();
            Team team6 = new Team();
            Team team7 = new Team();
            Team team8 = new Team();
            Team team9 = new Team();
            Team team10 = new Team();
            Team team11 = new Team();
            Team team12 = new Team();
            Team team13 = new Team();
            Team team14 = new Team();
            Team team15 = new Team();
            Team team16 = new Team();
            Team team17 = new Team();
            Team team18 = new Team();
            Team team19 = new Team();
            Team team20 = new Team();

            team1.setName("Arsenal");
            team1.setDescription("Arsenal Football Club is a professional football club based in Islington, London, England. Arsenal plays in the Premier League, the top flight of English football. The club has won 13 league titles (including one unbeaten title), a record 14 FA Cups, two League Cups, 16 FA Community Shields, the League Centenary Trophy, one European Cup Winners' Cup, and one Inter-Cities Fairs Cup.");
            team1.setLogoUrl("https://w7.pngwing.com/pngs/214/795/png-transparent-arsenal-f-c-emirates-stadium-football-kit-fa-cup-arsenal-f-c-emblem-label-sport.png");
            Stadium stadium1 = this.stadiumRepository.getById(Long.parseLong("1"));
            team1.setStadium(stadium1);
            team1.setPlayed(8);
            team1.setGoalDifference(-5);
            team1.setPoints(11);

            team2.setName("Aston_Villa");
            team2.setDescription("Aston Villa Football Club is an English professional football club based in Aston, Birmingham. The club competes in the Premier League, the top tier of the English football league system. Founded in 1874, they have played at their home ground, Villa Park, since 1897. Aston Villa were one of the founder members of the Football League in 1888 and of the Premier League in 1992.[5] Villa are one of only five English clubs to have won the European Cup, in 1981–82. They have also won the Football League First Division seven times, the FA Cup seven times, the League Cup five times, and the European (UEFA) Super Cup once.");
            team2.setLogoUrl("https://toppng.com/uploads/preview/aston-villa-logo-png-11536012608uoiti56oh4.png");
            Stadium stadium2 = this.stadiumRepository.getById(Long.parseLong("2"));
            team2.setStadium(stadium2);
            team2.setPlayed(8);
            team2.setGoalDifference(0);
            team2.setPoints(10);

            team3.setName("Brentford");
            team3.setDescription("Brentford Football Club is a professional football club based in Brentford, West London, England. They currently compete in the Premier League, the highest tier of English football, having gained promotion via the playoffs at the end of the 2020–21 Championship season. Nicknamed \"the Bees\", the club was founded in 1889 and played home matches at Griffin Park from 1904 before moving to Brentford Community Stadium in 2020. Their main rivals are fellow West London clubs Fulham and Queens Park Rangers.");
            team3.setLogoUrl("https://e7.pngegg.com/pngimages/946/1000/png-clipart-brentford-f-c-griffin-park-football-brentford-fc-community-sports-trust-brentford-vs-birmingham-football-emblem-label.png");
            Stadium stadium3 = this.stadiumRepository.getById(Long.parseLong("3"));
            team3.setStadium(stadium3);
            team3.setPlayed(8);
            team3.setGoalDifference(3);
            team3.setPoints(12);

            team4.setName("Brighton");
            team4.setDescription("Brighton (/ˈbraɪtən/) is a seaside resort and one of the two main areas of the city of Brighton and Hove. Located on the southern coast of England, in the county of East Sussex, it is 47 miles (76 km) south of London.[2]\n" +
                    "\n" +
                    "Archaeological evidence of settlement in the area dates back to the Bronze Age, Roman and Anglo-Saxon periods. The ancient settlement of \"Brighthelmstone\" was documented in the Domesday Book (1086). From about 1730 it developed as a health resort.");
            team4.setLogoUrl("https://img.favpng.com/16/20/16/logo-brighton-hove-albion-f-c-brand-organization-png-favpng-Tb3h0DbvAJ4vWy6ufrc2Cd17w.jpg");
            Stadium stadium4 = this.stadiumRepository.getById(Long.parseLong("4"));
            team4.setStadium(stadium4);
            team4.setPlayed(8);
            team4.setGoalDifference(3);
            team4.setPoints(15);

            team5.setName("Burnley");
            team5.setDescription("Burnley Football Club (/ˈbɜːrnli/) is an English association football club based in Burnley, Lancashire. Founded on 18 May 1882, it was one of the first to become professional (in 1883), and subsequently put pressure on the Football Association to permit payments to players. The club entered the FA Cup for the first time in 1885–86 and was one of the 12 founder members of the Football League in 1888–89. From the 1950s until the 1970s, under chairman Bob Lord, the club became renowned for its youth policy and scouting system, and was one of the first to set up a purpose-built training ground. The team currently compete in the Premier League, the top tier of English football.");
            team5.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/10/burnley-logo-1.png");
            Stadium stadium5 = this.stadiumRepository.getById(Long.parseLong("5"));
            team5.setStadium(stadium5);
            team5.setPlayed(8);
            team5.setGoalDifference(-8);
            team5.setPoints(3);

            team6.setName("Chelsea");
            team6.setDescription("Chelsea Football Club are an English professional football club based in Fulham, West London. Founded in 1905, the club competes in the Premier League, the top division of English football. Chelsea are among England's most successful clubs, having won over thirty competitive honours, including six league titles and eight European trophies. Their home ground is Stamford Bridge.");
            team6.setLogoUrl("https://toppng.com/uploads/preview/chelsea-fc-vector-logo-11574230515h7qxtmmgxz.png");
            Stadium stadium6 = this.stadiumRepository.getById(Long.parseLong("6"));
            team6.setStadium(stadium6);
            team6.setPlayed(8);
            team6.setGoalDifference(13);
            team6.setPoints(19);

            team7.setName("Crystal_Palace");
            team7.setDescription("Crystal Palace Football Club is a professional football club based in Selhurst in the Borough of Croydon, South London, England, who currently compete in the Premier League, the highest level of English football. Although formally created as a professional outfit in 1905, the club's origins can be traced as far back as 1861, when an amateur Crystal Palace football team was established at the Crystal Palace Exhibition building, which has led to claims by the club that Crystal Palace should be recognised as the oldest professional football club in the world.");
            team7.setLogoUrl("https://w7.pngwing.com/pngs/777/158/png-transparent-crystal-palace-f-c-selhurst-park-premier-league-english-football-league-crystal-palace-l-f-c-premier-league-text-logo-computer-wallpaper.png");
            Stadium stadium7 = this.stadiumRepository.getById(Long.parseLong("7"));
            team7.setStadium(stadium7);
            team7.setPlayed(8);
            team7.setGoalDifference(-3);
            team7.setPoints(8);

            team8.setName("Everton");
            team8.setDescription("Everton Football Club (/ˈɛvərtən/) is an English professional football club based in Liverpool that competes in the Premier League, the top tier of English football. The club is a founding member of the Football League and has competed in the top division for a record 118 seasons since the Football League's creation, having missed only four top-flight seasons (1930–31, 1951–52, 1952–53, 1953–54). Everton is the second-longest continuous serving club in English top flight football[2] and has won nine league titles, five FA Cups, one European Cup Winners' Cup and nine Charity Shields.");
            team8.setLogoUrl("https://e7.pngegg.com/pngimages/588/198/png-clipart-everton-f-c-premier-league-dream-league-soccer-liverpool-southampton-f-c-premier-league-blue-text.png");
            Stadium stadium8 = this.stadiumRepository.getById(Long.parseLong("8"));
            team8.setStadium(stadium8);
            team8.setPlayed(8);
            team8.setGoalDifference(4);
            team8.setPoints(14);

            team9.setName("Leeds");
            team9.setDescription("Leeds United Football Club is an English professional football club based in the city of Leeds, West Yorkshire. The club was formed in 1919 following the disbanding of Leeds City by the Football League and took over their Elland Road stadium. The club currently competes in the Premier League, the top flight of English football, following promotion from the EFL Championship during the 2019—20 season. Most of their history has been spent competing in the first tier of English football. Their longest continuous spell inside the first tier was a period of 18 years between 1964 and 1982, while their longest period outside of it spanned 16 years between 2004 and 2020.");
            team9.setLogoUrl("https://toppng.com/uploads/preview/leeds-united-football-logo-png-11536018007ce9oimdy6g.png");
            Stadium stadium9 = this.stadiumRepository.getById(Long.parseLong("9"));
            team9.setStadium(stadium9);
            team9.setPlayed(8);
            team9.setGoalDifference(-8);
            team9.setPoints(6);

            team10.setName("Leicester");
            team10.setDescription("Leicester City Football Club is a professional football club based in Leicester in the East Midlands, England. The club competes in the Premier League, the top division of England's football league system, and plays its home matches at the King Power Stadium.[2]\n" +
                    "\n" +
                    "The club was founded in 1884 as Leicester Fosse F.C.,[3] playing on a field near Fosse Road. They moved to Filbert Street in 1891, were elected to the Football League in 1894 and adopted the name Leicester City in 1919. They moved to the nearby Walkers Stadium in 2002,[4] which was renamed the King Power Stadium in 2011.[5]");
            team10.setLogoUrl("https://toppng.com/uploads/preview/leicester-city-fc-leicester-city-logo-11563173575frvl7u4rh8.png");
            Stadium stadium10 = this.stadiumRepository.getById(Long.parseLong("10"));
            team10.setStadium(stadium10);
            team10.setPlayed(8);
            team10.setGoalDifference(-1);
            team10.setPoints(11);

            team11.setName("Liverpool");
            team11.setDescription("Liverpool is a city and metropolitan borough in Merseyside, England. With a population of 498,042 in 2019, it is the tenth largest English district by population,[9][10] and its metropolitan area is the fifth largest in the United Kingdom with a population of 2.24 million.[11]");
            team11.setLogoUrl("https://w7.pngwing.com/pngs/217/457/png-transparent-liverpool-f-c-manchester-united-f-c-rivalry-premier-league-anfield-uefa-champions-league-premier-league-text-label-logo.png");
            Stadium stadium11 = this.stadiumRepository.getById(Long.parseLong("11"));
            team11.setStadium(stadium11);
            team11.setPlayed(8);
            team11.setGoalDifference(16);
            team11.setPoints(18);

            team12.setName("Manchester_City");
            team12.setDescription("Manchester City Football Club is an English football club based in Manchester that competes in the Premier League, the top flight of English football. Founded in 1880 as St. Mark's (West Gorton), it became Ardwick Association Football Club in 1887 and Manchester City in 1894. The club's home ground is the Etihad Stadium in east Manchester, to which it moved in 2003, having played at Maine Road since 1923. The club adopted their sky blue home shirts in 1894 in the first season of the club's current iteration, and have been used ever since.[4]");
            team12.setLogoUrl("https://w1.pngwing.com/pngs/203/356/png-transparent-premier-league-logo-manchester-manchester-city-fc-organization-line-area-circle-symbol.png");
            Stadium stadium12 = this.stadiumRepository.getById(Long.parseLong("12"));
            team12.setStadium(stadium12);
            team12.setPlayed(8);
            team12.setGoalDifference(13);
            team12.setPoints(17);

            team13.setName("Manchester_United");
            team13.setDescription("Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester, England, that competes in the Premier League, the top flight of English football. Nicknamed \"the Red Devils\", the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in 1902 and moved to its current stadium, Old Trafford, in 1910.");
            team13.setLogoUrl("https://w7.pngwing.com/pngs/480/26/png-transparent-manchester-united-f-c-old-trafford-glory-glory-association-football-manager-football-text-sport-logo.png");
            Stadium stadium13 = this.stadiumRepository.getById(Long.parseLong("13"));
            team13.setStadium(stadium13);
            team13.setPlayed(8);
            team13.setGoalDifference(6);
            team13.setPoints(14);

            team14.setName("Newcastle");
            team14.setDescription("Newcastle United Football Club is an English professional football club based in Newcastle upon Tyne, that plays in the Premier League - the top flight of English football. The club was founded in 1892 by the merger of Newcastle East End and Newcastle West End. The team plays its home matches at St. James' Park. Following the Taylor Report's requirement that all Premier League clubs have all-seater stadiums, the ground was modified in the mid-1990s and currently has a capacity of 52,305.");
            team14.setLogoUrl("https://cdn.freebiesupply.com/logos/large/2x/newcastle-united-logo-png-transparent.png");
            Stadium stadium14 = this.stadiumRepository.getById(Long.parseLong("14"));
            team14.setStadium(stadium14);
            team14.setPlayed(8);
            team14.setGoalDifference(-9);
            team14.setPoints(3);

            team15.setName("Norwich");
            team15.setDescription("Norwich City Football Club (also known as The Canaries or The Yellows) is an English professional football club based in Norwich, Norfolk. As of the 2021–22 season, the team competes in the Premier League, the top tier of English football, after winning the 2020–21 EFL Championship title. The club was founded in 1902. Since 1935, Norwich have played their home games at Carrow Road and have a long-standing and fierce rivalry with East Anglian rivals Ipswich Town, with whom they have contested the East Anglian derby 134 times since 1902. The fans' song \"On the Ball, City\" is the oldest football chant in the world, written in 1890 and still sung today.");
            team15.setLogoUrl("https://toppng.com/uploads/preview/norwich-city-logo-vector-free-11574163620mwvdjlbscr.png");
            Stadium stadium15 = this.stadiumRepository.getById(Long.parseLong("15"));
            team15.setStadium(stadium15);
            team15.setPlayed(8);
            team15.setGoalDifference(-14);
            team15.setPoints(2);

            team16.setName("Southampton");
            team16.setDescription("Southampton Football Club  (About this soundlisten)) is an English professional football club based in Southampton, Hampshire, which plays in the Premier League, the top tier of English football. One of the founding members of the Premier League, they have spent the majority of their history in the top flight since their first promotion to it in 1966; their longest continuous period was for 27 seasons between 1978 and 2005.");
            team16.setLogoUrl("https://banner2.cleanpng.com/20180528/orj/kisspng-southampton-f-c-chelsea-f-c-201415-premier-le-5b0b83ae288bc3.6186483315274812621661.jpg");
            Stadium stadium16 = this.stadiumRepository.getById(Long.parseLong("16"));
            team16.setStadium(stadium16);
            team16.setPlayed(8);
            team16.setGoalDifference(-4);
            team16.setPoints(7);

            team17.setName("Tottenham");
            team17.setDescription("Tottenham Hotspur Football Club, commonly referred to as Tottenham (/ˈtɒtənəm/)[2][3] or Spurs, is an English professional football club based in Tottenham, London, that competes in the Premier League, the top flight of English football. The team has played its home matches in the 62,850-capacity Tottenham Hotspur Stadium since April 2019, replacing their former home of White Hart Lane, which had been demolished to make way for the new stadium on the same site.");
            team17.setLogoUrl("https://e7.pngegg.com/pngimages/290/45/png-clipart-tottenham-hotspur-f-c-premier-league-football-player-northumberland-development-project-premier-league-logo-football-team.png");
            Stadium stadium17 = this.stadiumRepository.getById(Long.parseLong("17"));
            team17.setStadium(stadium17);
            team17.setPlayed(8);
            team17.setGoalDifference(-3);
            team17.setPoints(15);

            team18.setName("Watford");
            team18.setDescription("Watford Football Club is an English professional football club based in Watford, Hertfordshire. They play in the Premier League, the top tier of English football, having been promoted in 2021.\n" +
                    "\n" +
                    "The club recognises its foundation as 1881, aligned with that of its antecedent, Watford Rovers, and was established as Watford Football Club in 1898. After finishing the 1914–15 season as Southern League champions under the management of Harry Kent, Watford joined the Football League in 1920. The team played at several grounds in their early history, including what is now West Herts Sports Club,[3] before moving to Vicarage Road in 1922. They have a long-standing rivalry with nearby club Luton Town.");
            team18.setLogoUrl("https://banner2.cleanpng.com/20180821/frc/kisspng-watford-f-c-premier-league-football-fa-cup-watford-f-c-5b7c3307e65061.5978793615348661839434.jpg");
            Stadium stadium18 = this.stadiumRepository.getById(Long.parseLong("18"));
            team18.setStadium(stadium18);
            team18.setPlayed(8);
            team18.setGoalDifference(-8);
            team18.setPoints(7);

            team19.setName("West_Ham");
            team19.setDescription("West Ham United Football Club is an English professional football club based in Stratford, East London that compete in the Premier League, the top tier of English football. The club plays at the London Stadium, having moved from their former home, the Boleyn Ground, in 2016.");
            team19.setLogoUrl("https://e1.pngegg.com/pngimages/34/1018/png-clipart-team-logos-west-ham-united-logo-illustration.png");
            Stadium stadium19 = this.stadiumRepository.getById(Long.parseLong("19"));
            team19.setStadium(stadium19);
            team19.setPlayed(8);
            team19.setGoalDifference(5);
            team19.setPoints(14);

            team20.setName("Wolverhampton");
            team20.setDescription("Wolverhampton Wanderers Football Club (/ˌwʊlvərˈhæmptən/ (About this soundlisten)), commonly known as Wolves, is a professional association football club based in the city of Wolverhampton in the West Midlands, England. Formed as St. Luke's F.C. in 1877, the club has played at Molineux Stadium since 1889 and has been competing in the Premier League, the top division of English football, since winning promotion in 2018. The 2021–22 season is the club's sixty-seventh season in total at the highest level and the eighth since the foundation of the Premier League in 1992.");
            team20.setLogoUrl("data:image/png;base64,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");
            Stadium stadium20 = this.stadiumRepository.getById(Long.parseLong("20"));
            team20.setStadium(stadium20);
            team20.setPlayed(8);
            team20.setGoalDifference(0);
            team20.setPoints(12);

            this.teamRepository.save(team1);
            this.teamRepository.save(team2);
            this.teamRepository.save(team3);
            this.teamRepository.save(team4);
            this.teamRepository.save(team5);
            this.teamRepository.save(team6);
            this.teamRepository.save(team7);
            this.teamRepository.save(team8);
            this.teamRepository.save(team9);
            this.teamRepository.save(team10);
            this.teamRepository.save(team11);
            this.teamRepository.save(team12);
            this.teamRepository.save(team13);
            this.teamRepository.save(team14);
            this.teamRepository.save(team15);
            this.teamRepository.save(team16);
            this.teamRepository.save(team17);
            this.teamRepository.save(team18);
            this.teamRepository.save(team19);
            this.teamRepository.save(team20);
        }
    }
}
