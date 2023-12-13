package String;

import java.util.Scanner;

public class EjercicioTrece {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //13. Realizar un programa que solicite la entrada de 10 cadenas de caracteres y
        //construya una cadena con el primer carácter de cada cadena. Finalmente mostrará
        //dicha cadena por pantalla.

        String cadenaDefinitiva = new String();
        int contador = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce la "+contador+" cadena.");
            String cadena = new String(teclado.nextLine());
            cadenaDefinitiva += cadena.charAt(0);
            contador++;
        }

        System.out.println("Resultado: ");
        System.out.println(cadenaDefinitiva);
        teclado.close();
    }
}
