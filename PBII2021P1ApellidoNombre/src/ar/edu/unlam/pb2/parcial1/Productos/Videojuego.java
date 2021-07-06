package ar.edu.unlam.pb2.parcial1.Productos;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto{
	
	private TipoDeConsola cONSOLA_ESPERADA;
	public Videojuego(TipoDeConsola cONSOLA_ESPERADA) {
		this.cONSOLA_ESPERADA=cONSOLA_ESPERADA;     
	}

	public TipoDeConsola getTipo() {
		return cONSOLA_ESPERADA;
	}
	
	public void setTipo(TipoDeConsola cONSOLA_ESPERADA) {
		this.cONSOLA_ESPERADA = cONSOLA_ESPERADA;
	}


}
