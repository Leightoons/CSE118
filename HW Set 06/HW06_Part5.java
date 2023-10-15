import java.util.Scanner;

public class HW06_Part5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a string of text:");
		String stringA = input.nextLine();
		
		System.out.println("Input another string of text:");
		String stringB = input.nextLine();
		
		System.out.println("String A has a length of "+stringA.length()+".");
		System.out.println("String B has a length of "+stringA.length()+".");
		
		int compareAB = stringA.compareTo(stringB);
		if (compareAB == 0)
			System.out.println("Both strings are equal.");
		else if (compareAB < 0)
			System.out.println("String B is greater than String A.");
		else
			System.out.println("String A is greater than String B.");
		
		input.close();
	}

}
