/*
	Nombre: Shiro William Salas Pérez
	Correo: ssalas-2021311@kinal.edu.gt
	Código técnico: IN5BV
	Jornada: Vespertina
	Grupo: 2
*/

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// Declaramos las variables
		int num1;
		int num2;

		int resultadoSuma;
		int resultadoResta;
		int resultadoMultiplicacion;
		double resultadoDivReal;
		int resultadoDivicion;
		int resultadoResiduo;
		double resultadoPotencia;

		// Entrada de datos
		System.out.println("Ingrese un número");
		num1 = in.nextInt();

		System.out.println("Ingrese otro número");
		num2 = in.nextInt();

		// Realiza las operaciones
		resultadoSuma = num1 + num2;
		resultadoResta = num1 - num2;
		resultadoMultiplicacion = num1 * num2;
		resultadoDivReal = (double) num1 / num2;
		resultadoDivicion = num1 / num2;
		resultadoResiduo = num1 % num2;
		resultadoPotencia = Math.pow(num1, num2);

		// Salida de datos
		System.out.println("El resultado de la suma es: " + resultadoSuma);
		System.out.println("El resultado de la resta es: " + resultadoResta);
		System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
		System.out.println("El resultado de la división real es: " + resultadoDivReal);
		System.out.println("El resultado de la división entera es: " + resultadoDivicion);
		System.out.println("El resultado del residuo es: " + resultadoResiduo);
		System.out.println("El resultado de la Potenciación es: " + resultadoPotencia);
	}
}