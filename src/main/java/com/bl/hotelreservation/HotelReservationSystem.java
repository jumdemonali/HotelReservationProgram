package com.bl.hotelreservation;
import java.util.ArrayList;
public class HotelReservationSystem {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;
    public boolean addHotel(String hotelName, int rating,double weekdayRegularCustomerCost,double weekendRateRegular) {
       hotel=new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRate(rating);
        hotel.setWeekdayRegularCustomerCost(weekdayRegularCustomerCost);
        hotel.setWeekendRegularCustomerCost(weekendRateRegular);
        hotelList.add(hotel);
        return true;
    }
}


