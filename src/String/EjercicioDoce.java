package String;

import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Hacer dos versiones, la primera con String y otra con StringBuilder.
        //Empezamos con la primera version:

        System.out.println("Introduce una cadena: ");
        String cadena = teclado.nextLine();

        System.out.println("Introduce un numero para indicar la posicion: ");
        int posicion = teclado.nextInt();

        System.out.println("Indica con que caracter quieres cambiar esa posicion: ");
        teclado.nextLine();
        String caracterDos = teclado.nextLine();

        if (cadena.charAt(posicion) == ' '){
            posicion++;
            String cambioDef = cadena.substring(0,posicion)+caracterDos+cadena.substring(posicion+1);
            System.out.println(cambioDef);
        }else {
            String cambioDef = cadena.substring(0,posicion)+caracterDos+cadena.substring(posicion+1);
            System.out.println(cambioDef);
        }

        System.out.println("----------Probamos con clase StringBuilder----------");

        System.out.println("Introduce una cadena: ");
        StringBuilder nuevaCadena = new StringBuilder(teclado.nextLine());

        System.out.println("Introduce un numero de posicion: ");
        int posi = teclado.nextInt();

        System.out.println("Cual es el caracter?: ");
        teclado.nextLine();
        StringBuilder nuevoCaracter = new StringBuilder(teclado.nextLine());

        if(nuevaCadena.toString().charAt(posi) == ' '){
            posi = posi+1;
            nuevaCadena.deleteCharAt(posi);
            nuevaCadena.insert(posi,nuevoCaracter);
            System.out.println(nuevaCadena);
        }else {
            nuevaCadena.deleteCharAt(posi);
            nuevaCadena.insert(posi, nuevoCaracter);
            System.out.println(nuevaCadena);
        }
        teclado.close();
    }
}
