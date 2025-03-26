/*
 * This file contains the Graduate class and its methods.
 */
package H9;

public class Graduate extends Student {
    
    // attributes
    private String degree;
    private boolean thesis;
    
    // constructors
    public Graduate() {
        super();
        degree = "Unknown";
        thesis = false;
    }
    
    public Graduate(String n, int sn, String s, boolean t) {
        super(n, sn);
        degree = s;
        thesis = t;
    }
    
    // accessors
    public String getDegree() {
        return degree;
    }
    
    public boolean getHasThesis() {
        return thesis;
    }
    
    // mutators
    public void setDegree(String d) {
        degree = d;
    }
    
    public void setHasThesis(boolean t) {
        thesis = t;
    }
    
    // writeOutput
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Degree: " + degree);
        System.out.println("Has thesis: " + thesis);
    }
    
}  // end of class
