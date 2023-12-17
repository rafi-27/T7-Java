package funciones;

public class Fun36 {
    /**
     * Crea una función letraNIF a la cual se le introduce un un número de 8 cifras que
     * representa un DNI y nos devolverá la letra asociada a ese DNI. Si el número
     * introducido no tiene la longitud adecuada devolverá el carácter ‘-’.
     * @param
     */

    public static String letraNIF(String numeroNIF){
        if (!numeroNIF.matches("\\d{8}")){
            return "NIF incorrecto";
        }else {
            String letrasDni ="TRWAGMYFPDXBNJZSQVHLCKE";
            int resto = Integer.parseInt(numeroNIF)%23;
            char letra = letrasDni.charAt(resto);
            return numeroNIF+letra;
        }
    }
    public static void main(String[] args) {
        System.out.println("----------Comprobamos----------");
        System.out.println(letraNIF("5501672"));
    }
}
