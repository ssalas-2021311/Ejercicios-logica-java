/*
	Nombre: Shiro William Salas Pérez
	Correo: ssalas-2021311@kinal.edu.gt
	Código técnico: IN5BV
	Jornada: Vespertina
	Grupo: 2
*/

import java.util.Scanner;

public class Ejercicio_5_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("-------------MENU-------------");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.println("5. Salir");
		System.out.println("Ingrese una opción");
		int opcion = sc.nextInt();

		switch (opcion) {
			case 1:
				System.out.println("Ingrese el primer número");
				int a = sc.nextInt();

				System.out.println("Ingrese el segundo número");
				int b = sc.nextInt();

				System.out.println("Suma: " + (a + b));
				break;
			case 2:
				System.out.println("Ingrese el primer número");
				int num1 = sc.nextInt();

				System.out.println("Ingrese el segundo número");
				int num2 = sc.nextInt();
		
				int resultado;
				resultado = 0;
				resultado = num1 - num2;
				System.out.println("Resta: " + resultado);
				break;
			case 3:
				System.out.println("Ingrese el primer número");
				int numero1 = sc.nextInt();

				System.out.println("Ingrese el segundo número");
				int numero2 = sc.nextInt();

				System.out.println("Multiplicación: " + (numero1 * numero2));
				break;
			case 4:
				System.out.println("Ingrese el primer número");
				int c = sc.nextInt();

				System.out.println("Ingrese el segundo número");
				int d = sc.nextInt();

				System.out.println("División: " + (c / d));
				break;
			case 5:
				System.out.println("Saliendo...");
 				System.out.println("Adios.");
 				break;

			default:
			System.out.println("ERROR! opcion no valida, intentelo de nuevo.");
 			break;

		}
	}
}