package tp1;

import java.util.Scanner;

public class Ej30 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita realizar varias operaciones matemáticas ingresando un
            caracter por cada una la operación a realizar (‘+’, ‘-’, ‘*’, ‘/’, ‘F’) y dos números enteros en el
            caso que no haya elegido ‘F’. La computadora debe mostrar el resultado para la operación
            ingresada. Considerar que no se puede dividir por cero. Cuando la operación ingresada sea
            ‘F’ nos indicará que no se desean calcular más operaciones. [EC]
         */
        int operacion;

        do {
            System.out.println("Ingrese la operación a realizar (‘+’, ‘-’, ‘*’, ‘/’, ‘F’ (para terminar))");
            operacion = teclado.nextLine().charAt(0);
        } while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/' && operacion != 'F');


        while (operacion != 'F'){
            System.out.println("Ingrese el primer numero");
            int num1 = Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el segundo numero");
            int num2 = Integer.parseInt(teclado.nextLine());

            if (operacion == '/'){
                while (num2 == 0){
                    System.out.println("Recuerde que para dividir, el segundo numero debe ser distinto a 0. Escriba otro numero");
                    num2 = Integer.parseInt(teclado.nextLine());
                }
            }
            switch (operacion){
                case '+':
                    System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + (num1+num2));
                    break;
                case '-':
                    System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + (num1-num2));
                    break;
                case '*':
                    System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es: " + (num1*num2));
                    break;
                case '/':
                    System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es: " + ((double) num1/num2));
                    break;
            }

            do {
                System.out.println("Ingrese la operación a realizar (‘+’, ‘-’, ‘*’, ‘/’, ‘F’ (para terminar))");
                operacion = teclado.nextLine().charAt(0);
            } while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/' && operacion != 'F');
        }

        teclado.close();
    }
}
