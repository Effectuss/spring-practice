package edu.panov.spring.crud.service;

import edu.panov.spring.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();
}
