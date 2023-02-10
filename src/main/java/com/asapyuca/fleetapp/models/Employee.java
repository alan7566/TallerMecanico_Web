package com.asapyuca.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Employee extends Person{
    @ManyToOne
    @JoinColumn(name = "employeeTypeId", insertable = false, updatable = false)
    private EmployeeType employeeType;
    private int employeeTypeId;
    private String username;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "jobTitleId", insertable = false, updatable = false)
    private JobTitle jobTitle;
    private int jobTitleId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;
}
