package String;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class EjercicioDos {
    public static void main(String[] args) {
        int numdni=0;
        for (int i = 0; i < 8000000; i++) {
            numdni+=ThreadLocalRandom.current().nextInt(0,9);
        }
        String letrasDni ="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numdni%23;
        char letra = letrasDni.charAt(resto);
        System.out.println(numdni+""+letra);

        Scanner teclado = new Scanner(System.in);
        int numer = teclado.nextInt();
        resto = numer%23;
        letra = letrasDni.charAt(resto);
        System.out.println(numer+" tiene la letra "+letra);
    }
}