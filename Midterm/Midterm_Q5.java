
public class Midterm_Q5 {

	public static void main(String[] args) {
		// generate number
		double x = Math.random() * 22222 - 11111;
		System.out.println("Generated number: "+x);
		
		// function
		double f;
		if (x < 0)
			f = 4.0/5 * x*x - 3.0/4 * x + 3.0/2;
		else if (x < 9)
			f = 3.0/2;
		else
			f = 2/3 * Math.sqrt(x) - 0.5;
			
		System.out.printf("f(%f) = %f", x, f);
	}

}
