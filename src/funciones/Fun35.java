package funciones;

public class Fun35 {

    public static int masPrimo(int num){
        for (int i = num+1; ; i++) {
            if (Fun33.cantidadDivisores(i) == 2){
                return i;
            }
        }
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

    public static String digitoN(String numero, int posicion){
        if (numero.length() < posicion){
            return "-1";
        }else {
            return String.valueOf(numero.charAt(posicion));
        }
    }

    public static int posicionDigito(String numero, String posicion){
        if (!numero.contains(posicion)){
            return -1;
        }else {
            return numero.indexOf(String.valueOf(posicion))+1;
        }
    }


    public static void main(String[] args) {
        System.out.println(masPrimo(12421));
        System.out.println(digitos(123456));
        System.out.println(digitos(1234.5678));
        System.out.println(digitoN("123456789",5));
        System.out.println(posicionDigito("123456789","8"));




    }
}
