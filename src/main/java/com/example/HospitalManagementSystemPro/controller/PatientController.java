package com.example.HospitalManagementSystemPro.controller;

import com.example.HospitalManagementSystemPro.domain.*;
import com.example.HospitalManagementSystemPro.repository.GenderRepo;
import com.example.HospitalManagementSystemPro.repository.PatientRepository;
import com.example.HospitalManagementSystemPro.repository.PrefixGenderMappingRepo;
import com.example.HospitalManagementSystemPro.repository.PrefixRepo;
import net.bytebuddy.build.ToStringPlugin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PrefixRepo prefixRepo;

    @Autowired
    private GenderRepo genderRepo;

    @Autowired
    private PrefixGenderMappingRepo prefixGenderMappingRepo;


    @PostMapping("saveGender")
    public String saveGender(@RequestBody Gender gender) {
        genderRepo.save(gender);
        return "gender is saved";
    }

    @PostMapping("savePrefix")
    public String saveGPrefix(@RequestBody Prefix prefix){

        Prefix prefix1 = prefixRepo.save(prefix);
        PrefixGenderMappingId prefixGenderMappingId = new PrefixGenderMappingId();
        prefixGenderMappingId.setPrefixId(prefix1.getId());
        prefixGenderMappingId.setGenderId(prefix1.getGender());

        PrefixGenderMapping prefixGenderMapping = new PrefixGenderMapping();
        prefixGenderMapping.setPrefixGenderMappingId(prefixGenderMappingId);
        prefixGenderMappingRepo.save(prefixGenderMapping);
        return "prefix saved";
    }

    @PostMapping("savePatient")
    public String savePatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
        return "saved Patient";
    }


    @GetMapping("getAll")
    public List<Patient> list(){
        return patientRepository.findAll();
    }
}

