import java.util.Scanner;

public class HW04_Part4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter distance to drive, in miles: ");
		double miles = input.nextDouble();
		System.out.print("Enter fuel efficiency, in miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.print("Enter price of gas per gallon, in USD: $");
		double ppg = input.nextDouble();
		
		double tripTotal = miles / mpg * ppg;
		tripTotal = (double)Math.round(tripTotal*100) / 100;
		System.out.println("The total cost of the trip will be $"+tripTotal+".");

		input.close();
	}

}
