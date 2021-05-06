package com.sabindangi.employeemanagementsystembackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sabindangi.employeemanagementsystembackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
