package com.asapyuca.fleetapp.repositories;

import com.asapyuca.fleetapp.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
