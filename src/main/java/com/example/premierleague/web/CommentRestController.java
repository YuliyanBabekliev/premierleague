package com.example.premierleague.web;

import com.example.premierleague.models.binding.CommentAddBindingModel;
import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.service.CommentServiceModel;
import com.example.premierleague.models.view.CommentViewModel;
import com.example.premierleague.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentRestController {
    private final CommentService commentService;
    private final ModelMapper modelMapper;

    public CommentRestController(CommentService commentService, ModelMapper modelMapper) {
        this.commentService = commentService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{newsId}/comments")
    public ResponseEntity<List<CommentViewModel>> getComments(@PathVariable Long newsId, Principal principal){
        return ResponseEntity.ok(
                this.commentService.getComments(newsId)
        );
    }

    @PostMapping("/comments")
    public ResponseEntity<Comment> createComment(@Valid CommentAddBindingModel commentAddBindingModel){
        Comment comment = this.commentService.addComment(this.modelMapper.map(commentAddBindingModel, CommentServiceModel.class));
        //TODO
        return ResponseEntity.ok(comment);
    }
}
