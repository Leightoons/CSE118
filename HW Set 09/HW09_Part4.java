
public class HW09_Part4 {

	public static boolean isValidHex(String str) {
		//str = str.trim();
		
		if (str.charAt(0) != '0' || str.charAt(1) != 'x' || str.length() < 3)
			return false;
		
		for (int i = 2; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= '0' && c <= '9') continue;
			if (c >= 'A' && c <= 'F') continue;
			if (c >= 'a' && c <= 'f') continue;
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] testStrings = new String[] {"0x", "0x 1", "0x2f", "0x123ABC", "123", "0x123"};
		
		for (String str : testStrings) {
			System.out.printf("\"%s\" is %s\n", str, isValidHex(str)? "valid" : "NOT valid");
		}
	}
}
