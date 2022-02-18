package com.basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to check Even Or Odd");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("Number:- " + num + " is Even ");
        }
        else {
            System.out.println("Number:- " + num + " is Odd ");

        }

    }

}
