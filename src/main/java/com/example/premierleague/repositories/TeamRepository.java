package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByName(String teamName);

    List<Team> findAllByOrderByPointsDescGoalDifferenceDesc();
}
