package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.Game;
import com.example.premierleague.models.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("SELECT g FROM Game g " +
            "WHERE g.homeTeam = ?1 or g.awayTeam = ?2" +
            " ORDER BY g.date DESC")
    List<Game> findByAwayTeamOrHomeTeam(Team team, Team team2);
}
