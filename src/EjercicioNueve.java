import java.util.concurrent.ThreadLocalRandom;

public class EjercicioNueve {
    public static void main(String[] args) {
        //Generar una contraseña desde la a-j y entre 5 y 10 caracteres.

        String cadena = new String();

        String contenidoContraseña = "a,b,c,d,e,f,g,h,i,j";

        int numeroAleatorio = ThreadLocalRandom.current().nextInt(5,10);
        System.out.println(numeroAleatorio);

        for (int i = 0; i <= numeroAleatorio; i++) {

        }



    }
}
