package calculadorabasica.main;

import java.util.Scanner;

import calculadorabasica.presentacion.Calculadora;

public class Main {
	
	public static double numero1, numero2;
	public static String operacion;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero:");
		numero1 = sc.nextDouble();
		System.out.println("Ingresa el segundo numero:");
		numero2 = sc.nextDouble();
		System.out.println("Ingresa el tipo de operacion, en minusculas, ejem. suma, resta, multiplicacion, division");
		operacion = sc.next();
		
		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.operacion(numero1, numero2, operacion));

	}

}
