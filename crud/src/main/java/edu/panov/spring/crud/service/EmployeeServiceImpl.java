package edu.panov.spring.crud.service;

import edu.panov.spring.crud.dao.employee.EmployeeDao;
import edu.panov.spring.crud.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    @Transactional
    public List<Employee> findAllEmployees() {
        return employeeDao.findAll();
    }

    @Override
    @Transactional
    public void saveNewEmployee(Employee employee) {
        employeeDao.add(employee);
    }

    @Override
    @Transactional
    public Optional<Employee> getEmployee(int id) {
        return employeeDao.get(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDao.delete(id);
    }
}
