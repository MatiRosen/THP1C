package tp1;

import java.util.Scanner;

public class Ej24 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realiza un programa que permita al usuario ingresar dos numeros enteros num1 y num2,
            donde el primero siempre debera ser menor o igual al segundo. La computadora debe
            mostrar la secuencia de numeros existentes entre ambos:
                a. Incluyendolos;
                b. Excluyendolos
         */

        System.out.println("Ingrese un numero entero");
        int num1 = Integer.parseInt(teclado.nextLine());
        int num2;

        do{
            System.out.println("Ingrese el segundo numero entero. Debe ser mayor al primero");
            num2 = Integer.parseInt(teclado.nextLine());
        } while (num1 > num2);


        System.out.println("Muestro la secuencia de numeros existentes entre ambos, incluyendolos: ");
        for (int i = num1; i <= num2; i++){
            System.out.println(i);
        }

        System.out.println("Muestro la secuencia de numeros existentes entre ambos, exluyendolos: ");
        for (int i = num1 + 1; i < num2; i++){
            System.out.println(i);
        }

        teclado.close();
    }
}
