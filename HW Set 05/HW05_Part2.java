import java.util.Random;

public class HW05_Part2 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int a = rand.nextInt(1,101);
		int b = rand.nextInt(1,101);
		int c = rand.nextInt(1,101);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		int greatest = (a>b)? a : (b>c)? b : c;
		System.out.println("The greatest number is "+greatest+".");
		
		int smallest = (a<b)? a : (b<c)? b : c;
		System.out.println("The smallest number is "+smallest+".");
		
	}

}
