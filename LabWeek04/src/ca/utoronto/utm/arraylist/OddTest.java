package ca.utoronto.utm.arraylist;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class OddTest {

	@Test
	public void testOdds() {
		ArrayList<Integer> actual;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		actual = Odd.odds(-5);
		assertEquals("odds(-5) should be empty", expected, actual);  
		
		actual = Odd.odds(-2);
		assertEquals("odds(-2) should be empty", expected, actual);  

		actual = Odd.odds(-1);
		assertEquals("odds(-1) should be empty", expected, actual);  

		actual = Odd.odds(0);
		assertEquals("odds(0) should be empty", expected, actual);  

		actual = Odd.odds(1);
		assertEquals("odds(1) smallest non-empty odd set", expected, actual);  

		actual = Odd.odds(2);
		expected.add(1);
		assertEquals("odds(2) smallest non-empty odd set", expected, actual);  

		actual = Odd.odds(11);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		assertEquals("odds(11) more general n", expected, actual);  

		actual = Odd.odds(12);
		expected.add(11);
		assertEquals("odds(13) more general n", expected, actual);  
		
		actual = Odd.odds(20);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		assertEquals("odds(15) more general n", expected, actual); 
	}
}
