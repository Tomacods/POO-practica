    import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        int peso = scanner.nextInt();

        System.out.print("Ingrese su altura en metros: ");
        int altura = scanner.nextInt();

        int imc = peso / (altura * altura);

        System.out.println("Su índice de masa corporal es: " + imc);
    }
}

