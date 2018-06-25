package fourWayStreetLights.services;

public class StartStateImplWest implements StreetLightsStateI{

	StreetLightsContext streetLightsContext;
	
	public StartStateImplWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}

	public void move(int cntCar) {

		System.out.println("Traffic Light at the West is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the West.");
			cntCar = cntCar-2;
			System.out.println("After Crossing it should be 8: "+cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplWest());
		}
		if(cntCar == 1) {
			System.out.println("Only one is crossed");
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
		}

		}
}
