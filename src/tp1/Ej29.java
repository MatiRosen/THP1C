package tp1;

import java.util.Scanner;

public class Ej29 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita validar la nota de un examen. Se espera que la nota que el
            usuario ingrese sea un número comprendido entre 0 y 10. La misma debe ser ingresada
            tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado. [EC]
         */
        double nota;

        do{
            System.out.println("Ingrese una nota del 0 al 10");
            nota = Double.parseDouble(teclado.nextLine());
        } while (nota < 0 || nota > 10);
        System.out.println("Su nota es: " + nota);
        teclado.close();
    }
}
