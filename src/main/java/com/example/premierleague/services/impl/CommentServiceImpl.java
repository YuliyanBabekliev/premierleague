package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.service.CommentServiceModel;
import com.example.premierleague.models.view.CommentViewModel;
import com.example.premierleague.repositories.CommentRepository;
import com.example.premierleague.services.CommentService;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final ModelMapper modelMapper;
    private final UserService userService;
    private final NewsService newsService;

    public CommentServiceImpl(CommentRepository commentRepository, ModelMapper modelMapper, UserService userService, NewsService newsService) {
        this.commentRepository = commentRepository;
        this.modelMapper = modelMapper;
        this.userService = userService;
        this.newsService = newsService;
    }

    @Override
    public List<CommentViewModel> getComments(Long newsId) {
        List<Comment> comments = this.commentRepository.findByNewsIdOrderByDateDesc(newsId);
        List<CommentViewModel> commentViewModels = new ArrayList<>();

        for(Comment comment: comments){
            CommentViewModel commentViewModel = this.modelMapper.map(comment, CommentViewModel.class);
            commentViewModel.setUser(comment.getUser().getUsername());
            if(comment.getUser().getPicture() == null) {
                if(comment.getUser().getGender().equals("Male")) {
                    commentViewModel.setImgUrl("data:image/png;base64,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");
                }else{
                    commentViewModel.setImgUrl("https://static.thenounproject.com/png/236432-200.pnghttps://static.thenounproject.com/png/236432-200.png");
                }
            }else{
                commentViewModel.setImgUrl(comment.getUser().getPicture().getUrl());
            }
            commentViewModels.add(commentViewModel);
        }
        return commentViewModels;
    }

    @Override
    public CommentViewModel addComment(CommentServiceModel commentServiceModel) {
        Objects.requireNonNull(commentServiceModel.getUser());

        var news = this.newsService.findNewsById(commentServiceModel.getNews().getId());
        var author = this.userService.findUserByUsername(commentServiceModel
                .getUser().getUsername());

        Comment newComment = this.modelMapper.map(commentServiceModel, Comment.class);
        newComment.setDate(LocalDateTime.now());

        Comment savedComment = this.commentRepository.save(newComment);

        return mapAsComment(savedComment);
    }

    @Override
    public void deleteCommentByNews(News news) {
        this.commentRepository.deleteCommentByNews(news);
    }

    private CommentViewModel mapAsComment(Comment commentEntity) {
        CommentViewModel commentViewModel = new CommentViewModel();

        commentViewModel.setId(commentEntity.getId());
        commentViewModel.setCommentText(commentEntity.getCommentText());
        commentViewModel.setDate(commentEntity.getDate());
        commentViewModel.setUser(commentEntity.getUser().getUsername());
        if(commentEntity.getUser().getPicture() != null) {
            commentViewModel.setImgUrl(commentEntity.getUser().getPicture().getUrl());
        }
        if(commentEntity.getUser().getPicture() == null){
            if(commentEntity.getUser().getGender().equals("Male")){
                commentViewModel.setImgUrl("data:image/png;base64,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");
            }else{
                commentViewModel.setImgUrl("https://static.thenounproject.com/png/236432-200.png");
            }
        }

        return commentViewModel;
    }
}
