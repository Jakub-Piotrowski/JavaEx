/*
 * This file contains the Undergraduate class and its methods.
 */
package H9;

public class Undergraduate extends Student {
    
    // attributes
    int level;
    
    // constructors
    public Undergraduate() {
        super();
        level = 0;
    }
    
    public Undergraduate(String n, int sn, int l) {
        super(n, sn);
        level = l;
    }
    
    // accessor
    public int getLevel() {
        return level;
    }
    
    // mutator
    public void setLevel(int l) {
        level = l;
    }
    
    // writeOutput
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Level: " + level);
    }
    
}  // end of class
