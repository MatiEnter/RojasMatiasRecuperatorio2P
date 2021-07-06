package ar.edu.unlam.pb2.parcial1.Productos;

public class Libro extends Producto{

	private String aUTOR_ESPERADO;
	private String eDITORIAL_ESPERADA;
	
	public Libro(String aUTOR_ESPERADO,String eDITORIAL_ESPERADA) {
		this.aUTOR_ESPERADO=aUTOR_ESPERADO;
		this.eDITORIAL_ESPERADA=eDITORIAL_ESPERADA;
	}

	public String getAutor() {
		return aUTOR_ESPERADO;
	}

	public void setAutor(String aUTOR_ESPERADO) {
		this.aUTOR_ESPERADO = aUTOR_ESPERADO;
	}

	public String getEditorial() {
		return eDITORIAL_ESPERADA;
	}

	public void setEditorial(String eDITORIAL_ESPERADA) {
		this.eDITORIAL_ESPERADA = eDITORIAL_ESPERADA;
	}


	
}
