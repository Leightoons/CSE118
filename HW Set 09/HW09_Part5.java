import java.util.Scanner;

public class HW09_Part5 {

	public static String convertToHHMMSS(int seconds) {
		int hrs = seconds / 3600;
		int min = (seconds % 3600) / 60;
		int sec = seconds % 60;
		return String.format("%2d:%2d:%2d", hrs, min, sec).replace(' ','0');
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount of seconds: ");
		int seconds = input.nextInt();
		
		System.out.println(convertToHHMMSS(seconds));
		input.close();
	}

}
