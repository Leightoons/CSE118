import java.util.Scanner;

public class Quiz1_Q4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a 3-digit integer number: ");
		int userInt = input.nextInt();
		
		int tempInt = userInt;
		int d3 = userInt % 10;
		int d2 = userInt/10 % 10;
		int d1 = userInt/100 % 10;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		int sum = d1 + d2 + d3;
		System.out.println("Sum: "+sum);
		
		double avg = sum / 3.0;
		System.out.println("Average: "+avg);
		
		int w = (int)avg;
		System.out.println("w: "+w);
		
		avg += 0.005;
		double avgRounded = (int)(avg*100)/100.0;
		System.out.println("Rounded average: "+avgRounded);
		
		input.close();
	}
}
