import java.util.Scanner;

public class Midterm_Q3 {

	static private boolean isSorted(boolean asc, int[] d) {
		for (int i=0; i < d.length-1; ++i) {
			if (d[i] <= d[i+1] == (asc? false:true))
				return false;
		}
		return true;
	}
	
	static private boolean isRepeat(int[] d) {
		for (int i=0; i < d.length-1; ++i) {
			for (int j = i+1; j < d.length; ++j) {
				if (d[i] == d[j])
					return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an int in range [1111, 9999]: ");
		int num4 = input.nextInt();
		
		// clamp to range
		if (num4 < 1111) num4 = 1111;
		else if (num4 > 9999) num4 = 9999;
		System.out.println("num is "+num4);
		
		// check divisibility
		boolean isDiv = num4%3 == 0 ^ num4%7 == 0;
		System.out.printf("%d %s divisible exclusively by 3 or 7.\n",num4,(isDiv)? "is":"is NOT");
		
		// extract digits
		int[] d = new int[4];
		d[0] = num4 / 1000;
		d[1] = num4 / 100 % 10;
		d[2] = num4 % 100 / 10 ;
		d[3] = num4 % 10;
		
		for (int i:d)
			System.out.println(i);

		// average
		double avg = (d[0]+d[1]+d[2]+d[3])/4.0;
		System.out.println("Average of digits: "+avg);
		
		// check sorting
		if (isSorted(true,d))
			System.out.println("Digits are sorted ascendingly");
		else if (isSorted(false,d))
			System.out.println("Digits are sorted descendingly");
		else
			System.out.println("Digits are not sorted");
		
		// check repeats
		boolean isDupe = isRepeat(d);
		System.out.printf("There %s duplicate digits.\n",(isDupe? "is":"isn't any"));
		
		input.close();
		
	}

}
