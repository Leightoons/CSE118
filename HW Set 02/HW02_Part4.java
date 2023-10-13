import java.util.Scanner;

public class HW02_Part4 {
	public static double funcOfX(double x) {
		return 1d/3d*x*x - 3d/5d*x + 5d/7d;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a value for x: ");
		double x = input.nextDouble();
		
		System.out.println("function ƒ("+x+") = "+funcOfX(x));
	}

}
