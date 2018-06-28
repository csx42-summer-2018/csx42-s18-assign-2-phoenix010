package fourWayStreetLights.util;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;



public class FileProcessor {
	
	
	public String readLine(String fileName) throws IOException{
		
//		String fileName = "input.txt";
		String input= "";
	try (Scanner scanner = new Scanner(new File(fileName))) {

		while (scanner.hasNext()){
//			System.out.println(scanner.nextLine());
			 input = scanner.nextLine();
		}
	

	} catch (IOException e) {
		e.printStackTrace();
	}
	return input;
}

	
	
}
