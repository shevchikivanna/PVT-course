package hometask;

import java.util.Scanner;

public class Task7_3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите количество строк: n =  ");
		int size = in.nextInt();
		String[] str = new String[size];

		for (int i = 0; i < str.length; i++) {
			System.out.println("¬ведите строку: ");
			str[i] = in.next();
		}

		int sum = 0;
		for (int i = 0; i < str.length; i++) {

			sum = str[i].length() + sum;
		}
		double average = sum / size;
		System.out.println("—редн€€ длинна строки " + average);

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < average) {
				String message = "ƒлинна строки %s /%s/  меньше средней и равна %s";
				System.out.println(String.format(message, i, str[i], str[i].length()));
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > average) {
				String message = "ƒлинна строки %s /%s/  больше средней и равна %s";
				System.out.println(String.format(message, i, str[i], str[i].length()));
			}
		}
		in.close();
	}
}