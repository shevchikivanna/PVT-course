package hometaskAbstract;

public class Planet extends StarSystem1 {

	int temperature;

	@Override
	public boolean isMagnitic() {
		return false;
	}

	@Override
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public int getTemperature() {
		return temperature;
	}
}
