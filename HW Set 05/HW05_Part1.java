import java.util.Random;

public class HW05_Part1 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int n1 = rand.nextInt(111);
		System.out.println("Number in range [0, 111): "+n1);
		
		int n2 = rand.nextInt(-1000,1001);
		System.out.println("Number in range [-1000, 1000]: "+n2);
		
		int n3 = rand.nextInt(10,100);
		System.out.println("Number in range [10, 99]: "+n3);
		
		double n4 = rand.nextDouble(11.0, 99.0);
		System.out.println("Number in range [11.0, 99.0): "+n4);

	}

}
