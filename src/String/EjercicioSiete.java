package String;

import java.io.CharArrayReader;
import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto para comprobar si es palindroma.");

        String cadena = teclado.nextLine();

        cadena = cadena.replace(" ","");

        StringBuilder cadenaR = new StringBuilder(cadena);

        if(cadena.equalsIgnoreCase(cadenaR.reverse().toString())){
            System.out.println("Es palindroma");
        }else {
            System.out.println("No es palindroma");
        }
        teclado.close();
    }
}