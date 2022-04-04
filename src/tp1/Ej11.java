package tp1;

import java.util.Scanner;

public class Ej11 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /* . Realiza un programa que permita ingresar un numero entero e indique si se trata de un
             numero par o impar. [EC]
        */
        System.out.println("Ingrese un numero entero");
        int numero = Integer.parseInt(teclado.nextLine());
        if ((numero % 2) == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        teclado.close();
    }
}
