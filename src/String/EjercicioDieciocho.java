package String;

import java.util.Scanner;

public class EjercicioDieciocho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
         *Realizar un programa en el que el usuario introduzca un texto y sustituya sus
         * posiciones impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones
         * impares pasaría a: “a*c*e*g”
         */

        System.out.println("Introduce una cadena: ");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());

        for (int i = 0; i < cadena.length(); i++) {
            if (i%2 != 0){
                cadena.deleteCharAt(i);
                cadena.insert(i, '*');
            }
        }
        System.out.println(cadena);
        teclado.close();






    }
}
