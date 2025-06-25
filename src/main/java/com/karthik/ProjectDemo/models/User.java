package com.karthik.ProjectDemo.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name="User")
@Getter
@Setter
public class User extends BaseClass{
    private String name;
    private String email;
    private String password;
}
