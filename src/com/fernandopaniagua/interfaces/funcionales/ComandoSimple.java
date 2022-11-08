package com.fernandopaniagua.interfaces.funcionales;

public class ComandoSimple implements IComando {

	@Override
	public void ejecutar() {
		System.out.println("Ejecutando Comando Simple");
	}

}
