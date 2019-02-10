package hometask;

public class Sun extends Star {

	int radius = 9874;
	String whoOpened = "Magelan";

	// перегруженные, но не связанные друг с другом конструкторы
	public Sun() {

	}

	public Sun(String name) {
		this.name = name;
	}

	public Sun(int radius) {
		this.radius = radius;
	}

	public Sun(String name, String composition, int radius, String whoOpened, int speed, double size) {
		this.name = name;
		this.composition = composition;
		this.radius = radius;
		this.whoOpened = whoOpened;
		this.speed = speed;
		this.size = size;
	}

	public void setWhoOpened(String whoOpened) {
		this.whoOpened = whoOpened;
	}

	public String getWhoOpened() {
		return whoOpened;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void print() {
		super.print();
		System.out.println(", radius = " + getRadius() + ", whoOpened = " + getWhoOpened());
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

		Sun sun = (Sun) obj;
		if (this.size != sun.size) {
			return false;
		}
		if (this.speed != sun.speed) {
			return false;
		}
		if (this.diameter != sun.diameter) {
			return false;
		}
		if (this.radius != sun.radius) {
			return false;
		}
		if (composition == null) {
			if (sun.composition != null) {
				return false;
			} else if (!composition.equals(sun.composition)) {
				return false;
			}
		}
		if (name == null) {
			if (sun.name != null) {
				return false;
			} else if (!name.equals(sun.name)) {
				return false;
			}
		}
		if (whoOpened == null) {
			if (sun.whoOpened != null) {
				return false;
			} else if (!whoOpened.equals(sun.whoOpened)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * (size + speed + diameter + radius) + ((null == name) ? 0 : name.hashCode())
				+ ((null == composition) ? 0 : composition.hashCode())
				+ ((null == whoOpened) ? 0 : whoOpened.hashCode()));
	}

	@Override
	public String toString() {
		return "Sun [name=" + name + ", size=" + size + ", composition=" + composition + ", speed=" + speed
				+ ", diameter=" + diameter + ", radius=" + radius + ", whoOpened=" + whoOpened + "]";
	}

}
