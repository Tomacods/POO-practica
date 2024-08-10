import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una oracion: ");
        String cade1 = scanner.nextLine();
        System.out.print("Ingrese otra oracion: ");
        String cade2 = scanner.nextLine();
        System.out.println(cade1 + " y " + cade2 + ".");
        scanner.close();
    }
}
