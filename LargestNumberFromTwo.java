package com.basics;

import java.util.Scanner;

public class LargestNumberFromTwo {
    public static void main(String[] args) {
        System.out.println("Let's Find Largest Number From 2 Numbers");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number");
        int firstNum = in.nextInt();

        System.out.println("Enter Second Number");
        int secondNum = in.nextInt();

        if (firstNum>secondNum){
            System.out.println("Largest Number is ( 01 ):- " + firstNum);
        }
        else{
            System.out.println("Largest Number is ( 02 ):- " + secondNum);
        }
    }
}
