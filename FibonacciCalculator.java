package com.basics;

import java.util.Scanner;

public class FibonacciCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci calculator");

        System.out.println("Enter the Nth Number To calculate Fibonacci Number!");
        int nthNumber = in.nextInt();

        int fiboCalculate = 0;
        int start = 0;
        int temp = 1;
        int sum =0;
        int count = 1;

        while(count <= nthNumber){
            start = temp;
            temp = sum;
            sum = start + temp;
            fiboCalculate +=sum;

            count++;

        }

        System.out.println("nth Fibonacci Number Is: " + sum);
        System.out.println("Sum till Nth Fibonacci Number Is: " + fiboCalculate);



    }
}
