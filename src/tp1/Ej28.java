package tp1;

import java.util.Scanner;

public class Ej28 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realiza un programa que a partir de un numero entero cant ingresado por el usuario permita
            cargar por teclado cant numeros enteros. La computadora debe mostrar cual fue el mayor
            numero y en que posicion aparecio.
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
