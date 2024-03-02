package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * IntegerSet class represents a set of integers and provides multiple set operations such as union, intersection, difference, complement, etc.
 * The set elements are stored internally in an ArrayList and are unique and non-repeated.
 */
public class IntegerSet {
	// Internal representation of the set
	private List<Integer> set;
	
	// Default constructor
	/**
     * Default constructor for IntegerSet class.
     * Initializes an empty set.
     */
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
	// Constructor to pass in already initialized ArrayList
	/**
     * Constructor for IntegerSet
     * Initializes it with provided integer ArrayList.
     * @param set An ArrayList of integers to initialize the set.
     */
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}
	
	// Clears the internal representation of the set
	/**
     * Clears the internal representation of the set
     */
	public void clear() {
		this.set.clear();
	}
	
	// Returns the length of the set
	/**
     * Returns the number of elements in the IntegerSet.
     * @return the length of the set
     */
	public int length() {
		return this.set.size();
	}
	
	/**
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order
     * Overrides the equal method from the Object class.
     * @param another object o
     * @return True if the sets are equal, and false otherwise.
     */
	@Override
	public boolean equals(Object o) {
		if (o == null || !(o instanceof IntegerSet)) {
			return false;
		}
		IntegerSet other = (IntegerSet) o;
		
		for (Integer element : this.set) {
			if (!other.set.contains(element)) {
				return false;
			}
		}
		for (Integer element : other.set) {
			if (!this.set.contains(element)) {
				return false;
			}
		}
		return true;
	}
	
	// Returns true if the set contains the value, otherwise false
	/**
	 * Returns whether or not a value is present in the set
	 * Checks if the set has the provided value
	 * @param an integer value to check for
	 * @return True if the value is in the set, false otherwise
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
	}
	
	// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	/**
	 * Finds the largest element in the set
	 * @return the value of the largest element in the set
	 * @throws IntegerSetException if the set is empty
	 */
	public int largest() throws IntegerSetException {
		if (this.set.isEmpty()) {
			throw new IntegerSetException("Set is empty!");
		}
		return Collections.max(this.set);
	}
	
	// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty 
	/**
	 * Finds the smallest element in the set
	 * @return the value of the smallest element in the set
	 * @throws IntegerSetException if the set is empty
	 */	
	public int smallest() throws IntegerSetException {
		if (this.set == null || this.set.isEmpty()) {
			throw new IntegerSetException("Set is empty!");
		}
		return Collections.min(this.set);
	}
	
	// Adds an item to the set or does nothing it already there
	/**
	 * Adds an element to the set if it's not there, otherwise does nothing
	 * @param integer item to be added
	 */
	public void add(int item) {
		boolean adding = true;
		for (Integer element : this.set) {
			if (element == item) {
				adding = false;
				break;
			}
		}
		if (adding == true) {
			this.set.add(item);
		}
	}
	
	// Removes an item from the set or does nothing if not there
	/**
	* Removes an element from the set if it's there, otherwise does nothing
	* @param integer item to be removed
	*/
	public void remove(int item) {
		if (this.set != null) {
			this.set.remove((Integer) item);
	    }
	}
	
	// Set union
	/**
	 * Performs the union operation of two sets.
	 * Adds all elements from the provided set to this set without repeating any.
	 * @param intSetb, the set with which to perform a union.
	 */
	public void union(IntegerSet intSetb) {
				
		for (Integer element : intSetb.set) {
			
			if (!this.set.contains(element)) {
			this.set.add(element);
			}
		}
	}
	
	// Set intersection, all elements in s1 and s2
	/**
	 * Performs the intersection operation of two sets.
	 * Removes all the elements from this set that are not present in the provided set.
	 * @param intSetb The set to perform intersection with.
	 */
	public void intersect(IntegerSet intSetb) {
		
		List<Integer> temp = new ArrayList<Integer>();
		
		for (Integer element : intSetb.set) {
			
			if (this.set.contains(element)) {
			temp.add(element);
			}
		}
		
		this.set.clear();
		this.set.addAll(temp);
	}
	
	// Set difference, i.e., s1 –s2
	/**
	 * Finds the difference between two sets.
	 * Removes elements from this set that are present in the other given set.
	 * @param intSetb, the set with which to perform difference.
	 */
	public void diff(IntegerSet intSetb) {
		
		for (Integer element : intSetb.set) {
			
			if (this.set.contains(element)) {
				this.set.remove(element);
			}
		}
		
	}
	
	// Set complement, all elements not in s1
	/**
	 * Finds the complement of this set based on the other given set.
	 * Removes all elements from the other set that are present in this set.
	 * @param intSetb, the set to find the complement with.
	 */
	public void complement(IntegerSet intSetb) {
		
		for (Integer element : this.set) {
			
			if (this.set.contains(element)) {
				intSetb.remove(element);
			}
		}
		
		this.set.clear();
		this.set.addAll(intSetb.set);
	}
	
	// Returns true if the set is empty, false otherwise
	/**
	 * Checks whether the set is empty.
	 * @return True if it is empty, and false otherwise.
	 */
	public boolean isEmpty() {
		return (this.set.size() == 0);
	}
	
	// Return String representation of your set.  This overrides the equal method from the Object class.
	/**
	 * Returns the string representation of the set.
	 * @return the string representation of the set.
	 */
	public String toString() {
		return this.set.toString();
	}
}
