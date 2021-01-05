package p1;

public class Pista {

	private int id;
	private String nombre;
	private double kilometros;
	//condicion
	Curva[] cantCurvas;
	Recta[] cantRectas;
	private double tiempoPits;
	double cont=0;
	//cola de curvas y rectas
	
	
	public void configurarCurvas(int numeroDeCurva, int metros, int inclinacion, double tiempoPromedio) {
		
		if(numeroDeCurva <= this.cantCurvas.length) {
			Curva curva  = new Curva(metros, inclinacion, tiempoPromedio);
			this.cantCurvas[numeroDeCurva]= curva;
		}
	}
	
	public void configurarRectas(int numeroDeRecta, int metros, double frenadoCurva, double tiempoPromedio) {
		if(numeroDeRecta<= this.cantRectas.length) {
			Recta recta = new Recta(metros, frenadoCurva,  tiempoPromedio);
			this.cantRectas[numeroDeRecta]= recta;
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getKilometros() {
		return kilometros;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	
	public double getTiempoPits() {
		return tiempoPits;
	}
	public void setTiempoPits(double tiempoPits) {
		this.tiempoPits = tiempoPits;
	}
	public Pista(int id, String nombre, double kilometros, double tiempoPits, int curvas, int rectas) {
		this.id = id;
		this.nombre = nombre;
		this.kilometros = kilometros;
		this.tiempoPits = tiempoPits;
		this.cantRectas = new Recta[rectas];
		this.cantCurvas = new Curva[curvas];
	}
	@Override
	public String toString() {
		return "Pista [id=" + id + ", nombre=" + nombre + ", kilometros=" + kilometros +  ", tiempoPits=" + tiempoPits + "]";
	}
	
	
}
