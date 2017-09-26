package ca.utoronto.utm.assignment1.primes;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Alexander
 *
 * NOTE TO TA: PLEASE IGNORE THIS TEST CASE FILE. PLEASE REFER TO PRIMESTEST.JAVA TEST CASES. THIS FILE WAS IMPOSSIBLE TO DELETE. SORRY.
 */  
public class primesLessThanTest {
	ArrayList<Integer> a;
	ArrayList<Integer> b;
	ArrayList<Integer> c;
	ArrayList<Integer> d;
	ArrayList<Integer> e;
	ArrayList<Integer> f;
	boolean num1;
	boolean num2;
	boolean num3;
	boolean num4;
	boolean num5;
	boolean num6;
	int[] array1;
	int[] array2;
	int[] array3;
	int[] array4;
	
	
	
	/**
	 * Test cases for the IsPrime() method from Primes.java
	 */
	@Test
	public void testIsPrime() {
		num1 = Primes.isPrime(0);
		num2 = Primes.isPrime(1);
		num3 = Primes.isPrime(2);
		num4 = Primes.isPrime(47);
		num5 = Primes.isPrime(997);
		num6 = Primes.isPrime(1000);
		// assert statements
		 assertEquals(false, num1);
		 assertEquals(false, num2);
		 assertEquals(true, num3);
		 assertEquals(true, num4);
		 assertEquals(true, num5);
		 assertEquals(false, num6);
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
		// assert statements
		assertEquals(10, array1.length);
		 assertEquals(1, array2.length);
		 assertEquals(1000, array3.length);
		 assertEquals(0, array4.length);
		 assertTrue(array1[1] == 3);
		 assertTrue(array1[array1.length - 1] == 29);
		 
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
		 // assert statements
		 assertEquals(4, a.size());
		 assertEquals(0, b.size());
		 assertEquals(15, c.size());
		 assertEquals(0, d.size());
		 assertEquals(2, e.size());
		 assertTrue(e.get(0) == 2);
		 assertTrue(a.get(3) == 7);
		 assertTrue(c.get(14) == 47);
		 assertEquals(168, f.size());
		 assertTrue(f.get(167) == 997);
		 
		 
		 
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
		 // assert statements
		 assertEquals(4, a.size());
		 assertEquals(0, b.size());
		 assertEquals(15, c.size());
		 assertEquals(0, d.size());
		 assertEquals(2, e.size());
		 assertTrue(e.get(0) == 2);
		 assertTrue(a.get(3) == 7);
		 assertTrue(c.get(14) == 47);
		 assertEquals(168, f.size());
		 assertTrue(f.get(167) == 997);
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
		 // assert statements
		 assertEquals(4, a.size());
		 assertEquals(0, b.size());
		 assertEquals(15, c.size());
		 assertEquals(0, d.size());
		 assertEquals(2, e.size());
		 assertTrue(e.get(0) == 2);
		 assertTrue(a.get(3) == 7);
		 assertTrue(c.get(14) == 47);
		 assertEquals(168, f.size());
		 assertTrue(f.get(167) == 997);
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
		 // assert statements
		 assertEquals(4, a.size());
		 assertEquals(0, b.size());
		 assertEquals(15, c.size());
		 assertEquals(0, d.size());
		 assertEquals(2, e.size());
		 assertTrue(e.get(0) == 2);
		 assertTrue(a.get(3) == 7);
		 assertTrue(c.get(14) == 47);
		 assertEquals(168, f.size());
		 assertTrue(f.get(167) == 997);
	}

}
