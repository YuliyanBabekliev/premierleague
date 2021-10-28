package com.example.premierleague.init.stadiums;

import com.example.premierleague.models.entities.Stadium;
import com.example.premierleague.repositories.StadiumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StadiumsInit {
    private final StadiumRepository stadiumRepository;

    @Autowired
    public StadiumsInit(StadiumRepository stadiumRepository) {
        this.stadiumRepository = stadiumRepository;
    }

    public void initStadiums() {
        if(this.stadiumRepository.count() == 0){
            Stadium stadium1 = new Stadium();
            Stadium stadium2 = new Stadium();
            Stadium stadium3 = new Stadium();
            Stadium stadium4 = new Stadium();
            Stadium stadium5 = new Stadium();
            Stadium stadium6 = new Stadium();
            Stadium stadium7 = new Stadium();
            Stadium stadium8 = new Stadium();
            Stadium stadium9 = new Stadium();
            Stadium stadium10 = new Stadium();
            Stadium stadium11 = new Stadium();
            Stadium stadium12 = new Stadium();
            Stadium stadium13 = new Stadium();
            Stadium stadium14 = new Stadium();
            Stadium stadium15 = new Stadium();
            Stadium stadium16 = new Stadium();
            Stadium stadium17 = new Stadium();
            Stadium stadium18 = new Stadium();
            Stadium stadium19 = new Stadium();
            Stadium stadium20 = new Stadium();

            stadium1.setName("Emirates Stadium");
            stadium1.setImgUrl("https://populous.com/wp-content/uploads/2018/01/POP_0W_WDB1_72_5321_Emirates_InteriorVacant_Day3_Hufton_Crow.jpg");


            stadium2.setName("Villa Park");
            stadium2.setImgUrl("https://i.guim.co.uk/img/media/4b89d8784cbd2bc089c1229cf5285ba276c177b2/0_339_5095_3057/master/5095.jpg?width=445&quality=45&auto=format&fit=max&dpr=2&s=e4a2f64db8b09ba3f167099d37a04173");

            stadium3.setName("Brentford Community Stadium");
            stadium3.setImgUrl("https://www.fifaultimateteam.it/en/wp-content/uploads/2021/05/brentford-community-stadium-fifa-22.jpg");

            stadium4.setName("Falmer Stadium");
            stadium4.setImgUrl("https://eu-assets.simpleview-europe.com/lewes/imageresizer/?image=%2Fdmsimgs%2Famexsyadiumdms_1856131479.jpg&action=ProductDetailEssentials");

            stadium5.setName("Turf Moor");
            stadium5.setImgUrl("https://icdn.justarsenal.com/wp-content/uploads/2020/02/turf-moor.jpg");

            stadium6.setName("Stamford Bridge");
            stadium6.setImgUrl("https://footballwhispers.com/wp-content/uploads/2020/12/Stamford-Bridge-560x280.jpg");

            stadium7.setName("Selhurst Park");
            stadium7.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/f/fd/Selhurst_Park_Holmesdale_Stand.jpg");

            stadium8.setName("Goodison Park");
            stadium8.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/Goodisonview1.JPG/1200px-Goodisonview1.JPG");

            stadium9.setName("Elland Road");
            stadium9.setImgUrl("https://leedsunitedbulgaria.bg/wp-content/uploads/2019/08/Leeds-Utd1.jpg");

            stadium10.setName("King Power Stadium");
            stadium10.setImgUrl("https://www.leicestercity.net/wp-content/uploads/2020/11/king-power.jpg");

            stadium11.setName("Anfield");
            stadium11.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/02/Panorama_of_Anfield_with_new_main_stand_%2829676137824%29.jpg/1200px-Panorama_of_Anfield_with_new_main_stand_%2829676137824%29.jpg");

            stadium12.setName("Etihad Stadium");
            stadium12.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Etihad_Stadium%2C_Manchester_City_Football_Club_%28Ank_Kumar%2C_Infosys%29_16.jpg/2560px-Etihad_Stadium%2C_Manchester_City_Football_Club_%28Ank_Kumar%2C_Infosys%29_16.jpg");

            stadium13.setName("Old Trafford");
            stadium13.setImgUrl("https://images.ctfassets.net/mivicpf5zews/3HvVSAnvVSg6sisG2kG6m4/bb6ba99e22f7b4f3d08b4014513284c1/Manchester-United-Old-Trafford_Hero_1200x600px.jpg?q=70&w=1024");

            stadium14.setName("St James' Park");
            stadium14.setImgUrl("https://media-cdn.tripadvisor.com/media/photo-s/06/c4/6a/83/st-james-park.jpg");

            stadium15.setName("Carrow Road");
            stadium15.setImgUrl("https://tmssl.akamaized.net/images/foto/stadionnormal/carrow-road-norwich-city-1575457126-27991.jpg?lm=1575457148");

            stadium16.setName("St Mary's Stadium");
            stadium16.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/5/52/St_Mary%27s_Stadium_%282%29.jpg");

            stadium17.setName("Tottenham Hotspur Stadium");
            stadium17.setImgUrl("https://i.guim.co.uk/img/media/0c43389417f433da9cde5604c38fc4e6f8940de2/0_0_4500_3000/master/4500.jpg?width=465&quality=45&auto=format&fit=max&dpr=2&s=0570ad2926dae5cc1c631a58e6b83405");

            stadium18.setName("Vicarage Road");
            stadium18.setImgUrl("https://upload.wikimedia.org/wikipedia/commons/1/16/Vicarage_Road_2015.jpg");

            stadium19.setName("London Stadium");
            stadium19.setImgUrl("http://www.whufc.com/sites/default/files/2019-04/Pitch1220.jpg");

            stadium20.setName("Molineux Stadium");
            stadium20.setImgUrl("https://res.cloudinary.com/dwh6m5mbn/image/upload/v1590746741/molineux_pzph76.jpg");

            this.stadiumRepository.save(stadium1);
            this.stadiumRepository.save(stadium2);
            this.stadiumRepository.save(stadium3);
            this.stadiumRepository.save(stadium4);
            this.stadiumRepository.save(stadium5);
            this.stadiumRepository.save(stadium6);
            this.stadiumRepository.save(stadium7);
            this.stadiumRepository.save(stadium8);
            this.stadiumRepository.save(stadium9);
            this.stadiumRepository.save(stadium10);
            this.stadiumRepository.save(stadium11);
            this.stadiumRepository.save(stadium12);
            this.stadiumRepository.save(stadium13);
            this.stadiumRepository.save(stadium14);
            this.stadiumRepository.save(stadium15);
            this.stadiumRepository.save(stadium16);
            this.stadiumRepository.save(stadium17);
            this.stadiumRepository.save(stadium18);
            this.stadiumRepository.save(stadium19);
            this.stadiumRepository.save(stadium20);
        }
    }
}
