package funciones;

import java.util.Scanner;

public class Fun26 {
    /**
     * int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
     * int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
     * double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
     * @param
     */

    public static int suma1an(int n){
        int num=0;
        for (int i = 0; i < n+1; i++) {
            num += i;
        }
        return num;
    }

    public static int producto1an(int n){
        int num=1;
        for (int i = 1; i < n+1; i++) {
            num*=i;
        }
        return num;
    }

    public static double intermedio1an(int n){
        int num=0;
        for (int i = 0; i < n; i++) {
            num+=i;
        }
        return num/n;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sumatorio: ");
        System.out.println(suma1an(teclado.nextInt()));

        System.out.println("Producto: ");
        System.out.println(producto1an(teclado.nextInt()));

        System.out.println("Promedio: ");
        System.out.println(intermedio1an(teclado.nextInt()));
    }
}
