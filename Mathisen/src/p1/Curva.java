package p1;

public class Curva {

	private int metros;
	private int inclinacion;
	private double tiempoPromedio;
	
	public int getMetros() {
		return metros;
	}
	public void setMetros(int metros) {
		this.metros = metros;
	}
	public int getInclinacion() {
		return inclinacion;
	}
	public void setInclinacion(int inclinacion) {
		this.inclinacion = inclinacion;
	}
	public double getTiempoPromedio() {
		return tiempoPromedio;
	}
	public void setTiempoPromedio(double tiempoPromedio) {
		this.tiempoPromedio = tiempoPromedio;
	}
	public Curva( int metros, int inclinacion, double tiempoPromedio) {
		this.metros = metros;
		this.inclinacion = inclinacion;
		this.tiempoPromedio = tiempoPromedio;
	}
	@Override
	public String toString() {
		return "Metros=" + metros + ", inclinacion=" + inclinacion + ", tiempoPromedio="
				+ tiempoPromedio + "]";
	}
	
	
}
