import java.util.Scanner;

public class Ejercicio8 { // para una cadena es nexline//
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase1: ");
        String cade1 = scanner.next();

        System.out.print("Ingrese una frase2 ");
        String cade2 = scanner.next(); 

        String palaString =   cade1 + " "+ cade2;

        System.out.println("el resultado de las dos frases ingresadas son:" + palaString );
    }
}
