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
			System.out.println(a);
			b = scanner.nextLine();
			noOfCars = Integer.parseInt(b); 
			String c = scanner.nextLine();
			String east = scanner.nextLine();
			
			String[] splitStringArray = east.split("-");
			String lightAtEast = splitStringArray[1];
//			System.out.println(lightAtEast);
			
			String west = scanner.nextLine();
			splitStringArray = west.split("-");
			String lightAtWest = splitStringArray[1];
//			System.out.println(lightAtWest);
			
			String north = scanner.nextLine();
			splitStringArray = north.split("-");
			String lightAtNorth = splitStringArray[1];
//			System.out.println(lightAtNorth);

			
			String south = scanner.nextLine();
			splitStringArray = south.split("-");
			String lightAtSouth = splitStringArray[1];
//			System.out.println(lightAtSouth);

			
			StreetLightsContext contextClass = new StreetLightsContext(noOfCars, lightAtEast,lightAtWest,lightAtNorth,lightAtSouth);
			contextClass.intersection();
			
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

