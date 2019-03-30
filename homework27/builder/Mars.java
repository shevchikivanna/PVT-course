package hometask;

public class Mars extends Planet {

	String satellite = "Moon";
	int numberOfMarsSatellites = 2;

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
		System.out.println(
				", satellite = " + getSatellite() + ", numberOfMarsSatellites = " + getNumberOfMarsSatellites());
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

		Mars mars = (Mars) obj;
		if (this.size != mars.size) {
			return false;
		}
		if (this.weight != mars.weight) {
			return false;
		}
		if (this.age != mars.age) {
			return false;
		}
		if (this.numberOfMarsSatellites != mars.numberOfMarsSatellites) {
			return false;
		}
		if (composition == null) {
			if (mars.composition != null) {
				return false;
			} else if (!composition.equals(mars.composition)) {
				return false;
			}
		}
		if (name == null) {
			if (mars.name != null) {
				return false;
			} else if (!name.equals(mars.name)) {
				return false;
			}
		}
		if (satellite == null) {
			if (mars.satellite != null) {
				return false;
			} else if (!satellite.equals(mars.satellite)) {
				return false;
			}
		}

		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * (size + weight + age + numberOfMarsSatellites)
				+ ((null == composition) ? 0 : composition.hashCode()) + ((null == name) ? 0 : name.hashCode())
				+ ((null == satellite) ? 0 : satellite.hashCode()));
	}

	@Override
	public String toString() {
		return "Mars [name=" + name + ", size=" + size + ", composition=" + composition + ", weight=" + weight + ", age="
				+ age + ", satellite=" + satellite + ", numberOfMarsSatellites=" + numberOfMarsSatellites + "]";

	}

}
