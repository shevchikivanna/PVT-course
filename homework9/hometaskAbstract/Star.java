package hometaskAbstract;

public class Star extends StarSystem1 {

	int temperature;

	@Override
	public boolean isMagnitic() {
		return true;
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
