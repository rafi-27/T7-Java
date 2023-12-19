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
        int numero;
        String romper="";
        while (!romper.equals("-1")) {
            System.out.println("Introduce un numero: ");
            numero = teclado.nextInt();

            if (numero < 1 || numero >= 20) {
                romper = "-1";
                //break;
            }else{
                System.out.println("La factorial del numero: "+numero);
                int factorial = 1;
            
                for (int i = numero; i >= 1; i--) {
                    factorial *= i;
                }
                System.out.println(factorial);
            }
        }
        teclado.close();
    }

    public static void main(String[] args) {
        System.out.println("Probamos el menu: ");
        calcularFactorial();

    }

}
