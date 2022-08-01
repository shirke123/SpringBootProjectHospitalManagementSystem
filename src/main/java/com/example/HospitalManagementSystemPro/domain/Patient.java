package com.example.HospitalManagementSystemPro.domain;


import com.example.HospitalManagementSystemPro.controller.PatientController;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@Data
public class Patient  {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private  Integer id;
    private String firstName;
    private String secondName;
    private String address;
    private LocalDate dob;
    private  String gender;
    private String mobileNo;
    private  String prefix;

}
