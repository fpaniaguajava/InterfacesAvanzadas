package com.fernandopaniagua.interfaces.enemigo;

public class SuperEnemigo implements IEnemigo, IObstaculo {

	@Override
	public void andar() {
		System.out.println("(SuperEnemigo) Andando...");
	}

	@Override
	public void atacar() {
		System.out.println("(SuperEnemigo) Atacando...");
	}

	@Override
	public void morir() {
		System.out.println("(SuperEnemigo) Muriendo...");
	}

	@Override
	public void huir() {
		System.out.println("(SuperEnemigo) Huyendo...");
	}
	
	@Override
	public void gritar() {
		System.out.println("(SuperEnemigo) Gritando...");
	}

	public void hacerCosasDeSuperEnemigo() {
		System.out.println("(SuperEnemigo) Haciendo cosas...");
	}
	
	
}
