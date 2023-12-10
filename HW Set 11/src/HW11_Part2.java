
public class HW11_Part2 {

	public static boolean arrayCheckEqual(int[] a, int[] b) {
		if (a == b) return true;
		if (a.length != b.length) return false;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[] {1,2,3,4,5};
		int[] c = new int[] {1,2,3,4,4};
		
		System.out.println(arrayCheckEqual(a,b));
		System.out.println(arrayCheckEqual(b,c));
		System.out.println(arrayCheckEqual(a,a));
	}

}
