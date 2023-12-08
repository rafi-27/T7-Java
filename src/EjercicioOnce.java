import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //(Ejemplo: info@empresas.clientes.mundo-r.com mostraría
        //empresas.clientes.mundo-r ).

        System.out.print("Introduce tu correo electronico: ");
        String email = teclado.nextLine();
        StringBuilder emailBuilder = new StringBuilder(email);

        //Procedemos a borrar las partes que no necesitamos.
        int PPos = emailBuilder.indexOf("@");
        StringBuilder config = emailBuilder.delete(0,PPos);
        config.deleteCharAt(0);

        int UPos = config.indexOf(".com");
        config.delete(UPos,config.length());

        //Resultado final.
        System.out.println(config);
    }
}
