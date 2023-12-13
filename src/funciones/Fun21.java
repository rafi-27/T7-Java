package funciones;

import java.util.Scanner;

public class Fun21 {

    public static int minimo(int a, int b){
        if (a>b) {
            return b;
        }else{
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros y te digo el minimo(El mas pequeño): ");
        System.out.println(minimo(teclado.nextInt(), teclado.nextInt()));
    }


}
