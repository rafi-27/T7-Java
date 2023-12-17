package funciones;

import java.util.Scanner;

public class Fun37 {
    /**
     * Escribe un programa que muestre un menú con 2 opciones:
     * “1.Circunferencia”
     * “2.Área”.
     */

    public static int menu(int numeroElegido){
        System.out.println("""
                1.Circunferencia
                2.Área
                3.Volumen
                4.Salir
                """);
        return numeroElegido;
    }
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""
                1.Circunferencia
                2.Área
                3.Volumen
                4.Todas
                5.Salir
                """);
            System.out.println("Seleccionar opcion: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Opcion seleccionada: 1.Circunferencia");
                    System.out.println("Introduce Radio:");
                    System.out.println(circunferencia(teclado.nextDouble()));
                    break;
                case 2:
                    System.out.println("Opcion seleccionada: 2.Area");
                    System.out.println("Introduce Radio:");
                    System.out.println(area(teclado.nextDouble()));
                    break;
                case 3:
                    System.out.println("Opcion seleccionada: 3.Volumen");
                    System.out.println("Introduce Radio:");
                    System.out.println(volumen(teclado.nextDouble()));
                    break;
                case 4:
                    System.out.println("Opcion seleccionada: 4.Todas");
                    System.out.println("Introduce Radio:");
                    double radio = teclado.nextDouble();
                    System.out.println("Circunferencia:");
                    System.out.println(circunferencia(radio));
                    System.out.println("Area:");
                    System.out.println(area(opcion));
                    System.out.println("Volumen:");
                    System.out.println(volumen(radio));
                    break;
                case 5:
                    System.out.println("Opcion seleccionada: 5.Salir");
                    System.out.println("Gracias adios.");
                    break;
                default:
                    System.err.println("Opcion incorrecta");
            }
        }while (opcion != 5);

    }

    /**
     * double pideRadio() // Pide que se introduzca el radio y lo devuelve
     */

    public double pideRadio(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }

    /**
     *double circunferencia(double r) // Calcula la circunferencia y la devuelve
     */

    public static double circunferencia(double r){
        return Math.PI*2*r;
    }

    /**
     *double area(double r) // Calcula el área y la devuelve
     */

    public static double area(double r){
        return Math.PI*(r*2);
    }

    /**
     *double volumen(double r) // Calcula el volumen y lo devuelve
     */

    public static double volumen(double r){
        return (double) 4/3*Math.PI*(r*3);
    }
    public static void main(String[] args) {
        menu();
    }
}
