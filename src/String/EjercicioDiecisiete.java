package String;

import java.util.Scanner;

public class EjercicioDiecisiete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
        * a. Borrar el carácter que haya en la posición 3.
        * b. Insertar una ‘x’ en la posición 5.
        * c. Sustituir el carácter de la posición 1 por una ‘z’.
        * d. Borrar los caracteres entre la posición 5 y 10.
        * e. Darles la vuelta a todos los caracteres del StringBuilder.
        * f. Convertir el StringBuilder en cadena.
        */

        System.out.println("Introduce una cadena larga 20 posiciones aprox: ");
        StringBuilder cadena = new StringBuilder(teclado.nextLine());
        //Comencamos con las partes que pide el programa:
        System.out.println("A");
        cadena.deleteCharAt(3);
        System.out.println(cadena);
        System.out.println("B");
        cadena.insert(5,'x');
        System.out.println(cadena);
        System.out.println("C");
        cadena.replace(0,1,"z");
        System.out.println(cadena);
        System.out.println("D");
        cadena.delete(5,10);
        System.out.println(cadena);
        System.out.println("E");
        cadena.reverse();
        System.out.println(cadena);
        System.out.println("F");
        cadena.toString();
        System.out.println(cadena);

    }
}
