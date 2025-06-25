package com.karthik.ProjectDemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karthik.ProjectDemo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

   
    
}
