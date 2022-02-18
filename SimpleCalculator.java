package com.basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome To Simple Calculator");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number!");
        int firstNum = in.nextInt();
        System.out.println("Enter First Number!");
        int secondNum = in.nextInt();

        System.out.println("Enter operation ( +,-,*,/ )");
        char operator = in.next().charAt(0);

        if (operator == '+'){
            System.out.println("Addition of " + firstNum + " & " + secondNum + " is: " +(firstNum+secondNum));
        }

        else if (operator == '-'){
            System.out.println("Subtraction of " + firstNum + " & " + secondNum + " is: " +(firstNum-secondNum));
        }

        else if (operator == '*'){
            System.out.println("Multiplication of " + firstNum + " & " + secondNum + " is: " +(firstNum*secondNum));
        }

        else if (operator == '/'){
            System.out.println("Division of " + firstNum + " & " + secondNum + " is: " +(firstNum/secondNum));
        }

        else{
            System.out.println("Wrong Operator Input...");
        }

    }
}
