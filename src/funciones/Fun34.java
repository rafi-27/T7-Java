package funciones;
public class Fun34 {

    public static int contadorPrimos(){
        int cont=0;
        for (int i = 0; i < 1000; i++) {
            if (Fun33.cantidadDivisores(i) == 2){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        System.out.println(contadorPrimos());
    }

}
