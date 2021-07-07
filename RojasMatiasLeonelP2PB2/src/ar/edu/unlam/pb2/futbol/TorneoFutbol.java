package ar.edu.unlam.pb2.futbol;

import java.util.*;

public class TorneoFutbol {

	private String nombre_torneo;
	private Map<Integer, Partido> partido;

	
	public TorneoFutbol(String nombre_torneo) {
		this.nombre_torneo=nombre_torneo;
		partido = new HashMap<Integer, Partido>();
	}

	public String getNombre_torneo() {
		return nombre_torneo;
	}

	public void setNombre_torneo(String nombre_torneo) {
		this.nombre_torneo = nombre_torneo;
	}
	
	public void agregarPartidoAlTorneo(Partido nuevo_partido) {
		partido.put(nuevo_partido.getId_partido(),nuevo_partido);
	}

	public Map<Integer, Partido> getPartido() {
		return partido;
	}

	public void setPartido(Map<Integer, Partido> partido) {
		this.partido = partido;
	}
	
	public Boolean registrarGol() {
		
		return true;
	}
}
