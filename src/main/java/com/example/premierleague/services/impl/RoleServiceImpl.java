package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAllRoles() {
        return this.roleRepository.findAll();
    }
}
