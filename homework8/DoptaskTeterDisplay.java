package hometask;

public class DoptaskTeterDisplay {

	
	public static void main(String[] args) {

		String empty = "  ";
		
//		DoptaskTester DoptaskTester = new DoptaskTester();
		
		System.out.println(DoptaskTester.getName());
		System.out.println(DoptaskTester.getSurname());
		System.out.println(DoptaskTester.getExpirienceInYears());
		System.out.println(DoptaskTester.getEnglishLevel());
		System.out.println(DoptaskTester.getSalary());
		
		
		System.out.println(empty);
		DoptaskTester.setName("Brad");
		DoptaskTester.setSurname("Pit");
		DoptaskTester.setExpirienceInYears(20);
		DoptaskTester.setEnglishLevel("Upper");
		DoptaskTester.setSalary(1000);
		
		System.out.println(DoptaskTester.getName());
		System.out.println(DoptaskTester.getSurname());
		System.out.println(DoptaskTester.getExpirienceInYears());
		System.out.println(DoptaskTester.getEnglishLevel());
		System.out.println(DoptaskTester.getSalary());
		
		System.out.println(empty);
		System.out.println(DoptaskTester.getValueOfExpirienceInMonthes());
	//	System.out.println(DoptaskTester.getSalaryMultiplyTwo());  
		
		System.out.println(empty);
		DoptaskTester.setNameSurname("Tomas", "Tomas");
		DoptaskTester.setAllInformation("Mihael", "Preston", 50, "pre-intermediate", 500);
		
	}

}
