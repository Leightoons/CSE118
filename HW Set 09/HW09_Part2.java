
public class HW09_Part2 {

	public static int generateRandomNumber (int lowerBound, int upperBound) {
		int range = upperBound - lowerBound;
		return (int)(Math.random() * (range+1)) + lowerBound;
	}
	
	public static void main(String[] args) {
		int low = 100;
		int upp = 10;
		System.out.printf("Generated random number in range [%d,%d]: %d\n", low, upp, generateRandomNumber(low,upp));
	}

}
