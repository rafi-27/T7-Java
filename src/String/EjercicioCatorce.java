package String;

import java.util.Scanner;

public class EjercicioCatorce {
    public static void main(String[] args) {
        //Procedemos a realizar una prueba del codigo mencionado en el ejercicio:
        /**
         * El programa empieza creando un Scanner para que se le introduzca una cadena.
         * Se guarda en una variable String llamada cadena.
         * Dicha cadena es convertida para poder ser usada por la clase StringBuilder.
         * Crea una variable tipo entero llamada pos(posicion)
         * Inicializa un bucle do-while.
         * Inicia con que pos nos indicara la primera posicion en la se encuentre un espacio.
         * Si no encuentra un espacio nos devolvera -1 y alli con un condicional le indica que
         * si pos es distinta de -1 entonces borrara el caracter que se encuentre en dicha posicion.
         * Esto se repetira hasta que pos sea distinto de -1.
         * Termina mostrando la cadena.
         * El codigo lo que realiza es borrar los espacion contenidos en una cadena y deja la cadena sin espacios.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
             pos = cadenaSB.indexOf(" ");
             if (pos!=-1) cadenaSB.deleteCharAt(pos);
        } while (pos != -1);
        System.out.println(cadenaSB);
    teclado.close();
    }
}