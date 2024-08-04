package com.pennstate.kimmyeonghwan.hotelServiceSystem.controller;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.domain.Hotel;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.service.HotelService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller //this annotation tells that this class is the "controller" similar to the "@Configuration" annotation
//Controller: takes request from user and return response
//have methods that can process the http request
public class HotelsController {

    @Autowired
    private HotelService hotelService;
    //declare hotelService to take "@Bean from config class"
    //why it uses HotelService hotelService to declare?

//    public HotelsController(HotelService hotelService){
//        this.hotelService=hotelService;
//    }//put the "@Bean: HotelsController from ApplicationConfig class" into the "hotelService" which is declared above
//    //
    @GetMapping("/hotels") //when http request from "/hotels" port(end point), it runs
    public String getHotels(HttpServletRequest request, HttpServletResponse response) { //generate parameter to process request and response from http
        HttpSession session = request.getSession(); //get current session, "session: temporary storage for users"
        List<Hotel> hotelList = hotelService.getHotels(); //by using hotelService(from HotelService class), get hotel list
        //list of hotels is in the session, so you can retrieve it later elsewhere in the program
        session.setAttribute("ListOfHotels", hotelList); //save the list of hotel in name of ListOfHotel
        //because of that, other requests can also access to this data by using the session
        return "hotels"; //return string "hotels"

    }
    @PostMapping("/hotels")
    public String postHotels() {
        return "hotels";
    }
}

