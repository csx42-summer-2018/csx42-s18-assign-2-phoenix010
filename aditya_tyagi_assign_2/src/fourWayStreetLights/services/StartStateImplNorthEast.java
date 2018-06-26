package fourWayStreetLights.services;

public class StartStateImplNorthEast implements StreetLightsStateI {

	StreetLightsContext streetLightsContext;
	public StartStateImplNorthEast(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {}
}
