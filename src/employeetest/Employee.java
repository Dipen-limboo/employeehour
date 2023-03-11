/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

import java.util.Scanner;

/**
 *
 * @author wd
 */
public class Employee {
    
    double hours;
    double rate;
    String name;

    
    //Default constructor
    public Employee(){}  
    
    //Parameterized constructor
    public Employee(String n, double r){
        name=n;
        rate=r;
    }
    
    
    
    //Define the methods
    public void getEmployeeDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of the Employee:");
        name = sc.nextLine();

        System.out.println("Enter number of hours work by" + name + ": ");
        hours = sc.nextDouble();
        System.out.println("Enter hourly working rate (HWR) for " + name + ": ");
        rate = sc.nextDouble();
    }

    public void displayGrossSalary() {
        //Output
        System.out.println("Gross Salary of " + name + ": " + calculateGrossSalary());
    }
        
    //Processing
    private double calculateGrossSalary() {
        double grossSalary;

        if (hours <= 40) {
            grossSalary = rate * hours;
        } else {
            grossSalary = (rate * 40) + (rate * 1.5) * (hours - 40);
        }
        return grossSalary;
    }
    
}
