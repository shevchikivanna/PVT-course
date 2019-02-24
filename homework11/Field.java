package hometask;

public class Field {

	int id;
	int value;

	public Field(int id, int value) {
		this.id = id;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Field [id=" + id + ", value=" + value + "]";
	}

}
