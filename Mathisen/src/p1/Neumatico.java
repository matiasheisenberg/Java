package p1;

public enum Neumatico {
BLANDO("Blando", 60 , 90), MEDIO("Medio", 75, 75), DURO("Duro", 90, 60), LLUVIA("Lluvia", 70, 70);
	
	private String neumatico;
	private double durabilidad;
	private int adherencia;
	
	private Neumatico(String neumatico, double durabilidad, int adherencia) {
		this.neumatico = neumatico;
		this.durabilidad = durabilidad;
		this.adherencia = adherencia;
	}
	
	public String getNeumatico() {
		return this.neumatico;
	}
	
	public double getDurabilidad() {
		return this.durabilidad;
	}

	public int getAdherencia() {
		return adherencia;
	}

	public void setAdherencia(int adherencia) {
		this.adherencia = adherencia;
	}

	public void setDurabilidad(double durabilidad) {
		this.durabilidad = durabilidad;
	}
	
	
}
