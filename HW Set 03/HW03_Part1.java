import java.util.Scanner;

public class HW03_Part1 {
	
	public static void PrintPos(int p1, int p2, int p3, int p4) {
		System.out.println("--------------");
		System.out.println("pos1 = "+p1);
		System.out.println("pos2 = "+p2);
		System.out.println("pos3 = "+p3);
		System.out.println("pos4 = "+p4);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please input 4 integer numbers separated by spaces:");
		
		int pos1 = input.nextInt();
		int pos2 = input.nextInt();
		int pos3 = input.nextInt();
		int pos4 = input.nextInt();
		
		PrintPos(pos1,pos2,pos3,pos4);
		
		// Left shift the variables
		int posTemp = pos1;
		pos1 = pos2;
		pos2 = pos3;
		pos3 = pos4;
		pos4 = posTemp;
		PrintPos(pos1,pos2,pos3,pos4);
		
		// Right shift the variables
		posTemp = pos4;
		pos4 = pos3;
		pos3 = pos2;
		pos2 = pos1;
		pos1 = posTemp;
		PrintPos(pos1,pos2,pos3,pos4);
		
	}

}
