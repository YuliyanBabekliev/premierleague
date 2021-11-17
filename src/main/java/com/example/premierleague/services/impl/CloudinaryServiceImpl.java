package com.example.premierleague.services.impl;

import com.cloudinary.Cloudinary;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.example.premierleague.models.binding.CloudinaryImage;
import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.repositories.PictureRepository;
import com.example.premierleague.services.CloudinaryService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryServiceImpl implements CloudinaryService {

    private static final String TEMP_FILE = "temp-file";
    private static final String URL = "url";
    private static final String PUBLIC_ID = "public_id";

    private final Cloudinary cloudinary;
    private final PictureRepository pictureRepository;

    public CloudinaryServiceImpl(Cloudinary cloudinary, PictureRepository pictureRepository) {
        this.cloudinary = cloudinary;
        this.pictureRepository = pictureRepository;
    }

    @Override
    public CloudinaryImage upload(MultipartFile multipartFile) throws IOException {

        File tempFile = File.createTempFile(TEMP_FILE, multipartFile.getOriginalFilename());
        multipartFile.transferTo(tempFile);
        try {
            @SuppressWarnings("unchecked")
            Map<String, String> uploadResult = cloudinary.
                    uploader().
                    upload(tempFile, Map.of());

            String url = uploadResult.getOrDefault(URL,
                    "https://i.pinimg.com/originals/c5/21/64/c52164749f7460c1ededf8992cd9a6ec.jpg");
            String publicId = uploadResult.getOrDefault(PUBLIC_ID, "");
            CloudinaryImage cloudinaryImage = new CloudinaryImage();
            cloudinaryImage.setPublicId(publicId);
            cloudinaryImage.setUrl(url);
            return cloudinaryImage;

        } finally {
            tempFile.delete();
        }
    }

    @Override
    public boolean delete(String publicId) {
        try {
            this.cloudinary.uploader().destroy(publicId, Map.of());
            deleteInDB(publicId);
        } catch (IOException e) {
            return false;
        }
        return true;
    }

    private void deleteInDB(String publicId) {
        Picture picture = this.pictureRepository.findByPublicID(publicId);
        this.pictureRepository.delete(picture);
    }

    @Override
    public void savePictureInDB(Picture picture) {
        this.pictureRepository.save(picture);
    }
}