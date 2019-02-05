package hometask;

public class Tester {

	public String name = "Ivan";
	public String surname = "Ivanov";
	protected int expirienceInYears = 8;
	String englishLevel = "Intermediate";
	private int salary = 200;

	// 1 ѕерегрузить в этом классе 3 конструктора
	protected Tester() {

	};

	public Tester(String name) {
		this();
		this.name = name;
	}

	private Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	// 2 Ќаписать дл€ каждого пол€ get- и set- методы с уровнем доступа только
	// внутри пакета
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	// 3 Ќаписать метод с уровнем доступа только внутри класса, который будет
	// возвращать salary*2;
	private int getSalaryMultiplyTwo() {
		int multiply = 2;
		return getSalary() * multiply;
	}

	// 4 Ќаписать метод с уровнем доступа только внутри пакета, который будет
	// возвращать количество опыта в мес€цах;
	int getValueOfExpirienceInMonthes() {
		int countOfMonthes = 12;
		return getExpirienceInYears() * countOfMonthes;
	}

	// 5 Ќаписать метод с уровнем доступа внутри пакета и дл€ наследников в других
	// пакетах, который выводит на экран им€ и фамилию;
	protected void setNameSurname(String name, String surname) {
		setName(name);
		setSurname(surname);
		System.out.println(getName() + "   " + getSurname());
	}

	// 6 Ќаписать метод с уровнем доступа отовсюду, который в одну строку будет
	// выводить всю информацию о пользователе.
	public void setAllInformation(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		setName(name);
		setSurname(surname);
		setExpirienceInYears(expirienceInYears);
		setEnglishLevel(englishLevel);
		setSalary(salary);		
		String message = "ћы имеем следующую информацию о поьзователе: %s, %s, %s, %s, %s";
		System.out.println(String.format(message, getName(), getSurname(), getExpirienceInYears(), getEnglishLevel(),
				getSalary()));
	}
}
