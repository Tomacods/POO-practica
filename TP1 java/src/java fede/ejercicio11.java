import java.util.Random;
import java.util.Scanner;

public class ejercicio11 {
    
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean rta = true;
        System.out.print("Numeros aleatorios.");
        while (rta) {
            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            while (num1==num2) {
                num1 = random.nextInt(10);
                num2 = random.nextInt(10);
            }
            System.out.println("Desea apostar por el valor 1: " + num1 + " o por el valor 2: " + num2 + " ?");
            int resp = scanner.nextInt();
            while (resp != 1 && resp != 2){
                System.out.print("Error, ingrese una respuesta correcta! (1/2)");
                resp = scanner.nextInt();
            }
            if (num1>num2){
                if (resp==1) System.out.print("Has ganado!");
                else System.out.print("Has perdido!");
                }
            else {if (resp==1) System.out.print("Has perdido!");
                else System.out.print("Has ganado!");
            }
            System.out.print("Desea jugar otra vez? s/n");
            scanner.nextLine();
            String respuesta = scanner.nextLine();
            if (respuesta != "s" && respuesta != "n") {
                System.out.print("Error, ingrese una respuesta correcta! (s/n)");
                respuesta = scanner.nextLine();
            }
            rta = respuesta.equalsIgnoreCase("s");
        }
    scanner.close();
    }
}
