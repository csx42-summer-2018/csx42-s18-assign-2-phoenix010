package fourWayStreetLights.services;

public class StartStateImplEastWestNorth implements StreetLightsStateI{

StreetLightsContext streetLightsContext;
	
	public StartStateImplEastWestNorth(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	public void move(int cntCar) {
		System.out.println("You cannot have 3 green lights at an intersection in Real Life Scenario. This State is Impossible");
			}

}


