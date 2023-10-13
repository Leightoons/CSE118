import java.util.Scanner;

public class HW05_Part6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Dollar-Yen conversion program.");
		
		System.out.print("Enter the current exchange rate from USD to Japanese Yen: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter 0 to convert USD to Yen, or enter 1 to convert Yen to USD: ");
		int mode = input.nextInt();
		while (mode != 0 && mode != 1) {
			System.out.print("Invalid input. Enter 0 for USD to Yen or 1 for Yen to USD: ");
			mode = input.nextInt();
		}

		System.out.println((mode == 0)? "Enter the amount of USD: " : "Enter the amount of Yen: ");
		double startAmt = input.nextDouble();
		
		if (mode == 0) { // USD -> Yen
			double endAmt = (startAmt * rate);
			startAmt = Math.round(startAmt*100)/100d;
			System.out.println("$"+startAmt+" is equivalent to ¥"+(int)endAmt+".");
		}
		else { // Yen -> USD
			double endAmt = startAmt / rate;
			startAmt = Math.round(startAmt*100)/100d;
			System.out.println("¥"+(int)startAmt+" is equivalent to $"+endAmt+".");
		}
		
		input.close();
	}

}
