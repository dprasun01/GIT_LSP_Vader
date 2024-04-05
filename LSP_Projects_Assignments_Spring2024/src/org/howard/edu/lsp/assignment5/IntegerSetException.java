package org.howard.edu.lsp.assignment5;

/**
 * The IntegerSetException class is an exception specific to the IntegerSet class that extends on Exception class
 * It is thrown when an error occurs during operations on IntegerSet objects.
 */
public class IntegerSetException extends Exception {
	/**
     * Constructor for a new IntegerSetException with the specified message.
     * @param message of the exception.
     */
	public IntegerSetException(String message) {
		super(message);
	}
}
