package hometask;

public class Sirius extends Star {

	String climate = "Normal";
	int numberOfStudies = 100;
	
	
	//перегруженные связанные друг с другом конструкторы
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
}
