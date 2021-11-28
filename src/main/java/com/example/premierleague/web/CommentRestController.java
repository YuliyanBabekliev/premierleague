package com.example.premierleague.web;

import com.example.premierleague.models.binding.CommentAddBindingModel;
import com.example.premierleague.models.service.CommentServiceModel;
import com.example.premierleague.models.validation.ApiError;
import com.example.premierleague.models.view.CommentViewModel;
import com.example.premierleague.services.CommentService;
import com.example.premierleague.services.NewsService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CommentRestController {
    private final CommentService commentService;
    private final UserService userService;
    private final NewsService newsService;
    private final ModelMapper modelMapper;

    public CommentRestController(CommentService commentService, UserService userService, NewsService newsService, ModelMapper modelMapper) {
        this.commentService = commentService;
        this.userService = userService;
        this.newsService = newsService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/{newsId}/comments")
    public ResponseEntity<List<CommentViewModel>> getComments(@PathVariable Long newsId, Principal principal){
        return ResponseEntity.ok(
                this.commentService.getComments(newsId)
        );
    }

    @PostMapping("/{newsId}/comments")
    public ResponseEntity<CommentViewModel> createComment(@PathVariable Long newsId,
                                                          @RequestBody @Valid CommentAddBindingModel commentAddBindingModel){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String username = auth.getName();
        CommentServiceModel commentServiceModel = this.modelMapper.map(commentAddBindingModel, CommentServiceModel.class);
        commentServiceModel.setUser(this.userService.findUserByUsername(username));
        commentServiceModel.setNews(this.newsService.findNewsById(newsId));

        CommentViewModel newComment = this.commentService.addComment(commentServiceModel);

        URI locationOfNewComment =
                URI.create(String.format("/api/v1/%s/comments/%s", newsId, newComment.getId()));

        return ResponseEntity.
                created(locationOfNewComment)
                .body(newComment);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> onValidationFailure(MethodArgumentNotValidException exc) {
        ApiError apiError = new ApiError(HttpStatus.BAD_REQUEST);
        exc.getFieldErrors().forEach(fe ->
                apiError.addFieldWithError(fe.getField()));

        return ResponseEntity.badRequest().body(apiError);
    }
}
