package com.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashokit.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
