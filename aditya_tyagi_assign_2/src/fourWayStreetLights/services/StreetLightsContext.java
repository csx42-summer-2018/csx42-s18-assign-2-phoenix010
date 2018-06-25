package fourWayStreetLights.services;


public class StreetLightsContext {
	StreetLightsStateI startStateImplEast;
	StreetLightsStateI startStateImplWest;
	StreetLightsStateI startStateImplNorth;
	StreetLightsStateI startStateImplSouth;
	StreetLightsStateI noCarAtIntersection;
	
	StreetLightsStateI streetLightsStateI = noCarAtIntersection;
	int cntCar = 0; //number of cars at intersection point before crossing
	
	public StreetLightsContext(int cntCar, String direction) {
		startStateImplEast = new StartStateImplEast(this);
		startStateImplWest = new StartStateImplWest(this);
		startStateImplNorth = new StartStateImplNorth(this);
		startStateImplSouth = new StartStateImplSouth(this);
		noCarAtIntersection = new NoCarAtIntersection(this);
		this.cntCar = cntCar;
		if(cntCar <= 0) {
			streetLightsStateI = noCarAtIntersection;
		}
		if(direction.equalsIgnoreCase("East")) {
			streetLightsStateI = startStateImplEast;
		}
		if(direction.equalsIgnoreCase("West")) {
			streetLightsStateI = startStateImplWest;
		}
		if(direction.equalsIgnoreCase("South")) {
			streetLightsStateI = startStateImplSouth;
		}
		if(direction.equalsIgnoreCase("North")) {
			streetLightsStateI = startStateImplNorth;
		}
	}
	
	public void intersection() {
		streetLightsStateI .move(cntCar);
	}
	public void noOfCarAtIntersection() {
		System.out.println("Numbers of cars at Intersection before crossing...");
		if(cntCar != 0 && cntCar == 1) {
			cntCar = cntCar - 2;
		}
		if(cntCar == 1) {
			cntCar = cntCar - 1;
			System.out.println("Intersection completed");
		}
	}
	
	void setStreetLightState(StreetLightsStateI streetLightsStateI) {
		this.streetLightsStateI = streetLightsStateI ;
	}
	public StreetLightsStateI getStartStateImplEast() {
		return startStateImplEast;
	}
	public StreetLightsStateI getStartStateImplWest() {
		return startStateImplWest;
	}
	public StreetLightsStateI getStartStateImplNorth() {
		return startStateImplNorth;
	}
	public StreetLightsStateI getStartStateImplSouth() {
		return startStateImplSouth;
	}
	public StreetLightsStateI getNoCarAtIntersection() {
		return noCarAtIntersection;
	}
	public StreetLightsStateI getStreetLightsStateI() {
		return streetLightsStateI;
	}
	public int getCntCar() {
		return cntCar;
	}
	
	
	
	}
  