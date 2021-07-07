package ar.edu.unlam.pb2.futbol;

import java.util.Objects;

public class Jugador extends Miembro{
	
	private Integer dni;
	private Posicion posicion;
	private Integer nro_camiseta;
	
	public Jugador(String nombre, String apellido, String equipo, TipoDeMiembro tipo, Integer dni, Posicion posicion,
			Integer nro_camiseta) {
		super(nombre, apellido, equipo, tipo);
		this.dni = dni;
		this.posicion = posicion;
		this.nro_camiseta = nro_camiseta;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
}
