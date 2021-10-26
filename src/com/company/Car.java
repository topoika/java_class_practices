package com.company;

public class Car {
    String color;
    String model;
    String make;
    int yearOfManufacture;
    double price;
    void getData(String _color,String _make,String _model,int _yom,double _price){
        this.color = _color;
        this.make = _make;
        this.model = _model;
        this.yearOfManufacture = _yom;
        this.price = _price;
    }
    void displayData(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Yeah of manufacture: " + yearOfManufacture);
        System.out.println("Price: " + price);
    }
}
