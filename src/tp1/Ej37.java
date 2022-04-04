package tp1;

import java.util.Scanner;

public class Ej37 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita al usuario ingresar hasta 12 valores, de a uno por vez, que
            representan los sueldos mensuales que percibió un empleado durante un año calendario. Si
            durante la carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún
            no se ha cobrado el mes en curso, y en ese caso se debe dejar de ingresar datos. Al finalizar
            mostrar el monto percibido por el empleado hasta ese momento (total o parcial).
         */
        final int SUELDO_MENSUAL = 12;
        double sueldo;
        int contador = 1;
        int sueldoTotal = 0;

        do {
            System.out.println("Ingrese su sueldo del mes " + contador);
            sueldo = Double.parseDouble(teclado.nextLine());
            if (sueldo > 0){
                sueldoTotal += sueldo;
            }
            contador++;
        } while (sueldo > 0 && contador <= SUELDO_MENSUAL);

        System.out.println("El sueldo percibido hasta el momento es de " + sueldoTotal);
        teclado.close();
    }
}
