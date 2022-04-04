package tp1;

import java.util.Scanner;

public class Ej27 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realiza un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
            las edades ingresadas y cuantas edades fueron valores impares mayores que 18. [EC]
        */

        int cantImparYMayor = 0;
        int edadTotal = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Escribir una edad");
            int edad = Integer.parseInt(teclado.nextLine());
            edadTotal = edadTotal + edad;

            if (edad % 2 != 0 && edad >= 18){
                cantImparYMayor++;
            }
        }

        double promedio = edadTotal/5d;
        System.out.println("El promedio es de " + promedio);
        System.out.println("La cantidad de edades impares mayores a 18 es de " + cantImparYMayor);

        teclado.close();
    }
}