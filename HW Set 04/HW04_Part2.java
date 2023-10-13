import java.util.Scanner;

public class HW04_Part2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter two integer numbers, separated by a space: ");
		int a = input.nextInt();
		int b = input.nextInt();
		
		int x = Math.max(a,b);
		int y = Math.min(a,b);
		
		double divResult = x / (double)y;
		if (divResult == (int)divResult) {
			System.out.println(x+" is divisible by "+y+".");
			System.out.println(x+" / "+y+" = "+(int)divResult);
		}
		else
			System.out.println(a+" and "+b+" are not divisible by each other.");
		
		input.close();
	}

}
