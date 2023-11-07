import java.util.Scanner;

public class HW06_Part4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string of text: ");
		String str = input.nextLine();
		int len = str.length();
		
		char first = str.charAt(0);
		System.out.println("First character:   \'"+first+"'");
		
		char last = str.charAt(len-1);
		System.out.println("Last character:    \'"+last+"'");
		
		if (len%2 != 0) {
			char mid = str.charAt(len/2);
			boolean isNum = mid >= '0' && mid <= '9';
			System.out.println("Middle character:  \'"+mid+"'");
			System.out.println("'"+mid+"' is "+(isNum? "" : "NOT ")+"a digital character.");
		}
		else {
			char mid1 = str.charAt(len/2 - 1);
			char mid2 = str.charAt(len/2);
			boolean isNum1 = mid1 >= '0' && mid1 <= '9';
			boolean isNum2 = mid2 >= '0' && mid2 <= '9';
			System.out.println("Middle characters: \'"+mid1+"' & \'"+mid2+"\'");
			System.out.println("'"+mid1+"' is "+(isNum1? "" : "NOT ")+"a digital character.");
			System.out.println("'"+mid2+"' is "+(isNum2? "" : "NOT ")+"a digital character.");
		}
		
		input.close();
	}

}
