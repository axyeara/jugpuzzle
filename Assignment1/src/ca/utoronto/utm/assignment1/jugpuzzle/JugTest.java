package ca.utoronto.utm.assignment1.jugpuzzle;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author csc207 student
 * 
 * Class for unit tests of the methods belonging to the Jug.java file. These methods
 * test are: toString(), addLiquid(), removeLiquid() and spillInto().
 *
 */
public class JugTest {
	
	Jug testJug0;
	Jug testJug1;
	Jug testJug2;
	Jug testJug3;
	Jug testJug4;
	Jug testJug5;
	Jug testJug6;
	Jug testJug7;
	Jug testJug8;
	Jug testJug9;
	int actual;
	
	/**
	 * Unit test for toString() method of Jug.
	 */
	@Test
	public void testToString() {
		Jug testJug0 = new Jug(8,8);
		Jug testJug1 = new Jug(5,0);
		Jug testJug2 = new Jug(3,0);
		Jug testJug3 = new Jug(8,0);
		Jug testJug4 = new Jug(8,3);
		Jug testJug5 = new Jug(5,5);
		Jug testJug6 = new Jug(3,3);
		Jug testJug7 = new Jug(1,1);
		Jug testJug8 = new Jug(0,0);
		Jug testJug9 = new Jug(5000,1000);
		String actual;
		
		actual = testJug0.toString();
		assertEquals("String representation of testJug 0 is: (8/8)", "(8/8) ", actual);
		
		actual = testJug1.toString();
		assertEquals("String representation of testJug 0 is: (0/5)", "(0/5) ", actual);
		
		actual = testJug2.toString();
		assertEquals("String representation of testJug 0 is: (0/3)", "(0/3) ", actual);
		
		actual = testJug3.toString();
		assertEquals("String representation of testJug 0 is: (0/8)", "(0/8) ", actual);
		
		actual = testJug4.toString();
		assertEquals("String representation of testJug 0 is: (3/8)", "(3/8) ", actual);
		
		actual = testJug5.toString();
		assertEquals("String representation of testJug 0 is: (5/5)", "(5/5) ", actual);
		
		actual = testJug6.toString();
		assertEquals("String representation of testJug 0 is: (3/3)", "(3/3) ", actual);
		
		actual = testJug7.toString();
		assertEquals("String representation of testJug 0 is: (1/1)", "(1/1) ", actual);
		
		actual = testJug8.toString();
		assertEquals("String representation of testJug 0 is: (0/0)", "(0/0) ", actual);
		
		actual = testJug9.toString();
		assertEquals("String representation of testJug 0 is: (1000/5000) ", "(1000/5000) ", actual);
		
		
	}
	
	
	/**
	 * Unit test for addLiquid() method of Jug.
	 */
	@Test
	public void testAddLiquid() {
		Jug testJug0 = new Jug(8,0);
		Jug testJug1 = new Jug(5,5);
		Jug testJug2 = new Jug(3,3);
		Jug testJug3 = new Jug(8,8);
		Jug testJug4 = new Jug(8,5);
		
		
		
		actual = testJug0.addLiquid(0);
		assertEquals("testJug0 had 0 units of liquid "
				+ ", its current amount is: 0", 0, actual);
		
		actual = testJug0.addLiquid(1);
		assertEquals("testJug0 had 0 units of liquid "
				+ ", its current amount is: 1", 1, actual);	
		
		actual = testJug0.addLiquid(2);
		assertEquals("testJug0 had 1 units of liquid "
				+ ", its current amount is 3, so 2 units were added", 2, actual);	
		
		actual = testJug0.addLiquid(3);
		assertEquals("testJug0 had 3 units of liquid "
				+ ", its current amount is 6, so 3 units were added", 3, actual);	
		
		actual = testJug0.addLiquid(1);
		assertEquals("testJug0 had 0 units of liquid "
				+ ", its current amount is 1, so 1 unit was added", 1, actual);	
		
		actual = testJug1.addLiquid(1);
		assertEquals("testJug1 had 5 units of liquid "
				+ ", its current amount is 5, so 0 units were added", 0, actual);	
		
		actual = testJug2.addLiquid(10);
		assertEquals("testJug2 had 3 units of liquid "
				+ ", its current amount is 3, so 0 units were added", 0, actual);	
		
		actual = testJug3.addLiquid(8);
		assertEquals("testJug3 had 8 units of liquid "
				+ ", its current amount is 8, so 8 units were added", 0, actual);	
		
		actual = testJug4.addLiquid(5);
		assertEquals("testJug4 had 5 units of liquid "
				+ ", its current amount is 5, so 0 units were added", 0, actual);	
		
		actual = testJug4.addLiquid(3);
		assertEquals("testJug4 had 5 units of liquid "
				+ ", its current amount is 8, so 3 units were added", 3, actual);	
	}

