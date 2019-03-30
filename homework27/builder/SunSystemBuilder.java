package hometask;

public class SunSystemBuilder {

	public SunSystem buildSunSystem() {
		Earth earth = new Earth();
		earth.setAge(3000);
		earth.setPopulation(100);
		
		Mars mars = new Mars();
		mars.setAge(500);
		mars.setWeight(100);
		
		Sirius sirius = new Sirius();
		sirius.setClimate("Cold");
		sirius.setDiameter(300);
		
		return new SunSystem(earth, mars, sirius);
	}
	
}
