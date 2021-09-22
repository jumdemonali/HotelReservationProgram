package com.bl.hotelreservation;

import org.junit.Test;;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationTest {
    @Test
    public void GivenHotelDetails_WhenValuesEnteredCorrect_ShoulReturnTrue() {
        HotelReservationSystem hotelReservationService = new HotelReservationSystem();
        boolean isValidHotel1 = hotelReservationService.addHotel("Lakewood", 3, 110, 90);
        Assert.assertEquals(true,isValidHotel1);
    }
    @Test
    public void GivenHotelDetails_WhenValuesEnteredIncorrect_ShoulReturnFalse() {
        HotelReservationSystem hotelReservationService = new HotelReservationSystem();
        boolean isValidHotel1 = hotelReservationService.addHotel(null,3,110,90);
        Assert.assertEquals(false,isValidHotel1);
    }
    @Test
    public void GivenHotelDetails_shouldReturnCheapestHotel(){

        HotelReservationSystem hotelReservation = new HotelReservationSystem();
        hotelReservation.addHotel("Bridgewood", 4, 160,110);
        hotelReservation.addHotel("Ridgewood", 5, 220,40);
        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);
        Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        Assert.assertEquals("Bridgewood", hotel.getHotelName());

    }
}
