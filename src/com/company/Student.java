package com.company;


import java.util.Scanner;

public class Student {

    String firstName;
    String lastName;
    int age;
    String admissionNumber;

    void getData(String _firstName,String _lastName,int _age,String _admNo){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
        this.admissionNumber = _admNo;
    }
    void displyData(){
        System.out.println("First Name: "+firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Student age: " + age);
        System.out.println("Admission number: " + admissionNumber);
    }
}
