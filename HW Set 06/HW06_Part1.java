import java.util.Scanner;

public class HW06_Part1 {
	
	private static String PrintFunc() {
		return
		  "          ╭ \n"
		+ "          │ (3/4)x³ - 1/2   if  x < 1\n"
		+ "          │ \n"
		+ "  𝑓(x) =  < 1/4             if  1 <= x < 4\n"
		+ "          │ \n"
		+ "          │ x¹/² - 7/4      if  x >= 4\n"
		+ "          ╰ ";
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(PrintFunc());
		System.out.print("Input a value for x: ");
		double x = input.nextDouble();
		
		double y;
		if (x < 1)
			y = 0.75 * x*x*x - 0.5;
		else if (x < 4)
			y = 0.25;
		else
			y = Math.sqrt(x) - 1.75;
		
		System.out.println("𝑓("+x+") = "+y);
		
		input.close();
	}

}
