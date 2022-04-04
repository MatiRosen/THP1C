package tp1;

import java.util.Scanner;

public class Ej03 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        /* 3. Realiza un programa que permita ingresar un numero entero. Debe mostrarse el numero ingresado:
              a. Multiplicado por 5.
              b. Dividido por 2.
              */

        System.out.println("Ingrese un numero entero");
        int num = Integer.parseInt(teclado.nextLine());

        int multplicacion = num*5;
        double division = num/2d; // Uso la d para hacer un cast implicito de int a double. (Podría simplemente usar 2.0 también)

        System.out.println(num + " multiplicado por 5 es: " + multplicacion + ".\n" + num + " dividido por 2 es: " + division);

        teclado.close();
    }

}
