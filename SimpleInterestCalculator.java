package com.basics;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome To Simple Interest Calculator");
        System.out.println("Enter Amount !");
        int amount = in.nextInt();
        System.out.println("Enter Time, ( In Years )");
        int time = in.nextInt();
        System.out.println("Enter Rate Of Interest!");
        int interest = in.nextInt();

        double rateOfInterest = (( amount * interest * time ) / 100);
        System.out.println("Interest Amount Is: " + rateOfInterest);


    }
}
