package String;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedimos las cadenas de texto:
        System.out.println("Introduce la primera cadena: ");
        String primeraCadena = teclado.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        String segundaCadena = teclado.nextLine();

        System.out.println(primeraCadena.equalsIgnoreCase(segundaCadena)?"Son iguales":"No son iguales");
        teclado.close();
    }
}
