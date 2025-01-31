package edu.panov.spring.crud.api;

import edu.panov.spring.crud.dao.employee.EmployeeDao;
import edu.panov.spring.crud.entity.Employee;
import edu.panov.spring.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    public final EmployeeService employeeService;

    @Autowired
    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String getFirstView(Model items) {
        List<Employee> employeeList = employeeService.findAllEmployees();

        items.addAttribute("employeeList", employeeList);

        return "all-employees";
    }

}
