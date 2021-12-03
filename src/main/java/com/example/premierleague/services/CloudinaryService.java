package com.example.premierleague.services;

import com.example.premierleague.models.binding.CloudinaryImage;
import com.example.premierleague.models.entities.Picture;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CloudinaryService {
    CloudinaryImage upload(MultipartFile file) throws IOException;

    boolean delete(String publicId);

    Picture savePictureInDB(Picture picture);
}
