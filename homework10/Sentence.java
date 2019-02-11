package hometask;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private String sentense;
	private List<Word> words = new ArrayList<>();
	private List<String> newWords = new ArrayList<>();
	
	public Sentence(String sentense) {
		this.sentense = sentense;	
	}
	
	public List<String> getNewWords() {
		return newWords;
	}

	public void splitOnWord() {
		String[] words = sentense.split(" ");
		for (int i = 0; i < words.length; i++) {
			Word word = new Word(words[i]);
			this.words.add(word);
		}
	}
	
	public void overrideSymbol(int position) {
		this.words.forEach(item -> {
			String newWord = item.overrideSymbol(position);
			this.newWords.add(newWord);
		});
	}

	@Override
	public String toString() {
		return "Sentence [sentense=" + sentense + ", words=" + words + "]";
	}
	
}
