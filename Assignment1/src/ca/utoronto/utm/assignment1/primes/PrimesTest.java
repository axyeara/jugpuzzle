package ca.utoronto.utm.assignment1.primes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

/**
 * @author Alexander
 *
 * This class defines JUnit test cases for all the methods in Primes.java. It also defines different variables for ArrayLists and in[] arrays for these test cases.
 */

public class PrimesTest {

	ArrayList<Integer> a;
	ArrayList<Integer> b;
	ArrayList<Integer> c;
	ArrayList<Integer> d;
	ArrayList<Integer> e;
	ArrayList<Integer> f;
	ArrayList<Integer> g;
	int[] array1;
	int[] array2;
	int[] array3;
	int[] array4;
	int[] array5;
	int[] array6;
	
	/**
	 * Test cases for the IsPrime() method from Primes.java
	 */
	@Test
	public void testIsPrime() {
		
		// assert statements
		assertEquals("2 is prime", true, Primes.isPrime(2));
		assertEquals("3 is prime", true, Primes.isPrime(3));
		assertEquals("5 is prime", true, Primes.isPrime(5));
		assertEquals("11 is prime", true, Primes.isPrime(11));
		assertEquals("101 is prime", true, Primes.isPrime(101));
		assertEquals("-7 is not prime", false, Primes.isPrime(-7));
		assertEquals("-1 is not prime", false, Primes.isPrime(-1));
		assertEquals("0 is not prime", false, Primes.isPrime(-0));
		assertEquals("1 is not prime", false, Primes.isPrime(1));
		assertEquals("4 is not prime", false, Primes.isPrime(4));
		assertEquals("6 is not prime", false, Primes.isPrime(6));
	}
	
	/**
	 * Test cases for the Primes() method from Primes.java.
	 */
	@Test
	public void testPrimes() {
		array1 = Primes.primes(10);
		array2 = Primes.primes(1);
		array3 = Primes.primes(1000);
		array4 = Primes.primes(0);
		array5 = Primes.primes(2);
		array6 = Primes.primes(5);
		
		// assert statements
		 assertEquals("length of array is 10", 10, array1.length);
		 assertEquals("length of array is 1", 1, array2.length);
		 assertEquals("length of array is 1000", 1000, array3.length);
		 assertEquals("length of array is 0", 0, array4.length);
		 assertEquals("length of array is 5", 5, array6.length);
		 assertTrue("prime number at index 1 in array is 3", array1[1] == 3);
		 assertTrue("prime number at the last index in array is 29", array1[array1.length - 1] == 29);
		 assertTrue("prime number at index 1 in array is 3", array5[1] == 3);
		 assertTrue("prime number at index 3 in array is 7", array6[3] == 7);
		 assertTrue("prime number at index 1 in array is 2", array1[0] == 2);
	}
	
	/**
	 * Test cases for the primesLessThan() method from Primes.java.
	 */
	@Test
	public void testPrimesLessThan() {
		 a = Primes.primesLessThan(10);
		 b = Primes.primesLessThan(0);
		 c = Primes.primesLessThan(51);
		 d = Primes.primesLessThan(2);
		 e = Primes.primesLessThan(4);
		 f = Primes.primesLessThan(1000);
		 g = Primes.primesLessThan(3);
		 
		 // assert statements
		 assertEquals("length of array is 4", 4, a.size());
		 assertEquals("length of array is 0", 0, b.size());
		 assertEquals("length of array is 15", 15, c.size());
		 assertEquals("length of array is 0", 0, d.size());
		 assertEquals("length of array is 2", 2, e.size());
		 assertEquals("length of array is 168", 168, f.size());
		 assertTrue("prime number at index 0 in array is 2", e.get(0) == 2);
		 assertTrue("prime number at index 3 in array is 7", a.get(3) == 7);
		 assertTrue("prime number at index 14 in array is 47", c.get(14) == 47);
		 assertTrue("prime number at index 167 in array is 997", f.get(167) == 997);
		 assertTrue("prime number at index 0 in array is 3", g.get(0) == 2);
		 
	}

