package String;

import java.util.Scanner;
public class EjercicioCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
         * 5. Crea un programa que pida una cadena de texto por teclado y luego muestre cada
         * palabra de la cadena en una línea distinta.
         */

        System.out.println("Introduce una cadena de texto:");
        String cadena = teclado.nextLine();

        System.out.println("Probamos: ");
        System.out.println(cadena.replace(" ","\n"));

    }
}
