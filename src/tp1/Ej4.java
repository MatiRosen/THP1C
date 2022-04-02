package tp1;

import java.util.Scanner;

public class Ej4 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /* Realizá un programa que permita ingresar el valor monetario de una hora de trabajo y la
        cantidad de horas trabajadas por día por un trabajador. Debes mostrar el valor del salario
        semanal, sabiendo que trabaja todos los días hábiles y la mitad de las horas del día hábil los
        sábados. (Todas las horas valen lo mismo.)
         */

        System.out.println("Ingrese el valor monetario de una hora de trabajo");
        double salarioPorHora = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingrese las horas trabajadas por día");
        double horasDiarias = Double.parseDouble(teclado.nextLine());;

        int diasHabiles = 5;
        double horasSabado = horasDiarias / 2;
        double horasTotal = horasDiarias * diasHabiles + horasSabado;

        System.out.println("El sueldo semanal es de: " + salarioPorHora * horasTotal);

        teclado.close();
    }
}