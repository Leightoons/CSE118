import java.util.Random;
import java.util.Scanner;

public class HW05_Part4 {

	private static int GetDigitCount(int integer) {
		return (int)Math.log10(integer) + 1;
	}
	
	private static int[] ExtractDigits(int val) {
		int digits[] = new int[GetDigitCount(val)];
		int n = val;
		for (int i = digits.length-1; i >= 0; --i) {
			digits[i] = n % 10;
			n /= 10;
		}
		return digits;
	}
	
	@SuppressWarnings("unused")
	private static int DigitsToValue(int[] digits) {
		int val = 0;
		int mult = 1;
		for (int i = digits.length-1; i <= 0; --i) {
			val += digits[i] * mult;
			mult *= 10;
		}
		return val;
	}
	
	private static boolean IsDigitsSorted(int[] digits, boolean ascending) {
		for (int i = 1; i < digits.length; ++i) {
			if (digits[i] == digits[i-1]) continue;
			boolean isGreater = digits[i] > digits[i-1];
			if (isGreater == (ascending)? false : true) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean IsPalindrome(int digits[]) {
		int i = 0;
		int j = digits.length - 1;
		while(j > i) {
			if (digits[j] != digits[i])
				return false;
			++i;
			--j;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		boolean validInt = false;
		while (!validInt) {
			System.out.print("Input value manually? (Leave blank to generate random value): ");
			String userInput = input.nextLine();
			boolean blankInput = userInput.isBlank();
			
			if (blankInput) {
				n = rand.nextInt(1000, 10000);
				System.out.println("Generated number: "+n);
				break;
			}
			else {
				try {
					n = Integer.parseInt(userInput);
					n = (n >= 0)? n : -n;
					validInt = true;
				}
				catch (Exception e){
					System.out.println("Input not valid. Try again.");
				}
			}
		}
		
		int digits[] = ExtractDigits(n);
		for (int d : digits)
			System.out.println(d);
		
		// Check if digits are sorted
		byte sortType = (byte)((IsDigitsSorted(digits,true))? 0 : IsDigitsSorted(digits,false)? 1 : 2);
		switch(sortType) {
		case 0: //ascending
			System.out.println("The digits in "+n+" are sorted ascendingly.");
			break;
		case 1: //ascending
			System.out.println("The digits in "+n+" are sorted descendingly.");
			break;
		default: //unsorted
			System.out.println("The digits in "+n+" are not in order.");
		}
		
		// Check if number is a palindrome
		boolean isPalindrome = IsPalindrome(digits);
		if (isPalindrome)
			System.out.println("The number "+n+" is a palindrome.");
		else
			System.out.println("The number "+n+" is NOT a palindrome.");
		
		input.close();
	}
}
