package funciones;

public class Fun27 {
    /**
     * Realiza una función llamada sumaIntervalo() que le pasan dos long y devuelve otro
     * long con la suma de los números comprendidos entre los números pasados (el
     * primero es menor que el segundo, y ambos mayores que cero, en caso contrario
     * devuelve -1)
     */

    public static long sumaIntervalo(long primero, long segundo){
        long result=0;
        if (primero > segundo || primero < 0 || segundo < 0) {
            return -1;
        }else{
            for (long i = primero; i <= segundo; i++) {
            result+=i;
        }
        return result;
        }

    }

    public static void main(String[] args) {
        System.out.println("Introduce un intervalo de dos numeros y hago una suma de los numeros que hay entre ambos: ");
        System.out.println(sumaIntervalo(13,10));

    }
}
