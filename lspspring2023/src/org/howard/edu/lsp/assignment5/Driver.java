package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment4.IntegerSet;

public class Driver {

	public static void main(String[] args) {
		IntegerSet setA = new IntegerSet();
		setA.add(1);
		setA.add(2);
		setA.add(4);
		IntegerSet setB = new IntegerSet();
		setB.add(3);
		setB.add(4);
		setB.add(5);
		
		System.out.println("Sets A and B were created with these elements:");
		System.out.println("SetA: "+ setA.toString());
		System.out.println("SetB: "+ setB.toString());
		System.out.println();
		
		System.out.println("True or False: SetA contains the integer 3.");
		System.out.println(setA.contains(3));
		System.out.println();
		System.out.println("True or False: SetB contains the integer 3.");
		System.out.println(setB.contains(3));
		System.out.println("\n");
		
		System.out.println("Removing 3 from SetB...");
		try {
			setB.remove(3);
		} catch (Exception e) {
			System.out.println("A problem occurred: "+e);
		}
		
		System.out.println("True or False: SetB contains the integer 3.");
		System.out.println(setB.contains(3));
		System.out.println("SetB: "+ setB.toString());
		System.out.println("\n");
		
		System.out.println("Testing Removing Not Present Integers:");
		System.out.println("Removing 3 from SetB again...");
		try {
			setB.remove(3);
		} catch (Exception e) {
			System.out.println("A problem occurred: "+e);
		}
		System.out.println("SetB: "+ setB.toString());
		System.out.println("\n");
		
		System.out.println("Testing Removing An Integer From An Empty Integer Set:");
		System.out.println("Clearing SetB...");
		setB.clear();
		System.out.println("SetB: "+ setB.toString());
		System.out.println();
		
		System.out.println("Attempting to remove 3 from SetB again...");
		try {
			setB.remove(3);
		} catch (Exception e) {
			System.out.println("A problem occurred: "+e);
		}
		System.out.println("\n");
		
		System.out.println("Testing Adding Duplicate Integers:");
		System.out.println("SetA: "+ setA.toString());
		System.out.println();
		
		System.out.println("What is the length of setA?");
		System.out.println(setA.length());
		System.out.println();

		System.out.println("Adding 1 to setA...");
		setA.add(1);
		System.out.println();

		System.out.println("What is the length of setA?");
		System.out.println(setA.length());
		System.out.println("SetA: "+ setA.toString());
		System.out.println("\n");
		
		setA.clear();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		System.out.println("SetA: "+ setA.toString());
		System.out.println("SetB: "+ setB.toString());
		System.out.println("What are the largest and smallest values of setA, respectively?");
		try {
			System.out.println(setA.largest() + ", " + setA.smallest());
		} catch (Exception e) {
			System.out.println("An error occurred: "+e);
		}
		System.out.println();
		System.out.println("What are the largest and smallest values of setB, respectively?");
		try {
			System.out.println(setB.largest() + ", " + setB.smallest());
		} catch (Exception e) {
			System.out.println("An error occurred: "+e);
		}
		System.out.println("\n");
		
		setB.add(2);
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setB.add(6);
		System.out.println("Set Comparisons:");
		System.out.println("SetA: "+ setA.toString());
		System.out.println("SetB: "+ setB.toString());
		System.out.println();
		
		System.out.println("True or False: SetA equals SetB.");
		System.out.println(setA.equals(setB));
		System.out.println();
		
		System.out.println("What is SetA 'Union' SetB?");
		setA.union(setB);
		System.out.println("SetA 'Union' SetB = " + setA.toString());
		setA.clear();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		System.out.println("What is SetA 'Intersection' SetB?");
		setA.intersect(setB);
		System.out.println("SetA 'Intersection' SetB = " + setA.toString());
		System.out.println();
		setA.clear();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		System.out.println("What is SetA 'Difference1' SetB?");
		setA.diff1(setB);
		System.out.println("SetA 'Difference1' SetB = " + setA.toString());
		System.out.println();
		setA.clear();
		setA.add(0);
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		
	}

}