
public class HW10_Part3 {

	public static void main(String[] args) {
		int[] array = new int[30];
		
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < array.length; i++)
			array[i] = array[i-1] + array[i-2];
		
		for (int i = 0; i < array.length; ) {
			System.out.printf("%-8d", array[i]);
			if (++i % 5 == 0) System.out.println();
		}
		System.out.println();
		
		//shuffle array
		for (int i = 0; i < array.length; i++) {
			int t = array[i];
			int r = (int)(Math.random()*array.length);
			array[i] = array[r];
			array[r] = t;
		}
		
		for (int i = 0; i < array.length; ) {
			System.out.printf("%-8d", array[i]);
			if (++i % 5 == 0) System.out.println();
		}
	}

}
