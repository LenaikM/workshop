package com.workshop.workshop.service;

import com.workshop.workshop.model.User;
import com.workshop.workshop.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service("customMembreDetailsService")
public class CustomMembreDetailsService implements UserDetailsService {

    @Autowired
    private IMembreService membreService;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = Optional.ofNullable(membreService.findByEmail(email))
                .orElseThrow(() -> new UsernameNotFoundException("User " + email + " not found"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getMdp(),
                getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(User m) {
        Role role = Optional.ofNullable(m.getRole()).orElse(new Role());
        return Arrays.asList(new SimpleGrantedAuthority(role.getRoleName()));
    }
}
