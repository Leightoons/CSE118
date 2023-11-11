import java.util.Scanner;

public class HW08_Part4 {
	
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

	private static void SortDigitArray(int[] digits, boolean greatestToLeast) {
		// uses selection sort
		int temp, idx;
		for (int i = 0; i < digits.length; i++) {
			idx = i;
			for (int j = i+1; j < digits.length; j++) {
				boolean greater = digits[j] > digits[idx];
				if (greatestToLeast? greater : !greater)
					idx = j;
			}
			temp = digits[idx];
			digits[idx] = digits[i];
			digits[i] = temp;
		}
	}
	
	private static int DigitsToValue(int digits[]) {
		int maxPow = digits.length - 1;
		int val = 0;
		for (int i = 0; i < digits.length; i++)
			val += digits[i] * Math.pow(10, maxPow - i);
		return val;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.lineSeparator());
		System.out.print("Input a positive integer value for n or leave blank to generate a random one: ");
		
		int n = -1;
		try { n = (Integer.parseInt(input.nextLine())); } catch (Exception e) {}
		if (n < 0) n = (int)(Math.random() * 900) + 100;
		System.out.printf("Original number: %d\n",n);
		
		int[] digits = ExtractDigits(n);
		SortDigitArray(digits, true);
		
		System.out.printf("Sorted number:\t %d\n",DigitsToValue(digits));
		
		input.close();
	}
}
