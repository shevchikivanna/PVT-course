package hometask;

public class Star extends StarSystem {

	int speed = 6000;
	int diameter = 22222;
	int temperature;

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

}
