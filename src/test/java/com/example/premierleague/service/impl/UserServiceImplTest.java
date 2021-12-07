package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Picture;
import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.models.view.UserProfileViewModel;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.repositories.UserRepository;
import com.example.premierleague.services.CloudinaryService;
import com.example.premierleague.services.TeamService;
import com.example.premierleague.services.impl.UserDetailsServiceImpl;
import com.example.premierleague.services.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    private UserServiceImpl serviceToTest;

    @Mock
    private UserRepository userRepository;

    @Mock
    private RoleRepository roleRepository;

    @Mock
    private TeamService teamService;

    @Mock
    private PasswordEncoder passwordEncoder;

    @Mock
    private ModelMapper modelMapper;

    @Mock
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private CloudinaryService cloudinaryService;

    private User user;
    private User user2;
    private Team team;
    private Role userRole;
    private Role adminRole;
    private Picture picture;

    @BeforeEach
    public void setUp(){
        this.serviceToTest = new UserServiceImpl(
                this.userRepository, this.roleRepository, this.teamService, this.passwordEncoder, this.modelMapper,
                this.userDetailsService, this.cloudinaryService
        );

        this.team = new Team();
        team.setName("Sheffield");

        userRole = new Role();
        userRole.setRole(RoleNameEnum.USER);
        adminRole = new Role();
        adminRole.setRole(RoleNameEnum.ADMIN);

        picture = new Picture();
        picture.setUrl("aaaa");

        this.user = new User();
        this.user.setUsername("yuliyan");
        this.user.setEmail("yuliyan@abv.bg");
        this.user.setGender("Male");
        this.user.setPassword("topsecret");
        this.user.setFavouriteTeam(team);
        this.user.setRoles(Set.of(userRole));
        this.user.setPicture(picture);

        this.user2 = new User();
        this.user2.setUsername("yuliyana");
        this.user2.setEmail("yuliyana@abv.bg");
        this.user2.setGender("Female");
        this.user2.setPassword("topsecret");
        this.user2.setFavouriteTeam(team);
        this.user2.setRoles(Set.of(userRole, adminRole));
    }

    @Test
    public void invalidUsernameOrPasswordTest(){
        Mockito.when(this.userRepository.findByUsernameAndPassword(this.user.getUsername(), this.user.getPassword())).
                thenReturn(this.user);

        Boolean isValid = this.serviceToTest.invalidUsernameOrPassword(this.user.getUsername(), this.user.getPassword());

        Assertions.assertEquals(isValid, true);
    }

    @Test
    public void findUserProfileByUsernameTest(){
        Mockito.when(this.userRepository.findByUsername(this.user.getUsername())).
                thenReturn(Optional.of(this.user));
        Mockito.when(this.userRepository.findByUsername(this.user2.getUsername())).
                thenReturn(Optional.of(this.user2));

        UserProfileViewModel userProfileViewModel = new UserProfileViewModel();
        userProfileViewModel.setUsername(this.user.getUsername());
        userProfileViewModel.setEmail(this.user.getEmail());
        userProfileViewModel.setGender(this.user.getGender());

        Mockito.when(this.modelMapper.map(this.user, UserProfileViewModel.class)).thenReturn(
                userProfileViewModel
        );

        UserProfileViewModel userProfileViewModel2 = new UserProfileViewModel();
        userProfileViewModel2.setUsername(this.user2.getUsername());
        userProfileViewModel2.setEmail(this.user2.getEmail());
        userProfileViewModel2.setGender(this.user2.getGender());

        Mockito.when(this.modelMapper.map(this.user2, UserProfileViewModel.class)).thenReturn(
                userProfileViewModel2
        );

        UserProfileViewModel actual1 = this.serviceToTest.findUserProfileByUsername(this.user.getUsername());
        UserProfileViewModel actual2 = this.serviceToTest.findUserProfileByUsername(this.user2.getUsername());

        Assertions.assertNotNull(actual1);
        Assertions.assertNotNull(actual2);
        Assertions.assertEquals(actual1.getUsername(), userProfileViewModel.getUsername());
        Assertions.assertEquals(actual2.getUsername(), userProfileViewModel2.getUsername());
    }

    @Test
    public void findAllUsersTest(){
        Mockito.when(this.userRepository.findAll()).
                thenReturn(List.of(this.user, this.user2));

        List<User> actual = this.serviceToTest.findAllUsers();

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(actual.get(0).getUsername(), this.user.getUsername());
    }

    @Test
    public void setAdminRoleTest(){
        Mockito.when(this.roleRepository.findById(Long.parseLong("1"))).
                thenReturn(Optional.of(this.adminRole));
        Mockito.when(this.roleRepository.findById(Long.parseLong("2"))).
                thenReturn(Optional.of(this.userRole));
        this.serviceToTest.setUserAdminRole(this.user);
        Mockito.verify(this.userRepository, Mockito.times(1)).saveAndFlush(this.user);
    }

    @Test
    public void setUserRoleTest(){
        Mockito.when(this.roleRepository.findById(Long.parseLong("2"))).
                thenReturn(Optional.of(this.userRole));
        this.serviceToTest.setUserRole(this.user);
        Mockito.verify(this.userRepository, Mockito.times(1)).saveAndFlush(this.user);
    }

    @Test
    public void editUserProfileImageTest(){
        this.serviceToTest.editUserProfileImage(this.user, this.picture);

        Mockito.verify(this.userRepository, Mockito.times(1)).saveAndFlush(this.user);
    }

}
