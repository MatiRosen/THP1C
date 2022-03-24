package tp1;

import java.util.Scanner;

public class Ej20 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Ingrese un numero entero");
        int num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese la operación (+ ; - ; * ; /)");
        String operacion = teclado.nextLine();

        System.out.println("Ingrese otro numero entero");
        int num2 = Integer.parseInt(teclado.nextLine());

        double resultado;

        switch (operacion){
            case "+":
                resultado = num1 + num2;
                System.out.println("El resultado es " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("El resultado es " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("El resultado es " + resultado);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("El numero 2 no debe ser igual a 0");
                } else{
                    resultado = num1 / num2;
                    System.out.println("El resultado es " + resultado);
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        teclado.close();
    }
}
