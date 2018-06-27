package fourWayStreetLights.services;


public class StreetLightsContext {
	StreetLightsStateI startStateImplEast;
	StreetLightsStateI startStateImplWest;
	StreetLightsStateI startStateImplNorth;
	StreetLightsStateI startStateImplSouth;
	StreetLightsStateI startStateImplEastWest;
	StreetLightsStateI startStateImplNorthEast;
	StreetLightsStateI startStateImplNorthSouth;
	StreetLightsStateI startStateImplNorthWest;
	StreetLightsStateI startStateImplSouthEast;
	StreetLightsStateI startStateImplSouthWest;
	StreetLightsStateI noCarAtIntersection;
	
	StreetLightsStateI streetLightsStateI = noCarAtIntersection;
	int cntCar = 0; //number of cars at intersection point before crossing
	
	public StreetLightsContext(int cntCar, String lightAtEast,String lightAtWest,String lightAtNorth,String lightAtSouth) {
		startStateImplEast = new StartStateImplEast(this);
		startStateImplWest = new StartStateImplWest(this);
		startStateImplNorth = new StartStateImplNorth(this);
		startStateImplSouth = new StartStateImplSouth(this);
		noCarAtIntersection = new NoCarAtIntersection(this);
		startStateImplEastWest = new StartStateImplEastWest(this);
		startStateImplNorthEast = new StartStateImplNorthEast(this);
		startStateImplNorthSouth = new StartStateImplNorthSouth(this);
		startStateImplNorthWest = new StartStateImplNorthWest(this);
		startStateImplSouthEast = new StartStateImplSouthEast(this);
		startStateImplSouthWest = new StartStateImplSouthWest(this);
		this.cntCar = cntCar;
		System.out.println("The value of cntCar is: "+cntCar);
		if(cntCar <= 0) {
			streetLightsStateI = noCarAtIntersection;
		}
		else {
		if(lightAtEast.equalsIgnoreCase("green")) {
			System.out.println("LOL");
			streetLightsStateI = startStateImplEast;
		}
		if(lightAtWest.equalsIgnoreCase("green")) {
			
			streetLightsStateI = startStateImplWest;
		}
		if(lightAtNorth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplNorth;
		}
		if(lightAtSouth.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplSouth;
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtSouth.equalsIgnoreCase("green")) {
			System.out.println("tyagi");
			streetLightsStateI = startStateImplNorthSouth;
			System.out.println("State set");
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtEast.equalsIgnoreCase("green")){
			streetLightsStateI =  startStateImplNorthEast;
		}
		if(lightAtNorth.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplNorthWest;
		}
		if(lightAtSouth.equalsIgnoreCase("green") && lightAtEast.equalsIgnoreCase("green")){
			streetLightsStateI = startStateImplSouthEast;
		}
		if(lightAtSouth.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")){
			streetLightsStateI = startStateImplSouthWest;
		}
		if(lightAtEast.equalsIgnoreCase("green") && lightAtWest.equalsIgnoreCase("green")) {
			streetLightsStateI = startStateImplEastWest;
		}
		if(lightAtNorth.equalsIgnoreCase("red") && lightAtSouth.equalsIgnoreCase("red") && lightAtEast.equalsIgnoreCase("red") && lightAtWest.equalsIgnoreCase("red")) {
			streetLightsStateI = noCarAtIntersection ;
		}
		}
			
		
	}
	
	public void intersection() {
//		int cntCar = noOfCarAtIntersection();
//		System.out.println("In Context class:"+cntCar );
		System.out.println("Aditya");
		streetLightsStateI.move(cntCar);
	}
	public int noOfCarAtIntersection(int number) {
//		System.out.println("Numbers of cars at Intersection before crossing...");
		this.cntCar = number;
		if(this.cntCar != 0 && this.cntCar == 1) {
			this.cntCar = cntCar - 2;
			return this.cntCar;
		}
//		if(cntCar == 1) {
//			cntCar = cntCar - 1;
//			System.out.println("Intersection completed");
//			return cntCar;
//		}
		return this.cntCar;
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

	public StreetLightsStateI getStartStateImplEastWest() {
		return startStateImplEastWest;
	}

	public StreetLightsStateI getStartStateImplNorthEast() {
		return startStateImplNorthEast;
	}

	public StreetLightsStateI getStartStateImplNorthSouth() {
		return startStateImplNorthSouth;
	}

	public StreetLightsStateI getStartStateImplNorthWest() {
		return startStateImplNorthWest;
	}

	public StreetLightsStateI getStartStateImplSouthEast() {
		return startStateImplSouthEast;
	}

	public StreetLightsStateI getStartStateImplSouthWest() {
		return startStateImplSouthWest;
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
  