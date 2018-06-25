package fourWayStreetLights.driver;

import java.io.File;
import java.util.Scanner;

import fourWayStreetLights.services.StreetLightsContext;

public class Driver {
	private static Scanner scanner;

	public static void main(String[] args) {
		int noOfCars=0;
		String b = " ";
		try {
			scanner = new Scanner(new File("input.txt"));
			
			while(scanner.hasNext()) {
			String a = scanner.nextLine();
			b = scanner.nextLine();
			String c= scanner.nextLine();
			noOfCars = Integer.parseInt(scanner.nextLine()); 
			System.out.printf("%s\n%s\n%s\n%d\n",a,b ,c,noOfCars);
			StreetLightsContext contextClass = new StreetLightsContext(noOfCars, b);
			contextClass.intersection();
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
//		StreetLightsContext contextClass = new StreetLightsContext(noOfCars, b);
		
		
	}
}

