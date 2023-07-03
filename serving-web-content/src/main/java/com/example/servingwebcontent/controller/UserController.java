package com.example.servingwebcontent.controller;

import com.example.servingwebcontent.entity.User;
import com.example.servingwebcontent.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String greeting(Model model){
        return "greeting";
    }
    @GetMapping("/main")
    public String mainPage(Map<String, Object> model){
        Iterable<User> users = userRepo.findAll();
        model.put("users", users);
        return "main";
    }
    @PostMapping("/main")
    public String add(@RequestParam String name, @RequestParam String surname, @RequestParam String email, @RequestParam String phoneNumber, Map<String, Object> model ){
        User user = new User(name, surname, email, phoneNumber);

        Iterable<User> users = userRepo.findAll();
        model.put("users", users);

        userRepo.save(user);
        return "main";
    }


}

