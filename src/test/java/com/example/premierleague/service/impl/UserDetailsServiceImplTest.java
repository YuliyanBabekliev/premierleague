package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.repositories.UserRepository;
import com.example.premierleague.services.impl.UserDetailsServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@ExtendWith(MockitoExtension.class)
public class UserDetailsServiceImplTest {
    private User testUser;
    private Role adminRole, userRole;

    private UserDetailsServiceImpl serviceToTest;

    @Mock
    private UserRepository mockUserRepository;

    @Mock
    private TeamRepository teamRepository;

    @BeforeEach
    void init(){
        serviceToTest = new UserDetailsServiceImpl(mockUserRepository);

        adminRole = new Role();
        adminRole.setRole(RoleNameEnum.ADMIN);

        userRole = new Role();
        userRole.setRole(RoleNameEnum.USER);

        testUser = new User();
        testUser.setUsername("yuliyan");
        testUser.setEmail("yuliyan@abv.bg");
        testUser.setPassword("123456");
        testUser.setRoles(Set.of(adminRole, userRole));
        testUser.setGender("Male");
        testUser.setFavouriteTeam(teamRepository.findByName("Chelsea"));
    }

    @Test
    void testUserNotFound(){
        Assertions.assertThrows(
                UsernameNotFoundException.class,
                () -> serviceToTest.loadUserByUsername("abc")
        );
    }

    @Test
    void testUserFound(){
        Mockito.when(mockUserRepository.findByUsername(testUser.getUsername()))
                .thenReturn(Optional.of(testUser));

        var actual = serviceToTest.loadUserByUsername(testUser.getUsername());

        String expectedRoles = "ROLE_ADMIN, ROLE_USER";
        String actualRoles = actual.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(", "));

        Assertions.assertEquals(actual.getUsername(), testUser.getUsername());
        Assertions.assertEquals(expectedRoles, actualRoles);
    }
}
