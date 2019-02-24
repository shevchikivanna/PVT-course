package hometask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Page {

	ArrayList<Button> buttons = new ArrayList<>();
	LinkedList<Field> fields = new LinkedList<Field>();
	HashSet<Label> labels = new HashSet<Label>();
	Map<String, Dropdown> dropdowns = new HashMap<String, Dropdown>();
	float id;
	String title;

	public void addButton(Button button) {
		this.buttons.add(button);
	}

	public void printButtons() {
		System.out.println(this.buttons);
	}

	public void removeButton(Button button) {
		this.buttons.remove(button);
	}

	public void replaceButton(Button buttonOld, Button buttonNew) {
		int index = this.buttons.indexOf(buttonOld);
		this.buttons.set(index, buttonNew);
	}

	public void addField(Field field) {
		this.fields.add(field);
	}

	public void removeField(Field field) {
		this.fields.remove(field);
	}

	public void replaceField(Field fieldOld, Field fieldNew) {
		int index = this.fields.indexOf(fieldOld);
		this.fields.set(index, fieldNew);
	}

	public void printFields() {
		System.out.println(this.fields);
	}

	public void addLabel(Label label) {
		this.labels.add(label);
	}

	public void removeLabel(Label label) {
		this.labels.remove(label);
	}

	public void replaceLabel(Label labelOld, Label labelNew) {
		this.labels.remove(labelOld);
		this.labels.add(labelNew);
	}

	public void printLabel() {
		System.out.println(this.labels);
	}

	public void addDropdown(Dropdown dropdown) {
		this.dropdowns.put(dropdown.name, dropdown);
	}

	public void removeDropdown(Dropdown dropdown) {
		this.dropdowns.remove(dropdown.name);
	}

	public void replaceDropdown(Dropdown dropdownOld, Dropdown dropdownNew) {
		this.dropdowns.replace(dropdownOld.name, dropdownNew);
	}

	public void printDropdown() {
		System.out.println(this.dropdowns);
	}
}
