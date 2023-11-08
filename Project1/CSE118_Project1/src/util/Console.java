package util;

import java.io.IOException;

public class Console {
	
	public static void clear(){
	    //Clears console on windows
		System.out.print("\n\n\n\n\n");
	    try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else {
	        	Runtime.getRuntime().exec("clear");
	        }
	    } catch (IOException | InterruptedException e) {}
	}
	
}
