package org.howard.edu.lsp.midterm.question1;

/**
 * A driver class to demonstrate the functionality of the SecurityOps class.
 */
public class Driver {
    
    /**
     * Main method to test the encrypt method of the SecurityOps class.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        String input = "I love CSCI363"; // Input string to be encrypted
//      String input2 = ")(*&Prasun Dhungana!@#$"; // Additional input string to be encrypted
        
        // Print original input string
        System.out.println("Original String: " + input);
        
        // Encrypt the input string and print the result
        System.out.println("Encrypted String: " + SecurityOps.encrypt(input));
        
//      System.out.println("Original String: " + input2);
//      System.out.println("Encrypted String: " + SecurityOps.encrypt(input2));
    }
}
