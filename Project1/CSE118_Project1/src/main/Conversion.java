package main;

public class Conversion {
	
	private static int IntPow(int a, int b) {
		int i = 0, result = 1;
		while (i++ < b)
			result *= a;
		return result;
	}
	
	private static int Char2Val(char c) {
		// assumes character has already been validated for efficiency
		if (c >= '0' && c <= '9')
			return c - '0';
		return c - 'A' + 10;
	}

	public static String Dec2Hex(int dec) {
		String hex = "";
		
		int rem, n = dec;
		while (n > 0) {
			rem = n % 16;
			n /= 16;
			hex = String.format("%c%s", rem%10 + (rem<10? '0':'A'), hex);
		}
		return hex;
	}
	
	public static int RebaseToDecimal(String num, int base) {
		int val, result = 0;
		for (int i = 0; i < num.length(); i++) {
			val = Char2Val(num.charAt(i));
			result += val * IntPow(base, num.length()-1 - i);
		}
		return result;
	}
	
}
