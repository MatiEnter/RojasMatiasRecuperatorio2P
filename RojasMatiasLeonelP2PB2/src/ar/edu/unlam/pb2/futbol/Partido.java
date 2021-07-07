package ar.edu.unlam.pb2.futbol;

import java.util.*;

public class Partido {
	
	private Integer id_partido;
	private String equipo_local;
	private String equipo_visitante;
	
	
	private Set<Miembro> nomina_jugVisitante;
	private Set<Miembro> nomina_jugLocal;
	private Set<Gol> registro_de_gol;
	
	public Partido(Integer id_partido, String equipo_local, String equipo_visitante) {
		super();
		this.id_partido = id_partido;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
		
		nomina_jugLocal = new HashSet<Miembro>();
		nomina_jugVisitante = new HashSet<Miembro>();
		registro_de_gol= new HashSet<Gol>();
	}

	public Boolean agregarJugador(Miembro nuevoMiembro) {
		if(nuevoMiembro.getTipo()==TipoDeMiembro.JUGADOR) {
			if(nuevoMiembro.getEquipo().equals(equipo_local)) {
				nomina_jugLocal.add(nuevoMiembro);
				return true;
			}else
				if(nuevoMiembro.getEquipo().equals(equipo_visitante)) {
					nomina_jugVisitante.add(nuevoMiembro);
					return true;
				}
			}return false;
		}
	
	public Integer cantidad_jugadoresLocales() {
		return nomina_jugLocal.size();
	}
	
	public Integer cantidad_jugadoresVisitantes() {
		return nomina_jugVisitante.size();
	}

	public Integer getId_partido() {
		return id_partido;
	}

	public void setId_partido(Integer id_partido) {
		this.id_partido = id_partido;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id_partido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(id_partido, other.id_partido);
	}

	public Boolean registroDeGol(Jugador nuevo, Partido partido) {
		if(nomina_jugLocal.equals(nuevo));
	}
	
	
	
}
