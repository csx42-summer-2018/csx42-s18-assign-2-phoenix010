package fourWayStreetLights.services;

//import fourWayStreetLights.util.MyLogger;

public class NoCarAtIntersection implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	
	public NoCarAtIntersection(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {

//		MyLogger logger = new MyLogger();
		
		System.out.println("Either there is no cars to cross or all cars are crossed");
}
		
}
