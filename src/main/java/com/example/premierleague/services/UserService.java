package com.example.premierleague.services;

import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.models.view.UserProfileViewModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    boolean invalidUsernameOrPassword(String username, String password);

    User findUserByUsername(String username);

    UserProfileViewModel findUserProfileByUsername(String username);
}
