package fourWayStreetLights.services;

public class StartStateImplEast implements StreetLightsStateI{
	
	StreetLightsContext streetLightsContext;
	public StartStateImplEast(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		System.out.println("Traffic Light at the East is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the EAST.");
			cntCar = cntCar-2;
			System.out.println("After Crossing it should be 10: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			
//			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplWest());
//			streetLightsContext.noOfCarAtIntersection(cntCar);
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the East");
			cntCar = cntCar-1;
			System.out.println("After Crossing it should be 0: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			
		}

	}
}
