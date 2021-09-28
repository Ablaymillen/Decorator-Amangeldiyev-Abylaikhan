package com.company;

public class RoundTrip extends AirportDecorator{

    public RoundTrip(Airport airportTicket) {
        super(airportTicket);
    }

    @Override
    public void description(){
        airportTicket.description();
        System.out.println("Round trip option.");

    }

    @Override
    public double ticketPrice(){
        return airportTicket.ticketPrice() + 0.7*airportTicket.ticketPrice();
    }

}
