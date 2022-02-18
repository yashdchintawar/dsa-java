package com.basics;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        String name = in.next();

        System.out.println("Hello " + name + " Welcome To The Yash Chintawar World");
    }
}
