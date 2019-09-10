package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of tickets:");
        int ticketnumber = scan.nextInt();
        System.out.println("How many round-trip tickets:");
        int roundtripticket = scan.nextInt();

        Ticket tck = new Ticket(ticketnumber, roundtripticket);
        tck.print();
    }
}
