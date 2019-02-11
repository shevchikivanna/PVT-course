package hometask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text: ");
		List<Paragraph> paragraphs = new ArrayList<>();
		while (in.hasNextLine()) {
			String paragraphText = in.nextLine();
			if (paragraphText.length() == 0) {
				break;
			}
			paragraphs.add(new Paragraph(paragraphText));
		}

		System.out.println("Enter the n-th letter of each word: ");
		int size = in.nextInt();
		paragraphs.forEach(item -> {
			item.splitOnSentenses();
			item.overrideSymbol(size);
		});

		paragraphs.forEach(item -> System.out.println(item.getNewSentenses()));
		in.close();
	}
}
