package fourWayStreetLights.driver;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {
	private static Scanner scanner;

	public static void main(String[] args) {
		try {
			scanner = new Scanner(new File("input.txt"));
			
			while(scanner.hasNext()) {
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			
			String array1[]= b.split(" ");
		
			int size = array1.length;
			System.out.println(size);

			if(size ==1) {
				
			}
			else {
				
				
				
				
				}
		    }
		      
		   
	    }
		catch(Exception e) {
			System.out.println("Could not open the file");
			e.printStackTrace();
		}
		finally {
			scanner.close();
	}
		
	}
}

