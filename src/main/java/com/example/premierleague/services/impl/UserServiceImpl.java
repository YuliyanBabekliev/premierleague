package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.repositories.UserRepository;
import com.example.premierleague.security.CurrentUser;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final TeamService teamService;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final CurrentUser currentUser;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, TeamService teamService, PasswordEncoder passwordEncoder, ModelMapper modelMapper, CurrentUser currentUser) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.teamService = teamService;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
        this.currentUser = currentUser;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        User user = this.modelMapper.map(userServiceModel, User.class);
        user.setRole(Set.of(this.roleRepository.findById(Long.parseLong("2")).get()));
        user.setPassword(this.passwordEncoder.encode(userServiceModel.getPassword()));
        Team team = this.teamService.findTeamByName(userServiceModel.getFavouriteTeam());
        user.setFavouriteTeam(team);
        this.userRepository.save(user);
    }

    @Override
    public boolean invalidUsernameOrPassword(String username, String password) {
        User user = this.userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }

    @Override
    public void loginUser(UserServiceModel userServiceModel) {
        this.currentUser.setId(userServiceModel.getId());
        this.currentUser.setUsername(userServiceModel.getUsername());
    }

    @Override
    public void logout() {
        this.currentUser.setId(null);
        this.currentUser.setUsername(null);
    }
}
