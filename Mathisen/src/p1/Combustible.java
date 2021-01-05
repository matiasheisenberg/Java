package p1;

public enum Combustible {
COMUN("Comun"), SUPER("Super"), VPOWER("vPower"), DIESEL("Diesel");
	
	private String combustible;
	
	private Combustible(String combustible) {
		this.combustible = combustible;
	}
	
	public String getCombustible() {
		return this.combustible;
	}
}
