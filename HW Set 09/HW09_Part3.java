
public class HW09_Part3 {

	public static char generateRandomCharacter(char ch1, char ch2) {
		int range = ch2 - ch1;
		return (char)(Math.random() * (range+1) + ch1);
	}
	
	public static void main(String[] args) {
		char low = 'a';
		char upp = 'z';
		System.out.printf("Generated random char in range [%c,%c]: %c\n", low, upp, generateRandomCharacter(low,upp));

	}

}
