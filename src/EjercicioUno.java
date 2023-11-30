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

        System.out.println("i. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha\n" +
                "cadena es un número hexadecimal, esto es, contiene solo dígitos decimales\n" +
                "(del 0 a 9) y letras de la A a F");
        String nuevo = teclado.nextLine();
        int hexa = Integer.parseInt(nuevo, 16);
        System.out.println(hexa);

        System.out.println("j. Si se encuentra con en su interior con “prueva” sustituir por “prueba”");
        System.out.println(primeraCadena.replace("prueva", "prueba"));

        System.out.println("k. Decir si la primera posición de la cadena es igual a la última.");
        System.out.println((primeraCadena.startsWith("hola")&&primeraCadena.endsWith("hola")));

        System.out.println("l. Decir cuántos dígitos numéricos hay en la cadena.");
        System.out.println(primeraCadena.length());

        System.out.println("m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)");
        System.out.println(primeraCadena.startsWith(primeraCadena)&&primeraCadena.endsWith(primeraCadena));

//        System.out.println("n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.");
//        System.out.println(primeraCadena.replace(primeraCadena.));









    }
}