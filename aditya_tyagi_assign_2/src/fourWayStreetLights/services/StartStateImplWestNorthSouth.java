package fourWayStreetLights.services;

public class StartStateImplWestNorthSouth implements StreetLightsStateI{

StreetLightsContext streetLightsContext;
	
	public StartStateImplWestNorthSouth(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	public void move(int cntCar) {
		System.out.println("You cannot have 3 green lights at an intersection in Real Life Scenario. This State is Impossible");
			}

}
