package hometask;

import java.util.ArrayList;
import java.util.List;

public class Display {
	public static void main(String[] args) {

		Button buttonCancel = new Button("Cancel", "OnCancel");
		Button buttonSave = new Button("Save", "ToSave");
		Button buttonReplace = new Button("Replace", "ToReplace");
		Page page = new Page();
		page.addButton(buttonCancel);
		page.addButton(buttonSave);
		page.removeButton(buttonCancel);
		page.replaceButton(buttonSave, buttonReplace);
		page.printButtons();

		Field fieldNumber = new Field(5, 444);
		Field field2 = new Field(11, 789);
		Field fieldTitle = new Field(1, 1000);
		page.addField(fieldNumber);
		page.addField(field2);
		page.removeField(field2);
		page.replaceField(fieldNumber, fieldTitle);
		page.printFields();

		Label labelMarko = new Label("Marko");
		Label labelMexx = new Label("Mexx");
		Label labelConte = new Label("Conte");
		page.addLabel(labelMexx);
		page.addLabel(labelMarko);
		page.removeLabel(labelMexx);
		page.replaceLabel(labelMarko, labelConte);
		page.printLabel();

		List<String> city = new ArrayList<String>();
		city.add("Minsk");
		city.add("Moskow");
		city.add("Kiev");
		Dropdown dropdownCity = new Dropdown(city, true, "dropdownCity");
		List<String> lands = new ArrayList<String>();
		lands.add("FR");
		lands.add("USA");
		lands.add("BY");
		Dropdown dropdownLand = new Dropdown(lands, true, "dropdownLand");
		List<String> surname = new ArrayList<String>();
		surname.add("Tomas");
		surname.add("Peter");
		surname.add("Ivanov");
		Dropdown dropdownSurname = new Dropdown(surname, true, "surname");
		page.addDropdown(dropdownLand);
		page.addDropdown(dropdownCity);
		page.removeDropdown(dropdownCity);
		page.replaceDropdown(dropdownLand, dropdownSurname);
		page.printDropdown();

	}
}
