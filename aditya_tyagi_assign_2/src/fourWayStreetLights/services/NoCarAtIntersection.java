package fourWayStreetLights.services;

public class NoCarAtIntersection implements StreetLightsStateI {
	
	StreetLightsContext streetLightsContext;
	
	public NoCarAtIntersection(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	
	public void move(int cntCar) {
//		if(cntCar > 1 ) {
//			System.out.println("NO CAR INTERSECTION.");
//			cntCar = cntCar-2;
//			System.out.println("After Crossing it should be 4: "+cntCar);
//			streetLightsContext.noOfCarAtIntersection(cntCar);
////		System.out.println("SInce no car is left to cross. So this is no green zone");
//	}
		System.out.println("Since no car is left to cross.");
}
		
}
