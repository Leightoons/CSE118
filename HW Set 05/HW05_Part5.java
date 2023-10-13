import java.util.Scanner;

public class HW05_Part5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x coordinate of a point: ");
		double x = input.nextDouble();
		System.out.print("Enter the y coordinate of a point: ");
		double y = input.nextDouble();
		
		double radius = 10;
		
		double dist = Math.sqrt(x*x + y*y);
		if (dist > radius)
			System.out.println("Point ("+x+","+y+") is not within the circle.");
		else if (dist < radius)
			System.out.println("Point ("+x+","+y+") is within the circle.");
		else
			System.out.println("Point ("+x+","+y+") is on the edge of the circle.");
		
		input.close();
	}
}
