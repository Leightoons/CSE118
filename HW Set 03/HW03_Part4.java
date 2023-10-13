import java.util.Scanner;

public class HW03_Part4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an inter value represtenting a length in millimeters:");
		int mmTotal = input.nextInt();
		
		int m = mmTotal / 1000;
		int cm = mmTotal / 10 - m*100;
		int mm = mmTotal - m*1000 - cm*10;
		
		System.out.println(mmTotal+"mm = "+m+"m + "+cm+"cm + "+mm+"mm");
		
		input.close();
	}

}
