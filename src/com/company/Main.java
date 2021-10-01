package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        DataTypesFunctions _functions =new DataTypesFunctions();
        ControllStructures _controlStructures = new ControllStructures();
        MiniProject _miniProject = new MiniProject();

        Scanner _newScanner = new Scanner(System.in);
        _functions.getdulicates();
//        _miniProject.mainfuntion();
//        System.out.print("Enter the marks for this unit: \n");
//        int a;
//        a = _newScanner.nextInt();
//        _controlStructures.getGrade(a);
    }
}

class DataTypesFunctions{


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

    void usingLoops(){
        for(int a = 0;a<5;a +=1){
            System.out.println(a);
        }
    }
    void userContitionalOperator(){
        int a = 3;
        int b=5;
        if(!(a>b)){
            System.out.println("A is greater thab B");
        }else{
            System.out.println("A is not greater than B");
        }
    }


    void getdulicates(){
        Scanner myInput = new Scanner(System.in);
        String letters;
        System.out.println("enter the letters");
        letters = myInput.next();
        int n = letters.length();
        int y=0;
        for (int i = 0 ; i < n ; i++) {
            for (int j=i+1;j<n;j++ ){
                if (letters.charAt(i ) == letters.charAt(j )) {
                    y=y+1;
                }
            }
        }
        if(y>0){
            System.out.println("Have Duplicates");
        }
        else {
            System.out.println("unique String");
        }
    }

}

class  ControllStructures{
    void usingIfStatements(){
        int year_of_study = 2;
        double discount;
        if(year_of_study ==1){
            discount = 0.05*50000;
            System.out.println("The discount is KSH " + discount);
        }else {
            System.out.println("You're not eligible for a discout");
        }
    }
    void getValue(int amount){
        if(amount>=200){
            System.out.println("High");
        }else {
            System.out.println("Low");
        }
    }
    void getGrade(int marks){
        if(marks>=90&& !(marks >100)){
            System.out.println("Grade : A");
        }else  if(marks>=70 && marks<90 ){
            System.out.println("Grade : A-");
        }else  if(marks>=50 && marks<70 ){
            System.out.println("Grade : B+");
        }else  if(marks>=40 && marks<50 ){
            System.out.println("Grade : B+");
        }else  if(marks<40 ){
            System.out.println("Grade : F");
        }else {
            System.out.println("Invalid marks");
        }
    }
}