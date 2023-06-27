package com.example.servingwebcontent;

import com.example.servingwebcontent.entity.User;
import com.example.servingwebcontent.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name ="name", required = false, defaultValue = "World")String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
    @GetMapping
    public String mainPage(Model model){
        Iterable<User> users = userRepo.findAll();
        model.addAttribute("user", users );
        return "mainPage";
    }
    @PostMapping
    public String add(@RequestParam String name, @RequestParam String surname, @RequestParam String email, @RequestParam String phoneNumber, Model model ){
        new
    }
}

