package com.karthik.ProjectDemo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.ProjectDemo.controllers.DTOs.RequestDTO;
import com.karthik.ProjectDemo.controllers.DTOs.ResponseDTO;
import com.karthik.ProjectDemo.models.User;
import com.karthik.ProjectDemo.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService=userService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        Optional<User> userOptional=userService.getUser(id);
        if(userOptional==null){
            throw new Error("error retrivng user");
        }
        else{
            return ResponseEntity.status(200).body(userOptional.get());
        }
    }
    @PostMapping
    public ResponseEntity<ResponseDTO> postUser(@RequestBody RequestDTO requestDTO){
        User userdata;
        userdata=userService.postUser(requestDTO.getEmail(),requestDTO.getName(),requestDTO.getPassword());
        ResponseDTO user=new ResponseDTO();
        user.setEmail(userdata.getEmail());
        return ResponseEntity.status(200).body(user);
    }
}
