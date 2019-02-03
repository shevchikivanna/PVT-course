package hometask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Task7_4_8 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите количество слов: n =  ");
		int size = in.nextInt();
		String[] str = new String[size];

		for (int i = 0; i < str.length; i++) {
			System.out.println("Введите слово: ");
			str[i] = in.next();
		}

		// 4. Найти слово, в котором число различных символов минимально.
		String minStr = Arrays.asList(str).stream().sorted(Comparator.comparing(String::length)).findFirst().get();
		System.out.println("Cлово, в котором число различных символов минимально " + minStr);

		// 5. Найти количество слов, содержащих только символы латинского алфавита, а
		// среди них – количество слов с равным числом гласных и согласных букв.

		long countWord = Arrays.asList(str).stream().filter(word -> word.matches("[a-zA-Z]*"))
				.filter(word -> countMatches(word, "[aeiou]") == countMatches(word, "[^aeiou]")).count();

		System.out.println("Количество слов " + countWord);

		// 6. Найти слово, символы в котором идут в строгом порядке возрастания их
		// кодов.
		Optional<String> optional = Arrays.asList(str).stream().filter(word -> {
			char[] chars = word.toCharArray();
			boolean isOrdered = true;
			for (int i = 0; i < chars.length - 1; i++) {
				if (chars[i] > chars[i + 1])
					isOrdered = false;
			}
			return isOrdered;

		}).findFirst();

		if (optional.isPresent()) {
			System.out.println("Code ordedred word: " + optional.get());
		} else {
			System.out.println("There is no");
		}

		// 7. Найти слово, состоящее только из различных символов. Если таких слов
		// несколько, найти первое из них.
		optional = Arrays.asList(str).stream().filter(word -> {
			char[] chars = word.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				char charValue = chars[i];
				int count = 0;
				for (int j = 0; j < chars.length; j++) {
					if (charValue == chars[j])
						count++;
				}

				if (count >= 2)
					return false;
			}
			return true;
		}).findFirst();
		if (optional.isPresent()) {
			System.out.println("Unique word: " + optional.get());
		} else {
			System.out.println("There is no unique word");
		}

		// 8. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких
		// слов больше одного, найти второе из них.
		List<String> polindriomList = Arrays.asList(str).stream().filter(word -> {
			char[] chars = word.toCharArray();
			int valueOfLength = chars.length - 1;
			boolean isPolindrom = true;
			for (int i = 0; i < valueOfLength; i++) {
				if (chars[i] != chars[valueOfLength]) {
					isPolindrom = false;
				}
				valueOfLength--;
			}
			return isPolindrom;
		}).collect(Collectors.toList());

		if (polindriomList.size() >= 2) {
			System.out.println("Полиндром " + polindriomList.get(1));
		} else {
			System.out.println("There is no Word-Palindrome");
		}

		in.close();
	}

	private static int countMatches(String str, String regex) {
		int result = 0;
		Pattern p = Pattern.compile(regex);
		Matcher matcher = p.matcher(str);
		while (matcher.find())
			result++;
		return result;

	}

}
