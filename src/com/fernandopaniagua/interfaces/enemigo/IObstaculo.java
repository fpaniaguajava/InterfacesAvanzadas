package com.fernandopaniagua.interfaces.enemigo;

public interface IObstaculo {
	default void ofrecerResistencia() {
		System.out.println("(IObstaculo) Ofreciendo resistencia(método default)...");
	}
}
