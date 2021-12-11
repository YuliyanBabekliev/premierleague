package com.example.premierleague.web;

import com.example.premierleague.models.entities.User;
import com.example.premierleague.repositories.CommentRepository;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.repositories.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private NewsRepository newsRepository;

    @Test
    void testOpenRegisterForm() throws Exception{
        mockMvc
                .perform(get("/users/register"))
                .andExpect(status().isOk())
                .andExpect(view().name("register"));
    }

    private static final String TEST_USER_USERNAME = "yuliyan";
    private static final String TEST_USER_EMAIL = "yuliyan@abv.bg";
    private static final String TEST_USER_PASSWORD = "123456";
    private static final String TEST_USER_CONFIRM_PASSWORD = "123456";
    private static final String TEST_USER_GENDER = "MALE";

    @Test
    void TestRegisterUser() throws Exception{
        mockMvc.perform(post("/users/register")
                .param("username", TEST_USER_USERNAME)
                .param("email", TEST_USER_EMAIL)
                .param("password", TEST_USER_PASSWORD)
                .param("confirmPassword", TEST_USER_CONFIRM_PASSWORD)
                .param("gender", TEST_USER_GENDER)
                .param("favouriteTeam", teamRepository.findByName("Chelsea").getName())
                .with(csrf())
                .contentType(MediaType.APPLICATION_FORM_URLENCODED))
                .andExpect(status().is3xxRedirection());

        Assertions.assertEquals(2, userRepository.count());
    }

    @AfterEach
    void tearDown(){
        commentRepository.deleteAll();
        newsRepository.deleteAll();
        userRepository.deleteAll();
    }
}
