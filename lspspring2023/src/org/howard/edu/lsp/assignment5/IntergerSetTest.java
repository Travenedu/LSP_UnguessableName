package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment5.IntegerSet;
import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	@Test
	@DisplayName("IntegerSet.Clear test case")
	void testClear() {
		System.out.println("Testing IntegerSet.Clear test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		
		setA.clear();
		
		assertEquals("[]", setA.toString());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Length test case")
	void testLength() {
		System.out.println("Testing IntegerSet.Length test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		setA.add(1);
		setA.add(2);
		setA.add(3);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		
		assertEquals(3, setA.length());
		assertEquals(0, setB.length());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Equals test case")
	void testEquals() {
		System.out.println("Testing IntegerSet.Equals test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setD = new IntegerSet();
		
		setA.add(1);
		setA.add(2);
		setA.add(3);
		IntegerSet setC = setA;
		
		setD.add(2);
		setD.add(3);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		System.out.println("\tSetC: " + setC.toString());
		System.out.println("\tSetD: " + setD.toString());
		
		assertTrue(setA.equals(setC));
		assertFalse(setA.equals(setD));
		//Null Array test
		assertFalse(setA.equals(setB));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.EqualsTwoNullArrays test case")
	void testEqualsTwoNullArrays() {
		System.out.println("Testing IntegerSet.EqualsTwoNullArrays test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		
		assertTrue(setA.equals(setB));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.EqualsTwoEqualUnorderedInputArrays test case")
	void testEqualsTwoEqualUnorderedArrays() {
		System.out.println("Testing IntegerSet.EqualsTwoUnorderedArrays test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setB.add(1);
		setB.add(0);
		setB.add(2);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		
		assertTrue(setA.equals(setB));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Contains test case")
	void testContains() {
		System.out.println("Testing IntegerSet.Contains test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		
		assertTrue(setA.contains(1));
		assertFalse(setA.contains(3));
		//Null Array test
		assertFalse(setB.contains(3));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Largest test case")
	void testLargest() throws IntegerSetException {
		System.out.println("Testing IntegerSet.Largest test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		
		System.out.println("\tSetA: " + setA.toString());
		
		assertEquals(2, setA.largest());
		assertNotEquals(1, setA.largest());
		
		setA.add(3);
		assertEquals(3, setA.largest());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.LargestOnNullArray test case")
	void testLargestOnNullArray() {
		System.out.println("Testing IntegerSet.LargestOnNullArray test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		
		System.out.println("\tSetA: " + setA.toString());
		
		try {
			setA.largest();
			fail();
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Smallest test case")
	void testSmallest() throws IntegerSetException {
		System.out.println("Testing IntegerSet.Smallest test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		
		System.out.println("\tSetA: " + setA.toString());
		
		assertEquals(0, setA.smallest());
		assertNotEquals(2, setA.smallest());
		
		setA.add(-1);
		assertEquals(-1, setA.smallest());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.SmallestOnNullArray test case")
	void testSmallestOnNullArray() {
		System.out.println("Testing IntegerSet.SmallestOnNullArray test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		
		System.out.println("\tSetA: " + setA.toString());
		
		try {
			setA.smallest();
			fail();
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Add test case")
	void testAdd() {
		System.out.println("Testing IntegerSet.Add test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		
		System.out.println("\tSetA: " + setA.toString());
		
		setA.add(0);
		assertEquals(1, setA.length());
		//Tests adding duplicate values
		setA.add(0);
		assertEquals(1, setA.length());
		setA.add(1);
		assertEquals(2, setA.length());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Remove test case")
	void testRemove() throws IntegerSetException{
		System.out.println("Testing IntegerSet.Remove test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		
		System.out.println("\tSetA: " + setA.toString());
		
		setA.remove(0);
		assertEquals(2, setA.length());
		//Tests removing duplicate values
		setA.remove(0);
		assertEquals(2, setA.length());
		setA.remove(1);
		assertEquals(1, setA.length());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.RemoveOnNullArray test case")
	void testRemoveOnNullArray() {
		System.out.println("Testing IntegerSet.RemoveOnNullArray test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		
		System.out.println("\tSetA: " + setA.toString());
		
		try {
			setA.remove(0);
			fail();
		} catch (IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Union test case")
	void testUnion() {
		System.out.println("Testing IntegerSet.Union test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setC = new IntegerSet();
		IntegerSet setD = new IntegerSet();
		
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setB.add(3);
		setB.add(3);
		setB.add(4);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		System.out.println("\tSetC: " + setC.toString());
		
		setA.union(setB);
		
		setC.add(0);
		setC.add(1);
		setC.add(2);
		setC.add(3);
		setC.add(4);
		
		assertTrue(setA.equals(setC));
		
		//Union with a Null Array
		setC.union(setD);
		assertTrue(setA.equals(setC));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Intersect test case")
	void testIntersect() {
		System.out.println("Testing IntegerSet.Intersect test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setC = new IntegerSet();
		IntegerSet setD = new IntegerSet();
		
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setB.add(2);
		setB.add(3);
		setB.add(4);
		setC.add(2);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		System.out.println("\tSetC: " + setC.toString());
		System.out.println("\tSetD: " + setD.toString());
		
		setA.intersect(setB);
		
		assertTrue(setA.equals(setC));
		
		//Intersect with a Null Array
		setC.intersect(setD);
		assertTrue(setD.equals(setC));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.Diff test case")
	void testDiff() {
		System.out.println("Testing IntegerSet.Diff test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		IntegerSet setC = new IntegerSet();
		IntegerSet setD = new IntegerSet();
		
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setB.add(2);
		setB.add(3);
		setB.add(4);
		setC.add(0);
		setC.add(1);
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		System.out.println("\tSetC: " + setC.toString());
		System.out.println("\tSetD: " + setD.toString());
		
		setA.diff1(setB);
		
		assertTrue(setA.equals(setC));
		assertFalse(setA.equals(setB));
		
		//Intersect with a Null Array
		setA.diff1(setD);
		assertTrue(setA.equals(setC));
		assertFalse(setA.equals(setD));
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.IsEmpty test case")
	void testIsEmpty() {
		System.out.println("Testing IntegerSet.IsEmpty test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		
		assertTrue(setA.isEmpty());
		
		setA.add(0);
		setA.add(1);
		setA.add(2);
		
		assertFalse(setA.isEmpty());
		
		System.out.println("\tSetA: " + setA.toString());
		
		setA.clear();
		
		assertEquals(0 == setA.length(), setA.isEmpty());
		
		System.out.println();
	}
	
	@Test
	@DisplayName("IntegerSet.ToString test case")
	void testToString() {
		System.out.println("Testing IntegerSet.ToString test case...\nInput:");
		
		IntegerSet setA = new IntegerSet();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		IntegerSet setB = setA;
		
		System.out.println("\tSetA: " + setA.toString());
		System.out.println("\tSetB: " + setB.toString());
		
		assertEquals("[0, 1, 2]", setA.toString());
		assertNotEquals(setB, setA.toString());
		
		System.out.println();
	}
}