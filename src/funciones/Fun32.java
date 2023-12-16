package funciones;

import java.util.Scanner;

public class Fun32 {
    /**
     * Programa que calcule el factorial de números menores de 20. El programa
     * permite
     * al usuario meter los números que desee y finalizará cuando meta un número
     * menor que 1 o mayor que 20. Crea las funciones que consideres útiles y que
     * puedas reutilizar en otros programas.
     */

    public static void calcularFactorial() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();
        do {
            if (numero < 1 || numero >= 20) {
                break;
            }else{
                System.out.println("La factorial del numero: "+numero);
                int factorial = 1;
            
                for (int i = numero; i >= 1; i--) {
                    factorial *= i;
                }
                System.out.println(factorial);
                break;
            }
        } while (numero > 1 || numero < 20);
    }

    public static void main(String[] args) {
        System.out.println("Probamos el menu: ");
        calcularFactorial();

    }

}
