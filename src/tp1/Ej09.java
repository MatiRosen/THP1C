package tp1;

import java.util.Scanner;

public class Ej09 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realiza un programa que permita ingresar dos numeros que representan las medidas en
            grados de dos angulos interiores de cierto triangulo. A partir de los valores de estos dos
            angulos el programa debe mostrar el valor en grados del angulo restante. Recorda que la
            suma de los angulos interiores de todo triangulo es de 180
        */

        System.out.println("Ingrese la medida del primer angulo (Debe ser positivo)");
        double angulo1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese la medida del segundo angulo (Debe ser positivo)");
        double angulo2 = Double.parseDouble(teclado.nextLine());

        double sumaAngulos = angulo1 + angulo2;

        System.out.println("El tercer angulo mide " + (180 - sumaAngulos));
        
        //Todavía no vimos if, por lo tanto, podría ser que el tercer angulo sea negativo, lo cual no tiene sentido. Abajo el codigo con el if...
        
        /*
        if (sumaAngulos > 180){
            System.out.println("La suma de ambos angulos es mayor a 180, lo cual no tiene sentido matematico.");
        } else{
            System.out.println("El tercer angulo mide " + (180 - sumaAngulos));
        }
        */
        teclado.close();

    }
}
