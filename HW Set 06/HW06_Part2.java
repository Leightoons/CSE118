import java.util.Random;

public class HW06_Part2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int r = rand.nextInt(26);
		char letter = (char)(r+'a');
		System.out.println("Generated lowercase letter: \'"+letter+"\'.");
		
		r = rand.nextInt(10);
		char num = (char)(r+'0');
		System.out.println("Generated digit: \'"+num+"\', which is "+(r < 5? "" : "NOT ")+"less than 5.");
		
		// starts at '2' when r=52, but wraps back around to include '0' and '1',
		// so all digital characters are still possible and equally probable
		r = rand.nextInt(62);
		int rem = (r >= 52)? 10 : 26;
		char ch = (char)(r%rem + (r<26? 'a' : r<52? 'A' : '0'));
		System.out.println("Generated letter or digit: \'"+ch+"\'.");

	}

}
