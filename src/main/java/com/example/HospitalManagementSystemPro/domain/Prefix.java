package com.example.HospitalManagementSystemPro.domain;

import lombok.Data;
import org.springframework.data.annotation.Transient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Prefix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  Integer id;

    private  String  prefix;

    @Transient
    private Integer gender;
}
