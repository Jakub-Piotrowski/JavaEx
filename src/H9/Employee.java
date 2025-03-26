/*
 * This file contains the Employee class and its methods.
 */
package H9;

import java.text.DecimalFormat;

public class Employee extends Person {
    DecimalFormat df = new DecimalFormat("0");
    
    // attributes
    private double salary;
    private int yearHired;
    private int idNum;
    private String department;
    
    // constructors
    public Employee() {
        super();
        salary = 0.0;
        yearHired = 0;
        idNum = 0;
        department = "Unknown";
    }
    
    public Employee(String n, double s, int y, int id, String d) {
        super(n);
        salary = s;
        yearHired = y;
        idNum = id;
        department = d;
    }
    
    // accessors
    public double getSalary() {
        return salary;
    }
        
    public int getYearHired() {
        return yearHired;
    }
    
    public int getIDNum() {
        return idNum;
    }
    
    public String getDepartment() {
        return department;
    }
    
    // mutators
    public void setSalary(double s) {
        salary = s;
    }
    
    public void setYearHired(int y) {
        yearHired = y;
    }
    
    public void setIDNum(int id) {
        idNum = id;
    }
    
    public void setDepartment(String d) {
        department = d;
    }
    
    // methods
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Annual salary: $" + df.format(salary));
        System.out.println("Year hired: " + yearHired);
        System.out.println("ID number: " + idNum);
        System.out.println("Department: " + department);
    }
    
    public boolean hasSameIDNum(Employee e2) {
        return this.idNum == e2.idNum;
    }
    
}  // end of class
