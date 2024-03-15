package org.howard.edu.lsp.midterm.question1;

/**
 * A class for performing encryption operations on strings.
 */
public class SecurityOps {
    
    /**
     * Encrypts a given text by keeping only alphanumeric characters and
     * concatenating characters at odd positions followed by characters at even positions.
     * 
     * @param text the text to be encrypted
     * @return the encrypted text
     */
    public static String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder(); // StringBuilder to store alphanumeric characters
        StringBuilder odds = new StringBuilder(); // StringBuilder to store characters at odd positions
        StringBuilder evens = new StringBuilder(); // StringBuilder to store characters at even positions
        
        // Loop through the input string to extract alphanumeric characters
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                encrypted.append(c);
            }
        }
        
        // Convert StringBuilder to String
        String txt = encrypted.toString();

        // Loop through the text to separate characters at odd and even positions
        for (int i = 0; i < txt.length(); i++) {
            if (i % 2 == 1) {
                odds.append(txt.charAt(i)); // Append character at odd position
            } else {
                evens.append(txt.charAt(i)); // Append character at even position
            }
        }

        // Concatenate characters at even positions followed by characters at odd positions
        String result = evens.toString() + odds.toString();
        return result;
    }
}
