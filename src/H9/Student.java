/*
 * This file contains the Student class and its methods.
 */
package H9;

public class Student extends Person implements Comparable <Student> {
    
    // attributes
    private int studentNumber;
    
    // constructors
    public Student() {
        super();
        studentNumber = 0;
    }
    
    public Student(String n, int sn) {
        super(n);
        studentNumber = sn;
    }
    
    // accessor
    public int getStuNum() {
        return studentNumber;
    }
    
    // mutator
    public void setStuNum(int sn) {
        studentNumber = sn;
    }
    
    // methods
    @Override
    public int compareTo(Student s2) {
        if (this.studentNumber > s2.studentNumber)
            return 1;
        else if (this.studentNumber < s2.studentNumber)
            return -1;
        else
            return 0;
    }
    
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Student number: " + studentNumber);
    }
    
}  // end of class
