package funciones;

import java.util.Scanner;

public class Fun25 {
    
/**
 * double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 */
    public static double perimetroRectangulo(double ancho, double alto){
        return ancho+ancho+alto+alto;
    }

    public static double areaRectangulo(double ancho, double alto){
        return ancho*alto;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el ancho y alto y te muestro el perimetro y area: ");
        System.out.println("Perimetro: ");
        System.out.println(perimetroRectangulo(teclado.nextDouble(), teclado.nextDouble()));

        System.out.println("Area:");
        System.out.println(areaRectangulo(teclado.nextDouble(), teclado.nextDouble()));
        teclado.close();
    }
}