package main;

import java.util.Scanner;

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
	
	private static final String menu =
		"Select an option:\n"+
		" 1. Binary to hexadecimal & decimal\n"+
		" 2. Hexadecimal to binary & decimal\n"+
		" 3. Decimal to binary & hexadecimal\n"+
		" 4. Exit\n";

	private static int parseSelectionInput(String str) {
		if (str.length() != 1) return -1;
		
		str = str.trim();
		char c = str.charAt(0);
		if (c >= '1' && c <= '4')
			return c - '0';
			
		return -1;
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean loopProgram = true;
		while (loopProgram) {
			System.out.print(menu);
			int selection = parseSelectionInput(input.nextLine().trim());
			
			switch(selection) {
			case 1: // binary -> dec/hex
				while (true) {
					System.out.println("Enter a binary number: ");
					String bin = input.nextLine().trim();
					
					if (!Conversion.isValidNumber(bin,2)) {
						System.out.println("Input not valid\n");
						continue;
					}
					
					int value = Conversion.rebaseToInt(bin, 2);
					String dec = Conversion.intToRebasedString(value, 10);
					String hex = Conversion.intToRebasedString(value, 16);
					
					System.out.println("Binary:      "+bin);
					System.out.println("Decimal:     "+dec);
					System.out.println("Hexadecimal: "+hex);
					break;
				}
				break;
				
			case 2: // hex -> binary/dec
				while (true) {
					System.out.println("Enter a hexadecimal number: ");
					String hex = input.nextLine().trim();
					
					if (!Conversion.isValidNumber(hex,16)) {
						System.out.println("Input not valid\n");
						continue;
					}
					
					int value = Conversion.rebaseToInt(hex, 16);
					hex = Conversion.intToRebasedString(value, 16); // makes sure output uses uppercase letters
					String bin = Conversion.intToRebasedString(value, 2);
					String dec = Conversion.intToRebasedString(value, 10);
					
					System.out.println("Hexadecimal: "+hex);
					System.out.println("Binary:      "+bin);
					System.out.println("Decimal:     "+dec);
					break;
				}
				break;
				
			case 3: // dec -> binary/hex
				while (true) {
					System.out.println("Enter a decimal number: ");
					String dec = input.nextLine().trim();
					
					if (!Conversion.isValidNumber(dec,10)) {
						System.out.println("Input not valid\n");
						continue;
					}
					
					int value = Conversion.rebaseToInt(dec, 10);
					String bin = Conversion.intToRebasedString(value, 2);
					String hex = Conversion.intToRebasedString(value, 16);
					
					System.out.println("Binary:      "+bin);
					System.out.println("Decimal:     "+dec);
					System.out.println("Hexadecimal: "+hex);
					break;
				}
				break;
				
			case 4: // exit
				loopProgram = false;
				break;
			
			default :
				System.out.println("Input not valid");
			}
			
			// print newline on loop restart
			System.out.println();
		}
		
		System.out.println("Program terminated.");
		input.close();
	}

}









