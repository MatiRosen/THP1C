package tp1;

import java.util.Scanner;

public class Ej32 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita validar la nota de un examen de la misma manera que el
            ejercicio 29 pero con las siguientes nuevas directivas:
                ● Las notas 1 y 3 no usan nunca.
                ● La nota 0 se reserva para los ausentes
            En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10. [EC]
         */
        double nota;

        do{
            System.out.println("Ingrese una nota del 4 al 10, o 2");
            nota = Double.parseDouble(teclado.nextLine());
        } while ((nota < 4 && nota != 2) || nota > 10);
        System.out.println("Su nota es: " + nota);
        teclado.close();
    }
}