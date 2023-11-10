import java.util.Scanner;

public class Midterm_Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of seconds: ");
		int secTotal = input.nextInt();
		int temp = secTotal;
		
		int hrs = temp / 3600;
		temp %= 3600;
		
		int min = temp / 60;
		temp %= 60;
		
		int sec = temp;
		
		System.out.printf("%d seconds = %d:%d:%d", secTotal, hrs, min, sec);
		
		input.close();
	}

}
