package tp1;

import java.util.Scanner;

public class Ej21 {

    static Scanner teclado = new Scanner(System.in);

    public static void main (String[] args){
        System.out.println("Ingrese un numero entero del 1 al 7");
        int num = Integer.parseInt(teclado.nextLine());

        switch (num){
            case 1:
                System.out.println("El dia de hoy es Domingo");
                break;
            case 2:
                System.out.println("El dia de hoy es Lunes");
                break;
            case 3:
                System.out.println("El dia de hoy es Martes");
                break;
            case 4:
                System.out.println("El dia de hoy es Miercoles");
                break;
            case 5:
                System.out.println("El dia de hoy es Jueves");
                break;
            case 6:
                System.out.println("El dia de hoy es Viernes");
                break;
            case 7:
                System.out.println("El dia de hoy es Sabado");
                break;
            default:
                System.out.println("Error");
                break;
        }
        teclado.close();
    }
}
