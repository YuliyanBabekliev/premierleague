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
            team1.setLogoUrl("https://logodownload.org/wp-content/uploads/2017/02/Arsenal-logo-escudo-shield-1.png");
            Stadium stadium1 = this.stadiumRepository.getById(Long.parseLong("1"));
            team1.setStadium(stadium1);
            team1.setPlayed(8);
            team1.setGoalDifference(-5);
            team1.setPoints(11);
            team1.setPosition(1);

            team2.setName("Aston_Villa");
            team2.setDescription("Aston Villa Football Club is an English professional football club based in Aston, Birmingham. The club competes in the Premier League, the top tier of the English football league system. Founded in 1874, they have played at their home ground, Villa Park, since 1897. Aston Villa were one of the founder members of the Football League in 1888 and of the Premier League in 1992.[5] Villa are one of only five English clubs to have won the European Cup, in 1981–82. They have also won the Football League First Division seven times, the FA Cup seven times, the League Cup five times, and the European (UEFA) Super Cup once.");
            team2.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/10/aston-villa-logo-1.png");
            Stadium stadium2 = this.stadiumRepository.getById(Long.parseLong("2"));
            team2.setStadium(stadium2);
            team2.setPlayed(8);
            team2.setGoalDifference(0);
            team2.setPoints(10);
            team2.setPosition(1);

            team3.setName("Brentford");
            team3.setDescription("Brentford Football Club is a professional football club based in Brentford, West London, England. They currently compete in the Premier League, the highest tier of English football, having gained promotion via the playoffs at the end of the 2020–21 Championship season. Nicknamed \"the Bees\", the club was founded in 1889 and played home matches at Griffin Park from 1904 before moving to Brentford Community Stadium in 2020. Their main rivals are fellow West London clubs Fulham and Queens Park Rangers.");
            team3.setLogoUrl("https://cdn.freelogovectors.net/wp-content/uploads/2021/03/brentford-fc-logo-freelogovectors.net_.png");
            Stadium stadium3 = this.stadiumRepository.getById(Long.parseLong("3"));
            team3.setStadium(stadium3);
            team3.setPlayed(8);
            team3.setGoalDifference(3);
            team3.setPoints(12);
            team3.setPosition(1);

            team4.setName("Brighton");
            team4.setDescription("Brighton (/ˈbraɪtən/) is a seaside resort and one of the two main areas of the city of Brighton and Hove. Located on the southern coast of England, in the county of East Sussex, it is 47 miles (76 km) south of London.[2]\n" +
                    "\n" +
                    "Archaeological evidence of settlement in the area dates back to the Bronze Age, Roman and Anglo-Saxon periods. The ancient settlement of \"Brighthelmstone\" was documented in the Domesday Book (1086). From about 1730 it developed as a health resort.");
            team4.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/10/brighton-hove-albion-logo-1.png");
            Stadium stadium4 = this.stadiumRepository.getById(Long.parseLong("4"));
            team4.setStadium(stadium4);
            team4.setPlayed(8);
            team4.setGoalDifference(3);
            team4.setPoints(15);
            team4.setPosition(1);

            team5.setName("Burnley");
            team5.setDescription("Burnley Football Club (/ˈbɜːrnli/) is an English association football club based in Burnley, Lancashire. Founded on 18 May 1882, it was one of the first to become professional (in 1883), and subsequently put pressure on the Football Association to permit payments to players. The club entered the FA Cup for the first time in 1885–86 and was one of the 12 founder members of the Football League in 1888–89. From the 1950s until the 1970s, under chairman Bob Lord, the club became renowned for its youth policy and scouting system, and was one of the first to set up a purpose-built training ground. The team currently compete in the Premier League, the top tier of English football.");
            team5.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/10/burnley-logo-1.png");
            Stadium stadium5 = this.stadiumRepository.getById(Long.parseLong("5"));
            team5.setStadium(stadium5);
            team5.setPlayed(8);
            team5.setGoalDifference(-8);
            team5.setPoints(3);
            team5.setPosition(1);

            team6.setName("Chelsea");
            team6.setDescription("Chelsea Football Club are an English professional football club based in Fulham, West London. Founded in 1905, the club competes in the Premier League, the top division of English football. Chelsea are among England's most successful clubs, having won over thirty competitive honours, including six league titles and eight European trophies. Their home ground is Stamford Bridge.");
            team6.setLogoUrl("https://logodownload.org/wp-content/uploads/2017/02/chelsea-fc-logo-escudo.png");
            Stadium stadium6 = this.stadiumRepository.getById(Long.parseLong("6"));
            team6.setStadium(stadium6);
            team6.setPlayed(8);
            team6.setGoalDifference(13);
            team6.setPoints(19);
            team6.setPosition(1);

            team7.setName("Crystal_Palace");
            team7.setDescription("Crystal Palace Football Club is a professional football club based in Selhurst in the Borough of Croydon, South London, England, who currently compete in the Premier League, the highest level of English football. Although formally created as a professional outfit in 1905, the club's origins can be traced as far back as 1861, when an amateur Crystal Palace football team was established at the Crystal Palace Exhibition building, which has led to claims by the club that Crystal Palace should be recognised as the oldest professional football club in the world.");
            team7.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/05/crystal-palace-logo-1.png");
            Stadium stadium7 = this.stadiumRepository.getById(Long.parseLong("7"));
            team7.setStadium(stadium7);
            team7.setPlayed(8);
            team7.setGoalDifference(-3);
            team7.setPoints(8);
            team7.setPosition(1);

            team8.setName("Everton");
            team8.setDescription("Everton Football Club (/ˈɛvərtən/) is an English professional football club based in Liverpool that competes in the Premier League, the top tier of English football. The club is a founding member of the Football League and has competed in the top division for a record 118 seasons since the Football League's creation, having missed only four top-flight seasons (1930–31, 1951–52, 1952–53, 1953–54). Everton is the second-longest continuous serving club in English top flight football[2] and has won nine league titles, five FA Cups, one European Cup Winners' Cup and nine Charity Shields.");
            team8.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/04/everton-logo-escudo.png");
            Stadium stadium8 = this.stadiumRepository.getById(Long.parseLong("8"));
            team8.setStadium(stadium8);
            team8.setPlayed(8);
            team8.setGoalDifference(4);
            team8.setPoints(14);
            team8.setPosition(1);

            team9.setName("Leeds");
            team9.setDescription("Leeds United Football Club is an English professional football club based in the city of Leeds, West Yorkshire. The club was formed in 1919 following the disbanding of Leeds City by the Football League and took over their Elland Road stadium. The club currently competes in the Premier League, the top flight of English football, following promotion from the EFL Championship during the 2019—20 season. Most of their history has been spent competing in the first tier of English football. Their longest continuous spell inside the first tier was a period of 18 years between 1964 and 1982, while their longest period outside of it spanned 16 years between 2004 and 2020.");
            team9.setLogoUrl("https://cdn.freebiesupply.com/logos/large/2x/leeds-united-afc-3-logo-png-transparent.png");
            Stadium stadium9 = this.stadiumRepository.getById(Long.parseLong("9"));
            team9.setStadium(stadium9);
            team9.setPlayed(8);
            team9.setGoalDifference(-8);
            team9.setPoints(6);
            team9.setPosition(1);

            team10.setName("Leicester");
            team10.setDescription("Leicester City Football Club is a professional football club based in Leicester in the East Midlands, England. The club competes in the Premier League, the top division of England's football league system, and plays its home matches at the King Power Stadium.[2]\n" +
                    "\n" +
                    "The club was founded in 1884 as Leicester Fosse F.C.,[3] playing on a field near Fosse Road. They moved to Filbert Street in 1891, were elected to the Football League in 1894 and adopted the name Leicester City in 1919. They moved to the nearby Walkers Stadium in 2002,[4] which was renamed the King Power Stadium in 2011.[5]");
            team10.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/05/leicester-city-logo.png");
            Stadium stadium10 = this.stadiumRepository.getById(Long.parseLong("10"));
            team10.setStadium(stadium10);
            team10.setPlayed(8);
            team10.setGoalDifference(-1);
            team10.setPoints(11);
            team10.setPosition(1);

            team11.setName("Liverpool");
            team11.setDescription("Liverpool is a city and metropolitan borough in Merseyside, England. With a population of 498,042 in 2019, it is the tenth largest English district by population,[9][10] and its metropolitan area is the fifth largest in the United Kingdom with a population of 2.24 million.[11]");
            team11.setLogoUrl("https://logoeps.com/wp-content/uploads/2011/08/liverpool-logo-vector.png");
            Stadium stadium11 = this.stadiumRepository.getById(Long.parseLong("11"));
            team11.setStadium(stadium11);
            team11.setPlayed(8);
            team11.setGoalDifference(16);
            team11.setPoints(18);
            team11.setPosition(1);

            team12.setName("Manchester_City");
            team12.setDescription("Manchester City Football Club is an English football club based in Manchester that competes in the Premier League, the top flight of English football. Founded in 1880 as St. Mark's (West Gorton), it became Ardwick Association Football Club in 1887 and Manchester City in 1894. The club's home ground is the Etihad Stadium in east Manchester, to which it moved in 2003, having played at Maine Road since 1923. The club adopted their sky blue home shirts in 1894 in the first season of the club's current iteration, and have been used ever since.[4]");
            team12.setLogoUrl("https://logodownload.org/wp-content/uploads/2017/02/manchester-city-fc-logo-escudo-badge.png");
            Stadium stadium12 = this.stadiumRepository.getById(Long.parseLong("12"));
            team12.setStadium(stadium12);
            team12.setPlayed(8);
            team12.setGoalDifference(13);
            team12.setPoints(17);
            team12.setPosition(1);

            team13.setName("Manchester_United");
            team13.setDescription("Manchester United Football Club is a professional football club based in Old Trafford, Greater Manchester, England, that competes in the Premier League, the top flight of English football. Nicknamed \"the Red Devils\", the club was founded as Newton Heath LYR Football Club in 1878, changed its name to Manchester United in 1902 and moved to its current stadium, Old Trafford, in 1910.");
            team13.setLogoUrl("https://cdn.freebiesupply.com/images/large/2x/manchester-united-logo-png-transparent.png");
            Stadium stadium13 = this.stadiumRepository.getById(Long.parseLong("13"));
            team13.setStadium(stadium13);
            team13.setPlayed(8);
            team13.setGoalDifference(6);
            team13.setPoints(14);
            team13.setPosition(1);

            team14.setName("Newcastle");
            team14.setDescription("Newcastle United Football Club is an English professional football club based in Newcastle upon Tyne, that plays in the Premier League - the top flight of English football. The club was founded in 1892 by the merger of Newcastle East End and Newcastle West End. The team plays its home matches at St. James' Park. Following the Taylor Report's requirement that all Premier League clubs have all-seater stadiums, the ground was modified in the mid-1990s and currently has a capacity of 52,305.");
            team14.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/10/newcastle-united-logo-1.png");
            Stadium stadium14 = this.stadiumRepository.getById(Long.parseLong("14"));
            team14.setStadium(stadium14);
            team14.setPlayed(8);
            team14.setGoalDifference(-9);
            team14.setPoints(3);
            team14.setPosition(1);

            team15.setName("Norwich");
            team15.setDescription("Norwich City Football Club (also known as The Canaries or The Yellows) is an English professional football club based in Norwich, Norfolk. As of the 2021–22 season, the team competes in the Premier League, the top tier of English football, after winning the 2020–21 EFL Championship title. The club was founded in 1902. Since 1935, Norwich have played their home games at Carrow Road and have a long-standing and fierce rivalry with East Anglian rivals Ipswich Town, with whom they have contested the East Anglian derby 134 times since 1902. The fans' song \"On the Ball, City\" is the oldest football chant in the world, written in 1890 and still sung today.");
            team15.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/10/norwich-fc-logo-1.png");
            Stadium stadium15 = this.stadiumRepository.getById(Long.parseLong("15"));
            team15.setStadium(stadium15);
            team15.setPlayed(8);
            team15.setGoalDifference(-14);
            team15.setPoints(2);
            team15.setPosition(1);

            team16.setName("Southampton");
            team16.setDescription("Southampton Football Club  (About this soundlisten)) is an English professional football club based in Southampton, Hampshire, which plays in the Premier League, the top tier of English football. One of the founding members of the Premier League, they have spent the majority of their history in the top flight since their first promotion to it in 1966; their longest continuous period was for 27 seasons between 1978 and 2005.");
            team16.setLogoUrl("https://cdn.freebiesupply.com/logos/large/2x/southampton-fc-logo-png-transparent.png");
            Stadium stadium16 = this.stadiumRepository.getById(Long.parseLong("16"));
            team16.setStadium(stadium16);
            team16.setPlayed(8);
            team16.setGoalDifference(-4);
            team16.setPoints(7);
            team16.setPosition(1);

            team17.setName("Tottenham");
            team17.setDescription("Tottenham Hotspur Football Club, commonly referred to as Tottenham (/ˈtɒtənəm/)[2][3] or Spurs, is an English professional football club based in Tottenham, London, that competes in the Premier League, the top flight of English football. The team has played its home matches in the 62,850-capacity Tottenham Hotspur Stadium since April 2019, replacing their former home of White Hart Lane, which had been demolished to make way for the new stadium on the same site.");
            team17.setLogoUrl("https://brandlogos.net/wp-content/uploads/2020/11/tottenham-hotspur-logo.png");
            Stadium stadium17 = this.stadiumRepository.getById(Long.parseLong("17"));
            team17.setStadium(stadium17);
            team17.setPlayed(8);
            team17.setGoalDifference(-3);
            team17.setPoints(15);
            team17.setPosition(1);

            team18.setName("Watford");
            team18.setDescription("Watford Football Club is an English professional football club based in Watford, Hertfordshire. They play in the Premier League, the top tier of English football, having been promoted in 2021.\n" +
                    "\n" +
                    "The club recognises its foundation as 1881, aligned with that of its antecedent, Watford Rovers, and was established as Watford Football Club in 1898. After finishing the 1914–15 season as Southern League champions under the management of Harry Kent, Watford joined the Football League in 1920. The team played at several grounds in their early history, including what is now West Herts Sports Club,[3] before moving to Vicarage Road in 1922. They have a long-standing rivalry with nearby club Luton Town.");
            team18.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/05/watford-logo.png");
            Stadium stadium18 = this.stadiumRepository.getById(Long.parseLong("18"));
            team18.setStadium(stadium18);
            team18.setPlayed(8);
            team18.setGoalDifference(-8);
            team18.setPoints(7);
            team18.setPosition(1);

            team19.setName("West_Ham");
            team19.setDescription("West Ham United Football Club is an English professional football club based in Stratford, East London that compete in the Premier League, the top tier of English football. The club plays at the London Stadium, having moved from their former home, the Boleyn Ground, in 2016.");
            team19.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/05/west-ham-united-logo.png");
            Stadium stadium19 = this.stadiumRepository.getById(Long.parseLong("19"));
            team19.setStadium(stadium19);
            team19.setPlayed(8);
            team19.setGoalDifference(5);
            team19.setPoints(14);
            team19.setPosition(1);

            team20.setName("Wolverhampton");
            team20.setDescription("Wolverhampton Wanderers Football Club (/ˌwʊlvərˈhæmptən/ (About this soundlisten)), commonly known as Wolves, is a professional association football club based in the city of Wolverhampton in the West Midlands, England. Formed as St. Luke's F.C. in 1877, the club has played at Molineux Stadium since 1889 and has been competing in the Premier League, the top division of English football, since winning promotion in 2018. The 2021–22 season is the club's sixty-seventh season in total at the highest level and the eighth since the foundation of the Premier League in 1992.");
            team20.setLogoUrl("https://logodownload.org/wp-content/uploads/2019/04/wolverhampton-logo-escudo.png");
            Stadium stadium20 = this.stadiumRepository.getById(Long.parseLong("20"));
            team20.setStadium(stadium20);
            team20.setPlayed(8);
            team20.setGoalDifference(0);
            team20.setPoints(12);
            team20.setPosition(1);

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
