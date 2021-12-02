package com.example.premierleague.web;

import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.repositories.*;
import com.example.premierleague.services.impl.UserDetailsServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@WithMockUser("yuliyan")
public class TeamsControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PictureRepository pictureRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private NewsRepository newsRepository;

    @Test
    void teamInformationTest() throws Exception {
        mockMvc.perform(get("/teams/information")).
                andExpect(status().isOk()).
                andExpect(view().name("team-information"));
    }

    @Test
    void otherTeamsTest() throws Exception {
        mockMvc.perform(get("/teams/other")).
                andExpect(status().isOk()).
                andExpect(view().name("teams-other"));
    }

    @Test
    void teamStatisticsTest() throws Exception {
        mockMvc.perform(get("/teams/statistics")).
                andExpect(status().isOk()).
                andExpect(view().name("team-statistics"));
    }

    @Test
    void otherTeamsNewsTest() throws Exception {
        mockMvc.perform(get("/teams/other/news/1")).
                andExpect(status().isOk()).
                andExpect(view().name("other-team-news"));
    }

    @AfterEach
    void tearDown() {
        commentRepository.deleteAll();
        newsRepository.deleteAll();
        userRepository.deleteAll();
    }


}
