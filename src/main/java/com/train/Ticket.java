package com.train;

public class Ticket {
    int ticketnumber;
    int roundtripticket;
    int onewayPrice = 1000;
    float roundtripDiscount = 0.9f;
    float roundtripPrice = 2000*roundtripDiscount;


    public Ticket(int ticketnumber, int roundtripticket) {
        this.ticketnumber = ticketnumber;
        this.roundtripticket = roundtripticket;
    }

    public void print(){
        System.out.println("Total tickets:" + ticketnumber + "\tRound-trip:" + roundtripticket
                + "\tTotal:" + getPrice());
    }

    public float getPrice(){
        return ((ticketnumber-roundtripticket)*onewayPrice + roundtripticket*roundtripPrice);
    }
}


