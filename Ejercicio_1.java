/*
	Nombre: Shiro William Salas Pérez
	Correo: ssalas-2021311@kinal.edu.gt
	Código técnico: IN5BV
	Jornada: Vespertina
	Grupo: 2
*/

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Declaracion de Variables
		String nombre;
		String apellido;
		int edad;
		long cui;

		// Pedimos los datos
		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese su apellido");
		apellido = sc.nextLine();
		System.out.println("Ingrese su edad");
		edad = sc.nextInt();
		cui = 1796345078934l;

		// Salida de Datos
		System.out.println("Hola " + nombre + " " + apellido + " tienes " + edad + " años." + " " + "CUI:" + cui);
	}
}