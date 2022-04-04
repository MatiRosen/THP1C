package tp1;

import java.util.Scanner;

public class Ej08 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realiza un programa que permita ingresar dos numeros naturales. Debes mostrar los
            resultados para las 4 operaciones matematicas basicas con los numeros ingresados. [EC]
           */

        System.out.println("Ingrese un numero natural");
        double num1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese otro numero natural");
        double num2 = Double.parseDouble(teclado.nextLine());

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2; //Aún no vimos 'if'. Por lo tanto, el dividendo podría ser 0.

        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion
                + "\nDivision: " + division);

        teclado.close();
    }
}
