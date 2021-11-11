package com.example.premierleague.services;

import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.models.view.UserProfileViewModel;

import java.util.List;

public interface UserService {
    void registerAndLoginUser(UserServiceModel userServiceModel);

    boolean invalidUsernameOrPassword(String username, String password);

    User findUserByUsername(String username);

    UserProfileViewModel findUserProfileByUsername(String username);

    List<User> findAllUsers();

    void setUserAdminRole(User user);

    void setUserRole(User user);
}
