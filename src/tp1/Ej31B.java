package tp1;

import java.util.Scanner;

public class Ej31B {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa que permita validar una opción ingresada. Se le preguntará al usuario si
            desea continuar con alguna operación de la forma "¿Deseás continuar? [S/N]". Se
            espera que el usuario ingrese una 'S' o una 'N' (incluir las minúsculas). La opción debe ser
            ingresada tanto como sea necesario hasta que quede comprendida dentro de las
            posibilidades esperadas. Realizá este ejercicio en dos versiones (A y B): con ciclo while y
            con ciclo do-while.
        */

        char continuar;
        do {
            System.out.println("¿Desea continuar? ['S'/'N']");
            continuar = teclado.nextLine().charAt(0);
        } while (continuar != 'S' && continuar != 'N' && continuar != 's' && continuar != 'n');

        teclado.close();
    }
}
