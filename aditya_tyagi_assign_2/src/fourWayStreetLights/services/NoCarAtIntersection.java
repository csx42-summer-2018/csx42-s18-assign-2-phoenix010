package fourWayStreetLights.services;

public class NoCarAtIntersection implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	
	public NoCarAtIntersection(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		System.out.println("SInce no car is left to cross. So this is no green zone");
	}

		
}
