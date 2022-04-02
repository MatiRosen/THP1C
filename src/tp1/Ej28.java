package tp1;

import java.util.Scanner;

public class Ej28 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que a partir de un número entero cant ingresado por el usuario permita
            cargar por teclado cant números enteros. La computadora debe mostrar cuál fue el mayor
            número y en qué posición apareció.
         */
        int cant;
        do {
            System.out.println("Ingrese un numero entero mayor a 0");
            cant = Integer.parseInt(teclado.nextLine());
        } while (cant <= 0);

        System.out.println("Ingrese un numero entero. (" + 1 + "/" + cant + ")");
        int num = Integer.parseInt(teclado.nextLine());
        int max = num;
        int pos = 1;

        for (int i = 2; i <= cant; i++){
            System.out.println("Ingrese un numero entero. (" + i + "/" + cant + ")");
            num = Integer.parseInt(teclado.nextLine());
            if (num > max){
                max = num;
                pos = i;
            }
        }
        System.out.println("El numero mayor fue: " + max + ". Fue escrito en la posicion " + pos);
        teclado.close();
    }
}
