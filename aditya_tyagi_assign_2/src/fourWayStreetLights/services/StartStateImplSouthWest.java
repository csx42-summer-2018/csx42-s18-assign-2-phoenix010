package fourWayStreetLights.services;

public class StartStateImplSouthWest implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	public StartStateImplSouthWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {}
}
