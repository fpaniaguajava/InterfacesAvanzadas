package com.fernandopaniagua.interfaces.movies;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Movie> pelis = Movie.getMovies();
		//Filtrado con Predicate 'manual' y uso de forEach
		System.out.println("*** PELICULAS SIGLO XXI ***");
		pelis.
			stream().
			filter(new SigloXXI()).
			forEach(
				System.out::println
		);
		//Filtrado con Predicate 'manual' y asignación a lista
		System.out.println("*** PELICULAS SIGLO XX ***");
		List<Movie> pelisSigloXX = 
				pelis.
				stream().
				filter(new SigloXX()).
				collect(Collectors.toList());
		for (Movie peli : pelisSigloXX) {
			System.out.println(peli);
		}
		//¿Son todas las películas del 1900 en adelante?
		boolean sonPelisModernas= pelis.stream().allMatch((peli) -> (peli.anyoEstreno>=1900));
		System.out.println("Todas las películas son modernas:" + sonPelisModernas);
		
	
	}
}

class SigloXXI implements Predicate<Movie> {
	@Override
	public boolean test(Movie t) {
		return t.anyoEstreno>=2000;
	}
}

class SigloXX implements Predicate<Movie> {

	@Override
	public boolean test(Movie t) {
		return t.anyoEstreno<2000;
	}
	
}
