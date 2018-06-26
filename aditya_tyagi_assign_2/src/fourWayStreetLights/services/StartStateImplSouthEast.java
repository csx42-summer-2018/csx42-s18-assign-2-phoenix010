package fourWayStreetLights.services;

public class StartStateImplSouthEast implements StreetLightsStateI {
 
	StreetLightsContext streetLightsContext;
	public StartStateImplSouthEast(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {}
}
