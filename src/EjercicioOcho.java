import java.util.Scanner;
import java.util.stream.Stream;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
//Realiza un programa que solicite que se le introduzcan una cadena y un carácter y
//nos muestre cuantas veces está contenido el carácter en la cadena.

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        System.out.println("Que caracter quieres que te diga las veces que se repite.");
        char letra = teclado.nextLine().charAt(0);

        int cont=0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) ==letra){
                cont++;
            }
        }
        System.out.println("El caracter "+letra+" se ha repetido "+cont+" veces.");

    }
}