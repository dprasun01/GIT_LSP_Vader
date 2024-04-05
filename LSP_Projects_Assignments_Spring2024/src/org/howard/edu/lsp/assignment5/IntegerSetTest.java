package org.howard.edu.lsp.assignment5;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
//import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerSetTest {
	
	private IntegerSet setA;
	private IntegerSet setB;
	
	// Empty the two sets after each method
	@BeforeEach
	@DisplayName("Method for reinstantiating the integer sets")
	public void empty() {
		setA = new IntegerSet();
		setB = new IntegerSet();
	}
	
	@Test
	@DisplayName("Test case for isEmpty")
	public void testIsEmpty() {
		// Initially setA and setB are empty
		assertTrue(setA.isEmpty());
		assertTrue(setB.isEmpty());
		
		// Adding integers to setA
		setA.add(1);
		setA.add(2);
		
		// Asserting setA isn't empty anymore, but setB is
		assertFalse(setA.isEmpty());
		assertTrue(setB.isEmpty());
		
		// Adding an integer to setB
		setB.add(99);
		
		// Asserting setB isn't empty anymore
		assertFalse(setB.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for toString")
	public void testToString() {
		// Initially setB = []
		String setBString1 = setB.toString();
		assertEquals(setBString1, "[]");
		
		// Adding integers to setB
		setB.add(31);
		setB.add(72);
		
		// setB in string should be [31, 72]
		String setBString2 = setB.toString();
		assertEquals(setBString2, "[31, 72]");
		
		//Adding more integers to setB
		setB.add(15);
		setB.add(28);
				
		// Asserting if the change is reflected in the string
		String setBString3 = setB.toString();
		assertEquals(setBString3, "[31, 72, 15, 28]");
	}
	
	@Test
	@DisplayName("Test Case for length")
	public void testLength() {
		// Initially, setA is empty
		assertEquals(setA.length(), 0);
		
		// Adding some elements to setA
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(1);
        setA.add(3);
        setA.add(5);
        setA.add(7);
        setA.add(0);
        setA.add(1);
        setA.add(9);
        
        // Asserting the length to be 7
        assertEquals(setA.length(), 7);
	}
	
	@Test
	@DisplayName("Test Case for clear")
	public void testClear() {
		// Inserting some elements into setB
        setB.add(1);
        setB.add(2);
        setB.add(3);
        // Asserting setB isn't empty
        assertFalse(setB.isEmpty());
        // Clearing the set
        setB.clear();
        // Asserting setB is empty
        assertTrue(setB.isEmpty()); 
    }
	
	@Test
	@DisplayName("Test case for equals")
	public void testEquals() {
		// Populating setA and setB with different integers 
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		setB.add(1);
		setB.add(3);
		setB.add(5);
		setB.add(7);
		setB.add(9);
		
		// Asserting that setA and setB aren't equal
		assertFalse(setA.equals(setB));
		
		// Clearing and re-populating setB with the same integers as in setA
		setB.clear();
		setB.add(6);
		setB.add(2);
		setB.add(0);
		setB.add(8);
		setB.add(4);
		
		// Asserting that setA and setB are equal
		assertTrue(setA.equals(setB));		
	}
	
	@Test
	@DisplayName("Test Case for contains")
	public void testContains() {
		// Initially setB shouldn't contain the integer 55 or 217
		assertFalse(setB.contains(55));
		assertFalse(setB.contains(217));
		
		// Adding some values to setB, except 55
        setB.add(31);
        setB.add(492);
        setB.add(670);
        
        // Asserting setB doesn't still contain 55 or 217
        assertFalse(setB.contains(55));
        assertFalse(setB.contains(217));
        
        // Adding 55 to setB
        setB.add(55);
        
        // Asserting setB contains 55 but not 217
        assertTrue(setB.contains(55)); 
        assertFalse(setB.contains(217));
	}
	
	@Test
	@DisplayName("Test case for add")
	public void testAdd() {
		// Asserting setA doesn't contain 5 and 7
		assertFalse(setA.contains(5));
		assertFalse(setA.contains(7));
		
		// Adding 5 and 7 to setA
		setA.add(5);
		setA.add(7);
		
		// Asserting setA contains 5 and 7
		assertTrue(setA.contains(5));
		assertTrue(setA.contains(7));
		
	}
	
	@Test
	@DisplayName("Test case for remove")
	public void testRemove() {
		// Asserting setA doesn't contain 5 and 7
		assertFalse(setA.contains(5));
		assertFalse(setA.contains(7));
		
		// Adding 5 and 7 to setA
		setA.add(5);
		setA.add(7);
		
		// Asserting setA contains 5 and 7 and the length is 2
		assertTrue(setA.contains(5));
		assertTrue(setA.contains(7));
		assertEquals(setA.length(), 2);
		
		// Removing 7 from setA
		setA.remove(7);
		
		// Asserting setA doesn't contain 7 and the length is 1
		assertFalse(setA.contains(7));
		assertEquals(setA.length(), 1);
		
		// Removing 5 from setA
		setA.remove(5);
				
		// Asserting setA doesn't contain 5 and the length is 0
		assertFalse(setA.contains(5));
		assertEquals(setA.length(), 0);
	}
	
	@Test
	@DisplayName("Test Case for largest")
	public void testLargest() throws Exception {
		// Asserting IntegerSetException for empty sets
		Throwable exceptionSetA = assertThrows(Exception.class, () -> setA.largest());
        assertEquals("Set is empty!", exceptionSetA.getMessage());
        Throwable exceptionSetB = assertThrows(Exception.class, () -> setB.largest());
        assertEquals("Set is empty!", exceptionSetB.getMessage());
        
        // Adding some elements in setA
        setA.add(31);
        setA.add(492);
        setA.add(670);
        
        // Asserting 670 as the largest element
        assertEquals(setA.largest(), 670);
        
        // Removing 670 from setA
        setA.remove(670);
		
        // Asserting 492 is the largest element
        assertEquals(setA.largest(), 492);
	}
	
	@Test
	@DisplayName("Test Case for smallest")
	public void testSmallest() throws Exception {
		// Asserting IntegerSetException for empty sets
		Throwable exceptionSetA = assertThrows(Exception.class, () -> setA.smallest());
        assertEquals("Set is empty!", exceptionSetA.getMessage());
        Throwable exceptionSetB = assertThrows(Exception.class, () -> setB.smallest());
        assertEquals("Set is empty!", exceptionSetB.getMessage());
        
        // Adding some elements in setB
        setB.add(78);
        setB.add(49);
        setB.add(6);
        setB.add(0);
        
        // Asserting 0 as the smallest element
        assertEquals(setB.smallest(), 0);
        
        // Removing 670 from setA
        setA.remove(0);
		
        // Asserting 6 is the largest element
        assertEquals(setB.smallest(), 6);
	}
	
	@Test
	@DisplayName("Test Case for union")
	public void testUnion() {
		// Asserting that the union of two empty sets is []
		setA.union(setB);
		assertEquals(setA.toString(), "[]");
		
		// Adding integers to setA and setB
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		setB.add(1);
		setB.add(6);
		setB.add(0);
		setB.add(7);
		setB.add(9);
		
		// Implementing union of setA and setB
		setA.union(setB);
		
		// Asserting the union of the sets to be [0, 1, 2, 4, 6, 7, 8, 9]
		assertEquals(setA.toString(), "[0, 1, 2, 4, 6, 7, 8, 9]");
		
		// Another example where setB is a subset of setA
		setB.clear();
		setB.add(4);
		setB.add(6);
		setB.add(0);
		
		// Implementing union of setA and setB
		setA.union(setB);
				
		// Asserting the union of the sets to be [0, 2, 4, 6, 8]
		assertEquals(setA.toString(), "[0, 2, 4, 6, 8]");
		
	}
	
	@Test
	@DisplayName("Test Case for intersection")
	public void testIntersect() {
		// Asserting that the intersection of two empty sets is []
		setA.intersect(setB);
		assertEquals(setA.toString(), "[]");
		
		// Adding integers to setA and setB
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		setB.add(1);
		setB.add(6);
		setB.add(0);
		setB.add(7);
		setB.add(9);
		
		// Implementing intersection of setA and setB
		setA.intersect(setB);
		
		// Asserting the intersection of the sets to be [0, 1, 2, 4, 6, 7, 8, 9]
		assertEquals(setA.toString(), "[0, 6]");
		
		// Another example where setB is empty and setA is not
		setB.clear();
		
		// Implementing intersection of setA and setB
		setA.intersect(setB);
				
		// Asserting the intersection of the sets to be []
		assertEquals(setA.toString(), "[]");
		
	}
	
	@Test
	@DisplayName("Test Case for difference")
	public void testDiff() {
		
		// Adding integers to setA and setB
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		setB.add(1);
		setB.add(6);
		setB.add(0);
		setB.add(7);
		setB.add(9);
		
		// Implementing difference of setA and setB
		setA.diff(setB);
		
		// Asserting the difference of the sets to be [2, 4, 8]
		assertEquals(setA.toString(), "[2,4,8]");
		
		// Another example where setB is empty and setA is not
		setB.clear();
		
		// Implementing difference of setB and setA
		setB.diff(setA);
				
		// Asserting the intersection of the sets to be []
		assertEquals(setB.toString(), "[]");
		
		// Emptying setA and setB and adding other integers
		empty();
		setA.add(0);
		setA.add(10);
		setA.add(100);
		setA.add(1000);
		setB.add(0);
		setB.add(11);
		setB.add(111);
		setB.add(1111);
		setB.add(11111);
		setB.add(111111);
		
		// Implementing intersection of setB and setA
		setB.diff(setA);
		
		// Asserting the result
		assertEquals(setB.toString(), "[11, 111, 1111, 11111, 111111]");
		
	}
	
	@Test
	@DisplayName("Test Case for complement")
	public void testComplement() {
		
		// Adding integers to setA and setB
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);
		
		setB.add(1);
		setB.add(6);
		setB.add(0);
		setB.add(7);
		setB.add(9);
		
		// Implementing complement of setA and setB
		setB.complement(setA);
		
		// Asserting the complement of the sets to be [2, 4, 8]
		assertEquals(setB.toString(), "[2,4,8]");
		
		// Another example where setB is empty and setA is not
		setB.clear();
		
		// Implementing difference of setB and setA
		setA.complement(setB);
				
		// Asserting the intersection of the sets to be []
		assertEquals(setA.toString(), "[]");
		
		// Emptying setA and setB and adding other integers
		empty();
		setA.add(0);
		setA.add(10);
		setA.add(100);
		setA.add(1000);
		setB.add(0);
		setB.add(11);
		setB.add(111);
		setB.add(1111);
		setB.add(11111);
		setB.add(111111);
		
		// Implementing intersection of setB and setA
		setA.complement(setB);
		
		// Asserting the result
		assertEquals(setA.toString(), "[11, 111, 1111, 11111, 111111]");
		
	}
	
}
