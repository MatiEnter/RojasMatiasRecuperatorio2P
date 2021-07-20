package marvel;

public class GemaDelInfinito implements Hechizable {

	private TipoDeGema tipo;

	public GemaDelInfinito(TipoDeGema tipo) {
		super();
		this.tipo = tipo;
	}
	
	public TipoDeGema getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeGema tipo) {
		this.tipo = tipo;
	}

	@Override
	public void incrementarPoderDelHeroe(Heroe heroe) {
		
		switch (tipo) {
			case TIEMPO:  
			case MENTE:   
			case PODER:   heroe.setValorInicial(heroe.getValorInicial()*3);
		break;
			case ALMA:   
			case ESPACIO:
			case REALIDAD:heroe.setValorInicial(heroe.getValorInicial()*2);
		break;
		}
		
	}
	@Override
	public void incrementarPoderDelVillano(Villano villano) {
		
		switch (tipo) {
			case TIEMPO:  
			case MENTE:   
			case PODER:   villano.setValorInicial(villano.getValorInicial()*3);
		break;
			case ALMA:   
			case ESPACIO:
			case REALIDAD:villano.setValorInicial(villano.getValorInicial()*2);
		break;
		}
	}
}
