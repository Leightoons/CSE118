import java.util.Scanner;

public class HW07_Part5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of cents (0-99): ");
		int totalCents = input.nextInt();
		
		int dollars = totalCents / 100;
		totalCents -= dollars * 100;
		int quarters = totalCents / 25;
		totalCents -= quarters * 25;
		int dimes = totalCents / 10;
		totalCents -= dimes * 10;
		int nickels = totalCents / 5;
		totalCents -= nickels * 5;
		int pennies = totalCents;
		
		if (dollars > 0) System.out.printf("Dollars: %d\n", dollars);
		System.out.printf("Quarters: %d\nDimes: %d\nNickels: %d\nPennies: %d", quarters, dimes, nickels, pennies);
		
		input.close();
	}

}
