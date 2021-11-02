package com.example.premierleague.services.impl;

import com.example.premierleague.models.entities.MyUserDetails;
import com.example.premierleague.models.entities.User;
import com.example.premierleague.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.
                userRepository.
                findByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException("User with name" + username + " not found."));
        return new MyUserDetails(user);
    }

    private static UserDetails mapToUserDetails(User user){
        List<GrantedAuthority> authorities = user.
                getRoles().
                stream().
                map(r -> new SimpleGrantedAuthority("ROLE_" + r.getRole().name())).
                collect(Collectors.toList());

        return new org.
                springframework.
                security.
                core.
                userdetails.
                User(user.getUsername(),
                user.getPassword(),
                authorities
        );
    }
}
