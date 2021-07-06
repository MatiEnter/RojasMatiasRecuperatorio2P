package ar.edu.unlam.pb2.parcial1;

public class Cliente {
	
	private Integer cODIGO_ESPERADO;
	private String aPELLIDO_ESPERADO;
	private String nOMBRE_ESPERADO;
	private Integer eDAD_ESPERADA;

	public Cliente(Integer cODIGO_ESPERADO, String aPELLIDO_ESPERADO, String nOMBRE_ESPERADO, Integer eDAD_ESPERADA) {
		this.cODIGO_ESPERADO=cODIGO_ESPERADO;
		this.aPELLIDO_ESPERADO=aPELLIDO_ESPERADO;
		this.nOMBRE_ESPERADO=nOMBRE_ESPERADO;
		this.eDAD_ESPERADA=eDAD_ESPERADA;
	}

	public Integer getCodigo() {
		return cODIGO_ESPERADO;
	}

	public void setCodigo(Integer cODIGO_ESPERADO) {
		this.cODIGO_ESPERADO = cODIGO_ESPERADO;
	}

	public String getApellido() {
		return aPELLIDO_ESPERADO;
	}

	public void setApellido(String aPELLIDO_ESPERADO) {
		this.aPELLIDO_ESPERADO = aPELLIDO_ESPERADO;
	}

	public String getNombre() {
		return nOMBRE_ESPERADO;
	}

	public void setNombre(String nOMBRE_ESPERADO) {
		this.nOMBRE_ESPERADO = nOMBRE_ESPERADO;
	}

	public Integer getEdad() {
		return eDAD_ESPERADA;
	}

	public void setEdad(Integer eDAD_ESPERADA) {
		this.eDAD_ESPERADA = eDAD_ESPERADA;
	}

}
