import java.util.Scanner;

public class HW04_Part3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please input a 4-digit integer number: ");
		int intVal = input.nextInt();
		
		int[] intDigits = new int[4];
		for (int i=intDigits.length-1; i >= 0; i--) {
			intDigits[i] = intVal % 10;
			intVal /= 10;
		}
		for (int i:intDigits) {
			System.out.println(i);
		}
		
		int count5Plus = 0, countEven = 0;
		for (int i:intDigits) {
			if (i >= 5) ++count5Plus;
			if ( i % 2 == 0) ++countEven;
		}
		
		System.out.println(count5Plus+" digits are greater than or equal to 5.");
		System.out.println(countEven+" digits are even, and "+(4-countEven)+" are odd.");
		
		input.close();
	}

}
