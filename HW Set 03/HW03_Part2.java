import java.util.Scanner;

public class HW03_Part2 {
	
	public static int GenerateReverseNumber(int[] digits) {
		int newInt = 0;
		int place = 1;
		for (int i = 0; i < digits.length; i++) {
			newInt += digits[i] * place;
			place *= 10;
		}
		return newInt;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a 4 digit integer number: ");
		int intVal = input.nextInt();
		
		int[] intDigits = new int[4];
		for (int i=intDigits.length-1; i >= 0; i--) {
			intDigits[i] = intVal % 10;
			intVal /= 10;
		}
		
		for (int i=0; i < intDigits.length; i++) {
			System.out.print(intDigits[i]);
		}
		
		
		System.out.print("\n" + GenerateReverseNumber(intDigits));
	}
}
