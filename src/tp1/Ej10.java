package tp1;

import java.util.Scanner;

public class Ej10 {

    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args){
        /*10.   Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
                diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
                aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
                de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
                previamente.*/

        System.out.println("Ingrese nombre de socio 1");
        String nombre1 = teclado.nextLine();
        System.out.println("Ingrese nombre de socio 2");
        String nombre2 = teclado.nextLine();
        System.out.println("Ingrese nombre de socio 3");
        String nombre3 = teclado.nextLine();

        System.out.println("Ingrese aporte de socio 1");
        double aporte1 = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese aporte de socio 2");
        double aporte2 = Double.parseDouble(teclado.nextLine());
        System.out.println("Ingrese aporte de socio 3");
        double aporte3 = Double.parseDouble(teclado.nextLine());

        double total = aporte1 + aporte2 + aporte3;
        double porcentaje1 = aporte1 * 100 / total;
        double porcentaje2 = aporte2 * 100 / total;
        double porcentaje3 = aporte3 * 100 / total;

        System.out.println("El total aportado es de $" + total + ". " + nombre1 + " aportó " + porcentaje1 + "%. "
                + nombre2 + " aportó " + porcentaje2 + "%. " + nombre3 + " aportó " + porcentaje3 + "%.");

        teclado.close();
    }
}