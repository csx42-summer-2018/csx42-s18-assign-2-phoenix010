package fourWayStreetLights.services;

public class StartStateImplNorthWest implements StreetLightsStateI {

	StreetLightsContext streetLightsContext;
	public StartStateImplNorthWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		System.out.println("NorthWest is running");
	}
}
