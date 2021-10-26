package com.company;

import java.util.Scanner;

class UsingMethods {
    Scanner _input = new Scanner(System.in);

    int getSum(int a, int b) {
        return (a + b);
    }

    String getSum(String name) {
        return ("Hello " + name);
    }

    boolean authentication(int userPassword) {
        int _systemPassword = 123456;
        if (userPassword == _systemPassword) {
            System.out.println("Correct password");
            return true;
        } else {
            System.out.println("Incorrect password");
            return false;
        }
    }

    /////calculate the amount of interest on a loaned amount using interest rate of 13%////
    void mainFution() {
        double amount;
        int duration;
        String name;
        System.out.print("Enter your name ");
        name = _input.next();
        System.out.print("Enter the amount to borrow ");
        amount = _input.nextDouble();
        System.out.print("Enter the duration you'll need the amount ");
        duration = _input.nextInt();
        System.out.println("NAME: " + name);
        System.out.println("AMOUNT BORROWED: " + amount);
        System.out.println("DURATION: " + duration + " years");
        System.out.println("======================");
        System.out.println("INTEREST: " + getInterest((double) amount, duration));
        System.out.println("TOTAL: " + (getInterest((double) amount, duration) + amount));
    }
    double getInterest(double amount, int duration) {
        return (amount * 13 * duration) / 100;
    }


    ///////DISCUSSION//
    int getArea(int side) {
        return side * side;
    }

    int getArea(int length, int width) {
        return length * width;
    }


    int doubleNumber(int num) {
        return num * 2;
    }

    boolean checkNumber(int num) {
        if ((num % 2) == 0) {
            System.out.println("This number is even");
            return true;
        } else {
            System.out.println("This number is odd");
            return false;
        }
    }


}
