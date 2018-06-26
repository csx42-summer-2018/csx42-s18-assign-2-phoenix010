package fourWayStreetLights.services;

public class StartStateImplNorth implements StreetLightsStateI{
	
	StreetLightsContext streetLightsContext;
	
	

	public StartStateImplNorth(StreetLightsContext streetLightsContext) {
	this.streetLightsContext = streetLightsContext ;
	}



	public void move(int cntCar) {


		System.out.println("Traffic Light at the North is GREEN");

		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the NORTH.");
			cntCar = cntCar-2;
			System.out.println("After Crossing it should be 10: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
//			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplSouth());
		}
		if(cntCar == 1) {

			System.out.println("Only one Car is crossed from the North");
			cntCar = cntCar-1;
			System.out.println("After Crossing it should be 0: "+cntCar);
			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
			
		
		}

		
	}
}
