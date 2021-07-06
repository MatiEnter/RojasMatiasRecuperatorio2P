package ar.edu.unlam.pb2.parcial1.Productos;

import java.util.function.BooleanSupplier;

import ar.edu.unlam.pb2.parcial1.Cliente;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Calificacion;
import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;
import ar.edu.unlam.pb2.parcial1.Interfaces.Vendible;

public class Pelicula extends Producto implements Vendible {

	private Genero gENERO_ESPERADO;
	private Integer aNO_DE_ESTRENO_ESPERADO;
	private String dIRECTOR_ESPERADO;
	private String ACTOR_1_ESPERADO;
	private String ACTOR_2_ESPERADO;
	private Double PRECIO_VENTA;
	private Calificacion CALIFICACION_ESPERADA;
	
	public Pelicula(Genero gENERO_ESPERADO, Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO,Double PRECIO_VENTA) {
		this.gENERO_ESPERADO=gENERO_ESPERADO;
		this.aNO_DE_ESTRENO_ESPERADO=aNO_DE_ESTRENO_ESPERADO;
		this.dIRECTOR_ESPERADO=dIRECTOR_ESPERADO;
		this.PRECIO_VENTA=PRECIO_VENTA;
	}

	public void agregarActor(String ACTOR_1_ESPERADO) {
		this.ACTOR_1_ESPERADO=ACTOR_1_ESPERADO;
	}
	
	public Boolean actua(String actor) {
		if(actor==ACTOR_1_ESPERADO||actor==ACTOR_2_ESPERADO) {
		}
		return true;
	}

	public Genero getGenero() {
		return gENERO_ESPERADO;
	}

	public void setGenero(Genero gENERO_ESPERADO) {
		this.gENERO_ESPERADO = gENERO_ESPERADO;
	}

	public Integer getAnoDeEstreno() {
		return aNO_DE_ESTRENO_ESPERADO;
	}

	public void setAnoDeEstreno(Integer aNO_DE_ESTRENO_ESPERADO) {
		this.aNO_DE_ESTRENO_ESPERADO = aNO_DE_ESTRENO_ESPERADO;
	}

	public String getDirector() {
		return dIRECTOR_ESPERADO;
	}

	public void setDirector(String dIRECTOR_ESPERADO) {
		this.dIRECTOR_ESPERADO = dIRECTOR_ESPERADO;
	}
	
	public void busqueda() {
		
	}
	
	public Double getPrecioVenta() {
		return PRECIO_VENTA;
	}
	
	public void setPrecioVenta(Double precio) {
	this.PRECIO_VENTA=precio;
	}
	
	public Boolean mayoresDe7(Cliente cliente) {
		if(cliente.getEdad()>=7) {
			return true;
		}else return false;
	}
	
	public Boolean mayoresDe18(Cliente cliente) {
		if(cliente.getEdad()>=18) {
			return true;
		}else return false;
	}
}
