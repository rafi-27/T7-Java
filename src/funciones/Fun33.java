package funciones;

import java.util.Scanner;

public class Fun33 {
    public static int cantidadDivisores(int param){
        if (param > 0) {
            int cont = 0;
            for (int i = 1; i < param; i++) {
                if (param % i == 0) {
                    cont++;
                }
            }
            return cont;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y te digo la cantidad de divisores que tiene: ");
        System.out.println(cantidadDivisores(teclado.nextInt()));
    }
}
