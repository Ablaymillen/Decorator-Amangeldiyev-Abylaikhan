package com.company;

public class NoStopsDecorator extends AirportDecorator{
    public NoStopsDecorator(Airport airportTicket) {
        super(airportTicket);
    }

    @Override
    public void description() {
        airportTicket.description();
        System.out.println("No stops during flight");
    }

    @Override
    public double ticketPrice() {
        return airportTicket.ticketPrice() + 0.3* airportTicket.ticketPrice();
    }
}
