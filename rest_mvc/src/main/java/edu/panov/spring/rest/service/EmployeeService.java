package edu.panov.spring.rest.service;

import edu.panov.spring.rest.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAllEmployees();

    void saveNewEmployee(Employee employee);

    Optional<Employee> getEmployee(int id);

    void deleteEmployee(int id);

}
