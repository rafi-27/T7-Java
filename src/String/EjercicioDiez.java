package String;

import java.util.concurrent.ThreadLocalRandom;

public class EjercicioDiez {
    public static void main(String[] args) {
        //Generar una contraseña desde la a-j y entre 5 y 10 caracteres.
        String cadena = new String();

        StringBuilder contenidoContrasenia = new StringBuilder("abcdefghij");

        //Generar la  cantidad de letras que va a tener nuestra contraseña.
        int numeroAleatorio = ThreadLocalRandom.current().nextInt(5,10);
        //System.out.println(numeroAleatorio);
        //Iniciamos un bucle.
        for (int i = 0; i < numeroAleatorio; i++) {
            //int numAC = ThreadLocalRandom.current().nextInt(0,9);
            int numAC = ThreadLocalRandom.current().nextInt(contenidoContrasenia.length());
            char contrasenia = contenidoContrasenia.charAt(numAC);
            cadena+=contrasenia;
            contenidoContrasenia.deleteCharAt(numAC);
        }
        System.out.println(cadena);
    }
}