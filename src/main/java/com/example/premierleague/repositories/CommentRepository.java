package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.Comment;
import com.example.premierleague.models.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByNewsIdOrderByDateDesc(Long id);

    Comment deleteCommentByNews(News news);
}
