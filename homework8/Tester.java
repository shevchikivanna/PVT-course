package hometask;

public class Tester {

	public String name = "Ivan";
	public String surname = "Ivanov";
	protected int expirienceInYears = 8;
	String englishLevel = "Intermediate";
	private int salary = 200;

	// 1 ����������� � ���� ������ 3 ������������
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

	// 2 �������� ��� ������� ���� get- � set- ������ � ������� ������� ������
	// ������ ������
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

	// 3 �������� ����� � ������� ������� ������ ������ ������, ������� �����
	// ���������� salary*2;
	private int getSalaryMultiplyTwo() {
		int multiply = 2;
		return getSalary() * multiply;
	}

	// 4 �������� ����� � ������� ������� ������ ������ ������, ������� �����
	// ���������� ���������� ����� � �������;
	int getValueOfExpirienceInMonthes() {
		int countOfMonthes = 12;
		return getExpirienceInYears() * countOfMonthes;
	}

	// 5 �������� ����� � ������� ������� ������ ������ � ��� ����������� � ������
	// �������, ������� ������� �� ����� ��� � �������;
	protected void setNameSurname(String name, String surname) {
		setName(name);
		setSurname(surname);
		System.out.println(getName() + "   " + getSurname());
	}

	// 6 �������� ����� � ������� ������� ��������, ������� � ���� ������ �����
	// �������� ��� ���������� � ������������.
	public void setAllInformation(String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		setName(name);
		setSurname(surname);
		setExpirienceInYears(expirienceInYears);
		setEnglishLevel(englishLevel);
		setSalary(salary);		
		String message = "�� ����� ��������� ���������� � �����������: %s, %s, %s, %s, %s";
		System.out.println(String.format(message, getName(), getSurname(), getExpirienceInYears(), getEnglishLevel(),
				getSalary()));
	}
}
