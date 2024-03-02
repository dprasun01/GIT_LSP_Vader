package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;

/**
 * The Driver class has the main method to test the functionalities of the IntegerSet class.
 * It tests the methods provided by the IntegerSet class and displays their results.
 */

public class Driver {

    /**
     * Main method that tests the methods of the IntegerSet class.
     * @param args are the command line arguments.
     * @throws IntegerSetException if any error occurs during the test.
     */

	public static void main(String[] args) throws IntegerSetException {
		
			// Test add and toString methods
		    System.out.println("\nTest I: Testing the add and toString methods\n");
	        IntegerSet set1 = new IntegerSet();
	        System.out.println("Set 1 before any value is added: " + set1.toString());
	        set1.add(5);
	        set1.add(2);
	        set1.add(6);
	        System.out.println("Set 1 after elements are added: " + set1.toString()); // Expected Result: [5, 2, 6]
	        System.out.println("------------------------------------------------------------------------");
	        
	        // Test the constructor with an initialized ArrayList
		    System.out.println("\nTest II: Testing the constructor with an initialized ArrayList\n");
	        ArrayList<Integer> arr = new ArrayList<>();
	        arr.add(2);
	        arr.add(9);
	        arr.add(3);
	        IntegerSet set2 = new IntegerSet(arr);
	        System.out.println("Initialized ArrayList: " + arr.toString()); // Expected Result: [2, 9, 3]
	        System.out.println("Set 2 after using the constructor with ArrayList: " + set2.toString()); // Expected Result: [2, 9, 3]
	        System.out.println("------------------------------------------------------------------------");

	        
	        // Test clear method
	        System.out.println("\nTest III: Testing the clear method\n");
		    System.out.println("Set 1 before clear: " + set1.toString());
	        set1.clear();
	        System.out.println("Set 1 after clear: " + set1.toString()); // Expected Result: []
	        System.out.println("------------------------------------------------------------------------");

	        
	        // Test length method
		    System.out.println("\nTest IV: Testing the length method\n");
		    System.out.println("Current Set 1: " + set1.toString());
		    System.out.println("Length of Set 1: " + set1.length()); // Expected Result: 0
		    System.out.println("Current Set 2: " + set2.toString());
	        System.out.println("Length of Set 2: " + set2.length()); // Expected Result: 3
	        System.out.println("------------------------------------------------------------------------");

	        
	        // Test overridden equals method
		    System.out.println("\nTest V: Testing the equals method\n");
		    System.out.println("Current Set 1: " + set1.toString());
	        System.out.println("Set 1 equals Set 2?: " + set1.equals(set2)); // Expected Result: false
	        set1.add(2);
	        set1.add(9);
	        set1.add(3);
	        System.out.println("Changed Set 1: " + set1.toString());
	        System.out.println("Current Set 2: " + set2.toString());
	        System.out.println("Set 1 equals Set 2?: " + set1.equals(set2)); // Expected Result: true
	        System.out.println("------------------------------------------------------------------------");
	        
	        // Test contains method
		    System.out.println("\nTest VI: Testing the contains method\n");
		    set1.add(4);
		    set1.add(7);
		    set1.add(8);
		    System.out.println("Current Set 1: " + set1.toString());
		    System.out.println("Current Set 2: " + set2.toString());
		    int val1 = 77;
		    int val2 = 9;
	        System.out.println("Set 1 contains " + val1 + "?: " + set1.contains(val1)); // Expected Result: false
	        System.out.println("Set 2 contains " + val2 + "?: " + set2.contains(val2)); // Expected Result: true
	        System.out.println("------------------------------------------------------------------------");

	        // Test largest method 
		    System.out.println("\nTest VII: Testing the largest method \n");
		    set1.add(88);
		    System.out.println("Changed Set 1: " + set1.toString());
	        System.out.println("Largest element in Set 1: " + set1.largest()); // Expected Result: 88
	        System.out.println("------------------------------------------------------------------------");


	        // Test smallest method
		    System.out.println("\nTest VIII: Testing the smallest method\n");
		    set2.add(0);
		    System.out.println("Changed Set 2: " + set2.toString());
	        System.out.println("Smallest element in Set 2: " + set2.smallest()); // Expected Result: 0
	        System.out.println("------------------------------------------------------------------------");


	        // Test remove method
	        set1.clear();
	        set1.add(1);
	        set1.add(5);
	        set1.add(6);
		    System.out.println("\nTest IX: Testing the remove method\n");
		    System.out.println("Current Set 1: " + set1.toString());
		    set1.remove(3);
		    System.out.println("Set 1 after removing 3: " + set1.toString()); // Expected Result: 
		    System.out.println("Current Set 2: " + set2.toString());
		    set2.remove(3);
	        System.out.println("Set 2 after removing 3: " + set2.toString()); // Expected Result: [2, 9, 88]
	        System.out.println("------------------------------------------------------------------------\n");
	        
	        
	        // Starting from blank slate for set operations
	        set1.clear();
	        set2.clear();
	        
	        // Populating set 1
	        set1.add(1);
	        set1.add(3);
	        set1.add(5);
	        set1.add(7);
	        set1.add(9);
	        set1.add(0);
	        
	        // Populating set 2
	        set2.add(1);
	        set2.add(2);
	        set2.add(4);
	        set2.add(6);
	        set2.add(8);
	        set2.add(0);
	        
	        System.out.println("New Set 1 before union, intersection, difference, and complement: " + set1.toString());
	        System.out.println("New Set 2 before union, intersection, difference, and complement: " + set2.toString());
	        System.out.println("------------------------------------------------------------------------");

	        // Test union method
		    System.out.println("\nTest X: Testing the union method\n");
	        set1.union(set2);
	        System.out.println("Union of Set 1 and Set 2: " + set1.toString()); // Expected Result: [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
	        System.out.println("------------------------------------------------------------------------");

	        // Test intersect method
	        set1.clear();
	        set2.clear();
	        
	        // Repopulating set 1
	        set1.add(1);
	        set1.add(3);
	        set1.add(5);
	        set1.add(7);
	        set1.add(9);
	        set1.add(0);
	        
	        // Repopulating set 2
	        set2.add(1);
	        set2.add(2);
	        set2.add(4);
	        set2.add(6);
	        set2.add(8);
	        set2.add(0);
		    System.out.println("\nTest XI: Testing the intersect method\n");
	        set1.intersect(set2);
	        System.out.println("Intersection of Set 1 and Set 2: " + set1.toString()); // Expected Result: [1, 0]
	        System.out.println("------------------------------------------------------------------------");

	        // Test diff method
	        set1.clear();
	        set2.clear();
	        
	        // Repopulating set 1
	        set1.add(1);
	        set1.add(3);
	        set1.add(5);
	        set1.add(7);
	        set1.add(9);
	        set1.add(0);
	        
	        // Repopulating set 2
	        set2.add(1);
	        set2.add(2);
	        set2.add(4);
	        set2.add(6);
	        set2.add(8);
	        set2.add(0);
		    System.out.println("\nTest XII: Testing the diff method\n");
	        set1.diff(set2);
	        System.out.println("Difference of Set 1 and Set 2 (Set 1 - Set 2): " + set1.toString()); // Expected Result: [3, 5, 7, 9]
	        System.out.println("------------------------------------------------------------------------");

	        // Test complement method
	        set1.clear();
	        set2.clear();
	        
	        // Repopulating set 1
	        set1.add(1);
	        set1.add(3);
	        set1.add(5);
	        set1.add(7);
	        set1.add(9);
	        set1.add(0);
	        
	        // Repopulating set 2
	        set2.add(1);
	        set2.add(2);
	        set2.add(4);
	        set2.add(6);
	        set2.add(8);
	        set2.add(0);
		    System.out.println("\nTest XIII: Testing the complement method\n");
	        set1.complement(set2);
	        System.out.println("Complement of Set 1 using Set 2: " + set1.toString()); // Expected Result: [2, 4, 6, 8]
	        System.out.println("------------------------------------------------------------------------");
	        
	        //Test isEmpty and Exception throw
		    System.out.println("\nTest XIV: Testing isEmpty method and Proper Exception throw\n");
	        IntegerSet setNull = new IntegerSet();
	        System.out.println("An empty set: " + setNull);
	        System.out.println("Set empty?: " + setNull.isEmpty());
	        System.out.println("Trying to find largest element in null set: " + setNull.smallest()); // Should throw exception
	        

	}

}