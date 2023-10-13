import java.util.Scanner;

public class Quiz1_Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer value representing a measurement in square feet: ");
		int totalFt = input.nextInt();
		
		int yds = (int)(totalFt / 9.0);
		int ft = totalFt % 9;
		
		System.out.println(totalFt+" square feet = "+yds+" square yards + "+ft+" square feet.");
		
		input.close();
	}

}
