import java.util.Random;

public class HW06_Part7 {

	private static char GenerateChar(char min, char max, Random rand) {
		int r = rand.nextInt(max+1 - min);
		return (char)(min + r);
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		String plate = "";
		
		for (int i=0; i<3; ++i)
			plate += GenerateChar('A','Z',rand);
		
		plate += '-';
		
		for (int i=0; i<4; ++i)
			plate += GenerateChar('0','9',rand);
		
		System.out.println("Generate License Plate: "+plate);
	}

}
