package tp1;

import java.util.Scanner;

public class Ej12 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa que permita ingresar dos números enteros e indique cuál de ellos es el
            mayor. [EC]
        */

        System.out.println("Ingrese un numero entero");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese otro numero entero");
        int num2 = Integer.parseInt(teclado.nextLine());

        if (num1 > num2){
            System.out.println("El numero mayor es " + num1);
        } else{
            if (num1 == num2){
                System.out.println("Los numeros son iguales");
            } else{
                System.out.println("El numero mayor es " + num2);
            }
        }
        teclado.close();
    }
}
