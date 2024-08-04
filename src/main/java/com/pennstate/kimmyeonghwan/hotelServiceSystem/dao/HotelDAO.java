package com.pennstate.kimmyeonghwan.hotelServiceSystem.dao;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.domain.Hotel;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelDAO {    //get the query sentence
    private static final String GET_USER_DATA = "Select * from hotels where id = :hotelId";

//    @Autowired //bring bean
    //private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Hotel> getHotels(){ //this method returns the hotel list
        List<Hotel> hotels = new ArrayList<Hotel>();
        return hotels;
    }

}