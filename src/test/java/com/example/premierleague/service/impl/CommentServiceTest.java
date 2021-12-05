package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.view.CommentViewModel;
import com.example.premierleague.repositories.CommentRepository;
import com.example.premierleague.repositories.NewsRepository;
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

        user = new User();
        user.setUsername("yuliyan");
        user.setEmail("yuliyan@abv.bg");
        user.setGender("Male");

        news = new News();
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
        comment1.setUser(user);
        comment1.setNews(news);
    }

    @Test
    public void deleteCommentTest(){
        News news = new News();
        this.serviceToTest.deleteCommentByNews(news);
        Mockito.verify(this.commentRepository, times(1)).deleteCommentByNews(news);
    }

    @Test
    public void getCommentsTest(){
       when(this.commentRepository.findByNewsIdOrderByDateDesc(Long.parseLong("1")))
               .thenReturn(List.of(comment, comment1));

       List<CommentViewModel> actual = this.serviceToTest.getComments(news.getId());
    }
}
