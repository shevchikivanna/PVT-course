package hometask2;

import hometask.Tester;

public class DisplayTester2 {

	public static void main(String[] args) {

		String empty = "  ";
		
		Tester tester = new Tester("Idan", "Traub", 10);
		
/*		System.out.println(tester.getName());
		System.out.println(tester.getSurname());
		System.out.println(tester.getExpirienceInYears());
		System.out.println(tester.getEnglishLevel());
		System.out.println(tester.getSalary());
		
		
		System.out.println(empty);
		tester.setName("Brad");
		tester.setSurname("Pit");
		tester.setExpirienceInYears(20);
		tester.setEnglishLevel("Upper");
		tester.setSalary(1000);
		
		System.out.println(tester.getName());
		System.out.println(tester.getSurname());
		System.out.println(tester.getExpirienceInYears());
		System.out.println(tester.getEnglishLevel());
		System.out.println(tester.getSalary());
		
		System.out.println(empty);
		System.out.println(tester.getValueOfExpirienceInMonthes());
		System.out.println(tester.getSalaryMultiplyTwo());  
		
		System.out.println(empty);
		tester.setNameSurname("Tomas", "Tomas");
		
		methods not visible  */
		tester.setAllInformation("Mihael", "Preston", 50, "pre-intermediate", 500);
		
	}

}
