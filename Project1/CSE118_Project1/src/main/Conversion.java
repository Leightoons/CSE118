package main;

public class Conversion {
	
	private static int IntPow(int a, int b) {
		int i = 0, result = 1;
		while (i++ < b)
			result *= a;
		return result;
	}
	
	private static int Char2Val(char c) {
		if (c >= '0' && c <= '9')
			return c - '0';
		else if (c >= 'A' && c <= 'Z')
			return c - 'A';
		return c - 'a' + 10;
	}

	public static boolean IsValidNumber(String str, int base) {
		if (str.length() == 0) return false;
		
		for (int i = 0; i < str.length(); i++) {
			int val = Char2Val(str.charAt(i));
			if (val >= base)
				return false;
		}
		return true;
	}
	
	public static String IntToRebasedString(int num, int base) {
		String str = "";
		
		while (num > 0) {
			int rem = num % base;
			num /= base;
			str = String.format("%c%s", rem%10 + (rem<10? '0':'A'), str);
		}
		return str;
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
