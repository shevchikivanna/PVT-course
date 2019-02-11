package hometask;

import java.util.ArrayList;
import java.util.List;

public class Paragraph {
	
	private String paragraph;
	private List<Sentence> sentenses = new ArrayList<>();
	private List<String> newSentenses = new ArrayList<>();
	
	public Paragraph(String paragraph) {
		this.paragraph = paragraph;
	}
	
	public List<String> getNewSentenses() {
		return newSentenses;
	}

	public void splitOnSentenses() {
		String[] sensenses = paragraph.split("\\.|!|\\?|...]");
		for (int i = 0; i < sensenses.length; i++) {
			Sentence sentence = new Sentence(sensenses[i]);
			sentenses.add(sentence);
		}
		this.sentenses.forEach(Sentence::splitOnWord);
	}
	
	public void overrideSymbol(int position) {
		this.sentenses.forEach(item -> item.overrideSymbol(position));
		this.sentenses.forEach(item -> {
			this.newSentenses.addAll(item.getNewWords());
		});
	}

	@Override
	public String toString() {
		return "Paragraph [paragraph=" + paragraph + ", sentenses=" + sentenses + "]";
	}
	
}
