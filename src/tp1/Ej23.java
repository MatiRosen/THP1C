package tp1;

import java.util.Scanner;

public class Ej23 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa que permita ingresar un número entero n. Debe mostrar los primeros
            10 múltiplos de n (desde 1 x n).
         */
        System.out.println("Ingrese un numero entero");
        int n = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= 10; i++){
            System.out.println("Multiplicar " + n + " por " + i + " es igual a = " + n*i);
        }

        teclado.close();
    }
}
