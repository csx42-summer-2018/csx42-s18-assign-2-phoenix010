package fourWayStreetLights.services;

public class StartStateImplEast implements StreetLightsStateI{
	
	StreetLightsContext streetLightsContext;
	public StartStateImplEast(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		System.out.println("Traffic Light at the East is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the east.");
			cntCar = cntCar-2;
			System.out.println("After Crossing it should be 10: "+cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplWest());
		}
		if(cntCar == 1) {
			System.out.println("Only one is crossed");
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
		}

	}
}
