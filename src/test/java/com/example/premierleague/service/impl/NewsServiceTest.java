package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.NewsServiceModel;
import com.example.premierleague.models.service.StatisticsServiceModel;
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
import java.util.Optional;
import java.util.Set;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class NewsServiceTest {
    private NewsServiceImpl serviceToTest;

    private News newsToTest;
    private News news2;

    private Team team;

    private User user;

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

        this.user = new User();
        user.setUsername("yuliyan");
        user.setEmail("yuliyan@abv.bg");
        user.setFavouriteTeam(this.team);

        this.newsToTest = new News();
        this.newsToTest.setId(Long.parseLong("1"));
        this.newsToTest.setTitle("test");
        this.newsToTest.setDescription("testtestest");
        this.newsToTest.setImgUrl("aaaaaaaaaa");
        this.newsToTest.setAddedOn(LocalDateTime.now());
        this.newsToTest.setTeam(team);

        this.news2 = new News();
        this.news2.setId(Long.parseLong("1"));
        this.news2.setTitle("tebbst");
        this.news2.setDescription("testtebbbbstest");
        this.news2.setImgUrl("bbbbb");
        this.news2.setAddedOn(LocalDateTime.now());
        this.news2.setTeam(team);
    }

    @Test
    public void deleteNewsConfirmTest(){
        int id = 1;
        this.serviceToTest.deleteNewsConfirm((long) id);
        Mockito.verify(this.newsRepository, times(1)).deleteById((long) id);
    }

    @Test
    public void updateNewsTest(){
        Mockito.when(this.newsRepository.findById(this.newsToTest.getId())).
                thenReturn(Optional.of(this.newsToTest));

        NewsServiceModel testServiceModel = new NewsServiceModel();
        testServiceModel.setId(this.newsToTest.getId());
        testServiceModel.setTitle(this.newsToTest.getTitle());
        testServiceModel.setDescription(this.newsToTest.getDescription());
        testServiceModel.setImgUrl(this.newsToTest.getImgUrl());
        testServiceModel.setAddedOn(this.newsToTest.getAddedOn());
        testServiceModel.setTeam(this.newsToTest.getTeam());

        this.serviceToTest.updateNews(testServiceModel);

        Mockito.verify(this.newsRepository, Mockito.times(1)).save(this.newsToTest);
    }

    @Test
    public void addNewsTest(){
        NewsServiceModel testServiceModel = new NewsServiceModel();
        testServiceModel.setId(this.newsToTest.getId());
        testServiceModel.setTitle(this.newsToTest.getTitle());
        testServiceModel.setDescription(this.newsToTest.getDescription());
        testServiceModel.setImgUrl(this.newsToTest.getImgUrl());
        testServiceModel.setAddedOn(this.newsToTest.getAddedOn());
        testServiceModel.setTeam(this.newsToTest.getTeam());

        Mockito.when(this.modelMapper.map(testServiceModel, News.class)).
                thenReturn(this.newsToTest);

        this.serviceToTest.addNews(testServiceModel, this.user);

        Mockito.verify(this.newsRepository, Mockito.times(1)).save(this.newsToTest);
    }

    @Test
    public void findNewsByIdTest(){
        when(this.newsRepository.findById(this.newsToTest.getId())).
                thenReturn(Optional.of(this.newsToTest));

        News actual = this.serviceToTest.findNewsById(this.newsToTest.getId());

        Assertions.assertEquals(actual, this.newsToTest);
    }

    @Test
    public void orderNewsTest(){
        when(this.newsRepository.findByTeamOrderByAddedOnDesc(this.team)).thenReturn(Set.of(this.newsToTest, this.news2));

        Set<News> actual = this.serviceToTest.orderNews(Set.of(this.newsToTest, this.news2));

        Assertions.assertNotNull(actual);
        Assertions.assertTrue(actual.contains(this.newsToTest));
    }
}
