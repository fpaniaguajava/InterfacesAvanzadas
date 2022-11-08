package com.fernandopaniagua.interfaces.enemigo;

public interface IEnemigo {
	public final static int SALUD = 100;
	public void andar();
	public void atacar();
	public void morir();
	public void huir();
	default void gritar() {
		System.out.println("(IEnemigo) Gritando (método default)...");
	}
	/**
	 * La diferencia respecto al método default es que se invoca sobre el nombre de la interfaz
	 * y que no se puede sobreescribir.
	 */
	static void mostrarSalud() {
		System.out.println("(IEnemigo) Salud:" + SALUD);
	}
}
