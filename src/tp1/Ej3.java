package tp1;

import java.util.Scanner;

public class Ej3 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        /* 3. Realizá un programa que permita ingresar un número entero. Debe mostrarse el número ingresado:
              a. Multiplicado por 5.
              b. Dividido por 2.
              */

        System.out.println("Ingrese un numero");
        int num = Integer.parseInt(teclado.nextLine());

        int multplicacion = num*5;
        double division = num/2d;

        System.out.println(num + " multiplicado por 5 es: " + multplicacion + ".\n" + num + " dividido por 2 es: " + division);

        teclado.close();
    }

}
