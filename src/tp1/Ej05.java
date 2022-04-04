package tp1;

import java.util.Scanner;

public class Ej05 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /* . Realiza un programa que permita ingresar valores del mismo tipo para las variables num1 y num2.
        Una vez cargadas, mostrar ambas variables por pantalla, intercambia sus valores (que lo cargado en num1
        quede en num2, y viceversa) y volve a mostrarlas actualizadas. [EC] */

        System.out.println("Ingrese un numero entero");
        int num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese otro numero entero");
        int num2 = Integer.parseInt(teclado.nextLine());

        System.out.println("El primer numero vale: " + num1 + " y el segundo numero vale: " + num2);
        int auxiliar = num1;
        num1 = num2;
        num2 = auxiliar;

        System.out.println("Ahora el primer numero vale: " + num1 + " y el segundo numero vale: " + num2);

        teclado.close();
    }
}
