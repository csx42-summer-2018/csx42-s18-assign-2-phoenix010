package fourWayStreetLights.services;

public class StartStateImplEastWest implements StreetLightsStateI {
	StreetLightsContext streetLightsContext;
	public StartStateImplEastWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {}
			
}

