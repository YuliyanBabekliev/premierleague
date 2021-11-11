package com.example.premierleague.repositories;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRole(RoleNameEnum roleNameEnum);
}
