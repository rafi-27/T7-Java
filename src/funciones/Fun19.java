package funciones;

import java.util.Scanner;

public class Fun19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce dos numeros y los multiplico: ");
        System.out.println(multiplicacion(teclado.nextInt(), teclado.nextInt()));
        teclado.close();
    }

//Creamos las funciones:

    public static double multiplicacion(double primerNum, double segunNum){
        return primerNum*segunNum;
    }
}