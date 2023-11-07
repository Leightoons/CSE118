package main;

public class Utility {
	
	/**
	 * Simple alternative to Math.pow() when working with integers.
	 * @param a the base
	 * @param b the exponent (must be >=0)
	 */
	public static int IntPow(int a, int b) {
		int i = 0, result = 1;
		
		while (i++ < b)
			result *= a;
			
		return result;
		
	}
}
