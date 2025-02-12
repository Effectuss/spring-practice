package edu.panov.spring.crud.api;

import edu.panov.spring.crud.dao.employee.EmployeeDao;
import edu.panov.spring.crud.entity.Employee;
import edu.panov.spring.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    public final EmployeeService employeeService;

    @Autowired
    public MainController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String getFirstView(Model model) {
        List<Employee> employeeList = employeeService.findAllEmployees();

        model.addAttribute("employeeList", employeeList);

        return "all-employees";
    }

    @GetMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();

        model.addAttribute("employee", employee);

        return "add-new-employee";
    }

    @RequestMapping("/saveNewEmployee")
    public String saveNewEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.saveNewEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/updateEmployeeInfo")
    public String updateEmployeeInfo(@RequestParam("empId") int id, Model model) {
        Employee employee = employeeService.getEmployee(id).orElse(new Employee());

        model.addAttribute("employee", employee);

        return "add-new-employee";
    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }


}
