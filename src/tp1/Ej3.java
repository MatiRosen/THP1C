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
        double num = Double.parseDouble(teclado.nextLine());
        System.out.println(num + " multiplicado por 5 es: " + num * 5 + ". " + num + " dividido por 2 es: " + num / 2);

        teclado.close();
    }

}
