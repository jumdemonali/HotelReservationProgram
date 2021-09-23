package com.bl.hotelreservation;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Optional;

public class HotelReservationSystem {
    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;
    Scanner sc=new Scanner(System.in);
    public boolean addHotel(String hotelName, int rating,double weekdayRegularCustomerCost,double weekendRateRegular) {
       hotel=new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRate(rating);
        hotel.setWeekdayRegularCustomerCost(weekdayRegularCustomerCost);
        hotel.setWeekendRegularCustomerCost(weekendRateRegular);
        hotelList.add(hotel);
        return true;
    }
    public void printHotelList() {
        for (Hotel list : hotelList) {
            System.out.println("\tHotel Details: " + list.getHotelName()
                    + "\t\tRates per regular Customer: " + "Week day Rate:" + list.getWeekdayRegularCustomerCost() + "$"
                    + "Weekend day Rate:" + list.getWeekendRegularCustomerCost() + "$");
        }
    }
    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }
    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getWeekdayRegularCustomerCost));
        return sortedHotelList.get();
    }

}


