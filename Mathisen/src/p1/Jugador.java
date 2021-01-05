package p1;

public class Jugador {

    int idJugador;
    int autoSeleccionado;
    String nombreJugador;
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public int getAutoSeleccionado() {
		return autoSeleccionado;
	}
	public void setAutoSeleccionado(int autoSeleccionado) {
		this.autoSeleccionado = autoSeleccionado;
	}
	public String getNombreJugador() {
		return nombreJugador;
	}
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	public Jugador(int idJugador, int autoSeleccionado, String nombreJugador) {
		this.idJugador = idJugador;
		this.autoSeleccionado = autoSeleccionado;
		this.nombreJugador = nombreJugador;
	}
	@Override
	public String toString() {
		return "Jugador [idJugador=" + idJugador + ", autoSeleccionado=" + autoSeleccionado + ", nombreJugador="
				+ nombreJugador + "]";
	}
    
    
}
