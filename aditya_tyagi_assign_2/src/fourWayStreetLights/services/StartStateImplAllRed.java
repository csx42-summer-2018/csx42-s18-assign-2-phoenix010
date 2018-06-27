package fourWayStreetLights.services;

public class StartStateImplAllRed implements StreetLightsStateI{
	StreetLightsContext streetLightsContext;
	public StartStateImplAllRed(StreetLightsContext streetLightsContext ) {
		this.streetLightsContext = streetLightsContext ;
	}
	public void move(int cntCar) {
		System.out.println("All lights are RED. So no car can cross");
	}

}
