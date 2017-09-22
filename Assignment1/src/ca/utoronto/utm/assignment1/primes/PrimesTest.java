package ca.utoronto.utm.assignment1.primes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimesTest {

	// Add in a testXX for each public method XX in Primes
	
	@Test
	public void testIsPrime() {
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

}
