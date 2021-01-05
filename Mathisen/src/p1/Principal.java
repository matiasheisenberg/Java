package p1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
	Carrera carrera1 = new Carrera();
	
	carrera1.ingresarJugador();
	carrera1.prepararCurvas();
	carrera1.prepararRectas();
	carrera1.setearDatos();
	carrera1.correr();
	}
	
}
