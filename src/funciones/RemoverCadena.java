package funciones;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RemoverCadena {
    
    public static String removerCadena(String cadena){
        StringBuilder nuevaCadena=new StringBuilder(cadena);
        StringBuilder nueva = new StringBuilder();
        
        for (int i = 0; i < cadena.length(); i++) {
            int numer = ThreadLocalRandom.current().nextInt(cadena.length());
            nueva = nuevaCadena.append(nuevaCadena.charAt(numer));
            nuevaCadena.deleteCharAt(numer);
        }
        return nueva.toString();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(removerCadena(teclado.nextLine()));
    }
}