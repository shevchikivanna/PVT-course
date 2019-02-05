package hometask;

public class DoptaskTester {

	// 1 �������� ����� �����������, ������� �������� �������� ������� ������
	// DoptaskTester � ������ �������;
	private DoptaskTester() {

	}

	// 2 ����� ������ �������� ������ ������ DoptaskTester, ������� �������� ������
	// �����������, ���������� ������������� ����.

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

	// �������� ����� � ������� ������� ������ ������ ������, ������� �����
	// ���������� salary*2;
	private static int getSalaryMultiplyTwo() {
		int multiply = 2;
		return getSalary() * multiply;
	}

	//  �������� ����� � ������� ������� ������ ������ ������, ������� �����
	// ���������� ���������� ����� � �������;
	static int getValueOfExpirienceInMonthes() {
		int countOfMonthes = 12;
		return getExpirienceInYears() * countOfMonthes;
	}

	//  �������� ����� � ������� ������� ������ ������ � ��� ����������� � ������
	// �������, ������� ������� �� ����� ��� � �������;
	protected static void setNameSurname(String name1, String surname1) {
		setName(name);
		setSurname(surname);
		System.out.println(getName() + "   " + getSurname());
	}

	//  �������� ����� � ������� ������� ��������, ������� � ���� ������ �����
	// �������� ��� ���������� � ������������.
	public static void setAllInformation(String name1, String surname1, int expirienceInYears1, String englishLevel1,
			int salary1) {
		setName(name);
		setSurname(surname);
		setExpirienceInYears(expirienceInYears);
		setEnglishLevel(englishLevel);
		setSalary(salary);
		String message = "�� ����� ��������� ���������� � �����������: %s, %s, %s, %s, %s";
		System.out.println(String.format(message, getName(), getSurname(), getExpirienceInYears(), getEnglishLevel(),
				getSalary()));
	}

	// 3 ���������, ��� �������� ��� �������.

	/*
	 * ���� ������� ��������� �����������, �� �� ����� ������� ������ � ����� ������
	 * � ������� �������, ����� ��� � ������� ������ � ������. ���� ������� ��������
	 * �����������, �� �� �� ����� ������� ������ ������, �� ����� ��������
	 * ����������� ������, ������� �������� ���������� ������ � �������� ��
	 * ������������ ���������� ������ (name, surname, � �.�)
	 */

}
