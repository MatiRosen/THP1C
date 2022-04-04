package tp1;

import java.util.Scanner;

public class Ej26 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realiza un programa que permita al usuario ingresar un numero natural n. La computadora
            debe mostrar los primeros n multiplos de 3 excepto aquellos que sean a la vez multiplos de 5.
         */

        int n;
        do {
            System.out.println("Ingrese un numero natural");
            n = Integer.parseInt(teclado.nextLine());
        } while (n < 1);

        for (int i = 1; i <= n; i++){
            if (i % 5 != 0){
                System.out.println("Multiplicar " + 3 + " por " + i + " es igual a = " + 3 * i);
            } else{
                n++;
            }
        }

        /*  Otra manera de hacerlo sin modificar la n dentro del for... (En este caso funciona, pero es mala practica modificar
            el valor de la variable con la que se compara la i dentro del for.
         */

        /*
        for (int i = n; i >= 0; i--){
            if (i % 5 == 0){
                n++;
            }
        }

        for (int i = 1; i < n; i++){
            if (i % 5 != 0){
                System.out.println("Multiplicar " + 3 + " por " + i + " es igual a = " + 3 * i);
            }
        }
        */
        teclado.close();
    }
}
