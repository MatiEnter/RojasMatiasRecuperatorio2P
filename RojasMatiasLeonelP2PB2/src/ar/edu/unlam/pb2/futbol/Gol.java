package ar.edu.unlam.pb2.futbol;

public class Gol{
	
	private Jugador jugador;
	private Integer minutos;
	
	public Gol(Jugador jugador, Integer minutos) {
		super();
		this.jugador = jugador;
		this.minutos = minutos;
	}
	
	public Jugador getJugador() {
		return jugador;
	}
	
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	
	public Integer getMinutos() {
		return minutos;
	}
	
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}

	

	
	
}
