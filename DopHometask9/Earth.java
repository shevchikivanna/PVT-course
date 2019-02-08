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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Earth earth = (Earth) obj;
		if (this.size != earth.size) {
			return false;
		}
		if (this.weight != earth.weight) {
			return false;
		}
		if (this.age != earth.age) {
			return false;
		}
		if (this.population != earth.population) {
			return false;
		}
		if (name == null) {
			if (earth.name != null) {
				return false;
			} else if (!name.equals(earth.name)) {
				return false;
			}
		}
		if (composition == null) {
			if (earth.composition != null) {
				return false;
			} else if (!composition.equals(earth.composition)) {
				return false;
			}
		}
		if (satellite == null) {
			if (earth.satellite != null) {
				return false;
			} else if (!satellite.equals(earth.satellite)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * (size + weight + age + population) + ((null == name) ? 0 : name.hashCode())
				+ ((null == composition) ? 0 : composition.hashCode())
				+ ((null == satellite) ? 0 : satellite.hashCode()));
	}

	@Override
	public String toString() {
		return "Earth [name=" + name + ", size=" + size + ", composition=" + composition + ", weight=" + weight + ", age="
				+ age + ", satellite=" + satellite + ", population=" + population + "]";
	}
}
