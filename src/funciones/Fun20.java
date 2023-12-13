package funciones;

public class Fun20 {
    public static boolean mayorEdad(int edad){
        if (edad >= 18) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduce tu edad bro: ");
        System.out.println(mayorEdad(18)?"Eres mayor de edad.":"No eres mayor de edad.");
    }
}