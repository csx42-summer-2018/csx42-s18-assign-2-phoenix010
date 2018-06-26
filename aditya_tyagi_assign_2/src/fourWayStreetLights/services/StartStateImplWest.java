package fourWayStreetLights.services;

public class StartStateImplWest implements StreetLightsStateI{

	StreetLightsContext streetLightsContext;
	
	public StartStateImplWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}

	public void move(int cntCar) {

		System.out.println("Traffic Light at the WEST is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the WEST.");
			cntCar = cntCar-2;
			System.out.println("After Crossing it should be 10: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
//			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplNorth());
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the West");
			cntCar = cntCar-1;
			System.out.println("After Crossing it should be 0: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			
		
		}

		}
}
