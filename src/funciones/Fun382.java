package funciones;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Fun382 {
    public static void menu(){
        System.out.println("""
            * Nivel de seguridad: que corresponderá a las siguientes opciones
            ◦ 1. contraseña con letras minúsculas
            ◦ 2. contraseña con letras minúsculas y mayúsculas (al menos 1 de cada)
            ◦ 3. contraseñas con mayúsculas, minúsculas y números (al menos 1 de cada)
            ◦ 4. contraseñas con mayúsculas, minúsculas, números y símbolos (al menos 1 de cada)""");
    }
    public static String generarNewPass(int longiContra, int nivelSeguridad) {
        Scanner teclado = new Scanner(System.in);

        //Preguntamos la cantidad de caracteres que tendra la contraseña:
        //System.out.println("Longitud contraseña");

        //Preguntamos por el nivel que quiere:
        //System.out.println("Nivel de seguridad:");
        //int nivelSeguridad = teclado.nextInt();

        //Opciones
        String minusculas = "abcdefghijklmnopqrtsuvwxyz";
        String conjunto = "abcdefghijklmnopqrtsuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ";
        String conjuntoNum = "abcdefghijklmnopqrtsuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ123456789";
        String conjuntoFinal = "abcdefghijklmnopqrtsuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ123456789!#$%&'()*+,-./:;<=>?@_`}~";
        //String caracteresEspeciales = "!#$%&'()*+,-./:;<=>?@_`}~";

        String contrasenia="d";

        if (longiContra < 4 && nivelSeguridad == 4){
                longiContra = 8;
                nivelSeguridad=2;
              System.out.println("Longitud insuficiente se te asignara una longitud de 8 y nivel 2.");
        }

        if (nivelSeguridad == 3 && longiContra < 3){
            longiContra = 8;
            nivelSeguridad=2;
            System.out.println("Longitud insuficiente se te asignara una longitud de 8 y nivel 2.");
        }

        if (nivelSeguridad == 2 && longiContra < 2){
            longiContra = 8;
            nivelSeguridad=2;
            System.out.println("Longitud insuficiente se te asignara una longitud de 8 y nivel 2.");
        }

        switch (nivelSeguridad) {
            case 1:
                for (int i = 0; i < longiContra; i++) {
                    int numeroPosi = ThreadLocalRandom.current().nextInt(minusculas.length());
                    contrasenia += minusculas.charAt(numeroPosi);
                }
                return "Contraseña generada: "+contrasenia;
                //System.out.println("Contraseña generada: " + contrasenia);
                //break;
            case 2:
                do {
                    for (int i = 0; i < longiContra; i++) {
                        int numeroPosiMin = ThreadLocalRandom.current().nextInt(conjunto.length());
                        contrasenia += conjunto.charAt(numeroPosiMin);
                    }
                    break;
                } while (!contrasenia.matches(".*[a-z]+.*[A-Z]+"));
                return "Contraseña generada: "+contrasenia;
                //System.out.println("Contraseña generada: " + contrasenia);
                //break;
            case 3:
                do {
                    for (int i = 0; i < longiContra; i++) {
                        int numeroPosiMin = ThreadLocalRandom.current().nextInt(conjuntoNum.length());
                        contrasenia += conjuntoNum.charAt(numeroPosiMin);
                    }
                    break;
                } while (!contrasenia.matches(".*[a-z]+.*[A-Z]+.*[0-9]+"));
                return "Contraseña generada: "+contrasenia;
                //System.out.println("Contraseña generada: " + contrasenia);
                //break;
            case 4:
                do {
                    for (int i = 0; i < longiContra; i++) {
                        int numeroPosiMin = ThreadLocalRandom.current().nextInt(conjuntoFinal.length());
                        contrasenia += conjuntoFinal.charAt(numeroPosiMin);
                    }
                    return "Contraseña generada: "+contrasenia;
                    //break;
                } while (!contrasenia.matches(".*[a-z]+.*[A-Z]+.*[0-9]+.*[!#$%&'()*+,./:;<=>?@_`}~-]+"));
                //System.out.println("Contraseña generada: " + contrasenia);
                //break;
            default:
                System.out.println("ERROR");
                break;
        }
        return contrasenia;
    }
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        menu();
        generarNewPass(tecla.nextInt(),tecla.nextInt());
        tecla.close();
    }
}
