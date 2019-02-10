package hometask;

public class StarSystem {

	String name = "StarSystem";
	double size = 200.5;
	String composition = "gas";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public void print() {
		System.out.print("Name: " + getName() + ", composition = " + getComposition() + ", size = " + getSize());
	}

	public final void printTask() {
		System.out.println("Task10");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		StarSystem system = (StarSystem) obj;
		
		if (composition == null) {
			if (system.composition != null)
				return false;
		} else if (!composition.equals(system.composition))
			return false;
		
		if (name == null) {
			if (system.name != null)
				return false;
		} else if (!name.equals(system.name))
			return false;
		
		if (this.size != system.size)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return (int) (31 * size + ((null == name) ? 0 : name.hashCode())
				+ ((null == composition) ? 0 : composition.hashCode()));
	}

	@Override
	public String toString() {
		return "StarSystem [name=" + name + ", size=" + size + ", composition=" + composition + "]";
	}

	
}
