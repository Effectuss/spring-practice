package edu.panov.spring.crud.api;

import edu.panov.spring.crud.dao.employee.EmployeeDao;
import edu.panov.spring.crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    public final EmployeeDao employeeDao;

    @Autowired
    public MainController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/")
    public String getFirstView(Model items) {
        List<Employee> employeeList = employeeDao.findAll();

        items.addAttribute("employeeList", employeeList);

        return "all-employees";
    }

}
