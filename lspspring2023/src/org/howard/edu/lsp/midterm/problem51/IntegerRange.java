package org.howard.edu.lsp.midterm.problem51;


public class IntegerRange implements Range{
    
    
    private int lower;
    private int upper;

    public IntegerRange(int lower, int upper){
        this.lower = lower;
        this.upper = upper;
    }


    public boolean contains(int value) {
        // returns true if v is ≥ lower bound and ≤ upper bound, 
        // and false otherwise 

        // implement
        if( value >= this.lower && value <= this.upper){
            return true;
        } else {
            return false;
        }
    }

    public int getLower(){
        return lower;
    }
    public int getUpper(){
        return upper;
    } 
    public boolean overlaps(Range other) throws EmptyRangeException {
        int otherupper = getUpper();
        int otherlower = getLower();
        // returns true if the receiver contains at least 
        // one value in common with other, and false otherwise 
        //  EmptyRangeException is thrown when a null Range object is passed to the method

        // implement
        if (other == null) {
            throw new EmptyRangeException("Empty range object is passed.");
        }
        // Check for overlap between the two ranges
        if (this.upper < otherlower || otherupper < this.lower) {
            return false;
        }
        return true;
    }

    public int size()  {
        // returns the number of integers in the range
        // implement
        return this.upper - this.lower + 1;
    }


}