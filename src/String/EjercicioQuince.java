package String;

public class EjercicioQuince {
    public static void main(String[] args) {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        /**
         * Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que
         * todas sean dígitos y sin repetidos. Si no cumple esas condiciones, el usuario
         * deberá introducirla de nuevo hasta que lo haga correctamente.
         */

        String cadena = new String();
        do {
            boolean iguales=false;
            System.out.println("Introduce una cadena de 6 digitos: ");
            cadena = teclado.nextLine();

            for (int i = 0; i < cadena.length()+1; i++) {
                for (int j = i+1; j < cadena.length(); j++) {
                    if (cadena.charAt(i) == cadena.charAt(j)){
                        iguales = true;
                    }
                }
            }

            if (iguales){
                System.out.println("No puede tener digitos iguales.");
            }

            if (!cadena.matches("\\d{6}")){
                System.err.println("Error vueve a introducirla.");
            }

        }while (!cadena.matches("\\d{6}"));
        teclado.close();
    }
}