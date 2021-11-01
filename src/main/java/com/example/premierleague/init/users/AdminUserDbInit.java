package com.example.premierleague.init.users;

import com.example.premierleague.models.entities.Role;
import com.example.premierleague.models.entities.Team;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.repositories.RoleRepository;
import com.example.premierleague.repositories.TeamRepository;
import com.example.premierleague.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;

@Component
public class AdminUserDbInit {
    private final UserRepository userRepository;
    private final TeamRepository teamRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public AdminUserDbInit(UserRepository userRepository, TeamRepository teamRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.teamRepository = teamRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void initAdmin(){
        if(this.userRepository.count() == 0){
            Optional<Team> favTeam = this.teamRepository.findById(Long.parseLong("6"));
            Optional<Role> userRole = this.roleRepository.findById(Long.parseLong("1"));
            Optional<Role> adminRole = this.roleRepository.findById(Long.parseLong("2"));
            User admin = new User();
            admin.setUsername("admin");
            admin.setEmail("admin@abv.bg");
            admin.setPassword(this.passwordEncoder.encode("topsecret"));
            admin.setGender("Male");
            admin.setFavouriteTeam(favTeam.get());
            admin.setRoles(Set.of(userRole.get(), adminRole.get()));

            this.userRepository.save(admin);
        }
    }
}
