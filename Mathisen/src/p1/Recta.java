package p1;

public class Recta {
	
	private int metros;
	private double frenadoCurva;
	private double tiempoPromedio;
	
	public int getMetros() {
		return metros;
	}
	public void setMetros(int metros) {
		this.metros = metros;
	}
	public double getFrenadoCurva() {
		return frenadoCurva;
	}
	public void setFrenadoCurva(double frenadoCurva) {
		this.frenadoCurva = frenadoCurva;
	}
	public double getTiempoPromedio() {
		return tiempoPromedio;
	}
	public void setTiempoPromedio(double tiempoPromedio) {
		this.tiempoPromedio = tiempoPromedio;
	}
	public Recta(int metros, double frenadoCurva, double tiempoPromedio) {
		this.metros = metros;
		this.frenadoCurva = frenadoCurva;
		this.tiempoPromedio = tiempoPromedio;
	}
	@Override
	public String toString() {
		return "Metros=" + metros + ", frenadoCurva=" + frenadoCurva + ", tiempoPromedio="
				+ tiempoPromedio + "]";
	}
	
	

}
