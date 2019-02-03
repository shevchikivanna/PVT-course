package hometask;

import java.util.Scanner;

public class Task7_2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите количество строк: n =  ");
		int size = in.nextInt();
		String[] str = new String[size];
		String[] strIncrease = new String[size];

		for (int i = 0; i < str.length; i++) {
			System.out.println("¬ведите строку: ");
			String val = in.next();
			str[i] = val;
			strIncrease[i] = val;
		}

		int val = strIncrease.length;
		while (val != 0) {
			for (int i = strIncrease.length - 1; i >= 0; i--) {
				while (i > 0 && strIncrease[i].length() < strIncrease[i - 1].length()) {
					String c = strIncrease[i];
					strIncrease[i] = strIncrease[i - 1];
					strIncrease[i - 1] = c;
				}
			}
			val--;
		}
		for (int i = 0; i < strIncrease.length; i++) {
			System.out.println(strIncrease[i]);
		}

		String[] strDecrease = new String[size];
		for (int i = 0; i < str.length; i++) {
			strDecrease[i] = str[i];
		}

		int val1 = strDecrease.length;
		while (val1 != 0) {
			for (int i = strDecrease.length - 1; i >= 0; i--) {
				while (i > 0 && strDecrease[i].length() > strDecrease[i - 1].length()) {
					String d = strDecrease[i - 1];
					strDecrease[i - 1] = strDecrease[i];
					strDecrease[i] = d;
				}
			}
			val1--;
		}
		for (int i = 0; i < strDecrease.length; i++) {
			System.out.println(strDecrease[i]);
		}
		in.close();
	}
}