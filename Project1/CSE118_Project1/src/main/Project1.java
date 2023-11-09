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

	public static String bin2Dec(String bin) {
		int val = Conversion.rebaseToInt(bin, 2);
		return Conversion.intToRebasedString(val, 10);
	}
	public static String bin2Hex(String bin) {
		int val = Conversion.rebaseToInt(bin, 2);
		return Conversion.intToRebasedString(val, 16);
	}
	
	public static String dec2Bin(String dec) {
		int val = Conversion.rebaseToInt(dec, 10);
		return Conversion.intToRebasedString(val, 2);
	}
	public static String dec2Hex(String dec) {
		int val = Conversion.rebaseToInt(dec, 10);
		return Conversion.intToRebasedString(val, 16);
	}

	public static String hex2Bin(String hex) {
		int val = Conversion.rebaseToInt(hex, 16);
		return Conversion.intToRebasedString(val, 2);
	}
	public static String hex2Dec(String hex) {
		int val = Conversion.rebaseToInt(hex, 16);
		return Conversion.intToRebasedString(val, 10);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean loopProgram = true;
		while (loopProgram) {
			String bin = null, dec = null, hex = null;
			boolean showResult = true;
			
			System.out.print(menu);
			int selection = parseSelectionInput(input.nextLine().trim());
			switch(selection) {
			
			case 1: // binary -> dec/hex
				while (true) {
					System.out.println("Enter a binary number: ");
					bin = input.nextLine().trim();
					
					if (!Conversion.isValidNumber(bin,2)) {
						System.out.println("Input not valid\n");
						continue;
					}
					
					dec = bin2Dec(bin);
					hex = bin2Hex(bin);
					break;
				}
				break;
				
			case 2: // hex -> binary/dec
				while (true) {
					System.out.println("Enter a hexadecimal number: ");
					hex = input.nextLine().trim();
					
					if (!Conversion.isValidNumber(hex,16)) {
						System.out.println("Input not valid\n");
						continue;
					}
					
					bin = hex2Bin(hex);
					dec = hex2Dec(hex);
					break;
				}
				break;
				
			case 3: // dec -> binary/hex
				while (true) {
					System.out.println("Enter a decimal number: ");
					dec = input.nextLine().trim();
					
					if (!Conversion.isValidNumber(dec,10)) {
						System.out.println("Input not valid\n");
						continue;
					}
					
					bin = dec2Bin(dec);
					hex = dec2Hex(dec);
					break;
				}
				break;
				
			case 4: // exit
				loopProgram = false;
				showResult = false;
				break;
			
			default:
				showResult = false;
				System.out.println("Input not valid");
			}
			
			if (showResult) System.out.printf("Binary: %s\nDecimal: %s\nHexadecimal: %s\n", bin,dec,hex);
			
			System.out.println();
		}
		
		System.out.println("Program terminated.");
		input.close();
	}

}









