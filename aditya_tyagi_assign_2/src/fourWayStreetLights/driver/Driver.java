package fourWayStreetLights.driver;

import java.io.IOException;
import fourWayStreetLights.services.StreetLightsContext;
import fourWayStreetLights.util.StringProcessor;

public class Driver {
	public static void main(String[] args)throws IOException {
		StringProcessor str = new StringProcessor();
		String input = str.processing();
//		System.out.println(input);
		String [] splitArray = input.split(",");
		
		String noOfCars = splitArray[0];
		int cntCar = Integer.parseInt(noOfCars);
		String lightAtEast = splitArray[1];
		String lightAtWest = splitArray[2];
		String lightAtNorth = splitArray[3];
		String lightAtSouth = splitArray[4];
		
		StreetLightsContext streetlightcontext = new StreetLightsContext(cntCar, lightAtEast, lightAtWest, lightAtNorth, lightAtSouth);
		streetlightcontext.intersection();
		
	}
}

