package fourWayStreetLights.driver;
import java.lang.NumberFormatException;
public class Validation {

	public void cmdValidation(String [] args) {
		if(args.length == 0) {
			System.err.println("Please insert some arguments at command line");
			System.exit(0);
		}
		if(args.length > 3) {
			System.err.println("Command Line arguments cannot be more than three");
			System.exit(0);
		}
		
	}
}

// /home/aditya/Desktop/input.txt