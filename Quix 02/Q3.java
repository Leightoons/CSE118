import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double w = 10;
		double h = 8;
		
		System.out.println("This program checks if a point is within a 10x8 rectangle centered at the origin");
		
		System.out.print("Input x value: ");
		double x = input.nextDouble();
		System.out.print("Input y value: ");
		double y = input.nextDouble();
		
		if (Math.abs(x) > w/2 || Math.abs(y) > h/2)
			System.out.println("Point ("+x+","+y+") is NOT within the rectangle.");
		else
			System.out.println("Point ("+x+","+y+") is within the rectangle.");
		
		input.close();
	}

}
