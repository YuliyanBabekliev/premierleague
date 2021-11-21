package com.example.premierleague.init.comments;

import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.repositories.CommentRepository;
import com.example.premierleague.repositories.NewsRepository;
import com.example.premierleague.repositories.UserRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CommentsInit {
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final NewsRepository newsRepository;

    public CommentsInit(CommentRepository commentRepository, UserRepository userRepository, NewsRepository newsRepository) {
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.newsRepository = newsRepository;
    }

    public void initComments(){
        if(this.commentRepository.count() == 0){
            Comment comment1 = new Comment();
            Comment comment2 = new Comment();

            comment1.setCommentText("Awesome!");
            comment1.setDate(LocalDateTime.now());
            comment1.setUser(this.userRepository.findById(Long.parseLong("1")).orElse(null));
            comment1.setNews(this.newsRepository.findById(Long.parseLong("21")).orElse(null));

            comment2.setCommentText("Excellent!");
            comment2.setDate(LocalDateTime.now());
            comment2.setUser(this.userRepository.findById(Long.parseLong("1")).orElse(null));
            comment2.setNews(this.newsRepository.findById(Long.parseLong("21")).orElse(null));

            this.commentRepository.save(comment1);
            this.commentRepository.save(comment2);
        }
    }
}
