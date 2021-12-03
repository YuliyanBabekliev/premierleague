package com.example.premierleague.service.impl;

import com.cloudinary.Cloudinary;
import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.repositories.PictureRepository;
import com.example.premierleague.services.impl.CloudinaryServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class CloudinaryServiceTest {
    private CloudinaryServiceImpl serviceToTest;

    private Picture pictureToTest;

    @Mock
    private PictureRepository pictureRepository;

    @Mock
    private Cloudinary cloudinary;

    @Mock
    private MultipartFile multipartFile;

    @BeforeEach
    public void setUp(){
        this.serviceToTest = new CloudinaryServiceImpl(this.cloudinary, this.pictureRepository);

        this.pictureToTest = new Picture();
        pictureToTest.setTitle("test");
        pictureToTest.setUrl("testtestest");
        pictureToTest.setPublicID("123456789");
    }

    @Test
    public void createPictureTest() throws IOException {
        Mockito.when(this.pictureRepository.save(this.pictureToTest))
                .thenReturn(this.pictureToTest);

        Picture picture = this.serviceToTest.savePictureInDB(pictureToTest);

        Assertions.assertEquals(picture.getUrl(), pictureToTest.getUrl());
        Assertions.assertEquals(picture.getPublicID(), pictureToTest.getPublicID());
    }

//    @Test
//    public void testDeletePicture() {
//
//        int testId = 1;
//
//        this.serviceToTest.delete(pictureToTest.getPublicID());
//
//        Mockito.verify(this.pictureRepository, times(1)).deleteById((long) testId);
//    }
}
