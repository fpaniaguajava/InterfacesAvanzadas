package com.fernandopaniagua.interfaces.enemigo;

public class App {

	public static void main(String[] args) {
		IEnemigo enemigo = new EnemigoSpawner().spawnEnemigo();
		enemigo.andar();
		enemigo.gritar();
		IEnemigo.mostrarSalud();
					
		if (enemigo instanceof EnemigoNormal) {
			((EnemigoNormal)enemigo).hacerCosasDeEnemigoNormal();
			((EnemigoNormal)enemigo).ofrecerResistencia();
		} 
		
		if (enemigo instanceof SuperEnemigo) {
			((SuperEnemigo)enemigo).hacerCosasDeSuperEnemigo();
		} 
		
	}
}
