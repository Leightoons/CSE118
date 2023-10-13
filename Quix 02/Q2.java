import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Main Menu\n1:Option 1\n2:Option 2\n3:Option 3\n4: Exit");
		System.out.print("Select option: ");
		int option = input.nextInt();
		
		switch(option) {
		case 1:
			System.out.println("Selected Option 1");
			break;
		case 2:
			System.out.println("Selected Option 2");
			break;
		case 3:
			System.out.println("Selected Option 3");
			break;
		case 4:
			System.out.println("Exit is selected");
			break;
		default:
			System.out.println("Invalid selection");
		}
		
		input.close();
	}

}
