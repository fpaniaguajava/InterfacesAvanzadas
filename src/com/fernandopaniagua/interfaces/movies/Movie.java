package com.fernandopaniagua.interfaces.movies;
import java.util.Arrays;
import java.util.List;

public class Movie {
	public String titulo;
	public int anyoEstreno;
	public long recaudacion;
	public Movie(String titulo, int anyoEstreno, long recaudacion) {
		super();
		this.titulo = titulo;
		this.anyoEstreno = anyoEstreno;
		this.recaudacion = recaudacion;
	}
	public static List<Movie> getMovies(){
		Movie peli1 = new Movie("El resplandor", 1980, 47_300_000);
		Movie peli2 = new Movie("Lo que el viento se llevó", 1939, 402_000_000);
		Movie peli3 = new Movie("Avatar", 2009, 2_923_000_000l);
		Movie peli4 = new Movie("Titanic", 1997, 2_202_000_000l);
		Movie peli5 = new Movie("El renacido", 2015, 553_000_000);
		List<Movie> pelis = Arrays.asList(peli1, peli2, peli3, peli4,peli5);
		return pelis;
	}
	@Override
	public String toString() {
		return this.titulo;
	}
}
