package org.howard.edu.lsp.midterm.question2;

/**
 * A class to test the functionality of the Range interface and its implementations.
 */
public class RangeTester {

    /**
     * Main method to test the Range interface and its implementations.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Range range1 = new IntegerRange(1, 9); // Creating a range object with lower bound 1 and upper bound 9
        Range range2 = new IntegerRange(5, 17); // Creating another range object with lower bound 5 and upper bound 17
        
        // Printing the ranges
        System.out.println("Range 1: " + range1.toString() + " and Range 2: " + range2.toString());
        
        // Checking if specific values are contained in the ranges
        System.out.println("Range 1 contains 12 or not: " + range1.contains(12));
        System.out.println("Range 2 contains 9 or not: " + range2.contains(9));
        
        // Checking if the ranges overlap
        System.out.println("Range 1 overlaps Range 2: " + range1.overlaps(range2));
        
        // Printing the size of each range
        System.out.println("Range 1 size: " + range1.size());
        System.out.println("Range 2 size: " + range2.size());
        
        // Checking if the ranges are equal
        System.out.println("Range 1 equals Range 2 or not: " + range1.equals(range2));
    }
}
