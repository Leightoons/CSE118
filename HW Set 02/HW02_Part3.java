import java.util.Scanner;

public class HW02_Part3 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please input the length, width, and height values for a cube.");
		System.out.print("Input them as valid numbers separated by spaces: ");
		double l = input.nextDouble();
		double w = input.nextDouble();
		double h = input.nextDouble();
		
		String strVol = String.format("The volume of a cube with dimensions %s x %s x %s would be %s.", l, w, h, l*w*h);
		System.out.println(strVol);
	}

}
