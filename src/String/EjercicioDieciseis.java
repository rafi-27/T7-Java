package String;

import java.util.Scanner;

public class EjercicioDieciseis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
         * Realizar un programa al que se le introduzca un número decimal y lo convierta a
         * un String con su representación hexadecimal. Hay que hacerlo codificando el
         * proceso sin usar las clases de Java y luego compararlo con el resultado ofrecido
         * por las clases de Java para convertir de decimal a hexadecimal.
         */

        System.out.println("Introduce un numero decimal: ");
        Float numero = teclado.nextFloat();

        /**
         * String nuevo = teclado.nextLine();
         * int hexa = Integer.parseInt(nuevo, 16);
         */

        String cadena = new String(String.valueOf(numero));

        //int hexa = Integer.toHexString();

        //System.out.println("Resultado usando tu propio código: " + hexa);








    }
}
