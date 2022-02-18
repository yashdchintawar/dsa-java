package com.basics;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to inr To Usd Converter Program");

        System.out.println("Enter Inr Value: ");
        float inr = in.nextFloat();

        float usd = ( inr / 75 );

        System.out.println(inr + "INR Is " + usd + "USD");
    }

}
