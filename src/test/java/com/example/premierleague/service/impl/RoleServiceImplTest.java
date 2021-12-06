package com.example.premierleague.service.impl;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.services.impl.RoleServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class RoleServiceImplTest {
    private RoleServiceImpl serviceToTest;

    @Mock
    private RoleRepository roleRepository;

    private Role userRole;
    private Role adminRole;

    @BeforeEach
    public void setUp(){
        this.serviceToTest = new RoleServiceImpl(roleRepository);

        this.userRole = new Role();
        this.userRole.setRole(RoleNameEnum.USER);
        this.adminRole = new Role();
        this.adminRole.setRole(RoleNameEnum.ADMIN);
    }

    @Test
    public void findAllRolesTest(){
        Mockito.when(this.roleRepository.findAll()).
                thenReturn(List.of(userRole, adminRole));

        List<Role> actual = this.serviceToTest.findAllRoles();

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(actual.get(0).getRole(), this.userRole.getRole());
    }
}
