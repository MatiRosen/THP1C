package tp1;

import java.util.Scanner;

public class Ej14 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*  Para entrar a la montaña rusa Infierno en las alturas se requiere tener al menos 7 años y medir
            más de 1,50 metros. Completá el siguiente cuadro a mano según los requisitos y luego haz el
            programa que permita, según las edades y estaturas ingresadas por el usuario, obtener los
            mismos resultados según los siguientes datos: [EC]
        */
        System.out.println("Ingrese el nombre.");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la edad.");
        int edad = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la altura en centimetros");
        double altura = Double.parseDouble(teclado.nextLine());

        if (edad >= 7 && altura >= 150){
            System.out.println(nombre + " puede ingresar.");
        } else {
            if (edad < 7){
                System.out.println(nombre + " no llega a la edad necesaria.");
            }
            if (altura < 150){
                System.out.println(nombre + " no llega a la altura necesaria.");
            }
        }

        teclado.close();
    }
}
