package com.fernandopaniagua.interfaces.enemigo;

public class EnemigoSpawner {
	public IEnemigo spawnEnemigo() {
		return new EnemigoNormal();
	}

}
