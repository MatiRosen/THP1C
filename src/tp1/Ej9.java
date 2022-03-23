package tp1;

import java.util.Scanner;

public class Ej9 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa que permita ingresar dos números que representan las medidas en
            grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
            ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
            suma de los ángulos interiores de todo triángulo es de 180
        */

        System.out.println("Ingrese la medida del primer angulo (Debe ser positivo)");
        double angulo1 = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese la medida del segundo angulo (Debe ser positivo)");
        double angulo2 = Double.parseDouble(teclado.nextLine());

        final int sumaTotal = 180;

        double sumaAngulos = angulo1 + angulo2;

        if (sumaAngulos > 180){
            System.out.println("La suma de ambos angulos es mayor a 180, lo cual no tiene sentido matematico.");
        } else{
            System.out.println("El tercer angulo mide " + (sumaTotal - sumaAngulos) + "º");
        }
        teclado.close();

    }
}
