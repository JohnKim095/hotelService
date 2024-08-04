package com.pennstate.kimmyeonghwan.hotelServiceSystem.service;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.dao.UserDAO;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private final UserDAO userDAO;//this set is equal to the method bottom: call the bean

    public UserService(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    public List<User> getUsers(){
        List<User> users = userDAO.getUsers();
        return users;
    }
}
