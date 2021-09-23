package com.bl.hotelreservation;

import org.junit.Test;;
import org.junit.Assert;
import java.time.LocalDate;
import java.time.Month;

public class HotelReservationTest {
    @Test
    public void GivenHotelDetails_WhenValuesEnteredCorrect_ShoulReturnTrue() {
        HotelReservationSystem hotelReservationService = new HotelReservationSystem();
        boolean isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110,90);
        Assert.assertEquals(true, isValidHotel1);
    }

    @Test
    public void GivenHotelDetails_WhenValuesEnteredIncorrect_ShoulReturnFalse() {
        HotelReservationSystem hotelReservationService = new HotelReservationSystem();
        boolean isValidHotel1 = hotelReservationService.addHotel(null, 3, 110,90);
        Assert.assertEquals(false, isValidHotel1);
    }

    @Test
    public void GivenHotelDetails_shouldReturnCheapestHotel() {

        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotel("Bridgewood", 4, 160,60);
        hotelReservation.addHotel("Ridgewood", 5, 220,150);
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        Hotel hotel = hotelReservation.getCheapestHotelOnWeekDay(startDate, endDate);
        Assert.assertEquals("Bridgewood", hotel.getHotelName());

    }

    @Test
    public void whenGivenHotelListShouldReturnProperHotelRegularCustomerCost() {
        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotel("Bridgewood", 4, 150,50);
        int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getWeekendRegularCustomerCost();
        Assert.assertEquals(50, hotelRegularCustomerCost);
        System.out.println(hotelRegularCustomerCost);
    }
}

