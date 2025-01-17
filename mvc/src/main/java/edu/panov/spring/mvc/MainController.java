package edu.panov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
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
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {

        empName = "Mr. ".concat(empName);
        model.addAttribute("nameAttribute", empName);

        return "show-emp-details-view";
    }
}
