package edu.panov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MainController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model employee) {
        employee.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult bindingResult
    ) {

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }

//        employee.setName("Mr. " + employee.getName());
//        employee.setSalary(employee.getSalary() * 10);
    }

    // Простая реализация, берет из view ask-emp-details-view через ${param.namefield} и отображает на этом вью
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-details-view";
//    }

    // Добавления из поля формы ask-emp-details-view
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. ".concat(empName);
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

    // Альтернативный вариант передачи данных из формы
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
//
//        empName = "Mr. ".concat(empName);
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }
}
