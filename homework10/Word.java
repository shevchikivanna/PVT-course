package hometask;

public class Word {
	
	private String word;
	
	public Word(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + "]";
	}
	
	public String overrideSymbol(int position) {
		char[] chars = this.word.toCharArray();
		if (chars.length >= position) {
			chars[position-1] = '%';
		}
		return new String(chars);
	}
}
