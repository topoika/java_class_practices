package com.company;

import java.util.Scanner;

class UsingMethods {
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
