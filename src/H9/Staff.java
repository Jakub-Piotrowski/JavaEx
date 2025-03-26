/*
 * This file contains the Staff class and its methods.
 */
package H9;

public class Staff extends Employee implements Comparable <Staff> {

    // attribute
    int payGrade;

    // constructors
    public Staff() {
        super();
        payGrade = 10;
    }

    public Staff(int pg, String n, double s, int y, int id, String d) {
        super(n, s, y, id, d);
        if (pg < 1) {
            System.out.println("Invalid paygrade. Setting paygrade to 1.");
            payGrade = 1;
        }
        else if (pg > 20) {
            System.out.println("Invalid paygrade. Setting paygrade to 20.");
            payGrade = 20;
        }
        else
            payGrade = pg;
    }

    // accessor
    public int getPayGrade() {
        return payGrade;
    }

    // mutator
    public void setPayGrade(int pg) {
        if (pg < 1) {
            System.out.println("Invalid paygrade. Setting paygrade to 1.");
            payGrade = 1;
        }
        else if (pg > 20) {
            System.out.println("Invalid paygrade. Setting paygrade to 20.");
            payGrade = 20;
        }
        else
            payGrade = pg;
    }

    // writeOutput
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Paygrade: " + payGrade);
    }
    
    // compareTo
    @Override
    public int compareTo(Staff s2) {
        if (this.getSalary() > s2.getSalary())
            return 1;
        else if (this.getSalary() < s2.getSalary())
            return -1;
        else
            return 0;
    }

}  // end of class
