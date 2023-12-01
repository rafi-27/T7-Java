import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
         * 6. Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay
         * (cuantas ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe
         * diferenciar entre mayúsculas y minúsculas
         */
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        //boolean conA, conE, conI, conO, conU;

        System.out.println("Introduce una cadena y te digo las vocales que hay: ");
        String cadena = teclado.nextLine();

        cadena = String.valueOf(cadena);

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));

            if(caracter == 'a'){
                contA++;
            }
            if(caracter == 'e'){
                contE++;
            }
            if(caracter == 'i'){
                contI++;
            }
            if(caracter == 'o'){
                contO++;
            }
            if(caracter == 'u'){
                contU++;
            }
        }

        System.out.println("A: "+contA);
        System.out.println("E: "+contE);
        System.out.println("I: "+contI);
        System.out.println("O: "+contO);
        System.out.println("U: "+contU);

    }
}
