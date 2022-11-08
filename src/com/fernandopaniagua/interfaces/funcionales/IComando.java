package com.fernandopaniagua.interfaces.funcionales;

@FunctionalInterface
public interface IComando {
	public void ejecutar();
	
	public static void metodoEstatico() {
		System.out.println("Soy el método estático de una interfaz funcional");
	}
	
	public default void metodoDefault() {
		System.out.println("Soy el método por defecto de una interfaz funcional");
	}
}
