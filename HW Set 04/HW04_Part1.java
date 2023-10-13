import java.util.Scanner;

public class HW04_Part1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a 2-digit integer number: ");
		int userInt = input.nextInt();
		
		boolean isEven = userInt % 2.0 == 0;
		System.out.println(userInt+" is "+(isEven? "even":"odd")+".");
		
		boolean isDivBy5 = userInt % 5.0 == 0;
		System.out.println(userInt+" is "+(isDivBy5? "":"not ")+"divisible by 5.");
		
		int dOnes = userInt % 10;
		int dTens = userInt/10 % 10;
		System.out.println("Digits: "+dTens+", "+dOnes);
		
		// Reorder digits in sequential order
		int newInt = userInt;
		if (dTens == dOnes) {
			System.out.println("The digit at 1's place and the digit at 10's place are the same.");
		}
		else if (dTens < dOnes) {
			System.out.println("The digit at 1's place is greater than the digit at 10's place.");
		}
		else {
			System.out.println("The digit at 10's place is greater than the digit at 1's place.");
			newInt = dOnes*10 + dTens;
		}
		System.out.print("Newly ordered number: "+newInt);
		
		input.close();
	}

}
