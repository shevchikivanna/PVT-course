package hometask;

public class Massive {

	int a;
	Integer b;
	int c;

	public int sumElement(int a, int b, int c) {
		return a + b + c;
	}

	public int decreaseElement(int a, int b, int c) {
		return a - b - c;
	}

	public int multiplayElement(int a, int b, int c) {
		return a * b * c;
	}

	public double divisionElement(int a, Integer b) {
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("Error  " + e);

		}
		return 0;

	}

	public int squareElement(int a) {
		return a * a;
	}

}
