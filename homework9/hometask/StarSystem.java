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
}
