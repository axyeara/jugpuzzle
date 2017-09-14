import java.io.*;
import java.util.Scanner;

public class PrimeTester {
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("Input a number: ");
			n = scanner.nextInt();
			if (isPrime(n)) {
				System.out.println(n + " is a prime number");
			}
			else {
				System.out.println(n + " is not a prime number");
			}
		}
	}
}
