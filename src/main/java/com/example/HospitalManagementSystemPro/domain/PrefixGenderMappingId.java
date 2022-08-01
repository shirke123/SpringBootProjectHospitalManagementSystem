package com.example.HospitalManagementSystemPro.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class PrefixGenderMappingId implements Serializable {

    @Column(name="prefix_id")
    private  Integer prefixId;

    @Column(name = "gender_id")
    private  Integer genderId;

}
