@FunctionalInterface
interface ArrayCheck{
	boolean run(int n);
}

public class Test {

	public static String getCard(int idx) {
		String card = "";
		
		switch ((idx-1)/13) {
		case 0: card += "S"; break;
		case 1: card += "C"; break;
		case 2: card += "H"; break;
		case 3: card += "D"; break;
		}
		
		int num = ((idx-1) % 13)+1;
		switch(num) {
		case 11: card += "J"; break;
		case 12: card += "Q"; break;
		case 13: card += "K"; break;
		case 01: card += "A"; break;
		default: card += Integer.toString(num);
		}
		
		return card;
	}
	
	public static void shuffleArray(int[] array) {
		int r, t;
		for (int i = 0; i < array.length; i++) {
			r = (int)(Math.random()*array.length);
			t = array[i];
			array[i] = array[r];
			array[r] = t;
		}
	}
	
	public static void displayArrayAsCards(int[] array, int perLine) {
		for (int i = 0; i < array.length; ) {
			System.out.printf("%4s ", getCard(array[i]));
			if (++i % perLine == 0) System.out.println();
		}
	}
	
	public static void displayArray(int[] array, int perLine) {
		for (int i = 0; i < array.length; ) {
			System.out.printf("%4d ",array[i]);
			if (++i % perLine == 0) System.out.println();
		}
	}
	
	public static int displayArrayElements(int[] array, int perLine, ArrayCheck condition) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (condition.run(array[i])) {
				System.out.printf("%4d ",array[i]);
				if (++count % perLine == 0) System.out.println();
			}
		}
		return count;
	}
	
	public static int[] createCountingArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++)
			array[i] = i+1;
		return array;
	}
	
	public static void main(String[] args) {
		int[] array = createCountingArray(52);
		displayArrayAsCards(array, 13);
		//int div3Count = displayArrayElements(array, 13, (n) -> n % 3.0 == 0);
		//System.out.println(div3Count);
		shuffleArray(array);
		System.out.println();
		displayArrayAsCards(array, 13);
		
	}

}
