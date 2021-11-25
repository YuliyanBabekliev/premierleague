package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.News;
import com.example.premierleague.models.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {

    Set<News> findByTeamOrderByAddedOnDesc(Team team);
}
