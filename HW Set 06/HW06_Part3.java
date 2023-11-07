import java.util.Random;

public class HW06_Part3 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = rand.nextInt(26);
		char ch = (char)(r+'a');
		System.out.println("Generated lowercase letter: \'"+ch+"\' with ASCII code of "+(int)ch+".");

		char newChar = (char)(ch - 1);
		boolean isLetter = newChar >= 'a' && newChar <= 'z';
		System.out.print("ASCII character "+(int)newChar+" is \'"+newChar+"\', which ");
		System.out.println(isLetter? "is a letter." : "is not a letter.");
		
		newChar = (char)(ch + 3);
		isLetter = newChar >= 'a' && newChar <= 'z';
		System.out.print("ASCII character "+(int)newChar+" is \'"+newChar+"\', which ");
		System.out.println(isLetter? "is a letter." : "is not a letter.");

	}

}