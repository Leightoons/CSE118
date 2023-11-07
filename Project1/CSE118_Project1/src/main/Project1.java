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
		
		int x = Conversion.Hex2Int("A");
		System.out.println(x);
		
		int dec = 77985;
		System.out.printf("%d = %s\n", dec, Conversion.Dec2Hex(dec) );

	}

}
