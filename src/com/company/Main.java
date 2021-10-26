package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        /////OBJECT INIT////
//        DataTypesFunctions _functions = new DataTypesFunctions();
//        ControllStructures _controlStructures = new ControllStructures();
//        MiniProject _miniProject = new MiniProject();
//        WeekArrays _arrays = new WeekArrays();
//        UsingMethods _methods = new UsingMethods();
//        Scanner _newScanner = new Scanner(System.in);


        ////OPERATION///
        Student _studentA = new Student();
        Car _car1= new Car();
        _car1.getData("Red","Toyote","Vanguard",2013,1600000.00);
        _car1.displayData();
    }
}

class DataTypesFunctions {
    Scanner _myInput = new Scanner(System.in);

    void getCapitalizedWord(String name) {
        char firstLetter;
        firstLetter = name.toUpperCase().charAt(0);
        name = name.substring(1).toLowerCase();
        System.out.print(firstLetter + name + "\n");
    }

    void checkPassword() {
        String _systemPassword = "123456";
        String one = "0";
        String _userPassword;
        int result = Integer.parseInt(_systemPassword) * 2;
        double _mine = Double.parseDouble(_systemPassword);
        System.out.print("Enter your password\n" + getBool(one));
        _userPassword = _myInput.next();
        if (_systemPassword.compareTo(_userPassword) == 0) {
            System.out.print("Correct password");
        } else {
            System.out.print(result + "\n");
            System.out.print("Incorrect password\n");
            System.out.print("Hint: The correct password has " + _systemPassword.length() + " number os characters\n and the starting letter is " + _systemPassword.charAt(0));
        }
    }

    Boolean getBool(String _string) {
        String _true = "1";
        if (_true.compareTo(_string) == 0) {
            return true;
        } else {
            return false;
        }
    }

    void checkValue(int a) {
        int c = a % 13;
        System.out.println(Math.random());
        /* System.out.print("The modulo is "+c); */
        if (c == 0) {
            System.out.print(a + " is divisible by 26");
        } else {
            System.out.print(a + " isn't divisible by 13");
        }
    }

    void usingForLoops() {
        for (int a = 9; a <= 100; a += 9) {
            if (a == 54) {
                continue;
            }
            System.out.println(a);
        }
    }

    void dataStructuresAndAll() {
        int[] a = {4, 2, 5, 4};
        for (int i = 0; i <= a.length; i++) {
            for (int j = i++; j <= a.length - 1; j++) {
                if (a[i] + a[j] == 8) {
                    System.out.print("I have them");
                } else {
                    System.out.print("No can do");
                }
                System.out.print(a[j]);
            }
            System.out.print(a[i]);
        }
    }

    void usingWhileLoops() {
        int i = 20;
        while (i <= 50) {
            System.out.println(i);
            i += 2;
        }
    }

    void userContitionalOperator() {
        int a = 3;
        int b = 5;
        if (!(a > b)) {
            System.out.println("A is greater thab B");
        } else {
            System.out.println("A is not greater than B");
        }
    }

    void getdulicates() {
        Scanner myInput = new Scanner(System.in);
        String letters;
        System.out.println("enter the letters");
        letters = myInput.next();
        int n = letters.length();
        int y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (letters.charAt(i) == letters.charAt(j)) {
                    y = y + 1;
                }
            }
        }
        if (y > 0) {
            System.out.println("Have Duplicates");
        } else {
            System.out.println("unique String");
        }
    }
}
class ControllStructures {
    void usingIfStatements() {
        int year_of_study = 2;
        double discount;
        if (year_of_study == 1) {
            discount = 0.05 * 50000;
            System.out.println("The discount is KSH " + discount);
        } else {
            System.out.println("You're not eligible for a discout");
        }
    }

    void getValue(int amount) {
        if (amount >= 200) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
    }

    void getGrade(int marks) {
        if (marks >= 90 && !(marks > 100)) {
            System.out.println("Grade : A");
        } else if (marks >= 70 && marks < 90) {
            System.out.println("Grade : A-");
        } else if (marks >= 50 && marks < 70) {
            System.out.println("Grade : B+");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("Grade : B+");
        } else if (marks < 40) {
            System.out.println("Grade : F");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
class WeekArrays {
    Scanner _scanner = new Scanner(System.in);

    void getNumber() {
        int a;
        System.out.println("Enter the number of products");
        a = _scanner.nextInt();
        String[] _proucts = new String[a];
        for (int i = 0; i < _proucts.length; i++) {
            System.out.print("Enter the name of product number " + (i + 1) + " ");
            _proucts[i] = _scanner.next();
        }
        for (int i = 0; i < _proucts.length; i++) {
            System.out.println(_proucts[i]);
        }
    }

    void getScores() {
        int classSize;
        System.out.println("Enter the number of student");
        classSize = _scanner.nextInt();

        int[] _scores = new int[classSize];
        int sum = 0;
        System.out.println("Enter the scores for " + classSize + " Students");
        for (int i = 0; i < _scores.length; i++) {
            System.out.print("Enter the score for student number " + (i + 1) + " ");
            _scores[i] = _scanner.nextInt();
            sum = sum + _scores[i];
        }
        double avarage = (double) sum / classSize;
        int max = _scores[0];
        int min = _scores[0];
        for (int i = 0; i < classSize; i++) {
            if (_scores[i] > max) {
                max = _scores[i];
            }
            if (_scores[i] < min) {
                min = _scores[i];
            }
        }
        System.out.println("Avarage = " + avarage);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    void getPattern() {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        rows = sc.nextInt();
        for (i = 0; i <= rows - 1; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
//        for (i = rows - 1; i >= 0; i--) {
//            for (j = 0; j <= i - 1; j++) {
//                System.out.print("*" + " ");
//            }
//            System.out.println("");
//        }
    }
}


/*Define your own class called CAR it should recieve a car's model, color, year of manufacture, prices of the car,
define methods to recieve the data and diplay the data*/