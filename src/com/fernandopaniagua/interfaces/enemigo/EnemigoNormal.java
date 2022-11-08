package com.fernandopaniagua.interfaces.enemigo;

public class EnemigoNormal implements IEnemigo, IObstaculo {

	@Override
	public void andar() {
		System.out.println("(EnemigoNormal) Andando...");
	}

	@Override
	public void atacar() {
		System.out.println("(EnemigoNormal) Atacando...");
	}

	@Override
	public void morir() {
		System.out.println("(EnemigoNormal) Muriendo...");
	}

	@Override
	public void huir() {
		System.out.println("(EnemigoNormal) Huyendo...");
	}

	public void hacerCosasDeEnemigoNormal() {
		System.out.println("(EnemigoNormal) Haciendo cosas...");
	}
	
}
