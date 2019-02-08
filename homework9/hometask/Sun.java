package hometask;

public class Sun extends Star {

	int radius = 9874;
	String whoOpened = "Magelan";

	//перегруженные, но не связанные друг с другом конструкторы 
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
}
