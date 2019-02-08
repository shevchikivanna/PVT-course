package hometask;

public class Planet extends StarSystem {

	double weight = 500.555;
	int age = 1000000;
	int temperature;

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
}
