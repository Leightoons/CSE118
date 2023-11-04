import java.util.Scanner;

public class HW08_Part1 {

	private static double HarmonicSum(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) 
			sum += (1d / i);
		return sum;
	}
	
	private static double AltHarmonicSum(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) 
			sum += (1d / i) * (i%2==0? -1:1);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.useDelimiter(System.lineSeparator());
		System.out.print("Input a positive integer value for n or leave blank to generate a random one: ");
		
		int n = -1;
		try { n = Integer.parseInt(input.nextLine()); } catch (Exception e) {}
		n = (n > 0)? n : (int)(Math.random()*4 + 6); //[6,9]
		System.out.printf("n = %d\n", n);
		
		double sum1 = HarmonicSum(n);
		System.out.printf("sum1(%d) = %f\n", n, sum1);
		
		double sum2 = AltHarmonicSum(n);
		System.out.printf("sum2(%d) = %f\n", n, sum2);

		input.close();
	}

}
