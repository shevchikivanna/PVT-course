package hometask;

public class Star extends StarSystem {

	int speed = 6000;
	int diameter = 22222;

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void print() {
		super.print();
		System.out.print(", speed = " + getSpeed() + ", diameter = " + getDiameter());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null == obj) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Star star = (Star) obj;
		if (this.speed != star.speed) {
			return false;
		}

		if (this.diameter != star.diameter) {
			return false;
		}

		if (this.size != star.size) {
			return false;
		}

		if (composition == null) {
			if (star.composition != null)
				return false;
		} else if (!composition.equals(star.composition))
			return false;

		if (name == null) {
			if (star.name != null) {
				return false;
			} else if (!name.equals(star.name)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		
		return (int) (31 * (speed + diameter + size) + ((null == name) ? 0 : name.hashCode())
				+ ((null == composition) ? 0 : composition.hashCode()));
	}

	@Override
	public String toString() {
		
		return "Star [name=" + name + ", size=" + size + ", composition=" + composition + ", speed=" + speed
				+ ", diameter=" + diameter + "]";
	}

}
