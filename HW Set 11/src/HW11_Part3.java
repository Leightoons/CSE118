
public class HW11_Part3 {

	public static boolean arrayHasCommonElement(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++)
				if (a[i] == b[j]) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[] {4,3,2,1};
		int[] c = new int[] {5,6,7,8};
		int[] d = new int[] {1,2,3,5};
		
		System.out.println(arrayHasCommonElement(a,b));
		System.out.println(arrayHasCommonElement(b,c));
		System.out.println(arrayHasCommonElement(c,d));

	}

}
