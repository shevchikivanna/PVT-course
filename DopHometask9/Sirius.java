package hometask;

public class Sirius extends Star {

	String climate = "Normal";
	int numberOfStudies = 100;

	// перегруженные связанные друг с другом конструкторы
	public Sirius() {

	}

	public Sirius(String name) {
		this();
		this.name = name;
	}

	public Sirius(String name, double size) {
		this(name);
		this.size = size;
	}

	public Sirius(String name, double size, int speed) {
		this(name, size);
		this.speed = speed;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public String getClimate() {
		return climate;
	}

	public void setNumberOfStudies(int numberOfStudies) {
		this.numberOfStudies = numberOfStudies;
	}

	public int getNumberOfStudies() {
		return numberOfStudies;
	}

	public void print() {
		super.print();
		System.out.print(", climate = " + getClimate() + ", numberOfStudies = " + getNumberOfStudies());

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
		Sirius sirius = (Sirius) obj;
		if (this.size != sirius.size) {
			return false;
		}
		if (this.speed != sirius.speed) {
			return false;
		}
		if (this.diameter != sirius.diameter) {
			return false;
		}
		if(this.numberOfStudies != sirius.numberOfStudies) {
			return false;
		}
		if(composition == null) {
			if(sirius.composition != null) {
				return false;
			}else if(!composition.equals(sirius.composition)) {
				return false;
			}
		}
		if (name == null) {
			if(sirius.name != null) {
				return false;
			}else if(!name.equals(sirius.name)) {
				return false;
			}
		}
		if(climate == null) {
			if(sirius.climate != null) {
				return false;
			}else if(!climate.equals(sirius.climate)) {
				return false;
			}
		}

		return true;
	}
	@Override
	public int hashCode() {
		return (int) (31 * (size + speed + diameter + numberOfStudies) + ((null == name) ? 0 : name.hashCode()) + ((null == composition) ? 0 : composition.hashCode()) + ((null == climate) ? 0 : climate.hashCode()));
	}
	
	@Override
	public String toString() {
		return "Sirius [name=" + name + ", size=" + size + ", composition=" + composition + ", speed=" + speed
				+ ", diameter=" + diameter + ", climate=" + climate + ", numberOfStudies=" + numberOfStudies + "]";
	}
}
