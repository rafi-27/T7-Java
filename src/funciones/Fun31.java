package funciones;

import java.util.Scanner;

public class Fun31 {
    /**31.Hacer una función llamada CalcularDiasMes que se le pase como parámetro un
     * año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta los años
     * bisiestos. A continuación, realizar un programa al que se le introduzca una fecha y
     * nos informe de los días pasados desde el 1 de enero de ese año. */

//Para saber los dias que tiene el mes
public static int diasDeMes(int año, int mes){
    int cantidadDiasMeses=0;

    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        return cantidadDiasMeses = 31;
    }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        return cantidadDiasMeses = 30;
    }

    if (mes == 2) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return cantidadDiasMeses = 29;
        }else{
            return cantidadDiasMeses = 28;
        }
    }else{
        return cantidadDiasMeses=30;
    }  
}

public static int calcularDiasMes(int año, int mes, int diaExacto){
    Scanner teclado = new Scanner(System.in);
    int sumaDias=0;

    //sumaDias = cantidadDiasMeses;

    for (int i = 1; i <= mes; i++) {
        sumaDias+=diasDeMes(año, i);
    }
    int resta = diasDeMes(año, mes) - diaExacto;
    return sumaDias-resta;
}

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Probamos: ");
    System.out.println("Introduce primero el año luego el mes:");
    System.out.println(calcularDiasMes(teclado.nextInt(), teclado.nextInt(), teclado.nextInt()));
    teclado.close();
}


}
