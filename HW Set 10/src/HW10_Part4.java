
public class HW10_Part4 {

	public static boolean isArraySorted(int[] array, boolean ascending) {
		for (int i = 1; i < array.length; i++) {
			if (ascending? array[i]<array[i-1] : array[i-1]<array[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {0,1,2,3};

		if (isArraySorted(a, true))
			System.out.println("Array is sorted ascendingly.");
		else if (isArraySorted(a, false))
			System.out.println("Array is sorted descendingly.");
		else
			System.out.println("Array is not sorted.");
		
	}

}
