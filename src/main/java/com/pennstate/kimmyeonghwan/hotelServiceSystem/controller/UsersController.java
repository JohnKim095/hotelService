package com.pennstate.kimmyeonghwan.hotelServiceSystem.controller;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {

    private UserService userService;

    public UsersController(UserService userService){
        this.userService=userService;
    }

}
