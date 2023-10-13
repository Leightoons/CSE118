import java.util.Scanner;

public class HW02_Part2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please input 3 integer values separated by spaces: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		String strSum = String.format("The sum of the numbers %d, %d, and %d is %d.", a, b, c,a+b+c);
		System.out.println(strSum);
		
		String strAvg = String.format("The average of the numbers %d, %d, and %d is %s.", a, b, c,(a+b+c)/3.0);
		System.out.println(strAvg);
		
	}

}
