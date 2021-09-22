package com.bl.hotelreservation;
import java.util.HashMap;
import java.util.Map;
public class HotelReservationMain {
    Map<String, HotelReservation> hotelMap = new HashMap<String, HotelReservation>();
    HotelReservation hotel;
    public boolean addHotel(String hotelName,int rating)
        {
            hotel.setName(hotelName);
            hotel.setRate(rating);
            hotelMap.put(hotelName, hotel);
            return true;
        }
    }


