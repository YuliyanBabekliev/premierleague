package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
    Picture findByPublicID(String publicID);
}
