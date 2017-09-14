import java.io.*;
import java.util.*;
public class SumNums {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		String line;
		int start, end;
		while(true) {
			System.out.println("Starting number: ");
			start = scanner.nextInt();
			System.out.println("Ending number: ");
			end = scanner.nextInt();
			System.out.println("The sum from "+start+" to "+end+ " is: " + sumup(start,end));
		}
	}
	public static int sumup(int a, int b) {
		int sum = 0;
		if (b>=a) {
			while (a != b + 1) {
				sum += a;
				a++;
			}
			return sum;
		}
		else {
			return 0;
		}
	}
}
