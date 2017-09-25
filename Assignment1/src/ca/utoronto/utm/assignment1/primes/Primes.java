package ca.utoronto.utm.assignment1.primes;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alexander
 * 
 * This class defines different methods regarding primes, such as: determining whether a positive integer is a prime or not,
 * finding the first given number of primes, and different algorithm/methods to find all the primes that are less than a given 
 * number.
 * 
 */
public class Primes {
    public static void main(String [] args){
            System.out.println(primes(10000)[9999]);
            System.out.println(primesLessThan(10000));

            int n = 10000000;
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
	 * This method returns an array of primes that are less than a given non-negative integer n. This
	 * method has a runtime complexity O(n) and thus much more efficient than the other primesLessThanMethods*. It does depend, however,
	 * on the isPrime() method during iteration to check whether each number is a prime.
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	
	public static ArrayList<Integer> primesLessThan(int n) {
		ArrayList<Integer> array_of_primes = new ArrayList<>();
		for (int num = 0; num < n; num++) {
			if (isPrime(num)){
				array_of_primes.add(num);
			}		
		}
		return array_of_primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n. Has a runtime complexity (On^2).
	 * Note that runtime is significantly lower compared to the other methods.
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	public static ArrayList<Integer> primesLessThanSieveRemove(int n) {
		ArrayList<Integer> primes = new ArrayList<>();		
		for (int num = 2; num < n; num++) {
			primes.add(num);
		}
		ArrayList<Integer> referenceList = new ArrayList<>(primes);  // Had to make a copy of ArrayList primes. The copied list 
		                                                             // is used as a reference for splicing and iteration.
		for (int number: referenceList) {
			for (int other_number:referenceList.subList(referenceList.indexOf(number) + 1, referenceList.size())){  //Splicing of the reference list
				if (other_number % number == 0) {                                                                   //into a sublist containing the elements
					primes.remove((Object)other_number);                                                            //of higher index until the end of the list.
				}
			}
		}
		return primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n. Has a runtime complexity O(n^2).
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	public static ArrayList<Integer> primesLessThanSieveAdd(int n){
		ArrayList<Integer> primes = new ArrayList<>();
		for (int num = 2; num < n; num++) {
			boolean dividesBy = false;
			for (int prime: primes) {      
				if (num % prime == 0) {  
					dividesBy = true;
				}
			}
			if (dividesBy == false) {
				primes.add(num);
			}
		}
		return primes;
	}
	
	/**
	 * This method returns an array of primes that are less than a given non-negative integer n. Has a runtime complexity O(n^2).
	 * 
	 * @param n Maximum integer by which an array of primes less than it will be formed.
	 * @return Returns an ArrayList of all the prime numbers that are less than n.
	 */
	public static ArrayList<Integer> primesLessThanSieveRemove2(int n){
		boolean[] primes = new boolean[n];
		Arrays.fill(primes, true);
		for (int num = 2; num < n; num++) {
			for (int index = 0; index < n; index++) {
				if (index % num == 0 && index != num) {  // if the index j is divisible by integer i in the array, 
					primes[index] = false;               // the boolean value of that particular index of the boolean array is set to false.
				}
			}
		}
		ArrayList<Integer> finalPrimes = new ArrayList<>();
		for (int i = 2; i < n; i++) {
			if (primes[i] == true) {
				finalPrimes.add(i);
			}
		}
		return finalPrimes;
	}
}



/* Answer to point g.
 * 
 * The method primeLessThan is faster than the other primeLessThan* methods because we iterating of a range of numbers only once using a "for" loop.
 * This suggests that the algorithm runtime complexity is O(n). The other primeLessThan* methods have more that one "for" loops (which are nested), suggesting
 * these have an algorithm runtime complexity of O(n^2).*/
 
