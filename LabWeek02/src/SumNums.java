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
			int sum = 0;
			int startsum = start;
			int endsum = end;
			while(startsum != endsum + 1) {
				sum += startsum;
				startsum += 1;
			}
			System.out.println("The sum from "+start+" to "+end+ " is: " + sum);
			
		}
	
	}
}
