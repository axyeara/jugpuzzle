package ca.utoronto.utm.labweek11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFSMPractice {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = in.readLine()) != null) {
				if (recogniseSomethingRegex(line)) {
					System.out.println("recogniseSomethingRegex accepts " + line);
				} else {
					System.out.println("recogniseSomethingRegex rejects " + line);
				}
				if (recogniseSomethingFSM(line)) {
					System.out.println("recogniseSomethingFSM accepts " + line);
				} else {
					System.out.println("recogniseSomethingFSM rejects " + line);
				}
				if (recogniseWellFedRegex(line)) {
					System.out.println("recogniseWellFedRegex accepts " + line);
				} else {
					System.out.println("recogniseWellFedRegex rejects " + line);
				}
				if (recogniseWellFedFSM(line)) {
					System.out.println("recogniseWellFedFSM accepts " + line);
				} else {
					System.out.println("recogniseWellFedFSM rejects " + line);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Come up with some strings so that recogniseSomethingRegex returns true
	// Describe what this recognizes.
	public static boolean recogniseSomethingRegex(String s) {
		char [] c=s.toCharArray();
		int len=s.length();
		
		boolean retVal=true;
		
		int n=0;
		int state=0; // Start out in the initial state
		while(n<len){
			switch(state){	
				case 0:
					if ('0' <= c[n] && c[n] <= '9') {
						state = 1;}
					else {
						
					}
					break;
				case 1:
					if ('0' <= c[n] && c[n] <=  '9') {
						state = 1;
					} else if (c[n] == 'a' | c[n] == 'e' | c[n] == 'i' | c[n] == 'o' | c[n] == 'u') {
						state = 2;
					}
					break;
				case 2:
					if (c[n] == 'a' | c[n] == 'e' | c[n] == 'i' | c[n] == 'o' | c[n] == 'u') {
						state = 3;
					} else {			
					}
					break;
				case 3:
					if (c[n] == 'a' | c[n] == 'e' | c[n] == 'i' | c[n] == 'o' | c[n] == 'u') {
						state = 4;
					}
					break;
				case 4:
					if (c[n] == ':') {
						state = 5;
					}
					break;
				case 5:
					if (c[n] == 'y' | c[n] == 'x' | c[n] == 'z') {
						state = 6;
					}
					break;
				case 6:
					if (c[n] != 'e') {
						state = 7;
					} else if (c[n] == 'e') {
						state = 8;
					}
					break;
				case 7:
					if (c[n] == 'e') {
						state = 8;
					}
					break;
				case 8:
					if (c[n] == 'n') {
						state = 9;
					}
					break;
				case 9:
					if (c[n] == 'd') {
						state = 10;
					}
					break;
				
					
			}
			n=n+1;
		}
		
		if (state != 10) {
			retVal = false;
		}
		return retVal;
	}
	
	
	// Come up with some strings so that recogniseSomethingFSM returns true
	// Describe what this recognises.
	// This method recognizes numbers that start with either 0 or 1-9 and ends with 0. Best explained by the regex: ^([0-9])*0$.
	public static boolean recogniseSomethingFSM(String s) {
		char [] c=s.toCharArray();
		int len=s.length();
		// We can now access the characters of s one at a time via c[0], c[1], ..., c[len-1]
		Pattern p = Pattern.compile("^([0-9])*0$");
		Matcher m = p.matcher(s);
		boolean retVal=true;
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
		/*int n=0;
		int state=0; // Start out in the initial state
		while(n<len){
			switch(state){	
				case 0:
					if ('1'<=c[n] && c[n]<='9')
						state = 0;
					else if (c[n] == '0')
						state = 1;
					else 
						state=2;
					break;
				case 1:
					if (c[n] == '0') 
						state = 1;
					else if ('1'<=c[n] && c[n]<='9')
						state = 0;
					else 
						state=2;
					break;
				case 2:
					break;
			}
			n = n + 1;
		}
		if (state != 1)
			retVal=false;
		
		return retVal;*/
	}

	/**
	 * 
	 * A well-fed number is an integer in which 7s appear but 9s do not. (Why? Because seven eight nine.) 
	 * This means the number can be made up of any digits EXCEPT 9, and must include AT LEAST ONE 7.
	 * This recogniser uses a regular expression to determine if the string given is a well-fed number.
	 * 
	 * @param s
	 * @return whether s is the string representation of a well-fed number
	 */
	public static boolean recogniseWellFedRegex(String s) {
		// COMPLETE THIS! ...
		Pattern p = Pattern.compile("[0-8]*7+[0-8]*");
		Matcher m = p.matcher(s);
		return m.matches();
	}

	/**
	 * This recogniser uses a Finite State Machine to determine whether s
	 * represents a well-fed number (as defined above)
	 * 
	 * @param s
	 * @return whether s is the string representation of a well-fed number
	 */
	public static boolean recogniseWellFedFSM(String s) {
		// COMPLETE THIS! ...
		
		char [] c=s.toCharArray();
		int len=s.length();
		
		boolean retVal=true;
		
		int n=0;
		int state=0; // Start out in the initial state
		while(n<len){
			switch(state){	
				case 0:
					if (('0' <= c[n] && c[n] <=  '6') | c[n] == '8') {
						state = 0;
					} else if (c[n] == '7') {
						state = 1;
					} else if (c[n] == '9') {
						state = 2;
					}
					break;
				case 1:
					if ('0' <= c[n] && c[n] <=  '8') {
						state = 1;
					} else if(c[n] == '9') {
						state = 2;
					}
					break;
				case 2:
					if ('0' <= c[n] && c[n] <=  '8') {
						state = 2;
					} else {
						state = 2;
					}
					break;
			}
			n=n+1;
		}
		
		if (state != 1) {
			retVal = false;
		}
		return retVal;
	}
}