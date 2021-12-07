package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.CommentServiceModel;
import com.example.premierleague.models.view.CommentViewModel;
import com.example.premierleague.repositories.CommentRepository;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.services.CommentService;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.UserService;
import com.example.premierleague.services.impl.CommentServiceImpl;
import com.example.premierleague.services.impl.NewsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.parameters.P;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CommentServiceTest {

    private CommentServiceImpl serviceToTest;
    private Comment comment;
    private Comment comment1;
    private User user;
    private News news;
    private User user1;
    private Comment comment2;
    private User user2;
    private Picture picture;

    @Mock
    private CommentRepository commentRepository;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private NewsRepository newsRepository;

    @Mock
    private UserService userService;

    @Mock
    private NewsService newsService;

    @BeforeEach
    void setUp(){
        serviceToTest = new CommentServiceImpl(commentRepository, modelMapper, userService, newsService);

        picture = new Picture();
        picture.setUrl("testtesttest");
        picture.setTitle("test");

        user = new User();
        user.setUsername("yuliyan");
        user.setEmail("yuliyan@abv.bg");
        user.setGender("Male");

        user1 = new User();
        user1.setUsername("yuliyana");
        user1.setEmail("yuliyana@abv.bg");
        user1.setGender("Female");

        user2 = new User();
        user2.setUsername("yuliyann");
        user2.setEmail("yuliyann@abv.bg");
        user2.setGender("Male");
        user2.setPicture(picture);

        news = new News();
        news.setId(Long.parseLong("1"));
        news.setTitle("aaaa");
        news.setDescription("aaaaaaaaaaaaaa");
        news.setAddedOn(LocalDateTime.now());

        comment = new Comment();
        comment.setCommentText("test");
        comment.setDate(LocalDateTime.now());
        comment.setUser(user);
        comment.setNews(news);

        comment1 = new Comment();
        comment1.setCommentText("test1");
        comment1.setDate(LocalDateTime.now());
        comment1.setUser(user1);
        comment1.setNews(news);

        comment2 = new Comment();
        comment2.setCommentText("test2");
        comment2.setDate(LocalDateTime.now());
        comment2.setUser(user2);
        comment2.setNews(news);
    }

    @Test
    public void deleteCommentTest(){
        News news = new News();
        this.serviceToTest.deleteCommentByNews(news);
        Mockito.verify(this.commentRepository, times(1)).deleteCommentByNews(news);
    }

    @Test
    public void getCommentsTest(){
       when(this.commentRepository.findByNewsIdOrderByDateDesc(news.getId()))
               .thenReturn(List.of(comment, comment1, comment2));

       CommentViewModel commentViewModel = new CommentViewModel();
       commentViewModel.setCommentText(this.comment.getCommentText());
       commentViewModel.setUser(this.comment.getUser().getUsername());
       commentViewModel.setDate(this.comment.getDate());

       CommentViewModel commentViewModel1 = new CommentViewModel();
       commentViewModel1.setCommentText(this.comment1.getCommentText());
       commentViewModel1.setUser(this.comment1.getUser().getUsername());
       commentViewModel1.setDate(this.comment1.getDate());

        CommentViewModel commentViewModel2 = new CommentViewModel();
        commentViewModel2.setCommentText(this.comment2.getCommentText());
        commentViewModel2.setUser(this.comment2.getUser().getUsername());
        commentViewModel2.setDate(this.comment2.getDate());

       when(this.modelMapper.map(comment, CommentViewModel.class)).thenReturn(commentViewModel);
       when(this.modelMapper.map(comment1, CommentViewModel.class)).thenReturn(commentViewModel1);
       when(this.modelMapper.map(comment2, CommentViewModel.class)).thenReturn(commentViewModel2);

       List<CommentViewModel> actual = this.serviceToTest.getComments(news.getId());

       Assertions.assertNotNull(actual);
       Assertions.assertEquals(actual.get(0).getCommentText(), this.comment.getCommentText());
    }

    @Test
    public void addCommentTest(){
        CommentServiceModel commentServiceModel = new CommentServiceModel();
        commentServiceModel.setCommentText(this.comment.getCommentText());
        commentServiceModel.setDate(this.comment.getDate());
        commentServiceModel.setUser(this.comment.getUser());
        commentServiceModel.setNews(this.comment.getNews());

        when(this.newsService.findNewsById(this.news.getId())).thenReturn(this.news);
        when(this.userService.findUserByUsername(this.user.getUsername())).thenReturn(this.user);
        when(this.modelMapper.map(commentServiceModel, Comment.class)).thenReturn(this.comment);
        when(this.commentRepository.save(this.comment)).thenReturn(this.comment);

        CommentViewModel actual = this.serviceToTest.addComment(commentServiceModel);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(actual.getCommentText(), this.comment.getCommentText());
    }
}
