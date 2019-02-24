package hometask;

import java.util.Arrays;

public class Massive {

	int size = 3;
	int[] mas = new int[size];
	boolean isFull;

	public void addElement(int index, int element) {
		try {
			mas[index] = element;
		} catch (Exception e) {
			System.out.println("Exception in addElement method");
		}
	}

	public void removeElementByIndex(int index) {
		try {
			mas[index] = 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Error ArrayIndexOutOfBoundsException");
		} finally {
			System.out.println("Everything is good");
		}

	}

	public void replaceElementByIndex(int index, int newElement) {
		try {
			mas[index] = newElement;

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Please, fix it!!! " + e);
		}

	}

	public void devide(int index, int devider) {
		try {
			mas[index] = mas[index] / devider;

		} catch (ArithmeticException e) {
			System.out.println("Error ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error IndexOutOfBoundsException");
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Massive [mas=" + Arrays.toString(mas) + "]";
	}

}
