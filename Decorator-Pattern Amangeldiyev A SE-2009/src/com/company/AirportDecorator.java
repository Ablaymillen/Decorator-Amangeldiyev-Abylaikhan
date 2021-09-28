package com.company;

public abstract class AirportDecorator implements Airport {
    protected Airport airportTicket;

    public AirportDecorator(Airport airportTicket){
        this.airportTicket = airportTicket;
    }

    @Override
    public void description() {
        airportTicket.description();
    }

    @Override
    public double ticketPrice() {
       return airportTicket.ticketPrice();
    }

}
