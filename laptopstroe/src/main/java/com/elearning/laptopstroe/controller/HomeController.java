package com.elearning.laptopstroe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Laptop Store Home");
        model.addAttribute("message", "Welcome to the Laptop Store!");
        return "home";
    }
}
