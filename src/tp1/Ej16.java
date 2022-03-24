package tp1;

import java.util.Scanner;

public class Ej16 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*. Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la
            cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, Si los
            asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse.
         */

        System.out.println("Ingrese la cantidad de inscriptos");
        int inscriptos = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese la cantidad de asientos");
        int asientos = Integer.parseInt(teclado.nextLine());

        if (asientos >= inscriptos){
            System.out.println("Los asientos son suficientes.");
        } else{
            System.out.println("Faltan " + (inscriptos - asientos) + " asientos para que todos tengan uno.");
        }

        teclado.close();
    }
}
