package com.pennstate.kimmyeonghwan.hotelServiceSystem.dao;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.domain.User;
import org.springframework.beans.factory.annotation.Autowired;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class UserDAO {

    private static final String GET_USER_DATA = "Select * from users where id = :userId";
    //Get sql query, userId is the parameter

//    @Autowired //bring bean
//    private NamedParameterJdbcTemplate jdbcTemplate; //used to run query
    //by using @Autowired, it automatically add the put into Spring Context

//    public User getUser(String userID){ //method to get user information of the given "userID"
//        Map<String, Object> namedParameters = new HashMap<String, Object>(); //this saves the query parameter
//        namedParameters.put("userId", userID); // allocate the value of userID to userId parameter
//        return jdbcTemplate.queryForObject(GET_USER_DATA, namedParameters, (rs, rowNum)->{
//            //after running the query, this returns the result into a single User object
//            //mapping resultset to User
//            return populateUser(rs);
//        });
//    }

    public User populateUser(ResultSet rs) throws SQLException {
        //convert resultset to User object

        User user = new User();
        //create new User Object

        user.setName(rs.getString("id"));
        //from the resultset, bring the value of id colomn and save it into the "name" field of User object
        return user;
    }
    public List<User> getUsers(){
        return null;
    }
    //get all the users
}
