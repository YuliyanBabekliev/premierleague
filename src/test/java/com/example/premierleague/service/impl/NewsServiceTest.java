package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.repositories.CommentRepository;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.services.CommentService;
import com.example.premierleague.services.impl.NewsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NewsServiceTest {
    private NewsServiceImpl serviceToTest;

    private News newsToTest;

    private Team team;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private NewsRepository newsRepository;

    @Mock
    private CommentRepository commentRepository;
    @BeforeEach
    public void setUp(){
        this.serviceToTest = new NewsServiceImpl(this.newsRepository, this.modelMapper, commentRepository);

        this.team = new Team();
        team.setName("Sheffield");

        this.newsToTest = new News();
        this.newsToTest.setId(Long.parseLong("1"));
        this.newsToTest.setTitle("test");
        this.newsToTest.setDescription("testtestest");
        this.newsToTest.setImgUrl("aaaaaaaaaa");
        this.newsToTest.setAddedOn(LocalDateTime.now());
        this.newsToTest.setTeam(team);
    }

    @Test
    public void deleteNewsConfirmTest(){
        int id = 1;
        this.serviceToTest.deleteNewsConfirm((long) id);
        Mockito.verify(this.newsRepository, times(1)).deleteById((long) id);
    }

//    @Test
//    public void findNewsByIdTest(){
//        when(this.newsRepository.getById(newsToTest.getId())).thenReturn(newsToTest);
//
//        News actual = this.serviceToTest.findNewsById(newsToTest.getId());
//
//        Assertions.assertEquals(newsToTest.getTitle(), actual.getTitle());
//        Assertions.assertEquals(newsToTest.getDescription(), actual.getDescription());
//    }

//    @Test
//    public void testNewsCount(){
//        when(this.newsRepository.save(newsToTest))
//                .thenReturn(newsToTest);
//
//        Long count = this.serviceToTest.newsCount();
//        Long actual = Long.parseLong("1");
//
//        Assertions.assertEquals(count, actual);
//    }
}
