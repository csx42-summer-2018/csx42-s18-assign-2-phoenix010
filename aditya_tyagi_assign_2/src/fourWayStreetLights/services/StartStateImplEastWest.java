package fourWayStreetLights.services;

public class StartStateImplEastWest implements StreetLightsStateI {
	StreetLightsContext streetLightsContext;
	public StartStateImplEastWest(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		
		if(cntCar == 1) {
			System.out.println("Only one car for intersection.So, Traffic Light at the West is changed to Red");
//			streetLightsContext.noOfCarAtIntersection(cntCar);
			streetLightsContext.setStreetLightState(streetLightsContext.getStartStateImplEast());
			streetLightsContext.startStateImplEast.move(cntCar);
		}
		
		else if(cntCar ==2) {
			System.out.println("Both cars are crossed from the East. No need to pass them from the West");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic Light at the East Changed to RED");
			System.out.println("Traffic Light at the West Changed to RED");
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			streetLightsContext.noCarAtIntersection.move(cntCar);
		}
		else {
			System.out.println("Two cars are crossed from the East");
			cntCar = cntCar -2;
			streetLightsContext.noOfCarAtIntersection(cntCar);
			System.out.println("Traffic light at the East Changed to RED");
			
			
			if(cntCar == 1) {
				System.out.println("Only 1 car can be crossed from the West");
				cntCar = cntCar - 1;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The West is Changed to Red");
				streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
				streetLightsContext.noCarAtIntersection.move(cntCar);
			}
			else {
				System.out.println("Two cars are crossed from the West");
				cntCar = cntCar -2;
				streetLightsContext.noOfCarAtIntersection(cntCar);
				System.out.println("Traffic Light at The West is Changed to Red");
				
			}
		}
		
	}
			
}

