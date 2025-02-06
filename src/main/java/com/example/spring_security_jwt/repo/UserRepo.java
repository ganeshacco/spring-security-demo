package com.example.spring_security_jwt.repo;

import com.example.spring_security_jwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);

}
