
public class HW09_Part7 {

	/* Use these instead in case UTF-8 characters do not work
	private static final String header	= "| char |  dec  |   hex   |\n";
	private static final String divider	= "+------+-------+---------+\n";
	private static final String format	= "|%3c   |%6s |%8s |\n";
	 */
	private static final String header	= "│ char │  dec  │   hex   │\n";
	private static final String divider	= "┼──────┼───────┼─────────┼\n";
	private static final String format	= "│%3c   │%6s │%8s │\n";
	
	public static String getASCIICode(char ch, boolean isDecimal) {
		if (isDecimal) return String.format("%d", (int)ch);
		
		String hex = "";
		int rem = (int)ch;
		while (rem > 0) {
			int val = rem % 16;
			hex = String.format("%c%s", val + (val < 10 ? '0':'A'-10), hex);
			rem /= 16;
		}
		return "0x"+hex;
	}
	
	public static void printTableRange(char a, char b) {
		for (char i = a; i <= b; i++)
			System.out.printf(format, i, getASCIICode(i,true), getASCIICode(i,false));
	}
	
	public static void main(String[] args) {
		System.out.print(divider);
		System.out.print(header);
		System.out.print(divider);
		printTableRange('0','9');
		printTableRange('A','Z');
		printTableRange('a','z');
		System.out.print(divider);
		
	}

}
