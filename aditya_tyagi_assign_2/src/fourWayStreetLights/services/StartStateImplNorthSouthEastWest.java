package fourWayStreetLights.services;

public class StartStateImplNorthSouthEastWest implements StreetLightsStateI{

StreetLightsContext streetLightsContext;
	
	public StartStateImplNorthSouthEastWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	public void move(int cntCar) {
		System.out.println("You cannot have 4 green lights at an intersection in Real Life Scenario. This State is Impossible");
			}

}
