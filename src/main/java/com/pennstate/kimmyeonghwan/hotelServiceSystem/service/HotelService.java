package com.pennstate.kimmyeonghwan.hotelServiceSystem.service;

import com.pennstate.kimmyeonghwan.hotelServiceSystem.dao.HotelDAO;
import com.pennstate.kimmyeonghwan.hotelServiceSystem.domain.Hotel;

import java.util.List;

public class HotelService {

    private HotelDAO hotelDAO; //from DAO, get HotelDAO field

    public HotelService(HotelDAO hotelDAO){
        this.hotelDAO = hotelDAO; //get hotelDAO as parameter and save it
    }

    public List<Hotel> getHotels(){
        List<Hotel> hotels = hotelDAO.getHotels();
        return hotels;
    }
}