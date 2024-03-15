package org.howard.edu.lsp.midterm.question2;

/**
 * A representation of a range of integers.
 */
public interface Range {
    
    /**
     * Checks if the range contains a specific value.
     * 
     * @param value the value to check
     * @return true if the range contains the value, false otherwise
     */
    public boolean contains(int value);
    
    /**
     * Checks if the range overlaps with another range.
     * 
     * @param other the other range to check for overlap
     * @return true if there is overlap, false otherwise
     */
    public boolean overlaps(Range other);

    /**
     * Calculates the number of integers in the range.
     * 
     * @return the number of integers in the range
     */
    public int size();
}
