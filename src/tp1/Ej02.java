package tp1;

import java.util.Scanner;

public class Ej02 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /* 2. Realiza un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
              para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
        */
        System.out.println("Ingresar nota del primer trimestre.");
        double primerNota = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingresar nota del segundo trimestre.");
        double segundaNota = Double.parseDouble(teclado.nextLine());

        System.out.println("Ingresar nota del tercer trimestre.");
        double tercerNota = Double.parseDouble(teclado.nextLine());

        System.out.println("Tu promedio es de: " + (primerNota + segundaNota + tercerNota) / 3);

        teclado.close();
    }
}
