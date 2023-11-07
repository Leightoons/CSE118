import java.util.Random;

public class HW07_Part4 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		double n = rand.nextDouble(-1000.0, 1000.0);
		System.out.printf("Number: %f\n", n);
		
		double n2 = n * n;
		System.out.printf("Square: %f\n", n2);
		
		double n3 = n2 * n;
		System.out.printf("Cube: %f\n", n3);
		
		double nRt = Math.sqrt(n);
		System.out.printf("Square Root: %f\n", nRt);

	}

}
