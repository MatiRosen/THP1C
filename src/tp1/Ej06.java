package tp1;

import java.util.Scanner;

public class Ej06 {

    static Scanner teclado = new Scanner(System.in);
    static final int SUELDO_FIJO = 44000;

    public static void main(String[] args){
        /* 6. Realiza un programa que permita ingresar el monto total de las ventas realizadas por un
        vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos mas el 16
        por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
        cobrar por el vendedor.
        */

        System.out.println("Ingrese el monto total de las ventas mensuales");
        int montoVentas = Integer.parseInt(teclado.nextLine());
        System.out.println("Su sueldo es: $" + (SUELDO_FIJO + (montoVentas*0.16)));

        teclado.close();
    }
}
