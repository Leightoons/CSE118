import java.util.Random;

public class Q1 {
	
	private static boolean IsSorted(boolean ascending, int[] digits) {
		for (int i = 1; i < digits.length; ++i) {
			if (digits[i] == digits[i-1]) continue;
			boolean isGreater = digits[i] > digits[i-1];
			if (isGreater == (ascending)? false : true) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] arguments) {
		Random rand = new Random();
		
		int n = rand.nextInt(100,1000);
		System.out.println("Generated number: "+n);
		
		if (n % 3.0 == 0 && n % 7.0 == 0)
			System.out.println(n+" is divisible by both 3 and 7.");
		else
			System.out.println(n+" is NOT divisible by both 3 and 7.");
		
		if (n % 2.0 == 0 ^ n % 11.0 == 0)
			System.out.println(n+" is exclusively divisible by 2 or 11.");
		else
			System.out.println(n+" is NOT exclusively divisible by 2 or 11.");
		
		int[] digits = new int[3];
		digits[2] = n % 10;
		digits[1] = n/10 % 10;
		digits[0] = n / 100;
		System.out.println(digits[0]);
		System.out.println(digits[1]);
		System.out.println(digits[2]);
		
		if (IsSorted(true, digits))
			System.out.println("Number is sorted ascendingly.");
		else if (IsSorted(false, digits))
			System.out.println("Number is sorted descendingly.");
		else
			System.out.println("Number is not sorted.");
		
	}
}
