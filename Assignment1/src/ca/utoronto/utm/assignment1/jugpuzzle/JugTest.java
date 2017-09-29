package ca.utoronto.utm.assignment1.jugpuzzle;

import static org.junit.Assert.*;

import org.junit.Test;

public class JugTest {
	Jug testJug0 = new Jug(8,8);
	Jug testJug1 = new Jug(0,5);
	Jug testJug2 = new Jug(0,3);
	Jug testJug3 = new Jug(1,1);
	Jug testJug4 = new Jug(0,6);
	Jug testJug5 = new Jug(2,100);
	Jug testJug6 = new Jug(500,999);
	Jug testJug7 = new Jug(25,30);
	Jug testJug8 = new Jug(10000,10000);
	Jug testJug9 = new Jug(0,0);
	
	
	@Test
	public void testGetCapacity() {
		
		// assert statements
		assertEquals("Capacity of this Jug is 8", 8, testJug0.getCapacity());
		assertEquals("Capacity of this Jug is 0", 0, testJug1.getCapacity());
		assertEquals("Capacity of this Jug is 0", 0, testJug2.getCapacity());
		assertEquals("Capacity of this Jug is 1", 1, testJug3.getCapacity());
		assertEquals("Capacity of this Jug is 0", 0, testJug4.getCapacity());
		assertEquals("Capacity of this Jug is 2", 2, testJug5.getCapacity());
		assertEquals("Capacity of this Jug is 500", 500, testJug6.getCapacity());
		assertEquals("Capacity of this Jug is 25", 25, testJug7.getCapacity());
		assertEquals("Capacity of this Jug is 10000", 10000, testJug8.getCapacity());
		assertEquals("Capacity of this Jug is 0", 0, testJug9.getCapacity());
	}

	@Test
	public void testGetCurrentAmount() {
		
		// assert statements
		assertEquals("Amount of this Jug is 8", 8, testJug0.getCurrentAmount());
		assertEquals("Amount of this Jug is 5", 5, testJug1.getCurrentAmount());
		assertEquals("Amount of this Jug is 3", 3, testJug2.getCurrentAmount());
		assertEquals("Amount of this Jug is 1", 1, testJug3.getCurrentAmount());
		assertEquals("Amount of this Jug is 6", 6, testJug4.getCurrentAmount());
		assertEquals("Amount of this Jug is 100", 100, testJug5.getCurrentAmount());
		assertEquals("Amount of this Jug is 999", 999, testJug6.getCurrentAmount());
		assertEquals("Amount of this Jug is 30", 30, testJug7.getCurrentAmount());
		assertEquals("Amount of this Jug is 10000", 10000, testJug8.getCurrentAmount());
		assertEquals("Amount of this Jug is 0", 0, testJug9.getCurrentAmount());	
	}

	@Test
	public void testSetCurrentAmount() {
		int actual = testJug0.getCurrentAmount();
		testJug0.setCurrentAmount(8);
		int expected = testJug0.getCurrentAmount();
		
		// assert statements
		assertEquals("Amount of this Jug is 8", 8, expected);
	}
}
