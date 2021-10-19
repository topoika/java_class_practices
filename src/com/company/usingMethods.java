package com.company;

import java.util.Scanner;

class UsingMethods {
    int getSum(int a,int b){
        return (a+b);
    }
    String getSum(String name){
        return ("Hello " + name);
    }

    boolean checkPassword(String userPassword){
        String _systemPassword = "123456";
        if(_systemPassword.compareTo(userPassword) == 0){
            System.out.print("Correct password\n");
            return true;
        }else {
            System.out.print("Incorrect password\n");
            return false;
        }
    }


}
