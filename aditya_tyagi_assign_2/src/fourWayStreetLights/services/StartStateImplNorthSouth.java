package fourWayStreetLights.services;

public class StartStateImplNorthSouth implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	public StartStateImplNorthSouth(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
		System.out.println("Traffic Light at the North and South are GREEN");
		if(cntCar > 1 ) {
			System.out.println("two cars crossed from the North.");
			cntCar = cntCar-2;
			System.out.println(+cntCar);
			System.out.println("Traffic Light at The North Changed To Red");
			streetLightsContext.noOfCarAtIntersection(cntCar);
			
			if(cntCar > 1) {
			System.out.println("two cars crossed from the South.");
			cntCar = cntCar-2;
			System.out.println(+cntCar);
			System.out.println("Traffic Light at The North Changed To Red");
			streetLightsContext.noOfCarAtIntersection(cntCar);
			}
			else if(cntCar == 1){
				System.out.println("Only one car crosses from the south");
				streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
			}
		}
		if(cntCar == 1) {
			System.out.println("Only one Car is crossed from the North");
			streetLightsContext.setStreetLightState(streetLightsContext.getNoCarAtIntersection());
		}
			
	}
}
