package main;

import java.util.Scanner;

import util.Console;

/* Write a Java program to: 
 * - Convert binary to decimal or hex
 * - Convert decimal to binary or hex
 * - Convert hex to decimal or binary
 * Functions: The program repeatedly displays the following menu:
 * - Binary to hexadecimal and decimal
 * - Hexadecimal to binary and decimal
 * - Decimal to binary and hexadecimal 
 * - Exit
 */

public class Project1 {
	
	public static final String menu =
		"Select an option:"+
		" 1. Binary to hexadecimal & decimal\n"+
		" 2. Hexadecimal to binary & decimal\n"+
		" 3. Decimal to binary % hexadecimal\n"+
		" 4. Exit";

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a valid hexadecimal number: " );
			String userNum = input.nextLine();
			
			if (!Conversion.isValidNumber(userNum,16)) {
				System.out.println("Invalid input\n");
				continue;
			}
			
			int dec = Conversion.rebaseToInt(userNum, 16);
			String bin = Conversion.intToRebasedString(dec, 2);
			
			System.out.printf("Hexadecimal: %s\n", userNum);
			System.out.printf("Decimal:     %d\n", dec);
			System.out.printf("Binary:      %s\n", bin);
			
			break;
			
		}

	}

}
