/*
 * This file contains the Faculty class and its methods.
 */
package H9;

public class Faculty extends Employee implements Comparable <Faculty> {
    
    // attribute
    String title;
    
    // constructors
    public Faculty() {
        super();
        title = "Unknown";
    }
    
    public Faculty(String t, String n, double s, int y, int id, String d) {
        super(n, s, y, id, d);
        title = t;
    }
    
    // accessor
    public String getTitle() {
        return title;
    }
    
    // mutator
    public void setTitle(String t) {
        title = t;
    }
    
    // writeOutput
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Title: " + title);
    }
    
    @Override
    public int compareTo(Faculty f2) {
        return this.getDepartment().compareTo(f2.getDepartment());
    }
    
}  // end of class
