
public class HW08_Part6 {
	
	private final static int rowCount = 9;
	
	public static void main(String[] args) {
		// Calculate table data
		double[][] data = new double[rowCount][3];
		for (int i = 0; i < rowCount; i++) {
			data[i][0] = i + 1d; //meters
			data[i][1] = data[i][0] * 3.28084; //feet
			data[i][2] = data[i][1] * 12; //inches
		}
		
		// Create table
		String divider = "+------+--------+--------+\n";
		String rowFormat = "| %4s | %6s | %6s |\n";
		
		System.out.print(divider);
		System.out.print("|Meters|  Feet  | Inches |\n");
		System.out.print(divider);
		
		String a, b, c;
		for (int i = 0; i < rowCount; i++) {
			a = String.format("%d", (int)data[i][0]);
			b = String.format("%.2f", data[i][1]);
			c = String.format("%.2f", data[i][2]);
			System.out.printf(rowFormat, a, b, c);
		}
		System.out.print(divider);
	}

}
