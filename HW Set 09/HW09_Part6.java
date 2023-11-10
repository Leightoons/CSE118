
public class HW09_Part6 {

	public static double partialSum(int i) {
		double sum = 0;
		for (int j = 1; j <= i; j++)
			sum += j/(j+1.0);
		return sum;
	}
	
	public static void main(String[] args) {
		int i = 100;
		System.out.printf("sum(%d) = %f", i, partialSum(i));
	}

}
