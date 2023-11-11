import java.util.Scanner;

public class HW08_Part3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a string of text: ");
		String str = input.nextLine().trim();
		input.close();
		
		int i = 0;
		boolean prevWS = false;
		
		while (i < str.length()) {
			char ch = str.charAt(i);
			boolean isWS = Character.isWhitespace(ch);
			if (prevWS && isWS) {
				String newStr = str.substring(0,i) + str.substring(i+1);
				str = newStr;
				continue;
			}
			prevWS = isWS;
			i++;
		}

		System.out.printf("New string: \"%s\"\n",str);
	}

}
