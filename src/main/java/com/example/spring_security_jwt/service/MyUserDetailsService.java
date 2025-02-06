package com.example.spring_security_jwt.service;

import com.example.spring_security_jwt.model.UserPrincipal;
import com.example.spring_security_jwt.model.Users;
import com.example.spring_security_jwt.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if(user==null){
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("No Such User present");
        }
        return new UserPrincipal(user);
    }
}
