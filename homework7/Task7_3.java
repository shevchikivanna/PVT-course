package hometask;

import java.util.Scanner;

public class Task7_3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("������� ���������� �����: n =  ");
		int size = in.nextInt();
		String[] str = new String[size];

		for (int i = 0; i < str.length; i++) {
			System.out.println("������� ������: ");
			str[i] = in.next();
		}

		int sum = 0;
		for (int i = 0; i < str.length; i++) {

			sum = str[i].length() + sum;
		}
		double average = sum / size;
		System.out.println("������� ������ ������ " + average);

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < average) {
				String message = "������ ������ %s /%s/  ������ ������� � ����� %s";
				System.out.println(String.format(message, i, str[i], str[i].length()));
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > average) {
				String message = "������ ������ %s /%s/  ������ ������� � ����� %s";
				System.out.println(String.format(message, i, str[i], str[i].length()));
			}
		}
		in.close();
	}
}