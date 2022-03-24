package tp1;

import java.util.Scanner;

public class Ej19 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*19.   Existen dos reglas que identifican dos conjuntos de valores:
                    a. El número es de un solo dígito.
                    b. El número es impar.
                A partir de estas reglas, realizá un programa que permita ingresar un número entero. Debe
                asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
                estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, según corresponda, para indicar si
                el valor número ingresado pertenece o no a cada conjunto. Definí un lote de prueba de varios
                números y probá el algoritmo, escribiendo los resultados tal como se hizo en los ejercicios
                anteriores.
                */

        System.out.println("Ingrese un numero entero.");
        int num = Integer.parseInt(teclado.nextLine());

        boolean esDeUnSoloDigito = num > -10 && num < 10;
        boolean esImpar = num % 2 != 0;
        boolean estaEnAmbos = esDeUnSoloDigito && esImpar;
        boolean noEstaEnNinguno = !(esDeUnSoloDigito || esImpar);

        if (esDeUnSoloDigito){
            System.out.println("El numero es de un solo digito.");
        }
        if (esImpar){
            System.out.println("El numero es impar");
        }
        if (estaEnAmbos){
            System.out.println("El numero está en ambos");
        }
        if (noEstaEnNinguno){
            System.out.println("El numero no está en ninguno.");
        }
    }
}
