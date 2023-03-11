/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeetest;

/**
 *
 * @author wd
 */
public class Employeetest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        
        emp1.getEmployeeDetails();
        emp2.getEmployeeDetails();
        emp3.getEmployeeDetails();
        
        emp1.displayGrossSalary();        
        emp2.displayGrossSalary();        
        emp3.displayGrossSalary();
    }
    
    
    
}
