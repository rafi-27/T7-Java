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
         * 
         * 
         * dividirlo entre 16 quedamos con el resto numero <-- numero / 16 y convertir apartir del 10.
         */

        final String cadenaHexade = "0123456789ABCDEF";
        String numeroCadena;
        do {
            System.out.println("Introduce un numero decimal: ");
            numeroCadena = teclado.nextLine();
        } while (!numeroCadena.matches("\\d+"));

        int num;
        num = Integer.parseInt(numeroCadena);

        String hexadecimal="";

        while (num > 16) {
            hexadecimal += cadenaHexade.charAt(num%16)+hexadecimal;
            num = num/16;
        }

        //System.out.printf("Manera manual de cambiar s%, a %s",numeroCadena,hexadecimal);
        System.out.println("El numero "+numeroCadena+" en hexadecimal es "+num);


        //Manera con metodos de la clase:

        System.out.println("El numero "+numeroCadena+" es "+Integer.toHexString(num));

        //String cadena = new String(String.valueOf(numero));
        //teclado.close();
        //int hexa = Integer.toHexString();

        //System.out.println("Resultado usando tu propio código: " + hexa);
        teclado.close();
    }
}
