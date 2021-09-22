package com.bl.hotelreservation;

public class HotelReservation {

        String name;
        int rate;

    public HotelReservation(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "HotelReservation{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
