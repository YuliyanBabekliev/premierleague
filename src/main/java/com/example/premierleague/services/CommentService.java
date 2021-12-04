package com.example.premierleague.services;

import com.example.premierleague.models.binding.CommentAddBindingModel;
import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.service.CommentServiceModel;
import com.example.premierleague.models.view.CommentViewModel;

import java.util.List;

public interface CommentService {
    List<CommentViewModel> getComments(Long newsId);

    CommentViewModel addComment(CommentServiceModel commentServiceModel);

    void deleteCommentByNews(News news);
}
