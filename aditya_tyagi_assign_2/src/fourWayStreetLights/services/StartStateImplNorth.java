package fourWayStreetLights.services;

public class StartStateImplNorth implements StreetLightsStateI{
	
	StreetLightsContext streetLightsContext;
	
	

	public StartStateImplNorth(StreetLightsContext streetLightsContext2) {
		// TODO Auto-generated constructor stub
		this.streetLightsContext = streetLightsContext ;
	}



	public void move(int cntCar) {
		System.out.println("SInce no car is left to cross. So this is no green zone");
	}
}
