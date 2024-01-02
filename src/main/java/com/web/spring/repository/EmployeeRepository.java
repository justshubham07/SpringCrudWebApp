package com.web.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.spring.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