	/**
	 * Unit test for removeLiquid() method of Jug.
	 */
	@Test
	public void testRemoveLiquid() {
		
		Jug testJug0 = new Jug(8,0);
		Jug testJug1 = new Jug(5,5);
		Jug testJug2 = new Jug(3,3);
		Jug testJug3 = new Jug(8,8);
		Jug testJug4 = new Jug(8,5);
		Jug testJug5 = new Jug(8,0);
		
		
		actual = testJug0.removeLiquid(0);		
		assertEquals("testJug0 had 0 units of liquid "
				+ ", its current amount is 0, so 0 units were removed", 0, actual);
		
		actual = testJug0.removeLiquid(8);
		assertEquals("testJug0 had 0 units of liquid "
				+ ", its current amount is 0, so 0 units were removed", 0, actual);	
		
		actual = testJug1.removeLiquid(0);
		assertEquals("testJug1 had 5 units of liquid "
				+ ", its current amount is 5, so 0 units were removed", 0, actual);	
		
		actual = testJug1.removeLiquid(2);
		assertEquals("testJug1 had 5 units of liquid "
				+ ", its current amount is 3, so 2 units were removed", 2, actual);	
		
		actual = testJug1.removeLiquid(4);
		assertEquals("testJug1 had 3 units of liquid "
				+ ", its current amount is 3, so 0 units were removed", 0, actual);	
		
		actual = testJug1.removeLiquid(3);
		assertEquals("testJug1 had 3 units of liquid "
				+ ", its current amount is 0, so 3 units were removed", 3, actual);	
		
		actual = testJug2.removeLiquid(10);
		assertEquals("testJug2 had 3 units of liquid "
				+ ", its current amount is 3, so 0 units were removed", 0, actual);	
		
		actual = testJug3.removeLiquid(8);
		assertEquals("testJug3 had 8 units of liquid "
				+ ", its current amount is 0, so 8 units were removed", 8, actual);	
		
		actual = testJug4.removeLiquid(5);
		assertEquals("testJug4 had 5 units of liquid "
				+ ", its current amount is 0, so 5 units were removed", 5, actual);	
		
		actual = testJug5.removeLiquid(3);
		assertEquals("testJug5 had 0 units of liquid "
				+ ", its current amount is 0, so 0 units were removed", 0, actual);	
	}

	/**
	 * Unit test for spillInto() method of Jug.
	 */
	@Test
	public void testSpillInto() {
		Jug testJug0 = new Jug(8,8);
		Jug testJug1 = new Jug(5,0);
		Jug testJug2 = new Jug(3,0);
		Jug testJug3 = new Jug(0,0);
		Jug testJug4 = new Jug(5,5);
		Jug testJug5 = new Jug(3,3);
		String actual;
		
		testJug0.spillInto(testJug1);
		assertTrue("testJug1 now has 5 units of liquid", 5 == testJug1.getCurrentAmount());
		assertTrue("testJug0 now has 3 units of liquid", 3 == testJug0.getCurrentAmount());
		
		testJug1.spillInto(testJug2);
		assertTrue("testJug1 now has 2 units of liquid", 2 == testJug1.getCurrentAmount());
		assertTrue("testJug2 now has 3 units of liquid", 3 == testJug2.getCurrentAmount());
		
		testJug2.spillInto(testJug0);
		assertTrue("testJug2 now has 0 units of liquid", 0 == testJug2.getCurrentAmount());
		assertTrue("testJug0 now has 6 units of liquid", 6 == testJug0.getCurrentAmount());
		
		testJug1.spillInto(testJug2);
		assertTrue("testJug1 now has 0 units of liquid", 0 == testJug1.getCurrentAmount());
		assertTrue("testJug2 now has 2 units of liquid", 2 == testJug2.getCurrentAmount());
		
		testJug0.spillInto(testJug1);
		assertTrue("testJug0 now has 1 units of liquid", 1 == testJug0.getCurrentAmount());
		assertTrue("testJug1 now has 5 units of liquid", 5 == testJug1.getCurrentAmount());
		
		testJug1.spillInto(testJug2);
		assertTrue("testJug1 now has 4 units of liquid", 4 == testJug1.getCurrentAmount());
		assertTrue("testJug2 now has 3 units of liquid", 3 == testJug2.getCurrentAmount());
		
		testJug2.spillInto(testJug0);
		assertTrue("testJug2 now has 0 units of liquid", 0 == testJug2.getCurrentAmount());
		assertTrue("testJug0 now has 4 units of liquid", 4 == testJug0.getCurrentAmount());
		
		testJug5.spillInto(testJug4);
		assertTrue("testJug5 now has 3 units of liquid", 3 == testJug5.getCurrentAmount());
		assertTrue("testJug4 now has 5 units of liquid", 5 == testJug4.getCurrentAmount());
		
		testJug4.spillInto(testJug5);
		assertTrue("testJug4 now has 5 units of liquid", 5 == testJug4.getCurrentAmount());
		assertTrue("testJug5 now has 3 units of liquid", 3 == testJug5.getCurrentAmount());
		
		testJug3.spillInto(testJug4);
		assertTrue("testJug3 now has 0 units of liquid", 0 == testJug3.getCurrentAmount());
		assertTrue("testJug4 now has 5 units of liquid", 5 == testJug4.getCurrentAmount());
		
		
	}

	

}
