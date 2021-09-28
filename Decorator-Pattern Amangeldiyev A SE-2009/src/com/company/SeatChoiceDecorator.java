package com.company;

public class SeatChoiceDecorator extends AirportDecorator{

    public SeatChoiceDecorator(Airport airportTicket) {
        super(airportTicket);
    }

    @Override
    public void description() {
        airportTicket.description();
        System.out.println("Seat choice option.");
    }

    @Override
    public double ticketPrice() {
        return airportTicket.ticketPrice() + 0.15*airportTicket.ticketPrice();
    }
}
