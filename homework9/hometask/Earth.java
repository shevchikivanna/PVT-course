package hometask;

public class Earth extends Planet {

	String satellite = "Moon";
	long population = 7000000000L;

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}

	public String getSatellite() {
		return satellite;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public long getPopulation() {
		return population;
	}

	public void print() {
		super.print();
		System.out.println(", satellite = " + getSatellite() + ", population = " + getPopulation());
	}
}
