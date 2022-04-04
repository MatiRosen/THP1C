package tp1;

import java.util.Scanner;

public class Ej25 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realiza un programa que permita ingresar dos numeros enteros que representen el ancho y el
            alto de una matriz de cruces. El programa debe dibujar dicha matriz.
         */

        System.out.println("Ingrese el ancho de la matriz");
        int ancho = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese el alto de la matriz");
        int alto = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i < alto; i++){
            for (int j = 0; j < ancho; j++){
                System.out.print("X");
            }
            System.out.println("");
        }

        teclado.close();
    }
}
