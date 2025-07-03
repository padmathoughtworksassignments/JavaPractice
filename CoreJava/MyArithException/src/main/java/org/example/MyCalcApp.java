package org.example;

import java.util.Scanner;

public class MyCalcApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number (greater than 0) : ");
        int in = sc.nextInt();

        Calculator cal = new Calculator();
        System.out.println(cal.calculatePower2(in));

    }
}