package funciones;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Fun29{
/**
 * 29.Realiza una función llamada aleatorio() que se le pasan dos valores enteros
 * devuelve un entero al azar comprendido entre esos dos valores (el primero es
 * menor que el segundo, y ambos mayores que cero, en caso contrario devuelve -1)
 */

    public static int aleatorio(int primero, int segundo){
        if (primero>segundo || primero < 0 || segundo < 0) {
            return -1;
        }else{
            return ThreadLocalRandom.current().nextInt(primero,segundo);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros y te printeo un numero aleatorio que este comprendido entre ambos.");
        System.out.println(aleatorio(teclado.nextInt(), teclado.nextInt()));
        teclado.close();
    }
}