package cis.vmi.edu;

import java.util.Scanner;

/*
 * Author: Joshua Licona
 * Purpose: Count letters in a string
 */

public class letterCounter {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in); 


		System.out.print("Enter a string: ");
		String string = input.nextLine();

	
		System.out.println(
			"The number of letters in the string is " + countLetters(string));
		
	}
	
	public static int countLetters(String s) {
		
		int numberOfLetters = 0; 
		for (int i = 0; i < s.length(); i++) {
	
			if (Character.isLetter(s.charAt(i)))
				numberOfLetters++; 
		}
		return numberOfLetters;
	}
}
