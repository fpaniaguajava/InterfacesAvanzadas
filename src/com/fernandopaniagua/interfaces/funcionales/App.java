package com.fernandopaniagua.interfaces.funcionales;

public class App {
	public static void main(String[] args) {
		//Opción tradicional: instanciando un objeto de la clase que implementa la interface
		IComando comandoSimple = new ComandoSimple();
		comandoSimple.ejecutar();
		//Opción clase anónima
		IComando comandoAnonimo = new IComando() {
			@Override
			public void ejecutar() {
				System.out.println("Ejecutando Comando Clase Anónima");
			}
		};
		comandoAnonimo.ejecutar();
		//Opción clase anónima compacta
		(new IComando() {
			@Override
			public void ejecutar() {
				System.out.println("Ejecutando Comando Clase Anónima Compacta");
			}
		}).ejecutar();
		//Opción lambda
		IComando comandoLambda = () -> {
			System.out.println("Ejecutando Comando Clase Lambda");
		};
		comandoLambda.ejecutar();
			
		//Sobre una interfaz funcional con parámetros y retorno, 
		//la declaración incluye los parámetos y el bloque de código el return 
		ICalculadora calculadora1 = (int s1, int s2) -> {
			return s1+s2;
		};
		System.out.println(calculadora1.sumar(3, 2));
		//Alternativa al ejemplo calculadora
		ICalculadora calculadora2 = (s1, s2) -> {
			return s1+s2;
		};
		System.out.println(calculadora2.sumar(8, 3));
		//Alternativa más compacta
		ICalculadora calculadora3 = (x1, x2) -> (x1 + x2);
		System.out.println(calculadora3.sumar(9, 1));
		
		
	}
}