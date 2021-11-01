package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.repositories.UserRepository;
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

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, TeamService teamService, PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.teamService = teamService;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
    }

    @Override
    public void registerUser(UserServiceModel userServiceModel) {
        User user = this.modelMapper.map(userServiceModel, User.class);
        user.setRoles(Set.of(this.roleRepository.findById(Long.parseLong("2")).get()));
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
}
