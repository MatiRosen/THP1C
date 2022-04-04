package tp1;

import java.util.Scanner;

public class Ej36 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
      /*  Realizá un programa que permita ingresar números mientras el promedio entre todos los
          ingresados sea menor a 20. Al terminar el ingreso indicar la cantidad de valores leídos. [EC]
     */

        double promedio;
        double cuentaTotal = 0;
        int cantValores = 0;
        do {
            System.out.println("Escriba un valor");
            cuentaTotal += Double.parseDouble(teclado.nextLine());
            cantValores++;
            promedio = cuentaTotal / cantValores;
            System.out.println("Promedio actual: " + promedio);
        } while (promedio < 20);

        System.out.println("Se ingresaron " + cantValores + " numeros. El promedio es " + promedio);
    }
}