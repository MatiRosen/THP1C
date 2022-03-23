package tp1;

import java.util.Scanner;

public class Ej6 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /* 6. Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
        vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
        por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
        cobrar por el vendedor.
        */

        System.out.println("Ingrese el monto total de las ventas mensuales");
        int montoVentas = Integer.parseInt(teclado.nextLine());
        final int sueldoFijo = 44000;
        System.out.println("Su sueldo es: $" + (sueldoFijo + (16*montoVentas/100)));

        teclado.close();
    }
}
