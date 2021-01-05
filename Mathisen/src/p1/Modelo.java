package p1;

public class Modelo extends Marca{

	private String nombre;
	private double motor;
	private boolean turbo;
	private Neumatico neumatico;
	private Combustible combustibleCompatible;
	private int CV;
	private double consumoConbustible;
	private int capacidadTanque;
	private int naftaRestante;
	private double porbabilidadAveria;
	private int velocidadMaxima;
	private double tiempoCambioNeumaticos;
	public double neumaticoRestante;
	public int adherenciaRestante;
	
	public void cargarNafta() {
	this.naftaRestante=this.capacidadTanque;
	}
	
	public void cambiarNeumaticos() {
		this.adherenciaRestante= this.neumatico.getAdherencia();
		this.neumaticoRestante = this.neumatico.getDurabilidad();
	}
	
	public void setNaftaRestante(int naftaRestante) {
		this.naftaRestante = naftaRestante;
	}

	public int getNaftaRestante() {
		return naftaRestante;
	}

	public void setNaftaRestante() {
		this.naftaRestante = capacidadTanque;
	}

	public void setAdherenciaRestante() {
		adherenciaRestante = this.neumatico.getAdherencia();
	}
	
	public void setNeumaticoRestante() {
		neumaticoRestante=this.neumatico.getDurabilidad();
	}
	
	public void gastarCombustible(double kilometros) {
		int k = (int) kilometros;
		int res=k/5;
		this.adherenciaRestante= this.adherenciaRestante - res;
		this.naftaRestante-=(this.consumoConbustible/kilometros);
		System.out.println("Quedan en el tanque de " + this.nombre + ": " + this.naftaRestante);
		System.out.println("Adherencia de los neumaticos:" + this.adherenciaRestante);
	}
	
public void gastarNeumaticos(double kilometros) {
	    int k = (int) kilometros;
		this.neumaticoRestante= this.neumaticoRestante - k;
		System.out.println("Neumatico restante de " + this.nombre + ": " + this.neumaticoRestante);
	}
	
	public double tiempoTotalEnPits(double num) {
		double tt =0;
		tt= getTiempoCambioNeumaticos() + num;
		return tt;
	}
	
	public void aumentarProbabilidadDeAveria() {
		this.porbabilidadAveria+=1;
		System.out.println("La probabilidad de una averia de "+ this.nombre + " aumento a " + this.porbabilidadAveria);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public boolean isTurbo() {
		return turbo;
	}
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	public Neumatico getNeumatico() {
		return neumatico;
	}
	public void setNeumatico(Neumatico neumatico) {
		this.neumatico = neumatico;
	}
	public Combustible getCombustibleCompatible() {
		return combustibleCompatible;
	}
	public void setCombustibleCompatible(Combustible combustibleCompatible) {
		this.combustibleCompatible = combustibleCompatible;
	}
	public double getCV() {
		return CV;
	}
	public void setCV(int CV) {
		this.CV = CV;
	}
	public double getConsumoConbustible() {
		return consumoConbustible;
	}
	public void setConsumoConbustible(double consumoConbustible) {
		this.consumoConbustible = consumoConbustible;
	}
	public int getCapacidadTanque() {
		return capacidadTanque;
	}
	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	public double getPorbabilidadAveria() {
		return porbabilidadAveria;
	}
	public void setPorbabilidadAveria(double porbabilidadAveria) {
		this.porbabilidadAveria = porbabilidadAveria;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public double getTiempoCambioNeumaticos() {
		return tiempoCambioNeumaticos;
	}
	public void setTiempoCambioNeumaticos(double tiempoCambioNeumaticos) {
		this.tiempoCambioNeumaticos = tiempoCambioNeumaticos;
	}
	public Modelo(String nombre, int id, String nombre2, double motor, boolean turbo, Neumatico neumatico,
			Combustible combustibleCompatible, int CV, double consumoConbustible, int capacidadTanque,
			double porbabilidadAveria, int velocidadMaxima, double tiempoCambioNeumaticos) {
		super(nombre, id);
		this.nombre = nombre2;
		this.motor = motor;
		this.turbo = turbo;
		this.neumatico = neumatico;
		this.combustibleCompatible = combustibleCompatible;
		this.CV = CV;
		this.consumoConbustible = consumoConbustible;
		this.capacidadTanque = capacidadTanque;
		this.porbabilidadAveria = porbabilidadAveria;
		this.velocidadMaxima = velocidadMaxima;
		this.tiempoCambioNeumaticos = tiempoCambioNeumaticos;
	}
	@Override
	public String toString() {
		return "Marca=" + nombre + "Modelo [ID =" + getId() +", nombre=" + nombre + ", motor=" + motor + ", turbo=" + turbo + ", neumatico=" + neumatico
				+ ", combustibleCompatible=" + combustibleCompatible + ", CV=" + CV
				+ ", consumoConbustible=" + consumoConbustible + ", capacidadTanque=" + capacidadTanque
				+ ", porbabilidadAveria=" + porbabilidadAveria + ", velocidadMaxima=" + velocidadMaxima
				+ ", tiempoCambioNeumaticos=" + tiempoCambioNeumaticos + "]";
	}
	
	
	
}
