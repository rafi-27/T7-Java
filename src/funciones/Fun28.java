package funciones;

import java.util.Scanner;

public class Fun28 {
    /**
     * 28.Realiza una función llamada contarCeros() que se le pasa una cadena y devuelve la
     * cantidad de ceros que tiene.
     */

    public static int contarCeros(String cadena){
        int contadorCeros = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                contadorCeros++;
            }
        }

        return contadorCeros;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena y digo la cantidad de ceros que tiene: ");

        System.out.println(contarCeros(teclado.nextLine())+" ceros");
    }
}