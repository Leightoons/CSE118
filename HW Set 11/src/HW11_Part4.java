import java.util.Scanner;

public class HW11_Part4 {

	public static int[] getDigitOccurance(String s) {
		int count[] = new int[10];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				++count[c - '0'];
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string of text: ");
		String str = input.nextLine();
		input.close();
		
		int[] occurance = getDigitOccurance(str);
		for (int i = 0; i < occurance.length; i++) {
			System.out.printf("\'%d\' : %d\n", i, occurance[i]);
		}
	}

}
