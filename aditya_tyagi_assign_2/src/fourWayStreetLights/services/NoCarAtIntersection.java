package fourWayStreetLights.services;

public class NoCarAtIntersection implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	
	public NoCarAtIntersection(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {

		System.out.println("Either there is no cars to cross or all cars are crossed");
}
		
}
