package com.company;


import java.util.List;
import java.util.Scanner;

public class Student {
    String firstName;
    String lastName;
    int age;
    String admissionNumber;

    void getData(String _firstName, String _lastName, int _age, String _admNo) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
        this.admissionNumber = _admNo;
    }

    void displyData() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Student Age: " + age);
        System.out.println("Admission Number: " + admissionNumber);
    }
}
///////USING CONSTRACTORS ////
class CompaireNumbers {
    int a;
    int b;
    public CompaireNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int getGreater() {
        return a > b ? a : b;

    }
}

class Product{
    String name;
    double price;
    int quantity;
    String serial_no;
    Product getDetails(Product _product, Scanner _input){
        System.out.print("Enter the product details\nName: ");
        _product.name = _input.next();
        System.out.print("Price: ");
        _product.price = _input.nextInt();
        System.out.print("Quantiry: ");
        _product.price = _input.nextInt();
        _product.serial_no = "S"+ String.valueOf(Math.random()).substring(2,8);
        displayDetials(_product);
        return  _product;
    }
    void displayDetials(Product _product){
        System.out.println("Id: "+_product.serial_no);
        System.out.println("Name: "+_product.name);
        System.out.println("Price: Kshs "+_product.price);
        System.out.println("Quantity: "+_product.quantity);
    }
}
