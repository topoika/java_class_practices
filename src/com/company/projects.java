package com.company;

import java.util.Scanner;

class MiniProject{
    Employee _employee = new Employee();
    Scanner _myScanner = new Scanner(System.in);
    void mainfuntion(){
        getDetails();
    }
    void getDetails(){
        System.out.println("Enter your name: \n");
        _employee.employee_name = _myScanner.next();
        System.out.println("Enter your Employer name: \n");
        _employee.employer_name =_myScanner.next();
        System.out.println("Enter your salary: \n");
        _employee.gross_salary =  (double) _myScanner.nextInt();
        getTax((int) _employee.gross_salary);
        getNhif((int)_employee.gross_salary);
    }
    void getTax(int salary){
        if(salary>100000){
            _employee.tax=(double) salary  * 0.35;
        }else if(salary>=80000 && salary<=100000){
            _employee.tax = (double) salary  * 0.3;
        }else if(salary>=50000 && salary<80000){
            _employee.tax = (double) salary  * 0.25;
        }else if(salary>=20000 && salary<50000){
            _employee.tax = (double) salary  * 0.2;
        }else{
            _employee.tax = (double) salary  * 0.05;
        }
    }
    void getNhif(int salary){
       if(salary>20000){
           _employee.nhif = 1300.0;
       }else {
           _employee.nhif = 500.0;
       }
        printPaySlip();
    }


    void printPaySlip(){
        System.out.println("==================September Payslip================");
        System.out.println("=============**" + "For " + _employee.employee_name + " **=================");
        System.out.println("Name: " +_employee.employee_name);
        System.out.println("Employer name: " +_employee.employer_name);
        System.out.println("Gross pay: KSH " +_employee.gross_salary);
        System.out.println("===Deductions");
        System.out.println("Tax: KSH " +_employee.tax);
        System.out.println("NSSF: KSH " +_employee.nssf);
        System.out.println("NHIF: KSH " +_employee.nhif);
        System.out.println("==================");
        System.out.println("Total Dedutions: KSH " +( _employee.nhif + _employee.nssf + _employee.tax));
        System.out.println("NET PAY: KSH " +( _employee.gross_salary - _employee.nssf - _employee.tax -_employee.nhif ));

    }

}

class Employee{
    String employee_name;
    String employer_name;
    double gross_salary;
    double tax;
    double nhif;
    double nssf= 500.0;

}