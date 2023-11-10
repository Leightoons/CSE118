import java.util.Random;

public class HW07_Part1 {

	public static void main(String[] args) {
		System.out.println("RNG using Random class:");
		Random rand = new Random();
		int a = rand.nextInt(-99,100);
		int b = rand.nextInt(-111,111);
		double c = rand.nextDouble(-20.0,20.0);
		System.out.printf("a = %d\nb = %d\nc = %f\n\n", a,b,c);
		
		System.out.println("RNG using Math.random() method:");
		a = (int)(Math.random()*199) - 99;
		b = (int)(Math.random()*222) - 111;
		c = Math.random()*40 - 20;
		System.out.printf("a = %d\nb = %d\nc = %f", a,b,c);
	}

}