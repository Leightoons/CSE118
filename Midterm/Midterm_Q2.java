import java.util.Scanner;

public class Midterm_Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two double numbers, separated by a space: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		int num3 = (int)Math.max(num1, num2);
		System.out.println("num3 = "+num3);
		
		// truncate num1 x.xxx
		num1 = (int)(num1*1000) / 1000.0;
		System.out.println("num1 (truncated) = "+num1);
		
		// round num2 x.xxx
		num2 = (int)((num2+.0005)*1000) / 1000.0;
		System.out.println("num2 (rounded) = "+num2);
		
		input.close();
	}

}
