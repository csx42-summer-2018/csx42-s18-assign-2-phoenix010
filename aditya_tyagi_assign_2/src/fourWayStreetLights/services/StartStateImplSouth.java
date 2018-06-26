package fourWayStreetLights.services;

public class StartStateImplSouth implements StreetLightsStateI{

	StreetLightsContext streetLightsContext;
	
	public StartStateImplSouth(StreetLightsContext streetLightsContext) {
		
		this.streetLightsContext = streetLightsContext ;
	}



	public void move(int cntCar) {


		System.out.println("Traffic Light at the South is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the SOUTH.");
			cntCar = cntCar-2;
			System.out.println("After Crossing it should be 10: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
//			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the South");
			cntCar = cntCar-1;
			System.out.println("After Crossing it should be 0: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			
		
		}

		
	}
}
