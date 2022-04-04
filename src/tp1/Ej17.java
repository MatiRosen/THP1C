package tp1;

import java.util.Scanner;

public class Ej17 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realiza un programa que permita ingresar una edad (entre 1 y 120 años) y un genero ('F' para mujeres,
            'M' para hombres). En caso de haber ingresado valores erroneos (edad fuera de rango o genero invalido),
            informar tal situacion. Si los datos estan bien ingresados el programa debe indicar, sabiendo que las
            mujeres se jubilan con 60 años o mas y los hombres con 65 años o mas, si la persona esta en edad de jubilarse.
        */

        System.out.println("Ingresar edad (de 1 a 120 años)");
        int edad = Integer.parseInt(teclado.nextLine());

        if (edad < 1 || edad > 120){
            System.out.println("La edad esta fuera de rango. Debe estar entre 1 y 120.");
        } else{
            System.out.println("Ingrese genero ('F' para mujer y 'M' para hombre)");
            String genero = teclado.nextLine();

            if (!genero.equals("F") && !genero.equals("M")){
                System.out.println("El genero es invalido.");
            } else{
                if ((genero.equals("F") && edad >= 60) || (genero.equals("M") && edad >= 65)){
                    System.out.println("La persona esta en edad de jubilarse!");
                } else{
                    System.out.println("La persona no esta en edad de jubilarse.");
                }
            }
        }

        teclado.close();
    }
}
