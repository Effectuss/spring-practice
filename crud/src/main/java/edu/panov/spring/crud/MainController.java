package edu.panov.spring.crud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/getItems")
    public String getFirstView(Model items) {
        items.addAttribute("items", List.of("One", "Two", "Three"));
        return "items";
    }
}
