package hometaskAbstract;

public class Examp {

	public static void main(String[] args) {

		// работы абстрактных методов для каждого из наследников

		Star star = new Star();
		star.setTemperature(100);
		System.out.println(star.getTemperature());
		System.out.println(star.isMagnitic());

		Planet planet = new Planet();
		planet.setTemperature(600);
		System.out.println(planet.getTemperature());
		System.out.println(planet.isMagnitic());

	}
}
