import java.util.Scanner;

public class HW05_Part3 {

	private static int AdjustIfElse(int n) {
		if (n > 99)
			n = 99;
		else if (n < 11)
			n = 11;
		return n;
	}
	
	@SuppressWarnings("unused")
	private static int AdjustConditional(int n) {
		n = (n > 99)? 99 : (n < 11)? 11 : n;
		return n;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int n = input.nextInt();
		
		n = AdjustIfElse(n);
		//n = AdjustConditional(n);
		System.out.println(n);

		input.close();
	}

}
