import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
        * 4. Crea un programa que pida por teclado tres cadenas de texto: nombre y dos
        * apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la
        * concatenación de las tres primeras letras de cada uno de ellos. Por ejemplo si se
        * introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
        */
        System.out.println("Primera cadena Nombre: ");
        String primeraCadena = teclado.nextLine();

        System.out.println("Segunda cadena primer Apellido: ");
        String segundaCadena = teclado.nextLine();

        System.out.println("Tercera cadena segundo Apellido: ");
        String terceraCadena = teclado.nextLine();

        String codigoUsuario = new String();

        codigoUsuario = primeraCadena.substring(0,3)+segundaCadena.substring(0,3)+terceraCadena.substring(0,3);
        System.out.println("Tu codigo de usuario es: "+codigoUsuario.toUpperCase());
    }
}
