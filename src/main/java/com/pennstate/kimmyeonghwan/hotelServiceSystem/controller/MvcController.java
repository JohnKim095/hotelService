package com.pennstate.kimmyeonghwan.hotelServiceSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MvcController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }//spring security*

//    @PostMapping("/login")
//    public String postLogin() {
//        return "menu";
//      }//"no need" by Anna Zapolska

    @GetMapping("/register")
    public String getRegister() {
        return "register";
    }@PostMapping("/register")
    public String postRegister() {
        return "register";
    }

    @GetMapping("/menu")
    public String getMenu() {
        return "menu";
    }@PostMapping("/menu")
    public String postMenu() {
        return "menu";
    }

}