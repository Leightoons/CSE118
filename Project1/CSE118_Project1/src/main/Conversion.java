package main;

public class Conversion {
	
	private static int intPow(int a, int b) {
		int i = 0, result = 1;
		while (i++ < b)
			result *= a;
		return result;
	}
	
	private static int char2Val(char c) {
		// digits
		if (c >= '0' && c <= '9')
			return c - '0';
		
		// uppercase letters
		else if (c >= 'A' && c <= 'Z')
			return c - 'A' + 10;
		
		// lowercase letters
		else if (c >= 'a' && c <= 'z')
			return c - 'a' + 10;
		
		else return -1;
	}
	
	/**
	 * Validates that a number represented as a string contains
	 * only characters valid for the given number system's base.
	 * 
	 * @param string The string meant to represent a number
	 * @param base The base of the number system used
	 * 
	 * @returns true if string represents a valid number of the given base, otherwise false
	 */
	public static boolean isValidNumber(String string, int base) {
		if (string.length() == 0) return false;
		
		for (int i = 0; i < string.length(); i++) {
			int val = char2Val(string.charAt(i));
			if (val >= base || val < 0)
				return false;
		}
		return true;
	}
	
	/**
	 * Converts an int value into a string representation of the specified base number system
	 * 
	 * @param num The value to be represented
	 * @param base The base of the number system used in representation
	 * 
	 * @return String containing numeric representation of value using given base
	 */
	public static String intToRebasedString(int num, int base) {
		String str = "";
		while (num > 0) {
			int rem = num % base;
			num /= base;
			str = String.format("%c%s", rem%10 + (rem<10? '0':'A'), str);
		}
		return str;
	}
	
	/**
	 * Interprets a numeric representation using a given number system and returns the value
	 * 
	 * @param num Numeric representation to be interpreted and converted
	 * @param base The base of the number system that num is represented with
	 * 
	 * @return The actual value represented by the string
	 */
	public static int rebaseToInt(String num, int base) {
		int val, result = 0;
		for (int i = 0; i < num.length(); i++) {
			val = char2Val(num.charAt(i));
			result += val * intPow(base, num.length()-1 - i);
		}
		return result;
	}
	
}
