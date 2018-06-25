package fourWayStreetLights.driver;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Driver {
	private static Scanner scanner;

	public static void main(String[] args) {
		int c=0;
		try {
			scanner = new Scanner(new File("input.txt"));
			
			while(scanner.hasNext()) {
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			c = scanner.nextInt(); 
			System.out.printf("%s\n%s\n",a,b);
//			System.out.println(c);
			}
		      
		   
	    }
		catch(Exception e) {
			System.out.println("Could not open the file");
			e.printStackTrace();
		}
		finally {
			scanner.close();
	}
		System.out.println(c);
	}
}

