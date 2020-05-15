package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/employeeform")
    //Adding a new instance of the Employee class to the model
    public String loadFormPage(Model model) {
       model.addAttribute("employee1", new Employee());
       return "employeeform";

    }

    @PostMapping("/employeeform")
    public String loadFromPage(@ModelAttribute Employee employee, Model model){
        //String temp=employee.getFname().toUpperCase();
       // employee.setFname(temp);
        model.addAttribute("employee", employee);
        return "confirmemployee";

    }
}
