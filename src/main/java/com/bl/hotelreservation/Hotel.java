package com.bl.hotelreservation;

public class Hotel {

    String hotelName;
    int rate;
    double weekdayRegularCustomerCost;
    double weekendRegularCustomerCost;
    public Hotel(){}
    public Hotel(String hotelName, int rate, double weekdayRegularCustomerCost,double weekendRegularCustomerCost) {
        this.hotelName = hotelName;
        this.rate = rate;
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getWeekdayRegularCustomerCost() {
        return weekdayRegularCustomerCost;
    }

    public void setWeekdayRegularCustomerCost(double weekdayRegularCustomerCost) {
        this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
    }

    public double getWeekendRegularCustomerCost() {
        return weekendRegularCustomerCost;
    }

    public void setWeekendRegularCustomerCost(double weekendRegularCustomerCost) {
        this.weekendRegularCustomerCost = weekendRegularCustomerCost;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", rate=" + rate +
                ", weekdayRegularCustomerCost=" + weekdayRegularCustomerCost +
                ", weekendRegularCustomerCost=" + weekendRegularCustomerCost +
                '}';
    }
}