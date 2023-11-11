
public class HW09_Part1 {

	public static int listNumbers(int low, int upp, int numPerLine) {
		int numberCount = 0, lineCount = 0;
		for (int i = low; i <= upp; i++) {
			if (i % 3 == 0 ^ i % 7 == 0) {
				System.out.printf("%-3d ", i);
				numberCount++;
				lineCount++;
			}
			if (lineCount >= numPerLine && i < upp) { //check prevents printing extra newline if last iteration
				System.out.println();
				lineCount = 0;
			}
		}
		System.out.println();
		return numberCount;
	}
	
	public static void main(String[] args) {
		System.out.printf("Total: %d\n", listNumbers(0, 1000, 9));

	}

}
