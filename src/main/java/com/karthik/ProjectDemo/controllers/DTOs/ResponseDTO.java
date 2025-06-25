package com.karthik.ProjectDemo.controllers.DTOs;

import com.karthik.ProjectDemo.models.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {
      private String name;
    private String email;
    private ResponseDTO from(User user){
        ResponseDTO responseDTO=new ResponseDTO();
        responseDTO.setEmail(user.getEmail());
        responseDTO.setName(user.getName());
        return responseDTO;
    }
}
