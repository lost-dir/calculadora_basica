package calculadorabasica.presentacion;

import calculadorabasica.logica.Logica;

public class Calculadora implements Logica{

	@Override
	public double operacion(double numero1, double numero2, String operador) {
		double resultado = 0;	
		switch(operador) {
			case "suma":
				resultado = numero1 + numero2;
				break;
			case "resta":
				resultado = numero1 - numero2;
				break;
			case "multiplicacion":
				resultado = numero1 * numero2;
				break;
			case "division":
				resultado = numero1 / numero2;
				break;
		}
		return resultado;
	}

}
