package tp1;

import java.util.Scanner;

public class Ej34 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita ingresar la estatura (en metros con decimales) de cada
            jugador de un equipo de baloncesto. La carga finalizará al ingresar cero. Calcular y mostrar la
            estatura promedio del equipo
         */
        double cant = 0;
        double metrosTotal = 0;
        double estatura;

        do {
            do {
                System.out.println("Ingrese la estatura en metros con decimales de cada jugador. (Debe ser mayor a 0)");
                estatura = Double.parseDouble(teclado.nextLine());
            } while (estatura < 0);
            metrosTotal = metrosTotal + estatura;
            cant++;
        } while (estatura != 0);

    }
}
