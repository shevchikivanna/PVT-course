package hometask;

public class DoptaskTester {

	// 1 Ќаписать такой конструктор, который запретит создание объекта класса
	// DoptaskTester в других классах;
	private DoptaskTester() {

	}

	// 2 Ќайти способ вызывать методы класса DoptaskTester, который позволит обойти
	// ограничение, наложенное конструктором выше.

	public static String name = "Ivan";
	public static String surname = "Ivanov";
	protected static int expirienceInYears = 8;
	static String englishLevel = "Intermediate";
	private static int salary = 200;

	static String getName() {
		return name;
	}

	static void setName(String name1) {
		name = name1;
	}

	static String getSurname() {
		return surname;
	}

	static void setSurname(String surname1) {
		surname = surname1;
	}

	static int getExpirienceInYears() {
		return expirienceInYears;
	}

	static void setExpirienceInYears(int expirienceInYears1) {
		expirienceInYears = expirienceInYears1;
	}

	static String getEnglishLevel() {
		return englishLevel;
	}

	static void setEnglishLevel(String englishLevel1) {
		englishLevel = englishLevel1;
	}

	static int getSalary() {
		return salary;
	}

	static void setSalary(int salary1) {
		salary = salary1;
	}

	// Ќаписать метод с уровнем доступа только внутри класса, который будет
	// возвращать salary*2;
	private static int getSalaryMultiplyTwo() {
		int multiply = 2;
		return getSalary() * multiply;
	}

	//  Ќаписать метод с уровнем доступа только внутри пакета, который будет
	// возвращать количество опыта в мес€цах;
	static int getValueOfExpirienceInMonthes() {
		int countOfMonthes = 12;
		return getExpirienceInYears() * countOfMonthes;
	}

	//  Ќаписать метод с уровнем доступа внутри пакета и дл€ наследников в других
	// пакетах, который выводит на экран им€ и фамилию;
	protected static void setNameSurname(String name1, String surname1) {
		setName(name);
		setSurname(surname);
		System.out.println(getName() + "   " + getSurname());
	}

	//  Ќаписать метод с уровнем доступа отовсюду, который в одну строку будет
	// выводить всю информацию о пользователе.
	public static void setAllInformation(String name1, String surname1, int expirienceInYears1, String englishLevel1,
			int salary1) {
		setName(name);
		setSurname(surname);
		setExpirienceInYears(expirienceInYears);
		setEnglishLevel(englishLevel);
		setSalary(salary);
		String message = "ћы имеем следующую информацию о поьзователе: %s, %s, %s, %s, %s";
		System.out.println(String.format(message, getName(), getSurname(), getExpirienceInYears(), getEnglishLevel(),
				getSalary()));
	}

	// 3 ќбъ€снить, как работают оба способа.

	/*
	 * ≈сли создаем публичный конструктор, то мы можем создать объект и имеем доступ
	 * к методам объекта, таким как к примеру гетеры и сетеры. ≈сли создаем закрытый
	 * конструктор, то мы не можем создать объект класса, но можем вызывать
	 * статические методы, которые €вл€ютс€ атрибутами класса и работают со
	 * статическими свойствами класса (name, surname, и т.д)
	 */

}
