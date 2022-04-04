package tp1;

import java.util.Scanner;

public class Ej01 {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args){
		/* 1. Realiza un programa que permita que el usuario ingrese su nombre. El programa debe emitir
			  una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]*/

		System.out.println("Ingrese su nombre");
		String nombre = teclado.nextLine();
		System.out.println("Bienvenido " + nombre + "!");

		teclado.close();
	}
}
