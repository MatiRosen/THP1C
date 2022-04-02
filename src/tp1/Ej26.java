package tp1;

import java.util.Scanner;

public class Ej26 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita al usuario ingresar un número natural n. La computadora
            debe mostrar los primeros n múltiplos de 3 excepto aquellos que sean a la vez múltiplos de 5.
         */

        int n;
        do {
            System.out.println("Ingrese un numero natural");
            n = Integer.parseInt(teclado.nextLine());
        } while (n < 0);

        for (int i = 1; i <= n; i++){
            if (i % 5 != 0){
                System.out.println("Multiplicar " + 3 + " por " + i + " es igual a = " + 3 * i);
            } else{
                n++;
            }
        }

        teclado.close();
    }
}
