package com.example.HospitalManagementSystemPro.repository;

import com.example.HospitalManagementSystemPro.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{


}
