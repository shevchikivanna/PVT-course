package hometask;

public class Mars extends Planet {
	
	String satellite = "Moon";
	int  numberOfMarsSatellites = 2;

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}

	public String getSatellite() {
		return satellite;
	}

	public void setNumberOfMarsSatellites(int numberOfMarsSatellites) {
		this.numberOfMarsSatellites = numberOfMarsSatellites;
	}

	public long getNumberOfMarsSatellites() {
		return numberOfMarsSatellites;
	}

	public void print() {
		super.print();
		System.out.println(", satellite = " + getSatellite() + ", numberOfMarsSatellites = " + getNumberOfMarsSatellites());
	}

}
