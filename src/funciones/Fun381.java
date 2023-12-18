package funciones;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Fun381 {
    public static void generarNewPass(){
        Scanner teclado = new Scanner(System.in);

        //Preguntamos la cantidad de caracteres que tendra la contraseña:
        System.out.println("Longitud contraseña");
        int longiContra = teclado.nextInt();

        //Preguntamos por el nivel que quiere:
        System.out.println("Nivel de seguridad:");
        int nivelSeguridad = teclado.nextInt();

         //Opciones
         String minusculas = "abcdefghijklmnopqrtsuvwxyz";
         String mayusculas = "ABCDEFGHIJKLMNOPQRTSUVWXYZ";
         String conjunto = "abcdefghijklmnopqrtsuvwxyzABCDEFGHIJKLMNOPQRTSUVWXYZ";
         String numeros = "123456789";
         String caracteresEspeciales = "!#$%&'()*+,-./:;<=>?@_`}~";

         if (longiContra < 4){
            longiContra = 8;
            nivelSeguridad=2;
            System.out.println("Longitud insuficiente se te asignara una longitud de 8 y nivel 2.");
        }

        switch (nivelSeguridad) {
            case 1:
                String contrasenia="";
                for (int i = 0; i <= longiContra; i++) {
                    int numeroPosi = ThreadLocalRandom.current().nextInt(minusculas.length());
                    contrasenia += minusculas.charAt(numeroPosi);
                }
                System.out.println("Contraseña generada: "+contrasenia);
                break;
            case 2:
                    contrasenia="";
                    do {
                        for (int i = 0; i <= longiContra; i++) { 
                        int numeroPosiMin = ThreadLocalRandom.current().nextInt(0, conjunto.length());
                        //int numeroPosiMay = ThreadLocalRandom.current().nextInt(mayusculas.length());
                        contrasenia += conjunto.charAt(numeroPosiMin);
                        //int numeroPosiMay = ThreadLocalRandom.current().nextInt(mayusculas.length());
                        //contrasenia += mayusculas.charAt(numeroPosiMay);    
                        }
                        
                    } while (!contrasenia.matches(".*[a-z]+.*[A-Z]+"));
                    System.out.println("Contraseña generada: "+contrasenia);
                    break;
            
            case 3:



            default:
                break;
        }






    }
    public static void main(String[] args) {
        generarNewPass();
    }
    
}
