import java.util.Random;

public class HW07_Part6 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		char[] digits = new char[4];
		
		for (int i=0; i < digits.length; ++i) {
			int r = rand.nextInt(16);
			digits[i] = (char)((r < 10)? r+'0' : r-10+'A');
		}
		System.out.printf("Generated hexadecimal number: 0x%c%c%c%c",digits[0],digits[1],digits[2],digits[3]);
	}
}
