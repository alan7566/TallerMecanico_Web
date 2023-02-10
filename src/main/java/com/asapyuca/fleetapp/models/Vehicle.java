package com.asapyuca.fleetapp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "vehicleTypeId", insertable = false, updatable = false)
    private VehicleType vehicleType;
    private int vehicleTypeId;
    private String vehicleNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registrationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisitionDate;
    private String description;
    @ManyToOne
    @JoinColumn(name = "vehicleMakeId", insertable = false, updatable = false)
    private VehicleMake vehicleMake;
    private int vehicleMakeId;

    private String power;
    private String fuelCapacity;
    @ManyToOne
    @JoinColumn(name = "vehicleStatusId", insertable = false, updatable = false)
    private VehicleStatus status;
    private int vehicleStatusId;
    private String netWeight;

    @ManyToOne
    @JoinColumn(name = "vehicleModelId", insertable = false, updatable = false)
    private VehicleModel vehicleModel;
    private int vehicleModelId;

    @ManyToOne
    @JoinColumn(name = "employeeId", insertable = false, updatable = false)
    private Employee inCharge;
    private int employeeId;
    @ManyToOne
    @JoinColumn(name = "locationId", insertable = false, updatable = false)
    private Location currentLocation;
    private int locationId;
    private String remarks;

}
