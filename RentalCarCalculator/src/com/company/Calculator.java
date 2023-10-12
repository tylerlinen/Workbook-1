package com.company;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter pickup date");
        String pickupDate = myObj.nextLine();

        System.out.println("Number of days for rental");
        int rentalDays = myObj.nextInt();

        System.out.println("Do you want an electronic toll tag for $3.95 a day? ");
        boolean tag = myObj.nextBoolean();

        System.out.println("Do you want gps $2.95 day?");
        boolean gps = myObj.nextBoolean();

        System.out.println("Do you want roadside assistance at $3.95 a day?");
        boolean assistance = myObj.nextBoolean();

        System.out.println("Enter your current age");
        int currentAge = myObj.nextInt();

        //Car rental
        double rental = 29.99 * rentalDays;
        System.out.println("Basic Car Rental:" + rental);

        //Surcharge
        double surcharge = 0;
        if (currentAge < 25) {
            surcharge = rental * .3;
            System.out.println("Underage Driver Surcharge:" + surcharge);
        } else{
            System.out.println(0);
        }
        //Options Cost


        //Total Cost
        double total = rental + surcharge;
        System.out.println("total cost:" + total);





    }
}

