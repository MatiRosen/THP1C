package tp1;

import java.util.Scanner;

public class Ej15 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        /*  Para entrar a la montaña rusa Miedo a las alturas, algo más chica y tranquila que la anterior,
            alcanza con que se cumpla solamente una de las siguientes condiciones: ser mayor de 6 años
            o medir más de 1,50 metros. Realizá el mismo procedimiento que con el ejercicio anterior
            pero con los nuevos requisitos. [EC]
        */
        System.out.println("Ingrese el nombre.");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la edad.");
        int edad = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingrese la altura en metros");
        double altura = Double.parseDouble(teclado.nextLine());

        boolean tieneEdad = edad >= 7;
        boolean tieneAltura = altura >= 1.50;
        boolean puedeEntrar = tieneAltura || tieneEdad;

        if (puedeEntrar){
            System.out.println(nombre + " puede ingresar.");
        } else {
            System.out.println(nombre + " no llega a la edad ni la altura necesaria.");
        }
        teclado.close();
    }
}