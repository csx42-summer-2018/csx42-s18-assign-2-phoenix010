package fourWayStreetLights.services;

public class StartStateImplSouth implements StreetLightsStateI{

	StreetLightsContext streetLightsContext;
	
	public StartStateImplSouth(StreetLightsContext streetLightsContext2) {
		// TODO Auto-generated constructor stub
		this.streetLightsContext = streetLightsContext ;
	}



	public void move(int cntCar) {
		System.out.println("SInce no car is left to cross. So this is no green zone");
	}
}
