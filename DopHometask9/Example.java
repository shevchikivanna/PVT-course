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
		planet.setName("Planet");
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

		Mars mars = new Mars();
		mars.printTask();
		mars.setName("Mars");
		mars.setSize(8888);
		mars.setComposition("vodorod");
		mars.setWeight(999.999);
		mars.setAge(4000);
		mars.print();

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
		
		System.out.println(a);
		//Доп задание
		
		System.out.println(starSystem.equals(starSystem));
		System.out.println(starSystem.hashCode());
		System.out.println(starSystem.toString());
		
		
		System.out.println(star.equals(star));
		System.out.println(star.hashCode());
		System.out.println(star.toString());
		
		System.out.println(planet.equals(planet));
		System.out.println(planet.hashCode());
		System.out.println(planet.toString());

		System.out.println(sun.equals(sun));
		System.out.println(sun.hashCode());
		System.out.println(sun.toString());
		
		System.out.println(sirius.equals(sirius));
		System.out.println(sirius.hashCode());
		System.out.println(sirius.toString());
		
		System.out.println(mars.equals(mars));
		System.out.println(mars.hashCode());
		System.out.println(mars.toString());
		
		System.out.println(earth.equals(earth));
		System.out.println(earth.hashCode());
		System.out.println(earth.toString());
	}
}
