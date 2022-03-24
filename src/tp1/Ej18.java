package tp1;

import java.util.Scanner;

public class Ej18 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*18.   Realizá un programa que permita al usuario ingresar dos números enteros. La computadora
                debe indicar si el mayor es divisible por el menor. (Un número entero a es divisible por un
                número entero b cuando el resto de la división entre a y b es 0.*/
        System.out.println("Ingrese un numero entero.");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese otro numero entero.");
        int num2 = Integer.parseInt(teclado.nextLine());

        if ((num1 % num2) == 0){
            System.out.println("El mayor es divisible por el menor.");
        } else{
            System.out.println("El mayor no es divisible por el menor");
        }

        teclado.close();
    }
}