	/**
	 * Test cases for the primesLessThanSieveRemove() method from Primes.java
	 */
	@Test
	public void testPrimesLessThanSieveRemove() {
		 a = Primes.primesLessThanSieveRemove(10);
		 b = Primes.primesLessThanSieveRemove(0);
		 c = Primes.primesLessThanSieveRemove(51);
		 d = Primes.primesLessThanSieveRemove(2);
		 e = Primes.primesLessThanSieveRemove(4);
		 f = Primes.primesLessThanSieveRemove(1000);
		 g = Primes.primesLessThan(3);
			 
		 // assert statements
		 assertEquals("length of array is 4", 4, a.size());
		 assertEquals("length of array is 0",0, b.size());
		 assertEquals("length of array is 15",15, c.size());
		 assertEquals("length of array is 0",0, d.size());
		 assertEquals("length of array is 2",2, e.size());
		 assertEquals("length of array is 168", 168, f.size());
		 assertTrue("prime number at index 0 in array is 2", e.get(0) == 2);
		 assertTrue("prime number at index 3 in array is 7", a.get(3) == 7);
		 assertTrue("prime number at index 14 in array is 47", c.get(14) == 47);
		 assertTrue("prime number at index 167 in array is 997", f.get(167) == 997);
		 assertTrue("prime number at index 0 in array is 3", g.get(0) == 2);
	}

	/**
	 * Test cases for the primesLessThanSieveAdd() method from Primes.java
	 */
	@Test
	public void testPrimesLessThanSieveAdd() {
		 a = Primes.primesLessThanSieveAdd(10);
		 b = Primes.primesLessThanSieveAdd(0);
		 c = Primes.primesLessThanSieveAdd(51);
		 d = Primes.primesLessThanSieveAdd(2);
		 e = Primes.primesLessThanSieveAdd(4);
		 f = Primes.primesLessThanSieveAdd(1000);
		 g = Primes.primesLessThan(3);
		 
		 // assert statements
		 assertEquals("length of array is 4", 4, a.size());
		 assertEquals("length of array is 0",0, b.size());
		 assertEquals("length of array is 15", 15, c.size());
		 assertEquals("length of array is 0", 0, d.size());
		 assertEquals("length of array is 2", 2, e.size());
		 assertEquals("length of array is 168", 168, f.size());
		 assertTrue("prime number at index 0 in array is 2", e.get(0) == 2);
		 assertTrue("prime number at index 3 in array is 7", a.get(3) == 7);
		 assertTrue("prime number at index 14 in array is 47", c.get(14) == 47);
		 assertTrue("prime number at index 167 in array is 997", f.get(167) == 997);
		 assertTrue("prime number at index 0 in array is 3", g.get(0) == 2);
	}

	/**
	 * Test cases for the primesLessThanSieveRemove2() method from Primes.java
	 */
	@Test
	public void testPrimesLessThanSieveRemove2() {
		 a = Primes.primesLessThanSieveRemove2(10);
		 b = Primes.primesLessThanSieveRemove2(0);
		 c = Primes.primesLessThanSieveRemove2(51);
		 d = Primes.primesLessThanSieveRemove2(2);
		 e = Primes.primesLessThanSieveRemove2(4);
		 f = Primes.primesLessThanSieveRemove2(1000);
		 g = Primes.primesLessThan(3);
		 
		 // assert statements
		 assertEquals("length of array is 4", 4, a.size());
		 assertEquals("length of array is 0", 0, b.size());
		 assertEquals("length of array is 15", 15, c.size());
		 assertEquals("length of array is 0", 0, d.size());
		 assertEquals("length of array is 2", 2, e.size());
		 assertEquals("length of array is 168", 168, f.size());
		 assertTrue("prime number at index 0 in array is 2", e.get(0) == 2);
		 assertTrue("prime number at index 3 in array is 7", a.get(3) == 7);
		 assertTrue("prime number at index 14 in array is 47", c.get(14) == 47);
		 assertTrue("prime number at index 167 in array is 997", f.get(167) == 997);
		 assertTrue("prime number at index 0 in array is 3", g.get(0) == 2);
	}

}
