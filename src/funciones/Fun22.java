package funciones;

import java.util.Scanner;

public class Fun22 {
    /**int dimeSigno(int a) // Devuelve -1 si es negativo, 1 si es positivo*/

    public static int dimeSigno(int a){
        if (a == 0) {
            return 0;
        }else if (a > 0) {
            return 1;
        }else{
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero digo si es positivo o negativo o 0: ");
        System.out.println(dimeSigno(teclado.nextInt()));
        teclado.close();
    }
}
