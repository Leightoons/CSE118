import java.util.Random;

public class HW07_Part2 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		int vx = rand.nextInt(1,100);
		int vy = rand.nextInt(1,100);
		int vz = rand.nextInt(1,100);
		int vw = rand.nextInt(1,100);
		System.out.printf("vx = %d\nvy = %d\nvz = %d\nvw = %d\n\n", vx,vy,vz,vw);
		
		System.out.println("If-statement method:");
		int greatest = vx;
		int[] nums = {vy,vz,vw};
		for (int i : nums)
			if (i > greatest) greatest = i;
		System.out.printf("The greatest number generated is %d.\n\n", greatest);
		
		System.out.println("Math.max() method:");
		greatest = Math.max(Math.max(vx, vy),Math.max(vz, vw));
		System.out.printf("The greatest number generated is %d.\n\n", greatest);
		
	}
}
