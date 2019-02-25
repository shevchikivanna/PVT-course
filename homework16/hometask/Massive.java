package hometask;

public class Massive {

	int a = 10;
	int b = 0;

	public int sumElement(int a, int b) {
		return (a + b);
	}

	public int deductionElement(int a, int b) {
		return (a - b);
	}

	public int multiplyElement(int a, int b) {
		return (a * b);
	}

	public double divisionElement(int a, Integer b) {
		return (a / b);
	}

	public int squareElement(int a) {
		return (a * a);
	}

	public int valueIntFromDevisionElement(int a, int b) {
		return (a % b);
	}

	public boolean lessOrMore(int a, int b) {
		return a > b;

	}

	public boolean isZero(int a) {
		return a == 0;
	}

	public boolean moreZero(int a) {
		return a > 0;
	}

	public boolean isNull(Integer a) {
		if (a == null) {
			throw new NullPointerException("Example");
		} else {
			return false;
		}

	}
}
