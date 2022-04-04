package tp1;

import java.util.Scanner;

public class Ej19 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*19.   Existen dos reglas que identifican dos conjuntos de valores:
                    a. El numero es de un solo digito.
                    b. El numero es impar.
                A partir de estas reglas, realiza un programa que permita ingresar un numero entero. Debe
                asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esImpar,
                estaEnAmbos y noEstaEnNinguno el valor Verdadero o Falso, segun corresponda, para indicar si
                el valor numero ingresado pertenece o no a cada conjunto. Defini un lote de prueba de varios
                numeros y proba el algoritmo, escribiendo los resultados tal como se hizo en los ejercicios
                anteriores.
                */

        System.out.println("Ingrese un numero entero.");
        int num = Integer.parseInt(teclado.nextLine());

        boolean esDeUnSoloDigito = num > -10 && num < 10;
        boolean esImpar = num % 2 != 0;
        boolean estaEnAmbos = esDeUnSoloDigito && esImpar;
        boolean noEstaEnNinguno = !(esDeUnSoloDigito || esImpar);

        if (estaEnAmbos){
            System.out.println("El numero es impar y de un solo digito");
        } else{
            if (esDeUnSoloDigito){
                System.out.println("El numero es de un solo digito.");
            }
            if (esImpar){
                System.out.println("El numero es impar");
            }
        }

        if (noEstaEnNinguno){
            System.out.println("El numero no es impar y no es de un solo digito.");
        }
        
        teclado.close();
    }
}
