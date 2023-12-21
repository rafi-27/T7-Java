package Extra;

public class Ejer1 {
    /**
     * Una cadena de texto: numero(las veces que se van a mostrar),
     * 
     * @return
     */

    public static void repes(String cadena) {
        if (cadena.matches("^(\\d+\\{(.[^{}])+\\})+$")) {
            // Tenemos que separar los numeros.
            int i = 0;
            boolean esnumero = true;
            char caracgerActual;
            while (i < cadena.length()) {
                String n = "";
                while (esnumero) {
                    caracgerActual=cadena.charAt(i);

                    if (cadena.charAt(i) == '{') {
                        esnumero=false;
                } else {
                    n+=caracgerActual;
                }
                i++;
                }
            String c = "";
            int z = 0;
            while (!esnumero) {
                caracgerActual=cadena.charAt(i);
                if (caracgerActual == '}') {
                    esnumero = true;
                } else {
                    c += caracgerActual;
                }
                i++;
            }
            
            System.out.println(c.repeat(Integer.parseInt(n)));

            //for (int j = 1; j <= Integer.parseInt(n); j++) {
            //        System.out.print(c);
            //}
            }
        } else {
            System.out.println("Incorrecta la cadena introducida.");
        }
    }

    public static void main(String[] args) {
        repes("8{hola}7{si}2{rafe}4{nigg*}");
    }
}