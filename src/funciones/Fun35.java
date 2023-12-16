package funciones;

public class Fun35 {

    public static int masPrimo(int num){
        int primo=0;
        for (int i = num+1; i < 9999999; i++) {
            if (Fun33.cantidadDivisores(i) == 2){
                primo = i;
                break;
            }
        }
        return primo;
    }

    public static int digitos(double digit){
        String numero = String.valueOf(digit);
        int cont = 0;
        int contCaract = 0;

        for (int i = 1; i < numero.length(); i++) {
            if (numero.charAt(i) != '.' || numero.charAt(i) != ','){
                cont++;
            }else {
                contCaract++;
            }
        }
        return cont-contCaract;
    }


    public static void main(String[] args) {
        //System.out.println(masPrimo(12421));
        //System.out.println(digitos(123456));
        System.out.println(digitos(1234.5678));




    }
}
