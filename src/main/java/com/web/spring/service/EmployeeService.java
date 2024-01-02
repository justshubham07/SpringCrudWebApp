package com.web.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.spring.model.Employee;


public interface EmployeeService {

	List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(Long id);
}
