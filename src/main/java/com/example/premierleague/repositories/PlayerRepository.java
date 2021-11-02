package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.Player;
import com.example.premierleague.models.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Set<Player> findByClubAndPosition(Team team, String position);
}
