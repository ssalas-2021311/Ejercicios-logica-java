/*
	Nombre: Shiro William Salas Pérez
	Correo: ssalas-2021311@kinal.edu.gt
	Código técnico: IN5BV
	Jornada: Vespertina
	Grupo: 2
*/

public class Ejercicio_5_1 {
	public static void main(String[] args) {

		// Declaramos la variable
		String nombre = "Shiro Salas";

		// Metodos
		System.out.println(nombre.length());		
		System.out.println(nombre.toUpperCase());		
		System.out.println(nombre.toLowerCase());		
		System.out.println(nombre.equals("shiro salas"));		
		System.out.println(nombre.equalsIgnoreCase("Shiro salas"));
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(6));
		System.out.println(nombre.substring(6));
		System.out.println(nombre.substring(0,5));
		System.out.println(nombre.charAt(nombre.length()-1));
		System.out.println(nombre.substring(nombre.length()-3));

		String cadena = "ssalas-2021311@kinal.edu.gt  ";

		System.out.println(cadena.replace("a", "-"));
		System.out.println(cadena.indexOf("l"));
		System.out.println(cadena.indexOf("k"));
		System.out.println(cadena.contains("@"));
		System.out.println(cadena.contains(".gt"));
		System.out.println(cadena.startsWith("ssalas"));
		System.out.println(cadena.endsWith(".edu.gt"));
		System.out.println(cadena.trim());

	}
}