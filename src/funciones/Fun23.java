package funciones;

import java.util.Scanner;

public class Fun23 {
        public static double millas_a_kilometros(double millas){
            double unKilometro =  1.60934;
            return unKilometro*millas;
        }


        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce las millas y te digo los kilometros que tiene: ");
            System.out.println(millas_a_kilometros(teclado.nextDouble())+" km.");
        }
}
