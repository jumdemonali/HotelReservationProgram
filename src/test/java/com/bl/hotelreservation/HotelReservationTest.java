package com.bl.hotelreservation;

import org.junit.Test;;
import org.junit.Assert;
public class HotelReservationTest {
    @Test
    public void givenHotelDetails_WhenValuesEnteredCorrect_ShoulReturnTrue() {
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

}
