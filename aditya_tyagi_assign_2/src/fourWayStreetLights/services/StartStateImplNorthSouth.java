package fourWayStreetLights.services;

public class StartStateImplNorthSouth implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	public StartStateImplNorthSouth(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		
		if(cntCar == 1) {
			System.out.println("Only one car for intersection.So, Traffic Light at the South is changed to Red");
//			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplNorth());
			streetLightsContext.startStateImplNorth.move(cntCar);
		}
		
		else if(cntCar ==2) {
			System.out.println("Both cars are crossed from the North. No need to pass them from the South");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic Light at the North Changed to RED");
			System.out.println("Traffic Light at the South Changed to RED");
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
		}
		else {
			System.out.println("Two cars are crossed from the North");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic light at the North Changed to RED");
			
			
			if(cntCar == 1) {
				System.out.println("Only 1 car can be crossed from the South");
				cntCar = cntCar - 1;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The South is Changed to Red");
				streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
				streetLightsContext.noCarAtIntersection.move(cntCar);
			}
			else {
				System.out.println("Two cars are crossed from the South");
				cntCar = cntCar -2;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The South is Changed to Red");
				
			}
		}
		
	}
}
