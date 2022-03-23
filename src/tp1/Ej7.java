package tp1;

import java.util.Scanner;

public class Ej7 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
          valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
          metros de alambre para cercarlo completamente a tres alturas distintas.
         */
        System.out.println("Ingrese el ancho del terreno en metros");
        double ancho = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese el largo del terreno en metros");
        double largo = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese el valor del metro cuadrado");
        double valorMetroCuadrado = Double.parseDouble(teclado.nextLine());

        double area = ancho * largo;
        double valorTotal = area * valorMetroCuadrado;
        double alambreTotal = ((ancho * 2) + (largo * 2)) * 3;
        System.out.println("El valor del terreno es de $" + valorTotal + ". Se necesitan " + alambreTotal + " metros de alambre.");

        teclado.close();
    }
}
