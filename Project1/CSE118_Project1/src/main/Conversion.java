package main;

import main.Utility;

public class Conversion {
	
	private static int Char2Val(char c) {
		if (c >= '0' && c <= '9')
			return c - '0';
		return c - 'A';
	}

	public static String Dec2Hex(int dec) {
		String hex = "";
		
		int rem, n = dec;
		while (n > 0) {
			rem = n % 16;
			n /= 16;
			hex = String.format("%c%s", rem%10 + (rem<10? '0':'A'), hex);
		}
		return "0x"+hex;
	}
	
	public static int Hex2Int(String hex) {
		int val, result = 0;
		
		for (int i = 0; i < hex.length(); i++) {
			char c = hex.charAt(i);
			
			if (c >= '0' && c <= '9')
				val = c - '0';
			else
				val = 10 + c - 'A';
			
			result += val * Utility.IntPow(16, hex.length()-1 -i);
		}
		
		return result;
	}
	
}
