package org.howard.edu.lsp.midterm.question2;

/**
 * Represents a range of integers.
 */
public class IntegerRange implements Range {
    
    private int lower; // Lower bound of the range
    private int upper; // Upper bound of the range
    
    /**
     * Constructs an IntegerRange object with default lower and upper bounds.
     */
    public IntegerRange() {
    }

    /**
     * Constructs an IntegerRange object with specified lower and upper bounds.
     * 
     * @param lower the lower bound of the range
     * @param upper the upper bound of the range
     */
    public IntegerRange(int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
    }
    
    /**
     * Sets the upper bound of the range.
     * 
     * @param upper the new upper bound of the range
     */
    public void setUpperBound(int upper) {
        this.upper = upper;
    }
    
    /**
     * Sets the lower bound of the range.
     * 
     * @param lower the new lower bound of the range
     */
    public void setLowerBound(int lower) {
        this.lower = lower;
    }
    
    /**
     * Returns a string representation of the range.
     * 
     * @return string representation of the range in the format "[lower, upper]"
     */
    public String toString() {
        return "[" + this.lower + ", " + this.upper + "]";
    }
    
    /**
     * Checks if a given value is within the range.
     * 
     * @param value the value to check
     * @return true if the value is within the range, false otherwise
     */
    @Override
    public boolean contains(int value) {
        return (value >= this.lower && value <= this.upper);
    }
    
    /**
     * Checks if the current range overlaps with another range.
     * 
     * @param other the other range to check for overlap
     * @return true if there is overlap, false otherwise
     */
    @Override
    public boolean overlaps(Range other) {
        if (other.contains(lower) || other.contains(upper) || other.overlaps(this)) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Calculates the size of the range.
     * 
     * @return the size of the range
     */
    @Override
    public int size() {
        return this.upper - this.lower + 1;
    }

    /**
     * Checks if the current range is equal to another range.
     * 
     * @param other the other range to compare
     * @return true if the ranges are equal, false otherwise
     */
    public boolean equals(Range other) {
        if ((other.contains(this.lower) && other.contains(this.upper) && other.size() == this.size())) {
        	return true;
        } else {
        	return false;
        }
    }
}
