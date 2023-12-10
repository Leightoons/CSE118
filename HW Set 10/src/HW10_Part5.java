
public class HW10_Part5 {
	
	public static void arraySwapIndices(int[] array, int a, int b) {
		int t = array[a];
		array[a] = array[b];
		array[b] = t;
	}
	
	public static void arrayMoveElement(int[] array, int a, int b) {
		
	}

	public static void main(String[] args) {
		int[] array1 = new int[20];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random()*201)-100;
		}
		
		int[] array2 = new int[20];
		int j = 0;
		for (int i = 0; i < array1.length; i++)
			if (array1[i] >= 0) array2[j++]= array1[i];
		for (int i = 0; i < array1.length; i++)
			if (array1[i] < 0) array2[j++]= array1[i];
		
		for(int n : array1) System.out.println(n);
		System.out.println();
		for(int n : array2) System.out.println(n);
		
		//optional (separate pos & neg in array1 w/o new array)
		
		
	}

}
