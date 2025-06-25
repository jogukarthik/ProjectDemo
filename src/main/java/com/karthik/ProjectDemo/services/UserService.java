package com.karthik.ProjectDemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karthik.ProjectDemo.models.User;
import com.karthik.ProjectDemo.repositories.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }
    
    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }
    public User postUser(String name,String email,String password){
        User user=new User();
        user.setEmail(email);
        user.setName(name);
        user.setPassword(password);
        return userRepository.save(user);
    }
}
