package com.example.premierleague.init.roles;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.enums.RoleNameEnum;
import com.example.premierleague.repositories.RoleRepository;
import org.springframework.stereotype.Component;

@Component
public class RolesInit {
    private final RoleRepository roleRepository;

    public RolesInit(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void initRoles(){
        if(this.roleRepository.count() == 0){
            Role admin = new Role();
            Role user = new Role();

            admin.setRole(RoleNameEnum.ADMIN);
            user.setRole(RoleNameEnum.USER);

            this.roleRepository.save(admin);
            this.roleRepository.save(user);
        }
    }
}
