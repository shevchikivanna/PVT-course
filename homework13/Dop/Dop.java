package hometask;

import java.io.File;
import java.io.PrintWriter;

public class Dop {
	public static void main(String[] args) {

		int size = 5;
		int[] mas = new int[size];

		// try in try
		// try with resources
		try (PrintWriter writer = new PrintWriter(new File("C:/Users/User-PC/Desktop/test.txt"))) {
			writer.println("AutoCloseable -- Hello World");
			mas[0] = 100;
			mas[1] = 80;
			mas[2] = 0;
			try {
				int d = 500 / mas[2];
			} catch (ArithmeticException e) {
				System.out.println("Error " + e);
			}
			mas[30] = 200;

		} catch (Exception e) {
			System.out.println("Error " + e);
			// finally is not called
			System.exit(1);
		}

		finally {
			System.out.println("Everything is good");
		}

	}

}
