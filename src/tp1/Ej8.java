package tp1;

import java.util.Scanner;

public class Ej8 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
            resultados para las 4 operaciones matemáticas básicas con los números ingresados. [EC]
           */

        System.out.println("Ingrese un numero natural");
        double num1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese otro numero natural");
        double num2 = Double.parseDouble(teclado.nextLine());

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;

        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicación: " + multiplicacion
                + "\nDivisión: " + division);

        teclado.close();
    }
}
