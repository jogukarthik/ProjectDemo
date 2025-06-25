package com.karthik.ProjectDemo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Setter
@Getter
public class BaseClass {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
}
