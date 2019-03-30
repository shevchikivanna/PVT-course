package hometask;

public class ExampleBuilder {
	
	public static void main(String[] args) {
		
		SunSystemBuilder sunSystemBuilder = new SunSystemBuilder();
		SunSystem sunSystem = sunSystemBuilder.buildSunSystem();
		System.out.println(sunSystem.getEarth());
		System.out.println(sunSystem.getMars());
		System.out.println(sunSystem.getSirius());
	}

}
