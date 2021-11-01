package com.example.premierleague.services;

import com.example.premierleague.models.service.UserServiceModel;

public interface UserService {
    void registerUser(UserServiceModel userServiceModel);

    boolean invalidUsernameOrPassword(String username, String password);
}
