package com.example.test.service;

import com.example.test.entity.Personnel;
import com.example.test.repository.PersonnelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final PersonnelRepository personnelRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Personnel userDetails = personnelRepository.findPersonnelByUsername(username);

        if (userDetails == null) {
            throw new UsernameNotFoundException("User with username: " + username + " not found");
        }

        return User.builder()
                .username(userDetails.getUsername())
                .password(userDetails.getPassword())
                .roles("ADMIN") // Replace with appropriate roles from userDetails if available
                .build();
    }
}




