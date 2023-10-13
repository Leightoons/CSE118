
public class HW02_Part1 {

	public static void main(String[] args) {
		int x = 52;
		System.out.println("x = "+x);
		
		double y = 987.654;
		System.out.println("y = "+y);
		
		int _x = x;
		x += 101;
		System.out.println(_x+" + 101 = "+x);
		
		x = (int)y;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		double z = 0.5*x + y/3.0;
		System.out.println("z = "+z);
		
	}

}
