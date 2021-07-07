package ar.edu.unlam.pb2.futbol;

public abstract class Miembro {

	private String nombre;
	private String apellido;
	private String equipo;
	private TipoDeMiembro tipo;
	
	public Miembro(String nombre, String apellido, String equipo, TipoDeMiembro tipo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipo = equipo;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public TipoDeMiembro getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeMiembro tipo) {
		this.tipo = tipo;
	}
	
	
}
