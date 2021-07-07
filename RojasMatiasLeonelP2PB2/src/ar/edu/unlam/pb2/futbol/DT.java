package ar.edu.unlam.pb2.futbol;

public class DT extends Miembro{
	
	private Integer edad;

	public DT(String nombre, String apellido, String equipo, TipoDeMiembro tipo, Integer edad) {
		super(nombre, apellido, equipo, tipo);
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
}
