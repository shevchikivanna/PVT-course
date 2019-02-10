package hometask;

public class Planet extends StarSystem {

	double weight = 500.555;
	int age = 1000000;

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		super.print();
		System.out.print(", weight = " + getWeight() + ", age = " + getAge());
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

		Planet planet = (Planet) obj;
		if (this.size != planet.size) {
			return false;
		}
		if (this.age != planet.age) {
			return false;
		}
		if (this.weight != weight) {
			return false;
		}
		if (composition == null) {
			if (planet.composition != null) {
				return false;
			} else if (!composition.equals(planet.composition)) {
				return false;
			}
		}

		if (name == null) {
			if (planet.name != null) {
				return false;
			} else if (!name.equals(planet.name)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * (size + weight + age) + ((null == name) ? 0 : name.hashCode())
				+ ((null == composition) ? 0 : +composition.hashCode()));
	}
	
	@Override
	public String toString() {
		return "Planet [name=" + name + ", size=" + size + ", composition=" + composition + ", weight=" + weight
				+ ", age=" + age + "]";
	}

}
