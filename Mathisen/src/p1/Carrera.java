package p1;

import java.util.Scanner;
import java.util.ArrayList;

public class Carrera {
	double tiempoAuto1=0;
	double tiempoAuto2=0;
	Scanner entradaEscaner = new Scanner (System.in);
    final int MAX_JUGADORES=2;
    int cantVueltas;
    Jugador[] listaJugadores = new Jugador[MAX_JUGADORES];
    ArrayList<Modelo> listaModelos = new ArrayList <Modelo>();
	Marca marca1 = new Marca("Mercedes Benz", 1);
	Marca marca2 = new Marca("Ferrari", 2);
	
	Modelo modelo1 = new Modelo(marca1.getNombre(), marca1.getId(), "AMG GTR R COUPE", 4.0 , true, Neumatico.MEDIO, Combustible.VPOWER, 585 , 9.4 ,  65, 15, 315, 5);
	Modelo modelo2 = new Modelo(marca2.getNombre(), marca2.getId(), "458 ITALIA", 4.5, false, Neumatico.MEDIO, Combustible.VPOWER,      570 , 10.0 , 86, 17, 325, 4);
	
	Pista pista1 = new Pista(1, "SPA FRANCORCHAMPS", 7.004, 20 , 19 , 15);
	public void prepararCurvas() {
	pista1.configurarCurvas(0, 6, 90, 5.0);
	pista1.configurarCurvas(1, 4, 15, 3.13);
	pista1.configurarCurvas(2, 7, 20, 4.18);
	pista1.configurarCurvas(3, 6, 15, 3.22);
	pista1.configurarCurvas(4, 6, 50, 4.73);
	pista1.configurarCurvas(5, 6, 45, 4.14);
	pista1.configurarCurvas(6, 6, 47, 4.43);
	pista1.configurarCurvas(7, 12, 95, 8.68);
	pista1.configurarCurvas(8, 7, 50, 5.01);
	pista1.configurarCurvas(9, 9, 45, 5.79 );
	pista1.configurarCurvas(10, 9, 35, 5.69);
	pista1.configurarCurvas(11, 10, 45, 5.17);
	pista1.configurarCurvas(12, 7, 40, 5.17);
	pista1.configurarCurvas(13, 6, 50, 4.90);
	pista1.configurarCurvas(14, 10, 40, 5.37);
	pista1.configurarCurvas(15, 7, 5, 5.13);
	pista1.configurarCurvas(16, 7, 15, 4.62);
	pista1.configurarCurvas(17, 4, 50, 5.48 );
	pista1.configurarCurvas(18, 5, 80, 4.48);
	}
	public void prepararRectas() {
	pista1.configurarRectas(0, 11, 3.44, 5.42);
	pista1.configurarRectas(1, 39, 1.41, 11.51);
	pista1.configurarRectas(2, 70, 3.1, 17.7);
	pista1.configurarRectas(3, 6, 1.03, 1.69);
	pista1.configurarRectas(4, 21, 1.90, 5.02);
	pista1.configurarRectas(5, 8, 0.9, 3.0);
	pista1.configurarRectas(6, 28, 1.33, 8.13);
	pista1.configurarRectas(7, 8, 0.2, 2.95);
	pista1.configurarRectas(8, 24, 2.3, 6.0);
	pista1.configurarRectas(9, 14, 1.8, 5.0);
	pista1.configurarRectas(10, 14, 0.7, 3);
	pista1.configurarRectas(11, 44, 1.9, 15.8);
	pista1.configurarRectas(12, 32, 2.5, 8);
	pista1.configurarRectas(13, 1, 0.09, 0.7);
	pista1.configurarRectas(14, 22, 0.0, 8.29);
	
	}
	
	public double tiempoDePista() {
		double cont =0;
		for (int i = 0; i < pista1.cantCurvas.length; i++) {
			cont = cont + pista1.cantCurvas[i].getTiempoPromedio(); 
		}
		for (int i = 0; i < pista1.cantRectas.length; i++) {
			cont = cont + pista1.cantRectas[i].getTiempoPromedio(); 
		}
		return cont;
	}
	
	public void setearDatos() {
		modelo1.setNaftaRestante();
		modelo1.setAdherenciaRestante();
		modelo1.setNeumaticoRestante();
		modelo2.setNaftaRestante();
		modelo2.setAdherenciaRestante();
		modelo2.setNeumaticoRestante();
	}
	
	public void mostrarDatos() {
	System.out.println(modelo1.toString());
	System.out.println(modelo2.toString());
	System.out.println(pista1.toString());
	}
	
	public void agregarModelosALista() {
	listaModelos.add(modelo1);
	listaModelos.add(modelo2);
	}
	
	public void ingresarJugador() {
		this.agregarModelosALista();
		int idJugador=0;
		for (int i = 0; i < this.MAX_JUGADORES; i++) {
		 idJugador++;
		int modeloJugador;
		String nombreJugador;
		System.out.println("Ingrese nombre del jugador Nº" + idJugador );
		nombreJugador=entradaEscaner.next();
		this.mostrarModelosDisponibles();
		System.out.println("Ingrese el auto que desea elegir mediante su ID");
		modeloJugador = entradaEscaner.nextInt();
		modeloJugador--;
		while(modeloJugador>listaModelos.size()) {
			System.out.println("Ingrese un ID de auto valido");
			modeloJugador = entradaEscaner.nextInt();
		}
	Jugador jugador = new Jugador(idJugador, modeloJugador, nombreJugador);
	System.out.println("Jugador creado:" + idJugador +", " + listaModelos.get(modeloJugador).getNombre() +", " + nombreJugador);
	}
	}
		

