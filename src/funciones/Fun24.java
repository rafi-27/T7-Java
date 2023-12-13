package funciones;

import java.util.Scanner;

public class Fun24 {
    /**
    *Escribe un programa que pida cinco precios y muestre por pantalla el precio de
     venta de cada uno tras aplicarle un 21% de IVA. 
     Implementa y utiliza la función
     double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
     */

    public static double precioConIva(double precio){
        return precio+(precio*21/100);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el precio numero: "+contador);
            System.out.println(precioConIva(teclado.nextDouble()));
            contador++;
        }
        teclado.close();
    }
}
