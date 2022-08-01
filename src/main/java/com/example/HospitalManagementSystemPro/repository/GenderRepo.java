package com.example.HospitalManagementSystemPro.repository;

import com.example.HospitalManagementSystemPro.domain.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<Gender,Integer> {
}