	public void mostrarModelosDisponibles() {
		for (int i = 0; i < listaModelos.size(); i++) {
			System.out.println(this.listaModelos.get(i).toString());
		}
	}
		
	public void ingreseCantidadDeVueltas() {
	System.out.println("Ingrese cantidad de vueltas");
	cantVueltas= entradaEscaner.nextInt();
	cantVueltas++;
	}
	//calculos del auto{
	//preguntar si alcanza la nafta
	//preguntar si el riesgo es mayor a 90, lo voy a incrementar en 3 por cada vuelta
	//preguntar si los neumaticos resisten
	//calcular tiempo total en los pits
    //}
	//metodo correr{
	//calcular tiempo total en los pits
	public void tiempoEnPits() {
		modelo1.tiempoTotalEnPits(pista1.getTiempoPits());
		modelo2.tiempoTotalEnPits(pista1.getTiempoPits());
	}
	
	//mostrar quien va ganando por caada vuelta
	//mostrar si un auto fallo
	
	//mostrar quien va  a pits, cada vez que vaya hacer cambio de neumaticos y nafta
	//mostrar ganador y tiempo total
	//}
	public void correr() {
		ingreseCantidadDeVueltas();
	for (int i = 1; i < cantVueltas; i++) {
		if(i==1) {
			System.out.println("Comienza la carrera!!!");
		}
		if(modelo1.getNaftaRestante()<=pista1.getKilometros()) {
			System.out.println("El vehiculo 1 necesita parar cargar combustible");
			modelo1.cargarNafta();
			tiempoAuto1= tiempoAuto1 + pista1.getTiempoPits() + 10;
		}
		if(modelo2.getNaftaRestante()<=pista1.getKilometros()) {
			System.out.println("El vehiculo 1 necesita parar cargar combustible");
			modelo2.cargarNafta();
			tiempoAuto2= tiempoAuto2 + pista1.getTiempoPits() + 10;
		}
		if(modelo1.neumaticoRestante<=pista1.getKilometros()) {
			System.out.println("El modelo 1 cambio neumaticos por desgaste");
			modelo1.cambiarNeumaticos();
			tiempoAuto1 = tiempoAuto1 + modelo1.getTiempoCambioNeumaticos() + pista1.getTiempoPits();
		}
		if(modelo2.neumaticoRestante<=pista1.getKilometros()) {
			System.out.println("El modelo 2 cambio neumaticos por desgaste");
			modelo2.cambiarNeumaticos();
			tiempoAuto2 = tiempoAuto2 + modelo2.getTiempoCambioNeumaticos() + pista1.getTiempoPits();
		}
		if(modelo1.adherenciaRestante<=pista1.getKilometros()) {
			System.out.println("El modelo 1 cambio neumaticos por falta de adherencia");
			modelo1.cambiarNeumaticos();
			tiempoAuto1 = tiempoAuto1 + modelo1.getTiempoCambioNeumaticos() + pista1.getTiempoPits();
		}
		if(modelo2.adherenciaRestante<=pista1.getKilometros()) {
			System.out.println("El modelo 2 cambio neumaticos por falta de adherencia");
			modelo2.cambiarNeumaticos();
			tiempoAuto2 = tiempoAuto2 + modelo2.getTiempoCambioNeumaticos() + pista1.getTiempoPits();
		}
		System.out.println("Vuelta Nº" + i);
		modelo1.aumentarProbabilidadDeAveria();
		modelo2.aumentarProbabilidadDeAveria();
		modelo1.gastarCombustible(pista1.getKilometros());
		modelo2.gastarCombustible(pista1.getKilometros());
		modelo1.gastarNeumaticos(pista1.getKilometros());
		modelo2.gastarNeumaticos(pista1.getKilometros());
		tiempoAuto1 = tiempoAuto1 + tiempoDePista() - modelo1.getMotor() + Math.random()*4;
		tiempoAuto2 = tiempoAuto2 + tiempoDePista() - modelo2.getMotor() + Math.random()*4 ;
		System.out.println(modelo1.getMotor());
		System.out.println(modelo2.getMotor());
		if(modelo1.getPorbabilidadAveria()>90) {
			System.out.println("El modelo 1 sufrio una averia");
			tiempoAuto1=9999999;
			i=cantVueltas;
		}
		if(modelo2.getPorbabilidadAveria()>90) {
			System.out.println("El modelo 2 sufrio una averia");
			tiempoAuto2=9999999;
			i=cantVueltas;
		}
	}if(tiempoAuto1>tiempoAuto2 && tiempoAuto1!=9999999) {
	System.out.println("El ganador de la carrera fue: " + modelo2.getNombre() + " con un tiempo de: " + tiempoAuto2);

	}else if(tiempoAuto2>tiempoAuto1 && tiempoAuto2!=9999999){
		System.out.println("El ganador de la carrera fue: " + modelo1.getNombre() + " con un tiempo de: " + tiempoAuto1);

	} else if(tiempoAuto1==9999999) {
		System.out.println("El ganador de la carrera fue: " + modelo2.getNombre() + " con un tiempo de: " + tiempoAuto2 + " por una averia del modelo Nº1");

	}else if(tiempoAuto2==9999999) {
			System.out.println("El ganador de la carrera fue: " + modelo1.getNombre() + " con un tiempo de: " + tiempoAuto1 + " por una averia del modelo Nº2");

		}
	}
}
