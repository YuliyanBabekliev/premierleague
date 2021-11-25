package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.models.service.UserServiceModel;
import com.example.premierleague.models.view.UserProfileViewModel;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.repositories.UserRepository;
import com.example.premierleague.services.CloudinaryService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

@Service
public class UserServiceImpl implements UserService {
    static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class.getName());
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final TeamService teamService;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final UserDetailsServiceImpl userDetailsService;
    private final CloudinaryService cloudinaryService;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, TeamService teamService, PasswordEncoder passwordEncoder, ModelMapper modelMapper, UserDetailsServiceImpl userDetailsService, CloudinaryService cloudinaryService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.teamService = teamService;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
        this.userDetailsService = userDetailsService;
        this.cloudinaryService = cloudinaryService;
    }

    @Override
    public void registerAndLoginUser(UserServiceModel userServiceModel) {
        Role role = this.roleRepository.findByRole(RoleNameEnum.USER);
        User user = new User();
        user.setUsername(userServiceModel.getUsername());
        user.setEmail(userServiceModel.getEmail());
        user.setGender(userServiceModel.getGender());
        Team team = this.teamService.findTeamByName(userServiceModel.getFavouriteTeam());
        user.setFavouriteTeam(team);
        user.setActive(true);
        user.setPassword(this.passwordEncoder.encode(userServiceModel.getPassword()));
        user.setRoles(Set.of(role));

        this.userRepository.save(user);

        UserDetails principal = userDetailsService.loadUserByUsername(user.getUsername());
        Authentication authentication = new UsernamePasswordAuthenticationToken(
                principal,
                user.getPassword(),
                principal.getAuthorities()
        );

        SecurityContextHolder
                .getContext()
                .setAuthentication(authentication);
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

    @Override
    public void editUserProfileImage(User user, Picture picture) {
            user.setPicture(picture);
            this.userRepository.saveAndFlush(user);
    }

    @Override
    public Long getUsersCount() {
        return this.userRepository.count();
    }
}
