package hometask;

import java.util.Scanner;

public class Task7_1 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество строк: n =  ");
		int size = in.nextInt();
		String[] str = new String[size];

		for (int i = 0; i < str.length; i++) {
			System.out.println("Введите строку: ");
			str[i] = in.next();
		}

		String message = "Строка %s  /%s/ -> её длинна равна ";
		for (int i = 0; i < str.length; i++) {
			System.out.println(String.format(message, i, str[i]) + str[i].length());
		}

		int i = 0;
		String min = str[i];
		int indexForMin = 0;
		for (i = 0; i < str.length; i++) {
			if (str[i].length() < min.length()) {
				min = str[i];
				indexForMin = i;
			}
		}
		String message1 = "Самая короткая строка %s  /%s/ -> её длинна равна %s";
		System.out.println(String.format(message1, indexForMin, min, str[indexForMin].length()));

		String max = "";
		int indexForMax = 0;
		for (i = 0; i < str.length; i++) {

			if (str[i].length() > max.length()) {
				max = str[i];
				indexForMax = i;
			}
		}
		String message2 = "Самая длинная строка %s /%s/ -> её длинна равна %s";
		System.out.println(String.format(message2, indexForMax, max, max.length()));

		in.close();
	}

}
