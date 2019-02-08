package hometask;

public class Example {

	public static void main(String[] args) {

		String a = " ";

		StarSystem starSystem = new StarSystem();
		starSystem.printTask();
		starSystem.print();

		System.out.println(a);

		Planet planet = new Planet();
		planet.printTask();
		planet.setName("Planets");
		planet.setSize(900.56);
		planet.setComposition("water");
		planet.print();

		System.out.println(a);

		Earth earth = new Earth();
		earth.printTask();
		earth.setName("Earth");
		earth.setSize(1234564);
		earth.setComposition("kislorod");
		earth.setWeight(5184.656);
		earth.setAge(987423);
		earth.print();

		Mars Mars = new Mars();
		Mars.printTask();
		Mars.setName("Mars");
		Mars.setSize(8888);
		Mars.setComposition("vodorod");
		Mars.setWeight(999.999);
		Mars.setAge(4000);
		Mars.print();

		Star star = new Star();
		star.printTask();
		star.setName("Star");
		star.setSize(78963);
		star.setComposition("ozon");
		star.print();

		System.out.println(a);

		// создали при помощи не связанного конструктора
		Sun sun = new Sun("Sun", "H2O", 9874, "Magelan", 3000, 2000);
		sun.printTask();
		sun.setDiameter(1111);
		sun.print();

		// создали при помощи связанного конструктора
		Sirius sirius = new Sirius("Sirius", 1000);
		sirius.printTask();
		sirius.setComposition("CO2");
		sirius.setSpeed(333);
		sirius.setDiameter(2222);
		sirius.print();

	}
}
