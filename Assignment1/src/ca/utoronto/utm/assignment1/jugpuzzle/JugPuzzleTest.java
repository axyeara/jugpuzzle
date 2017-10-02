package ca.utoronto.utm.assignment1.jugpuzzle;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author csc207 student
 *
 * Class for unit tests of the methods belonging to the JugPuzzle.java file. These methods
 * test are: toString(), JugPuzzle() and move().
 */
public class JugPuzzleTest {
	
	
	int actual;
	JugPuzzle testPuzzle;
	Jug[] testArray;

	/**
	 * Unit test for move() method of JugPuzzle.
	 */
	@Test
	public void testMove() {
		String actual;
		
		testPuzzle = new JugPuzzle();
		testPuzzle.move(0, 0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "1  0:(8/8) 1:(0/5) 2:(0/3) ", "1  0:(8/8) 1:(0/5) 2:(0/3) ", actual);
		
		
		testPuzzle.move(0, 1);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "2  0:(3/8) 1:(5/5) 2:(0/3) ", "2  0:(3/8) 1:(5/5) 2:(0/3) ", actual);
		
		
		testPuzzle.move(1, 2);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "3  0:(3/8) 1:(2/5) 2:(3/3) ", "3  0:(3/8) 1:(2/5) 2:(3/3) ", actual);
		
		
		testPuzzle.move(2, 0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "4  0:(6/8) 1:(2/5) 2:(0/3) ", "4  0:(6/8) 1:(2/5) 2:(0/3) ", actual);
		
		
		testPuzzle.move(1, 2);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "5  0:(6/8) 1:(0/5) 2:(2/3) ", "5  0:(6/8) 1:(0/5) 2:(2/3) ", actual);
		
		
		testPuzzle.move(0, 1);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "6  0:(1/8) 1:(5/5) 2:(2/3) ", "6  0:(1/8) 1:(5/5) 2:(2/3) ", actual);
		
		
		testPuzzle.move(1, 2);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "7  0:(1/8) 1:(4/5) 2:(3/3) ", "7  0:(1/8) 1:(4/5) 2:(3/3) ", actual);
		
		
		testPuzzle.move(2, 0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "8  0:(4/8) 1:(4/5) 2:(0/3) ", "8  0:(4/8) 1:(4/5) 2:(0/3) ", actual);
		
		
		testPuzzle.move(2, 0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "9  0:(4/8) 1:(4/5) 2:(0/3) ", "9  0:(4/8) 1:(4/5) 2:(0/3) ", actual);
		
		
		testPuzzle.move(1, 2);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "10  0:(4/8) 1:(1/5) 2:(3/3) ", "10  0:(4/8) 1:(1/5) 2:(3/3) ", actual);
		
		
	}


	/**
	 * Unit test for toString() method and JugPuzzle() constructor method of JugPuzzle.
	 */
	@Test
	public void testToString() {
		String actual;
		
		testPuzzle = new JugPuzzle();
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(8/8) 1:(0/5) 2:(0/3) ", "0  0:(8/8) 1:(0/5) 2:(0/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,3);
		testPuzzle.getAllJugs()[1] = new Jug(5,5);
		testPuzzle.getAllJugs()[2] = new Jug(3,0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(3/8) 1:(5/5) 2:(0/3) ", "0  0:(3/8) 1:(5/5) 2:(0/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,3);
		testPuzzle.getAllJugs()[1] = new Jug(5,2);
		testPuzzle.getAllJugs()[2] = new Jug(3,3);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(3/8) 1:(2/5) 2:(3/3) ", "0  0:(3/8) 1:(2/5) 2:(3/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,6);
		testPuzzle.getAllJugs()[1] = new Jug(5,2);
		testPuzzle.getAllJugs()[2] = new Jug(3,0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(6/8) 1:(2/5) 2:(0/3) ", "0  0:(6/8) 1:(2/5) 2:(0/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,3);
		testPuzzle.getAllJugs()[1] = new Jug(5,5);
		testPuzzle.getAllJugs()[2] = new Jug(3,0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(3/8) 1:(5/5) 2:(0/3) ", "0  0:(3/8) 1:(5/5) 2:(0/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,1);
		testPuzzle.getAllJugs()[1] = new Jug(5,4);
		testPuzzle.getAllJugs()[2] = new Jug(3,3);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(1/8) 1:(4/5) 2:(3/3) ", "0  0:(1/8) 1:(4/5) 2:(3/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,4);
		testPuzzle.getAllJugs()[1] = new Jug(5,4);
		testPuzzle.getAllJugs()[2] = new Jug(3,0);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(4/8) 1:(4/5) 2:(0/3) ", "0  0:(4/8) 1:(4/5) 2:(0/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,2);
		testPuzzle.getAllJugs()[1] = new Jug(5,4);
		testPuzzle.getAllJugs()[2] = new Jug(3,2);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "0  0:(2/8) 1:(4/5) 2:(2/3) ", "0  0:(2/8) 1:(4/5) 2:(2/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,3);
		testPuzzle.getAllJugs()[1] = new Jug(5,5);
		testPuzzle.getAllJugs()[2] = new Jug(3,0);
		testPuzzle.move(0, 1);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "1  0:(3/8) 1:(5/5) 2:(0/3) ", "1  0:(3/8) 1:(5/5) 2:(0/3) ", actual);
		
		testPuzzle.getAllJugs()[0] = new Jug(8,3);
		testPuzzle.getAllJugs()[1] = new Jug(5,5);
		testPuzzle.getAllJugs()[2] = new Jug(3,0);
		testPuzzle.move(1, 2);
		actual = testPuzzle.toString();
		assertEquals("The string representation of this puzzle is: "
				+ "2  0:(3/8) 1:(2/5) 2:(3/3) ", "2  0:(3/8) 1:(2/5) 2:(3/3) ", actual);
		
		
	}

}
