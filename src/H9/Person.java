/*
 * This file contains the Person class and its methods.
 */
package H9;

public class Person {

    // attribute
    protected String name;
    
    // constructors
    public Person() {
        name = "";
    }
    
    public Person(String n) {
        name = n;
    }
    
    // accessor
    public String getName() {
        return name;
    }
    
    // mutator
    public void setName(String n) {
        name = n;
    }
    
    // methods
    public boolean hasSameName(Person p2) {
        return this.name.equals(p2.name);
    }
    
    public void writeOutput() {
        System.out.println("Name: " + name);
    }
    
}  // end of class
