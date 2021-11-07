package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.models.view.UserProfileViewModel;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.repositories.UserRepository;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Override
    public User findUserByUsername(String username) {
        return this.userRepository.findByUsername(username).orElse(null);
    }

    @Override
    public UserProfileViewModel findUserProfileByUsername(String username) {
        User user = this.userRepository.findByUsername(username).orElse(null);
        UserProfileViewModel userProfileViewModel = this.modelMapper.map(user, UserProfileViewModel.class);
        userProfileViewModel.setFavouriteTeam(user.getFavouriteTeam().getName());
        if(user.getRoles().size() == 2){
            userProfileViewModel.setRole("ADMIN");
        }else{
            userProfileViewModel.setRole("USER");
        }
        return userProfileViewModel;
    }

    @Override
    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public void setUserAdminRole(User user) {
        Role adminRole = this.roleRepository.findById(Long.parseLong("1")).orElse(null);
        Role userRole = this.roleRepository.findById(Long.parseLong("2")).orElse(null);
        user.setRoles(Set.of(adminRole, userRole));
        this.userRepository.saveAndFlush(user);
    }

    @Override
    public void setUserRole(User user) {
        Role userRole = this.roleRepository.findById(Long.parseLong("2")).orElse(null);
        user.setRoles(Set.of(userRole));
        this.userRepository.saveAndFlush(user);
    }
}
