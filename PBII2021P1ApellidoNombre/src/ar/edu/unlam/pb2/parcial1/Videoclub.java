package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;

import ar.edu.unlam.pb2.parcial1.Productos.Comestible;
import ar.edu.unlam.pb2.parcial1.Productos.Libro;
import ar.edu.unlam.pb2.parcial1.Productos.Pelicula;
import ar.edu.unlam.pb2.parcial1.Productos.Producto;
import ar.edu.unlam.pb2.parcial1.Productos.Videojuego;

public class Videoclub {
	
	private String nombre;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Videojuego> videojuegos;
	private ArrayList<Comestible> comestibles;
	private ArrayList<Libro> libros;
	private Integer alquileresRealizados;
	
	public Videoclub() {
		peliculas = new ArrayList <>();
		videojuegos = new ArrayList <>();
		comestibles = new ArrayList <>();
		libros = new ArrayList <>();
		this.alquileresRealizados=0;
	}
	

	
	
	
	public Boolean alquilarUnProducto(Integer codigo) {
		for(Pelicula busqueda: peliculas) {
			
			if(peliculas != null && busqueda.getCodigo().equals(codigo) && alquileresRealizados<=2) {
				
			}
		}return null;
	} 
	
}
