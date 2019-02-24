package hometask;

public class Display {
	public static void main(String[] args) {

		Massive massive = new Massive();

		massive.addElement(0, 100);
		massive.addElement(2, 80);
		massive.addElement(-1, 100);
		System.out.println(massive.toString());

		massive.devide(0, 2);
		massive.devide(0, 0);
		massive.devide(-1, 2);
		System.out.println(massive.toString());

		massive.removeElementByIndex(2);

		massive.replaceElementByIndex(-2, 60);
		massive.mas = null;
		massive.replaceElementByIndex(2, 77);
	}

}
