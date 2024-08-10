import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char continuar;

        do {
            System.out.println("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            int randomNum = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10

            if (numero == randomNum) {
                System.out.println(numero + " es igual a " + randomNum);
            } else {
                System.out.println(numero + " es distinto a " + randomNum);
                if (numero < randomNum) {
                    System.out.println(numero + " es menor que " + randomNum);
                } else {
                    System.out.println(numero + " es mayor que " + randomNum);
                }
            }

            if (numero <= randomNum) {
                System.out.println(numero + " es menor o igual a " + randomNum);
            } else {
                System.out.println(numero + " es mayor o igual a " + randomNum);
            }

            System.out.println("¿Desea ingresar otro número? (S/N): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); // Consumir el salto de línea restante
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
