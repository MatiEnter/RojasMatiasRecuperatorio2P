package ar.edu.unlam.pb2.futbol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pruebaFutbol {

	@Test
	public void queSePuedanRegistrarPartidosAlTorneo(){
		
		TorneoFutbol torneo        = new TorneoFutbol  ("Copa Java");
		Partido      primera_fecha = new Partido       (101,"Argentina","Uruguay");
		Miembro      jugador       = new Jugador       ("Kun", "Aguero", "Argentina", TipoDeMiembro.JUGADOR,40512642, Posicion.DEL, 7 );
		Miembro      jugador2      = new Jugador       ("Matias", "Rojas", "Argentina", TipoDeMiembro.JUGADOR,41512642, Posicion.DEL, 10);
		
		primera_fecha.agregarJugador(jugador);
		primera_fecha.agregarJugador(jugador2);
		torneo.agregarPartidoAlTorneo(primera_fecha);
		
		assertEquals(2,primera_fecha.cantidad_jugadoresLocales());
		assertEquals(1,torneo.getPartido().size());
	}
	
	@Test
	public void q() {
		
	}
	
	@Test
	public void qp() {
		
	}
}
