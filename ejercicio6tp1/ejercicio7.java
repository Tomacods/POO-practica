import java.util.Scanner;

public class ejercicio7{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = scanner.nextInt();
        int total = num1 + num2;
        System.out.println("El resultado de la suma es: " + total);
        scanner.close();
    }
}