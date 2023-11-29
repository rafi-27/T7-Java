import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        System.out.print("Introduce una cadena de caracteres: ");
        Scanner teclado = new Scanner(System.in);
        String primeraCadena = teclado.nextLine();

        System.out.println("a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas.");
        System.out.println(primeraCadena.toUpperCase());
        System.out.println(primeraCadena.toLowerCase());

        System.out.println("b. Decir si en la cadena aparece el carácter ‘x’.");
        System.out.println(primeraCadena.indexOf("x"));

        System.out.println("c. Decir si la cadena tiene más de 10 posiciones");
        System.out.println(primeraCadena.length()>10);

        System.out.println("d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición.");
        System.out.println(primeraCadena.indexOf("x",4));

        System.out.println("e. Crear una cadena formada por las 5 primeras posiciones de la cadena.");
        System.out.println(primeraCadena.substring(0,5));

        System.out.println("f. Crear una cadena formada por las 5 últimas posiciones de la cadena.");
        System.out.println(primeraCadena.substring(primeraCadena.length()-5));

        System.out.println("g. Decir si la cadena es igual a la cadena “hola”.");
        System.out.println(primeraCadena.matches("hola"));

        System.out.println("h. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena es un número, esto es, contiene solo dígitos decimales (del 0 a 9)");
        String numer = "12323";
        System.out.println(Integer.parseInt(numer));

        /**
         * i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha
         * cadena es un número hexadecimal, esto es, contiene solo dígitos decimales
         * (del 0 a 9) y letras de la A a F.
         */






    }
}