package com.company;

public class Economy implements Airport {


    @Override
    public void description() {
        System.out.println("Economy-class ticket.");
    }

    @Override
    public double ticketPrice() {
        return 80;
    }

}