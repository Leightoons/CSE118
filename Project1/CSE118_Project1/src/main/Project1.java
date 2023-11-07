package main;
import java.util.Scanner;

import main.*;

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
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter a valid hexadecimal number: " );
			String userNum = input.nextLine();
			
			if (!Conversion.IsValidNumber(userNum,16)) {
				System.out.println("You fucked it up.");
				continue;
			}
			
			int dec = Conversion.RebaseToDecimal(userNum, 16);
			String bin = Conversion.IntToRebasedString(dec, 2);
			
			System.out.printf("Decimal: %d\n", dec);
			System.out.printf("Binary: %s\n", bin);
			
			break;
			
		}

	}

}
