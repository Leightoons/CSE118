import java.util.Scanner;

public class HW03_Part3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a valid double number: ");
		double dblInput = input.nextDouble();
		
		int dblInt = (int)dblInput;
		double dblFrac = dblInput % 1;
		System.out.println(dblInt+" + "+dblFrac+" = "+(dblInt+dblFrac));
		
		dblFrac *= 1000d;
		double truncNum = dblInt + (int)dblFrac/1000d;
		dblFrac *= 10;
		dblFrac += 5;
		dblFrac = (int)(dblFrac/10) / 1000d;
		double roundedNum = dblFrac + dblInt;
		
		System.out.println("Truncated final value: "+truncNum);
		System.out.println("Rounded final value: "+roundedNum);
		
		input.close();
	}

}
