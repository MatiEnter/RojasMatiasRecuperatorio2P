package ar.edu.unlam.pb2.parcial1.Productos;

public abstract class Producto{
	
	private Integer cODIGO_ESPERADO;
	private String dESCRIPCION_ESPERADA;
	
	public Integer getCodigo() {
		return cODIGO_ESPERADO;
	}
	public void setCodigo(Integer cODIGO_ESPERADO) {
		this.cODIGO_ESPERADO = cODIGO_ESPERADO;
	}
	public String getDescripcion() {
		return dESCRIPCION_ESPERADA;
	}
	public void setDescripcion(String dESCRIPCION_ESPERADA) {
		this.dESCRIPCION_ESPERADA = dESCRIPCION_ESPERADA;
	}

}
