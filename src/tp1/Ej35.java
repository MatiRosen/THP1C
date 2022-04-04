package tp1;

import java.util.Scanner;

public class Ej35 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Realizá un programa que permita ingresar nombre y edad de un grupo de personas (para
            cada una, nombre y edad). La carga termina cuando en el nombre de la persona se ingresa un
            asterisco ('*'). Mostrar al final cómo se llama la persona más joven
         */

        boolean seguir = true;
        String nombreJoven;

        do {
            System.out.println("Ingrese un nombre. (No debe usar '*' en el primer nombre");
            nombreJoven = teclado.nextLine();
        } while (nombreJoven.equals("*"));

        int menorEdad;
        do {
            System.out.println("Ingrese la edad mayor a 0:");
            menorEdad = Integer.parseInt(teclado.nextLine());
        } while (menorEdad < 1);


        while (seguir){
            System.out.println("Ingrese un nombre (Use '*' para teminar):");
            String nombre = teclado.nextLine();

            if (nombre.equals("*")){
                seguir = false;
            } else {
                int edad;
                do {
                    System.out.println("Ingrese una edad:");
                    edad = Integer.parseInt(teclado.nextLine());
                } while (edad < 1);
                if (edad < menorEdad){
                    menorEdad = edad;
                    nombreJoven = nombre;
                }
            }
        }
        System.out.println("La persona mas joven es " + nombreJoven + " con " + menorEdad);
        teclado.close();
    }
}
