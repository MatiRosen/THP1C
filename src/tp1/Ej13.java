package tp1;

import java.util.Scanner;

public class Ej13 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y
            su valor. [EC]
         */

        System.out.println("Ingrese un numero entero");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese otro numero entero distinto");
        int num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese otro numero entero distinto");
        int num3 = Integer.parseInt(teclado.nextLine());


        if (num1 > num2 && num1 > num3){
            System.out.println("El numero mayor es el primero: " + num1);
        } else {
            if (num2 > num3){
                System.out.println("El numero mayor es el segundo: " + num2);
            } else {
                System.out.println("El numero mayor es el tercero: " + num3);
            }
        }
    }
}