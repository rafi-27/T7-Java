package funciones;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Fun38 {
    public static void menu(){
        System.out.println("""
                * Nivel de seguridad: que corresponderá a las siguientes opciones
                ◦ 1. contraseña con letras minúsculas
                ◦ 2. contraseña con letras minúsculas y mayúsculas (al menos 1 de cada)
                ◦ 3. contraseñas con mayúsculas, minúsculas y números (al menos 1 de cada)
                ◦ 4. contraseñas con mayúsculas, minúsculas, números y símbolos (al menos 1 de cada)""");
    }
    public static void generadorPassword(){
        Scanner teclado = new Scanner(System.in);

        //Preguntamos la cantidad de caracteres que tendra la contraseña:
        System.out.println("Longitud contraseña");
        int longiContra = teclado.nextInt();
        //Mostramos el menu de los diferentes tipos de seguridad:
        menu();
        //Preguntamos por el nivel que quiere:
        System.out.println("Nivel de seguridad:");
        int nivelSeguridad = teclado.nextInt();

        //Opciones
        String minusculas = "abcdefghijklmnopqrtsuvwxyz";
        String mayusculas = "ABCDEFGHIJKLMNOPQRTSUVWXYZ";
        String numeros = "123456789";
        String caracteresEspeciales = "!#$%&'()*+,-./:;<=>?@_`}~";
        //String caracteresEspeciales = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";

        if (longiContra < 5){
            longiContra = 8;
            nivelSeguridad=2;
            System.out.println("Longitud insuficiente se te asignara una longitud de 8 y nivel 2.");
        }

        switch (nivelSeguridad){
            case 1:
                String contrasenia="";
                for (int i = 0; i < longiContra; i++) {
                    int numeroPosi = ThreadLocalRandom.current().nextInt(minusculas.length());
                    contrasenia += minusculas.charAt(numeroPosi);
                }
                System.out.println("Contraseña generada: "+contrasenia);
                break;
            case 2:
                contrasenia="";
                do {
                    for (int i = 0; i < longiContra; i++) {
                        if (i % 2 == 0) {
                            int numeroPosiMin = ThreadLocalRandom.current().nextInt(minusculas.length());
                            contrasenia += minusculas.charAt(numeroPosiMin);
                        } else {
                            int numeroPosiMay = ThreadLocalRandom.current().nextInt(mayusculas.length());
                            contrasenia += mayusculas.charAt(numeroPosiMay);
                        }
                    }
                    System.out.println("Contraseña generada: "+contrasenia);
                }while (!contrasenia.matches(".*[a-z]+.*[A-Z]+.*"));
                break;
            case 3:
                contrasenia = "";
                do {
                    contrasenia = "";
                    for (int i = 0; i < longiContra; i++) {
                        if (i % 3 == 0) {
                            int numeroPosiMin = ThreadLocalRandom.current().nextInt(minusculas.length());
                            contrasenia += minusculas.charAt(numeroPosiMin);
                        } else if (i % 3 == 1) {
                            int numeroPosiMay = ThreadLocalRandom.current().nextInt(mayusculas.length());
                            contrasenia += mayusculas.charAt(numeroPosiMay);
                        } else {
                            int num = ThreadLocalRandom.current().nextInt(numeros.length());
                            contrasenia += numeros.charAt(num);
                        }
                    }
                    System.out.println("Contraseña generada: " + contrasenia);
                } while (!contrasenia.matches(".*[a-z]+.*[A-Z]+.*[0-9]+.*"));
                break;
            case 4:
                contrasenia = "";
                do {
                    contrasenia = "";
                    for (int i = 0; i < longiContra; i++) {
                        if (i % 4 == 0) {
                            int numeroPosiMin = ThreadLocalRandom.current().nextInt(minusculas.length());
                            contrasenia += minusculas.charAt(numeroPosiMin);
                        } else if (i % 4 == 1) {
                            int numeroPosiMay = ThreadLocalRandom.current().nextInt(mayusculas.length());
                            contrasenia += mayusculas.charAt(numeroPosiMay);
                        } else if (i % 4 == 2) {
                            int num = ThreadLocalRandom.current().nextInt(numeros.length());
                            contrasenia += numeros.charAt(num);
                        } else {
                            int numCarac = ThreadLocalRandom.current().nextInt(caracteresEspeciales.length());
                            contrasenia += caracteresEspeciales.charAt(numCarac);
                        }
                    }
                    System.out.println("Contraseña generada: " + contrasenia);
                } while (!contrasenia.matches(".*[a-z]+.*[A-Z]+.*[0-9]+.*[!#$%&'()*+,-./:;<=>?@_`}~]+.*"));
                break;
        }
    }

    public static void main(String[] args) {
        generadorPassword();
    }
}
