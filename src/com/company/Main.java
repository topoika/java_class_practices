package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
   Functions _functions =new Functions();

        Scanner _newScanner = new Scanner(System.in);

        System.out.print("Enter the number: \n");
    int a;
    a = _newScanner.nextInt();
    _functions.checkValue(a);
    }
}

class Functions{
    Scanner _myInput = new Scanner(System.in);
    void getCapitalizedWord(String name){
        char firstLetter;
        firstLetter = name.toUpperCase().charAt(0);
        name = name.substring(1).toLowerCase();
        System.out.print(firstLetter+name+"\n");
    }
    void checkPassword(){
        String _systemPassword = "123456";
        String one = "0";
        String _userPassword;
        int result = Integer.parseInt(_systemPassword)*2;
        double _mine = Double.parseDouble(_systemPassword);
        System.out.print("Enter your password\n" + getBool(one));
        _userPassword = _myInput.next();
        if(_systemPassword.compareTo(_userPassword) == 0){
            System.out.print("Correct password");
        }else {
            System.out.print(result + "\n");
            System.out.print("Incorrect password\n");
            System.out.print("Hint: The correct password has " + _systemPassword.length() + " number os characters\n and the starting letter is " + _systemPassword.charAt(0));
        }
    }

    Boolean getBool(String _string){
        String _true = "1";
       if(_true.compareTo(_string) == 0){
           return  true;
       }else {
           return  false;
       }
    }

    void checkValue(int a){
        int c = a%13;
        System.out.println(  Math.random());
        /* System.out.print("The modulo is "+c); */
        if(c==0){
            System.out.print(a + " is divisible by 26");
        }else {
            System.out.print(a +" isn't divisible by 13");
        }
    }



}

