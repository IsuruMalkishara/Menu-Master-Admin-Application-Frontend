package com.oxcentra.menumaster.services;

import com.oxcentra.menumaster.model.Business;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;



@Service
public interface BusinessService extends UserDetailsService {
    Business getUserByEmail(String email);

    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;
}
