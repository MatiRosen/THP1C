package tp1;

import java.util.Scanner;

public class Ej33 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            33. Realizá un programa que permita al usuario ingresar números hasta que se introduzca un 0.
            La computadora debe mostrar el número máximo y el número mínimo. [EC]
        */
        System.out.println("Ingrese un numero.");
        double numero = Double.parseDouble(teclado.nextLine());
        double max = numero;
        double min = numero;

        while (numero != 0){
            System.out.println("Ingrese un numero.");
            numero = Double.parseDouble(teclado.nextLine());

            if (numero > max && numero != 0){
                max = numero;
            }
            if (numero < min && numero != 0){
                min = numero;
            }
        }
        System.out.println("El numero maximo es " + max);
        System.out.println("El numero minimo es " + min);
        teclado.close();
    }
}