package com.company;

public class Main {

    public static void main(String[] args) {
        //round trip business class ticket
        Airport rtBusiness = new RoundTrip(new Business());
        //get description
        rtBusiness.description();
        //get ticket price for this option
        System.out.println(rtBusiness.ticketPrice());


        // economy class with seat choice option and no stop during flight ticket
        Airport economyNoStopSeat = new NoStopsDecorator(new SeatChoiceDecorator(new Economy()));
        //get description
        economyNoStopSeat.description();
        //get ticket price for this option
        System.out.println(economyNoStopSeat.ticketPrice());


        // all option on Business class ticket
        Airport allBusiness = new NoStopsDecorator(new RoundTrip(new SeatChoiceDecorator(new Business())));
        //get description
        allBusiness.description();
        //get price
        System.out.println(allBusiness.ticketPrice());

    }
}
