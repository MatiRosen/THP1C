package tp1;

import java.util.Scanner;

public class Ej38 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        /*
            Realizá un programa que permita controlar con validación el ingreso a un sitio web. Teniendo
            ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), el programa
            debe permitir al usuario ingresar sus credenciales. Si las mismas son erróneas, se volverán a
            pedir hasta un máximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
            siguientes mensajes según sea el caso: "Acceso concedido" o "Se ha bloqueado la cuenta"
         */
        final String nombre = "admin";
        final String contra = "123456";

        String nombreIntento;
        String contraIntento;

        int intentos = 1;
        do {
            System.out.println("Escriba el nombre de usuario");
            nombreIntento = teclado.nextLine();

            System.out.println("Ingrese la contraseña");
            contraIntento = teclado.nextLine();
            intentos++;
        } while (intentos <= 3 && (!nombreIntento.equals(nombre) || !contraIntento.equals(contra)));

        if (intentos <= 3){
            System.out.println("Acceso concedido!");
        } else{
            System.out.println("Se ha bloqueado la cuenta");
        }

        teclado.close();
    }
}
