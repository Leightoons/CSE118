
public class HW08_Part5 {
	
	private static int[] ExtractDigits(int num) {
		// determine # of digits
		int i = 1;
		while (num >= Math.pow(10, i)) i++;
		//extract digits to array
		int digits[] = new int[i];
		for (i = digits.length-1; i >= 0; i--) {
			digits[i] = num % 10;
			num /= 10;
		}
		return digits;
	}


	public static void main(String[] args) {
		int n = (int)(Math.random()*100_000_000) + 1;
		System.out.printf("Generated number: %d\n", n);
		
		int[] digits = ExtractDigits(n);
		
		// Find sum of all digits
		int sum = 0;
		for (int d : digits)
			sum += d;
		System.out.printf("Sum of all digits: %d\n", sum);
		
		// Reverse digits
		int reverseNum = 0;
		for (int i = 0; i < digits.length; i++)
			reverseNum += digits[i] * Math.pow(10, i);
		System.out.printf("Reverse number:   %d\n", reverseNum);
		
		// Count even/odd digits
		int evenCount = 0;
		for (int d : digits)
			if (d % 2 == 0) evenCount++;
		System.out.printf("Number contains %d even digits and %d odd digits\n", evenCount, digits.length-evenCount);
	}

}
