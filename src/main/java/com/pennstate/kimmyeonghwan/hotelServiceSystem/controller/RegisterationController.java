package com.pennstate.kimmyeonghwan.hotelServiceSystem.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class RegisterationController {


    @GetMapping("/register")
    public String getRegistrationView(HttpServletRequest request, HttpServletResponse response){
        return "register";
    }

    @PostMapping("/register")
    public String createRegistration(HttpServletRequest request, HttpServletResponse response){



        return "login";
    }
}
