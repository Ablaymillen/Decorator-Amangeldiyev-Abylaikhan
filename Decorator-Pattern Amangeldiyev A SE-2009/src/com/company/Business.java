package com.company;

public class Business implements Airport {


    @Override
    public void description() {
        System.out.println("Business-class ticket.");
    }

    @Override
    public double ticketPrice() {
        return 250;
    }
}
