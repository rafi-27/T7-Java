package funciones;

import java.util.Scanner;

public class Fun30{

/**Programa que presente un menú y permita calcular repetidas veces 
 * a) el área de círculo (necesitará el radio) , 
 * b) el área de cuadrado (necesitará el lado) , 
 * c) el área de triángulo (necesitará base y altura) 
 * d) Salir. Usar funciones para cada una de las 3 opciones.
*/

    public static void calcularArea(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("""
                a. Calcular el area de un circulo.
                b. Calcular el area de un cuadrado.
                c. Calcular el area de un triangulo.
                d. Salir.
                """);
        
        String opcion="";
        //boolean hayD = false;

       do {
            System.out.println("Introduce la opcion del menu que quieras: ");
            opcion = teclado.next();

            switch (opcion) {
               case "a":
                    System.out.println("Opcion 1 introduce radio:");
                    System.out.println("El area es "+calcularAreaCirculo(teclado.nextDouble()));
                        break;
                case "b":
                    System.out.println("Opcion 2 introduce el lado: ");
                    System.out.println("El area es "+calcularAreaCuadrado(teclado.nextDouble()));
                        break;
                case "c":
                    System.out.println("Introduce la base y altura: ");
                    System.out.println("El area es "+calcularAreaTriangulo(teclado.nextDouble(), teclado.nextDouble()));
                        break;
                case "d":
                    System.out.println("Adios y gracias!!");
                    //hayD = true;
                    break;
                default:
                    System.err.println("Opcion incorrecta.");
                    break;
                }             
        } while (!opcion.equals("d"));
        teclado.close();   
    }

        
    public static double calcularAreaCirculo(double radio){
        return Math.PI*Math.pow(radio, 2);
    }

    public static double calcularAreaCuadrado(double lado){
        return Math.pow(lado, 2);
    }

    public static double calcularAreaTriangulo(double base, double altura){
        return ((base*altura)/2);
    }


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Probamos nuestro menu: ");
        calcularArea();
    }





}