package ca.utoronto.utm.assignment1.primes;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alexander
 * 
 * This class defines different methods regarding primes.
 */
public class Primes {
    public static void main(String [] args){
            System.out.println(primes(10000)[9999]);
            System.out.println(primesLessThan(10000));

            int n = 1000000;
            ArrayList<Integer> a;
            long start, end;
            
            
            start = System.currentTimeMillis();
            a = primesLessThan(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveRemove(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveAdd(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));
            
            start = System.currentTimeMillis();
            a = primesLessThanSieveRemove2(n);
            end = System.currentTimeMillis();
            System.out.println(a.size()+ " " + (end-start));          
    }
	/**
	 * This method determines whether a given non-negative integer n is a prime number.
	 * 
	 * @param n Non-negative integer to which this method determines if it is prime or not.
	 * @return Returns true if the given integer n is prime. Returns false if otherwise.
	 */
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i < n; i = i + 1) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

	/**
	 * This method returns an array of the first n primes.
	 * 
	 * @param n Amount of the first primes to be return within an array.
	 * @return Returns an array of the first n primes.
	 */
	public static int[] primes(int n) {
		int current = 2;
		int num_primes = 0;
		int[] list_of_primes = new int[n];

		while (num_primes < n) {
			if (isPrime(current)) {
				list_of_primes[num_primes] = current;
				num_primes = num_primes + 1;
			}
			current = current + 1;
		}
		return list_of_primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n.
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	
	public static ArrayList<Integer> primesLessThan(int n) {
		ArrayList<Integer> array_of_primes = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (isPrime(i)){
				array_of_primes.add(i);
			}		
		}
		return array_of_primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n.
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	public static ArrayList<Integer> primesLessThanSieveRemove(int n) {
		ArrayList<Integer> primes = new ArrayList<>();		
		for (int i = 2; i < n; i++) {
			primes.add(i);
		}
		ArrayList<Integer> referenceList = new ArrayList<>(primes);
		for (int number: referenceList) {
			for (int other_number:referenceList.subList(referenceList.indexOf(number) + 1, referenceList.size())){
				if (other_number % number == 0) {
					primes.remove((Object)other_number);
				}
			}
		}
		return primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n.
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	public static ArrayList<Integer> primesLessThanSieveAdd(int n){
		ArrayList<Integer> primes = new ArrayList<>();
		for (int i = 2; i < n; i++) {
			boolean dividesBy = false;
			for (int prime: primes) {
				if (i % prime == 0) {
					dividesBy = true;
				}
			}
			if (dividesBy == false) {
				primes.add(i);
			}
		}
		return primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n.
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	public static ArrayList<Integer> primesLessThanSieveRemove2(int n){
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);
		for (int i = 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j % i == 0 && j != i) {
					primes[j] = false;
				}
			}
		}
		ArrayList<Integer> finalPrimes = new ArrayList<>();
		for (int x = 2; x < n; x++) {
			if (primes[x] == true) {
				finalPrimes.add(x);
			}
		}
		return finalPrimes;
	}
}



/* Answer to point g.
 * 
 * The method primeLessThan is fastest than the other primeLessThan* methods because */
