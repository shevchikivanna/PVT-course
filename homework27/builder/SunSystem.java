package hometask;

public class SunSystem {
	
	private Earth earth;
	private Mars mars;
	private Sirius sirius;
	
	public SunSystem(Earth earth, Mars mars, Sirius sirius) {
		super();
		this.earth = earth;
		this.mars = mars;
		this.sirius = sirius;
	}

	public Earth getEarth() {
		return earth;
	}

	public void setEarth(Earth earth) {
		this.earth = earth;
	}

	public Mars getMars() {
		return mars;
	}

	public void setMars(Mars mars) {
		this.mars = mars;
	}

	public Sirius getSirius() {
		return sirius;
	}

	public void setSirius(Sirius sirius) {
		this.sirius = sirius;
	}
	
}
