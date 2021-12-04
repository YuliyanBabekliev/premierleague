package com.example.premierleague.web;

import com.example.premierleague.models.binding.CommentAddBindingModel;
import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.repositories.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.hamcrest.text.MatchesPattern;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.time.LocalDateTime;
import java.util.Set;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@WithMockUser("yuliyan")
//@SpringBootTest
//@AutoConfigureMockMvc
//public class CommentRestControllerTest {
//    private static final String COMMENT_1 = "comment1......";
//    private static final String COMMENT_2 = "comment2......";
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private NewsRepository newsRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private TeamRepository teamRepository;
//
//    @Autowired
//    private CommentRepository commentRepository;
//
//    @Autowired
//    private PictureRepository pictureRepository;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    private User testUser;
//
//    @BeforeEach
//    void setUp() {
//        testUser = new User();
//        testUser.setPassword("123456");
//        testUser.setUsername("yuliyan");
//        testUser.setEmail("yuliyan@abv.bg");
//        testUser.setGender("Male");
//        testUser.setFavouriteTeam(teamRepository.findByName("Chelsea"));
//        Picture picture = new Picture();
//        picture.setUrl("asdasdasdasdasd");
//        picture.setTitle("adsasddas");
//        pictureRepository.save(picture);
//        testUser.setPicture(picture);
//
//        testUser = userRepository.save(testUser);
//    }
//
//    @Test
//    void testGetComments() throws Exception {
//        var route = initComments(initNews());
//
//        mockMvc.perform(get("/api/v1/" + route.getId() + "/comments")).
//                andExpect(status().isOk());
////                andExpect(jsonPath("$", hasSize(2))).
////                andExpect(jsonPath("$.[0].message", is(COMMENT_1))).
////                andExpect(jsonPath("$.[1].message", is(COMMENT_2)));
//    }
//
////    @Test
////    void testCreateComments() throws Exception {
////        CommentAddBindingModel testComment = new CommentAddBindingModel();
////
////        testComment.setCommentText(COMMENT_1);
////
////        var emptyNews = initNews();
////
////        mockMvc.perform(
////                        post("/api/v1/" + emptyNews.getId() + "/comments")
////                                .contentType(MediaType.APPLICATION_JSON)
////                                .content(objectMapper.writeValueAsString(testComment))
////                                .accept(MediaType.APPLICATION_JSON)
////                                .with(csrf())
////                )
////                .andExpect(status().isCreated())
//////                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
////                .andExpect(header().string("Location", MatchesPattern.matchesPattern("/api/v1/" + emptyNews.getId() + "/comments/\\d")));
//////                .andExpect(jsonPath("$[1].message").value(is(COMMENT_1)));
////
////    }
//
//    private News initNews() {
//        News testNews = new News();
//        testNews.setTitle("test");
//        testNews.setDescription("testtesttest");
//
//        return newsRepository.save(testNews);
//    }
//
//    private News initComments(News news) {
//
//        Comment comment1 = new Comment();
//        comment1.setDate(LocalDateTime.now());
//        comment1.setUser(testUser);
//        comment1.setCommentText(COMMENT_1);
//        comment1.setNews(news);
//
//        Comment comment2 = new Comment();
//        comment1.setDate(LocalDateTime.now());
//        comment1.setUser(testUser);
//        comment2.setCommentText(COMMENT_2);
//        comment2.setNews(news);
//
//        news.setComments(Set.of(comment1, comment2));
//
//        return newsRepository.save(news);
//    }
//
//    @AfterEach
//    void tearDown() {
//        commentRepository.deleteAll();
//        newsRepository.deleteAll();
//        userRepository.deleteAll();
//    }
//}
